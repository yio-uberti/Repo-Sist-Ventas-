package Controladores;

//importanciones
import Modelos.Modelo_categoria;
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

public class control_Cat_Proveedor {

    private List<Modelo_categoria> listaCategoria;
    private static final String BASE_URL = "http://localhost:8080/ApiRest/Cate";

    public control_Cat_Proveedor() {
        this.listaCategoria = cargarCategorias();
    }

    private List<Modelo_categoria> cargarCategorias() {
        List<Modelo_categoria> lista = new ArrayList<>();

        try {
            URL url = new URL(BASE_URL);
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
                    JSONObject jsonCategoria = jsonArray.getJSONObject(i);
                    Modelo_categoria categoria = new Modelo_categoria();
                    categoria.setId(jsonCategoria.getInt("id"));
                    categoria.setDescripcion(jsonCategoria.getString("nombre_categoria"));
                    lista.add(categoria);
                }

                System.out.println("Carga exitosa de la tabla categoria \n");
            } else {
                System.out.println("Error al cargar categorias: " + conn.getResponseMessage());
            }

        } catch (Exception e) {
            System.out.println("Error al cargar las categorias: " + e.getMessage());
            e.printStackTrace();
        }

        return lista;
    }

    public List<Modelo_categoria> getListaCategorias() {
        if (listaCategoria == null || listaCategoria.isEmpty()) {
            listaCategoria = cargarCategorias();
        }
        return listaCategoria;
    }

    // Método para guardar categoría en la base de datos
    public boolean guardar(Modelo_categoria objeto) throws JSONException {
        boolean respuesta = false;
        String jsonInputString = new JSONObject()
                .put("id", objeto.getId())
                .put("nombre_categoria", objeto.getDescripcion())
                .toString();

        try {
            URL url = new URL(BASE_URL);
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
                respuesta = true;
                System.out.println("Categoría guardada con éxito.");
            } else {
                System.out.println("Error al guardar categoria: " + conn.getResponseMessage());
            }

        } catch (Exception e) {
            System.out.println("Error al guardar categoria: " + e.getMessage());
        }
        return respuesta;
    }

    // Método para eliminar categorias
    public boolean eliminar(int idCategoria) {
        boolean respuesta = false;

        try {
            URL url = new URL(BASE_URL + "/" + idCategoria); // Suponiendo que la API tiene un endpoint para eliminar por ID
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("DELETE");

            // Leer la respuesta
            if (conn.getResponseCode() == 204) { // 204 No Content
                respuesta = true;
                System.out.println("Categoría eliminada con éxito.");
            } else {
                System.out.println("Error al eliminar categoria: " + conn.getResponseMessage());
            }

        } catch (Exception e) {
            System.out.println("Error al eliminar categoria: " + e.getMessage());
        }

        return respuesta;
    }

}
