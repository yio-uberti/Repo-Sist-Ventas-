package Controladores;

import Modelos.Modelo_Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class control_Producto {

    //Metodo para guardar producto
    public boolean guardar(Modelo_Producto objeto) {

        boolean respuesta = false;
        Connection cn;
        cn = Conexion.Conexion_BD.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("insert into Producto values(?,?,?,?)");
            consulta.setString(1, objeto.getCod_barra());//Cod_Barra
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getTipo());
            consulta.setDouble(4, objeto.getPrecio_Actual());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto " + e);
        }

        return respuesta;
    }

    //Metodo para saber si existe un Producto
    public boolean existeProducto(String codigoBarra) {

        boolean respuesta = false;
        String sql = "select Cod_Barra from Producto where Cod_Barra = '" + codigoBarra + "'; ";
        Statement st;

        try {
            Connection cn = Conexion.Conexion_BD.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar Producto " + e);
        }

        if (respuesta == true) {
            System.out.println("producto encontrado");
        }
        return respuesta;
    }

    //metodo para buscar un producto 
    public Modelo_Producto buscarProducto(String codigoBarra) {
        Modelo_Producto producto = new Modelo_Producto();
        String sql = "select nombre , precio_Actual, tipo from Producto where Cod_barra = ?";

        try (Connection cn = Conexion.Conexion_BD.conectar(); PreparedStatement pst = cn.prepareStatement(sql)) {

            pst.setString(1, codigoBarra);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio_Actual");
                String tipo = rs.getString("tipo");

                producto.setNombre(nombre);
                producto.setPrecio_Actual(precio);
                producto.setTipo(tipo);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar Producto por código de barras: " + e.getMessage());
        }

        return producto;
    }

    //Metodo de actualizacion de producto
    public Modelo_Producto cambioPrecio(String codigoBarra, double precioNuevo) {
        Modelo_Producto producto = new Modelo_Producto();
        String sql = "update Producto set precio_Actual = ? WHERE Cod_barra = ?";

        try (Connection cn = Conexion.Conexion_BD.conectar(); PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setDouble(1, precioNuevo);
            pst.setString(2, codigoBarra);

            int filasAfectadas = pst.executeUpdate();
            if (filasAfectadas > 0) {
                producto.setPrecio_Actual(precioNuevo);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar Producto por código de barras: " + e.getMessage());
        }

        return producto;
    }

}
