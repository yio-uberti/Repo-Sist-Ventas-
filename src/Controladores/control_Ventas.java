package Controladores;

import Modelos.Modelo_Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class control_Ventas {

    public Modelo_Venta registarVenta(double monto, String hora, String detalle) {

        Modelo_Venta venta = new Modelo_Venta();
        String sql = "INSERT INTO Venta(detalle, monto, horaVenta) values (?, ?, ?)";

        try (Connection cn = Conexion.Conexion_BD.conectar(); 
                PreparedStatement pst = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pst.setString(1, detalle);
            pst.setDouble(2, monto);
            pst.setString(3, hora);

            // Ejecutar la inserción
            int affectedRows = pst.executeUpdate();

            if (affectedRows > 0) {
                // Obtener el ID autogenerado
                try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int id = generatedKeys.getInt(1);
                        // Configurar el objeto Modelo_Venta con los datos insertados
                        venta.setId(id);
                        venta.setTipo(detalle);
                        venta.setMonto(monto);
                        venta.setHora(hora);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error al registrar la venta" + e.getMessage());
        }
        return venta;
    }

}
