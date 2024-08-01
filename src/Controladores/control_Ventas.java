package Controladores;

import Modelos.Modelo_Venta;
import java.sql.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

    public List<Modelo_Venta> buscarSegunTipo(String detalle) {
        List<Modelo_Venta> listaVenta = new ArrayList<>();
        String sql = "select detalle, montoKiosco, montoComida, montoPanaderia, montoPostre, montoTotal, horaVenta from Venta where detalle = ?";

        try (Connection cn = Conexion.Conexion_BD.conectar(); PreparedStatement pst = cn.prepareStatement(sql)) {

            pst.setString(1, detalle); // Establecer el valor del parámetro
            ResultSet rs = pst.executeQuery();

            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // Ajusta el patrón según tu formato de fecha y hora en la BD
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM HH:mm");

            while (rs.next()) {
                // Obtener los valores de las columnas del ResultSet y establecerlos en el modelo
                Modelo_Venta venta = new Modelo_Venta();
                venta.setTipo(rs.getString("detalle"));
                venta.setMontoKiosco(rs.getDouble("montoKiosco"));
                venta.setMontoPanaderia(rs.getDouble("montoPanaderia"));
                venta.setMontoComida(rs.getDouble("montoComida"));
                venta.setMontoPostre(rs.getDouble("montoPostre"));
                venta.setMontoTotal(rs.getDouble("montoTotal"));
                venta.setHora(rs.getString("horaVenta"));

                //Formateo de hora
                String horaVenta = rs.getString("horaVenta");
                LocalDateTime dateTime = LocalDateTime.parse(horaVenta, inputFormatter);
                String formattedHoraVenta = dateTime.format(outputFormatter);
                venta.setHora(formattedHoraVenta);

                listaVenta.add(venta);
            }

            System.out.println("Busqueda exitosa");

        } catch (Exception e) {

            System.out.println("Error al buscar venta por Tipo de pago: " + e.getMessage());
        }

        return listaVenta;
    }

    public List<Modelo_Venta> buscarPorFecha(String fecha) {
        List<Modelo_Venta> listaVenta = new ArrayList<>();
        String sql = "SELECT detalle, montoKiosco, montoComida, montoPanaderia, montoPostre, montoTotal, horaVenta FROM Venta WHERE DATE(horaVenta) = ?";

        try (Connection cn = Conexion.Conexion_BD.conectar(); PreparedStatement pst = cn.prepareStatement(sql)) {

            // Convertir la fecha de 'dd/MM/yyyy' a 'yyyy-MM-dd'
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter dbFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate parsedDate = LocalDate.parse(fecha, inputFormatter);
            String formattedDate = parsedDate.format(dbFormatter);

            pst.setString(1, formattedDate); // Establecer la fecha formateada
            ResultSet rs = pst.executeQuery();

            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM HH:mm");

            while (rs.next()) {
                Modelo_Venta venta = new Modelo_Venta();
                venta.setTipo(rs.getString("detalle"));
                venta.setMontoKiosco(rs.getDouble("montoKiosco"));
                venta.setMontoPanaderia(rs.getDouble("montoPanaderia"));
                venta.setMontoComida(rs.getDouble("montoComida"));
                venta.setMontoPostre(rs.getDouble("montoPostre"));
                venta.setMontoTotal(rs.getDouble("montoTotal"));
                venta.setHora(rs.getString("horaVenta"));

                // Formatear la hora para mostrar solo HH:mm
                String horaVenta = rs.getString("horaVenta");
                LocalDateTime dateTime = LocalDateTime.parse(horaVenta, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                String formattedHoraVenta = dateTime.format(outputFormatter);
                venta.setHora(formattedHoraVenta);

                listaVenta.add(venta);
            }

            System.out.println("Busqueda por fecha exitosa");

        } catch (Exception e) {
            System.out.println("Error al buscar venta por fecha: " + e.getMessage());
        }

        return listaVenta;

    }
}
