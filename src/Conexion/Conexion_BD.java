package Conexion;

import java.util.logging.*;
import java.sql.*;

public class Conexion_BD {
    //Creacion de conexion con base de datos
    String bd = "base version 1.5";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    
    public Conexion_BD(String bd){
        this.bd= bd;
    }

    public static Connection conectar() {

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Base_Datos_SonDelicias", "root","");
            return cn;
        } catch (SQLException ex) {
            System.out.println("NO SE CONECTO A BD ");
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
