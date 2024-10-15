package Controladores;

//Importaciones
import Modelos.Modelo_Cuenta;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public class control_Cuenta {

    private List<Modelo_Cuenta> listaCuenta;
    private static final String BASE_URL_CUENTAS = "http://localhost:8080/ApiRest/Cuen";


    public control_Cuenta() {
        this.listaCuenta = cargarCuentas();
    }

    private List<Modelo_Cuenta> cargarCuentas() {
        List<Modelo_Cuenta> lista = new ArrayList<>();

        try {
            URL url = new URL(BASE_URL_CUENTAS);
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
                    JSONObject jsonCuenta = jsonArray.getJSONObject(i);
                    Modelo_Cuenta cuenta = new Modelo_Cuenta();
                    cuenta.setId(jsonCuenta.getInt("id"));
                    cuenta.setDescripcion(jsonCuenta.getString("nombreCuenta"));
                    lista.add(cuenta);
                }

                System.out.println("Carga exitosa de la tabla cuenta \n");
            } else {
                System.out.println("Error al cargar cuentas: " + conn.getResponseMessage());
            }

        } catch (Exception e) {
            System.out.println("Error al cargar las cuentas: " + e.getMessage());
        }

        return lista;
    }

    public List<Modelo_Cuenta> getListaCuentas() {
        if (listaCuenta == null || listaCuenta.isEmpty()) {
            listaCuenta = cargarCuentas();
        }
        return listaCuenta;
    }

    // Método para guardar categoría en la base de datos
    public boolean guardar(Modelo_Cuenta objeto) throws JSONException {
        boolean respuesta = false;
        String jsonInputString = new JSONObject()
                .put("id", objeto.getId())
                .put("nombre_cuenta", objeto.getDescripcion())
                .toString();

        try {
            URL url = new URL(BASE_URL_CUENTAS);
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
            if (conn.getResponseCode() == 201) { // 201 Created
                respuesta = true;
                System.out.println("Cuenta guardada con éxito.");
            } else {
                System.out.println("Error al guardar cuenta: " + conn.getResponseMessage());
            }

        } catch (Exception e) {
            System.out.println("Error al guardar cuenta: " + e.getMessage());
        }
        return respuesta;
    }

    // Método para eliminar cuentas
    public boolean eliminar(int idCuenta) {
        boolean respuesta = false;

        try {
            URL url = new URL(BASE_URL_CUENTAS + "/" + idCuenta); // Suponiendo que la API tiene un endpoint para eliminar por ID
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("DELETE");

            // Leer la respuesta
            if (conn.getResponseCode() == 204) { // 204 No Content
                respuesta = true;
                System.out.println("Cuenta eliminada con éxito.");
            } else {
                System.out.println("Error al eliminar cuenta: " + conn.getResponseMessage());
            }

        } catch (Exception e) {
            System.out.println("Error al eliminar cuenta: " + e.getMessage());
        }

        return respuesta;
    }

}
