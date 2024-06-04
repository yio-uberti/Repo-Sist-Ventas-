package Controladores;

import Modelos.Modelo_categoria;
import java.sql.*;


public class control_Cat_Proveedor {
    
    //Metodo para guardar categoria en base de datos
    public boolean guardar(Modelo_categoria objeto){
        boolean respuesta = false;
        Connection cn;
        cn = Conexion.Conexion_BD.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into Categoria values(?,?)");
            consulta.setInt(1, objeto.getId());
            consulta.setString(2, objeto.getDescripcion());
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            } 
            
            cn.close();
            
        } catch (Exception e) {
            System.out.println("Error al guardar categoria: " + e);
        }
        return respuesta;
    }
    
    //metodo para eliminar categorias de la Gestion de Categorias 
    public boolean eliminar (int idCategoria){
        boolean respuesta = false;
        Connection cn = Conexion.Conexion_BD.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("delete from Categoria where id ='" + idCategoria + "'");
            consulta.executeUpdate();
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            
            cn.close();
            
        } catch (Exception e) {
            System.out.println("Error al eliminar categoria" + e);
        }
        
        return respuesta;
    }
    
}
