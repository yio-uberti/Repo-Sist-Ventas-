package Controladores;

//Importaciones
import java.util.List;
import Modelos.Modelo_Cuenta;
import java.sql.*;
import java.util.ArrayList;

public class control_Cuenta {

    private List<Modelo_Cuenta> listaCuenta;

    public control_Cuenta() {

    }

    public control_Cuenta(List<Modelo_Cuenta> listaCuenta) {
        if (this.listaCuenta == null || this.listaCuenta.isEmpty()) {
            this.listaCuenta = cargarCuentas();
        }
    }

    private List<Modelo_Cuenta> cargarCuentas() {
        List<Modelo_Cuenta> lista = new ArrayList<>();
        String sql = "SELECT id, nombreCuenta FROM Cuenta";

        try (Connection cn = Conexion.Conexion_BD.conectar(); PreparedStatement pst = cn.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Modelo_Cuenta cuenta = new Modelo_Cuenta();
                cuenta.setId(rs.getInt("id"));
                cuenta.setDescripcion(rs.getString("nombreCuenta"));

                lista.add(cuenta);
            }

            System.out.println("Carga exitosa de la tabla cuenta \n");

        } catch (SQLException e) {
            System.out.println("Error al cargar las cuentas: " + e.getMessage());
        }

        return lista;
    }

    public List<Modelo_Cuenta> getListaCuentas(){
        if(listaCuenta == null || listaCuenta.isEmpty()){
            listaCuenta = cargarCuentas();
        }
        return listaCuenta;
    }
    
     //Metodo para guardar categoria en base de datos
    public boolean guardar(Modelo_Cuenta objeto) {
        boolean respuesta = false;
        Connection cn;
        cn = Conexion.Conexion_BD.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into Cuenta values(?,?)");
            consulta.setInt(1, objeto.getId());
            consulta.setString(2, objeto.getDescripcion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (Exception e) {
            System.out.println("Error al guardar cuenta: " + e);
        }
        return respuesta;
    }
    
    //metodo para eliminar categorias de la Gestion de Categorias 
    public boolean eliminar(int idCuenta) {
        boolean respuesta = false;
        Connection cn = Conexion.Conexion_BD.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("delete from Cuenta where id ='" + idCuenta + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (Exception e) {
            System.out.println("Error al eliminar categoria" + e);
        }

        return respuesta;
    }
    
}
