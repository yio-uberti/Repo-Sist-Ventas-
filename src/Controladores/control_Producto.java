package Controladores;

import Modelos.Modelo_Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class control_Producto {

    private List<Modelo_Producto> listaProductos;

    public control_Producto() {
        if(this.listaProductos == null || this.listaProductos.isEmpty()){
            this.listaProductos = cargarProductos();
        }
    }

    private List<Modelo_Producto> cargarProductos() {
        List<Modelo_Producto> productos = new ArrayList<>();
        String sql = "SELECT Cod_Barra, nombre, precio_Actual, tipo, categoria_id FROM Producto";

        try (Connection cn = Conexion.Conexion_BD.conectar(); PreparedStatement pst = cn.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Modelo_Producto producto = new Modelo_Producto();
                producto.setCod_barra(rs.getString("Cod_Barra"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio_Actual(rs.getDouble("precio_Actual"));
                producto.setTipo(rs.getString("tipo"));
                productos.add(producto);
            }
            System.out.println("Carga exitosa de la tabla \n");
        } catch (SQLException e) {
            System.out.println("Error al cargar productos: " + e.getMessage());
        }

        return productos;
    }

    public Modelo_Producto buscarProductoPorCodigo(String codigoBarra) {
        for (Modelo_Producto producto : listaProductos) {
            if (producto.getCod_barra().equals(codigoBarra)) {
                return producto;
            }
        }
        return null; // Si no se encuentra el producto
    }

    //Metodo para guardar producto
    public boolean guardar(Modelo_Producto objeto) {

        boolean respuesta = false;
        Connection cn;
        cn = Conexion.Conexion_BD.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("insert into Producto values(?,?,?,?,?)");
            consulta.setString(1, objeto.getCod_barra());//Cod_Barra
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getTipo());
            consulta.setString(4, objeto.getCategoria());
            consulta.setDouble(5, objeto.getPrecio_Actual());

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
    public Modelo_Producto buscarProductoUno(String codigoBarra) {
        Modelo_Producto producto = null;
        String sql = "SELECT nombre, precio_Actual, tipo, categoria_id FROM Producto WHERE Cod_Barra = ?";

        try (Connection cn = Conexion.Conexion_BD.conectar(); PreparedStatement pst = cn.prepareStatement(sql)) {

            pst.setString(1, codigoBarra);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                producto = new Modelo_Producto();
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio_Actual(rs.getDouble("precio_Actual"));
                producto.setTipo(rs.getString("tipo"));
                producto.setCategoria(rs.getString("categoria_id"));
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

    public boolean eliminar(String codigoBarra) {

        Modelo_Producto producto = new Modelo_Producto();
        String sql = "delete from Producto where Cod_Barra = ?";

        try (Connection cn = Conexion.Conexion_BD.conectar(); PreparedStatement pst = cn.prepareStatement(sql)) {

            pst.setString(1, codigoBarra);
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar Producto por código de barras: " + e.getMessage());
            return false;
        }

    }
    
    
    
    
}
