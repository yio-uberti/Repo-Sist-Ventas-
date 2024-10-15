package Controladores;

import Modelos.Modelo_Producto;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.*;

public class control_Producto {

    private List<Modelo_Producto> listaProductos;
    private static final String BASE_URL_PRODUCTOS = "http://localhost:8080/ApiRest/Prod";

    public control_Producto() {
        if (this.listaProductos == null || this.listaProductos.isEmpty()) {
            this.listaProductos = cargarProductos();
        }
    }

    // Método para hacer una petición GET a la API y cargar los productos
    private List<Modelo_Producto> cargarProductos() {
        List<Modelo_Producto> productos = new ArrayList<>();
        try {
            URL url = new URL(BASE_URL_PRODUCTOS); // Ajusta el endpoint
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Error HTTP: " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            StringBuilder jsonResponse = new StringBuilder();
            while ((output = br.readLine()) != null) {
                jsonResponse.append(output);
            }

            // Parsear el JSON de respuesta
            JSONArray jsonArray = new JSONArray(jsonResponse.toString());
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObj = jsonArray.getJSONObject(i);
                Modelo_Producto producto = new Modelo_Producto(
                        jsonObj.getString("cod_barra"),
                        jsonObj.getString("nombre"),
                        jsonObj.getString("tipo"),
                        jsonObj.getInt("categoria_id"),
                        jsonObj.getDouble("precio_actual")
                );
                productos.add(producto);
            }
            conn.disconnect();
        } catch (Exception e) {
            System.out.println("Error al cargar productos: " + e.getMessage());
            e.printStackTrace();
        }

        return productos;
    }

    public Modelo_Producto buscarProductoPorCodigo(String codigoBarra) {
        Modelo_Producto producto = null;
        try {
            URL url = new URL("http://localhost:8080/ApiRest/Prod/producto/" + codigoBarra); // Ajusta el endpoint
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                return null; // Si no se encuentra el producto
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            StringBuilder jsonResponse = new StringBuilder();
            while ((output = br.readLine()) != null) {
                jsonResponse.append(output);
            }

            // Parsear el JSON de respuesta
            JSONObject jsonObj = new JSONObject(jsonResponse.toString());
            producto = new Modelo_Producto(
                    jsonObj.getString("cod_barra"),
                    jsonObj.getString("nombre"),
                    jsonObj.getString("tipo"),
                    jsonObj.getInt("categoria_id"),
                    jsonObj.getDouble("precio_actual")
            );

            conn.disconnect();
        } catch (Exception e) {
            System.out.println("Error al buscar producto: " + e.getMessage());
        }
        return producto;
    }

    public Modelo_Producto buscarProductoUno(String codigoBarra) {
        Modelo_Producto producto = null;
        String url = BASE_URL_PRODUCTOS + codigoBarra; // Cambia la URL según tu API

        try {
            // Crear el objeto de la conexión HTTP
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) { // Verificar que la respuesta sea 200 OK
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Convertir la respuesta a JSON
                JSONObject jsonResponse = new JSONObject(response.toString());

                // Asignar valores a la instancia de Modelo_Producto
                producto = new Modelo_Producto();
                producto.setNombre(jsonResponse.getString("nombre_Producto"));
                producto.setPrecio_Actual(jsonResponse.getDouble("precio_actual"));
                producto.setTipo(jsonResponse.getString("tipo"));
                producto.setCategoria(jsonResponse.getInt("categoria_id"));

            } else {
                System.out.println("Error en la consulta: Código de respuesta " + responseCode);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar Producto por código de barras: " + e.getMessage());
        }
        return producto;
    }

    // Método para guardar producto (POST)
    public boolean guardar(Modelo_Producto objeto) {
        try {
            URL url = new URL(BASE_URL_PRODUCTOS); // Ajusta el endpoint
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            JSONObject jsonObj = new JSONObject();
            jsonObj.put("cod_barra", objeto.getCod_barra());
            jsonObj.put("nombre", objeto.getNombre());
            jsonObj.put("tipo", objeto.getTipo());
            jsonObj.put("categoria_id", objeto.getCategoria());
            jsonObj.put("precio_actual", objeto.getPrecio_Actual());

            OutputStream os = conn.getOutputStream();
            os.write(jsonObj.toString().getBytes());
            os.flush();

            if (conn.getResponseCode() != 200) {
                return false;
            }
            conn.disconnect();
            return true;
        } catch (Exception e) {
            System.out.println("Error al guardar producto: " + e.getMessage());
            return false;
        }
    }

    // Método para verificar si el producto existe (GET)
    public boolean existeProducto(String codigoBarra) {
        return buscarProductoPorCodigo(codigoBarra) != null;
    }

    // Método para actualizar el precio de un producto (PUT)
    public Modelo_Producto cambioPrecio(String codigoBarra, double precioNuevo) {
        Modelo_Producto producto = buscarProductoPorCodigo(codigoBarra);
        if (producto == null) {
            return null; // Producto no encontrado
        }

        try {
            URL url = new URL(BASE_URL_PRODUCTOS + codigoBarra); // Ajusta el endpoint
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Content-Type", "application/json");

            JSONObject jsonObj = new JSONObject();
            jsonObj.put("precio_actual", precioNuevo);

            OutputStream os = conn.getOutputStream();
            os.write(jsonObj.toString().getBytes());
            os.flush();

            if (conn.getResponseCode() != 200) {
                return null;
            }

            producto.setPrecio_Actual(precioNuevo);
            conn.disconnect();
        } catch (Exception e) {
            System.out.println("Error al cambiar el precio: " + e.getMessage());
        }
        return producto;
    }

    // Método para eliminar un producto (DELETE)
    public boolean eliminar(String codigoBarra) {
        try {
            URL url = new URL(BASE_URL_PRODUCTOS + codigoBarra); // Ajusta el endpoint
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("DELETE");

            if (conn.getResponseCode() != 200) {
                return false;
            }
            conn.disconnect();
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar producto: " + e.getMessage());
            return false;
        }
    }
}
