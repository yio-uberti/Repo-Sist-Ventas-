package Controladores;

import Modelos.Modelo_Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class control_Ventas {

    public Modelo_Venta registrarVenta(double montoKiosco, double montoComida, double montoPanaderia, double montoPostre, double montoTotal, String hora, String detalle) {
        Modelo_Venta venta = new Modelo_Venta();
        String sql = "INSERT INTO Venta(detalle, montoKiosco, montoComida, montoPanaderia, montoPostre, montoTotal, horaVenta) values (?, ?, ?, ?, ?, ?, ?)";

        try (Connection cn = Conexion.Conexion_BD.conectar(); PreparedStatement pst = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pst.setString(1, detalle);
            pst.setDouble(2, montoKiosco);
            pst.setDouble(3, montoComida);
            pst.setDouble(4, montoPanaderia);
            pst.setDouble(5, montoPostre);
            pst.setDouble(6, montoTotal);
            pst.setString(7, hora);

            int affectedRows = pst.executeUpdate();

            if (affectedRows > 0) {
                try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int id = generatedKeys.getInt(1);
                        venta.setId(id);
                        venta.setTipo(detalle);
                        venta.setMontoKiosco(montoKiosco);
                        venta.setMontoComida(montoComida);
                        venta.setMontoPanaderia(montoPanaderia);
                        venta.setMontoPostre(montoPostre);
                        venta.setMontoTotal(montoTotal);
                        venta.setHora(hora);
                    }
                }
            }
            
            System.out.println("Resgitro de venta Exitoso");
            
        } catch (Exception e) {
            System.out.println("Error al registrar la venta: " + e.getMessage());
        }
        return venta;
    }

    public Modelo_Venta buscarSegunTipo(String detalle) {
        Modelo_Venta venta = new Modelo_Venta();
        String sql = "select detalle, montoKiosco, montoComida, montoPanaderia, montoPostre, montoTotal, horaVenta from Venta where detalle = ?";

        try (Connection cn = Conexion.Conexion_BD.conectar(); PreparedStatement pst = cn.prepareStatement(sql)) {

            pst.setString(1, detalle); // Establecer el valor del parámetro
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Obtener los valores de las columnas del ResultSet y establecerlos en el modelo
                venta.setTipo(rs.getString("detalle"));
                venta.setMontoKiosco(rs.getDouble("montoKiosco"));
                venta.setMontoComida(rs.getDouble("montoComida"));
                venta.setMontoPanaderia(rs.getDouble("montoPanaderia"));
                venta.setMontoPostre(rs.getDouble("montoPostre"));
                venta.setMontoTotal(rs.getDouble("montoTotal"));
                venta.setHora(rs.getString("horaVenta"));

            }
            
            System.out.println("Busqueda exitosa");
            
        } catch (Exception e) {

            System.out.println("Error al buscar venta por Tipo de pago: " + e.getMessage());
        }

        return venta;
    }
}
