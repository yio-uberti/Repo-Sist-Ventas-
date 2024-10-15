package Controladores;

import Modelos.Modelo_Venta;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public class control_Ventas {

    private static final String BASE_URL_VENTAS = "http://localhost:8080/ApiRest/Ven";

    // Método para registrar una venta
    public Modelo_Venta registrarVenta(double montoKiosco, double montoComida, double montoPanaderia, double montoDulce, double montoTotal, LocalDateTime hora, String detalle) throws JSONException {
        Modelo_Venta venta = new Modelo_Venta();
        String jsonInputString = new JSONObject()
                .put("detalle", detalle)
                .put("monto_kiosco", montoKiosco)
                .put("monto_comida", montoComida)
                .put("monto_panaderia", montoPanaderia)
                .put("monto_postre", montoDulce)
                .put("monto_total", montoTotal)
                .put("hora_venta", hora)
                .toString();

        try {
            URL url = new URL(BASE_URL_VENTAS);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // Enviar la solicitud
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Leer la respuesta
            if (conn.getResponseCode() == 201) {
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }

                JSONObject jsonResponse = new JSONObject(response.toString());
                venta.setId(jsonResponse.getInt("id"));
                venta.setTipo(detalle);
                venta.setMontoKiosco(montoKiosco);
                venta.setMontoComida(montoComida);
                venta.setMontoPanaderia(montoPanaderia);
                venta.setMontoDulce(montoDulce);
                venta.setMontoTotal(montoTotal);
                venta.setHora(hora);
                System.out.println("Registro de venta exitoso");
            }
            
        } catch (Exception e) {
            System.out.println("Error al registrar la venta: " + e.getMessage());
            e.printStackTrace();
        }
        return venta;
    }

    // Método para buscar ventas según el tipo
    public List<Modelo_Venta> buscarSegunTipo(String detalle) {
        
        List<Modelo_Venta> listaVenta = new ArrayList<>();
        String urlStr = "http://localhost:8080/ApiRest/Ven/por-tipo-pago?tipoPago=" + detalle; // Suponiendo que tu API acepta un parámetro de consulta para buscar por detalle

        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Leer la respuesta
            if (conn.getResponseCode() == 200) { // 200 OK
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }

                JSONArray jsonArray = new JSONArray(response.toString());
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonVenta = jsonArray.getJSONObject(i);
                    Modelo_Venta venta = new Modelo_Venta();
                    venta.setTipo(jsonVenta.getString("detalle"));
                    venta.setMontoKiosco(jsonVenta.getDouble("monto_kiosco"));
                    venta.setMontoPanaderia(jsonVenta.getDouble("monto_panaderia"));
                    venta.setMontoComida(jsonVenta.getDouble("monto_comida"));
                    venta.setMontoDulce(jsonVenta.getDouble("monto_postre"));
                    venta.setMontoTotal(jsonVenta.getDouble("monto_total"));
                    venta.setHora((LocalDateTime) jsonVenta.get("hora_venta"));
                    listaVenta.add(venta);
                }

                System.out.println("Búsqueda exitosa");
            } else {
                System.out.println("Error al buscar ventas por tipo: " + conn.getResponseMessage());
            }

        } catch (Exception e) {
            System.out.println("Error al buscar ventas por tipo: " + e.getMessage());
        }

        return listaVenta;
    }

    // Método para buscar ventas por fecha
    public List<Modelo_Venta> buscarPorFecha(String fecha) {
        List<Modelo_Venta> listaVenta = new ArrayList<>();
        String urlStr = BASE_URL_VENTAS + "?fecha=" + fecha; // Suponiendo que tu API acepta un parámetro de consulta para buscar por fecha

        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Leer la respuesta
            if (conn.getResponseCode() == 200) { // 200 OK
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }

                JSONArray jsonArray = new JSONArray(response.toString());
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonVenta = jsonArray.getJSONObject(i);
                    Modelo_Venta venta = new Modelo_Venta();
                    venta.setTipo(jsonVenta.getString("detalle"));
                    venta.setMontoKiosco(jsonVenta.getDouble("montoKiosco"));
                    venta.setMontoPanaderia(jsonVenta.getDouble("montoPanaderia"));
                    venta.setMontoComida(jsonVenta.getDouble("montoComida"));
                    venta.setMontoDulce(jsonVenta.getDouble("montoPostre"));
                    venta.setMontoTotal(jsonVenta.getDouble("montoTotal"));
                    venta.setHora((LocalDateTime) jsonVenta.get("horaVenta"));
                    listaVenta.add(venta);
                }

                System.out.println("Búsqueda por fecha exitosa");
            } else {
                System.out.println("Error al buscar ventas por fecha: " + conn.getResponseMessage());
            }

        } catch (Exception e) {
            System.out.println("Error al buscar ventas por fecha: " + e.getMessage());
        }

        return listaVenta;
    }

}