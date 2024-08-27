package Controladores;

import Modelos.Modelo_categoria;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class control_Cat_Proveedor {

    private List<Modelo_categoria> listaCategoria;

    public control_Cat_Proveedor(){
    
    }
    
    public control_Cat_Proveedor(List<Modelo_categoria> listaCategoria) {
        if (this.listaCategoria == null || this.listaCategoria.isEmpty()) {
            this.listaCategoria = cargarCategorias();
        }
    }

    private List<Modelo_categoria> cargarCategorias() {
        List<Modelo_categoria> lista = new ArrayList<>();
        String sql = "SELECT id, nombre_Categoria FROM Categoria";

        try (Connection cn = Conexion.Conexion_BD.conectar(); PreparedStatement pst = cn.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Modelo_categoria categoria = new Modelo_categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setDescripcion(rs.getString("nombre_Categoria"));

                lista.add(categoria);
            }

            System.out.println("Carga exitosa de la tabla categoria \n");

        } catch (SQLException e) {
            System.out.println("Error al cargar las categorias: " + e.getMessage());
        }

        return lista;
    }

    public List<Modelo_categoria> getListaCategorias() {
        if (listaCategoria == null || listaCategoria.isEmpty()) {
            listaCategoria = cargarCategorias();
        }
        return listaCategoria;
    }

    //Metodo para guardar categoria en base de datos
    public boolean guardar(Modelo_categoria objeto) {
        boolean respuesta = false;
        Connection cn;
        cn = Conexion.Conexion_BD.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into Categoria values(?,?)");
            consulta.setInt(1, objeto.getId());
            consulta.setString(2, objeto.getDescripcion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (Exception e) {
            System.out.println("Error al guardar categoria: " + e);
        }
        return respuesta;
    }

    //metodo para eliminar categorias de la Gestion de Categorias 
    public boolean eliminar(int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion.Conexion_BD.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("delete from Categoria where id ='" + idCategoria + "'");
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
