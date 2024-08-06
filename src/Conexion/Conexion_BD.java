package Conexion;

import java.util.logging.*;
import java.sql.*;

public class Conexion_BD {

    
    public static Connection conectar() {
        // Cambia la URL de conexión, el usuario y la contraseña según los datos proporcionados

        String url = "jdbc:mysql://root:GUfFGNKkmmWSOlRYUQmmpyGHKzCMfqbB@viaduct.proxy.rlwy.net:17459/railway";
        String user = "root";
        String password = "GUfFGNKkmmWSOlRYUQmmpyGHKzCMfqbB";

        try {
            // Crear la conexión con los datos ajustados
            Connection cn = DriverManager.getConnection(url, user, password);
            return cn;
        } catch (SQLException ex) {
            System.out.println("NO SE CONECTO A BD ");
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
    
    
    
}
