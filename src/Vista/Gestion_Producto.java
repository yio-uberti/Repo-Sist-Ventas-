package Vista;

//Importaciones
import Controladores.control_Cat_Proveedor;
import Modelos.Modelo_categoria;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.json.*;

public class Gestion_Producto extends javax.swing.JInternalFrame {

    public Gestion_Producto() {
        initComponents();
        this.setTitle("Gestion de Productos");
        this.setSize(new Dimension(1230, 650));

        jTable_Producto.getTableHeader().setReorderingAllowed(false); //para bloquear las columnas del usuario
        cargarCategoriasEnComboBox();
        agregarListeners();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JDesktopPane desktopPane = getDesktopPane();
                if (desktopPane != null) {
                    Dimension desktopSize = desktopPane.getSize();
                    Dimension jInternalFrameSize = getSize();
                    setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                            (desktopSize.height - jInternalFrameSize.height) / 2);
                }
            }
        });
    }

    private void cargarCategoriasEnComboBox() {
        // Crear instancia del controlador y de categorias
        control_Cat_Proveedor controlCategoria = new control_Cat_Proveedor();
        List<Modelo_categoria> categorias = controlCategoria.getListaCategorias();

        // Agregar categorías al JComboBox
        for (Modelo_categoria categoria : categorias) {
            jComboCategoria.addItem(categoria);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboCategoria = new javax.swing.JComboBox<>();
        txtPrecioNuevo = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        BotonBuscador = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Producto = new javax.swing.JTable();
        txtPrecioActual = new javax.swing.JTextField();
        txtNombreSeleccionado = new javax.swing.JTextField();
        BotonActualizar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        txtPrecioNuevoColectiva = new javax.swing.JTextField();
        BotonActualizarTodo = new javax.swing.JButton();
        titEliminar = new javax.swing.JLabel();
        titBuscador = new javax.swing.JLabel();
        titActualizacion2 = new javax.swing.JLabel();
        titActualizacion1 = new javax.swing.JLabel();
        titCategoria = new javax.swing.JLabel();
        titNombrePro = new javax.swing.JLabel();
        titPrecio = new javax.swing.JLabel();
        titNombrePro1 = new javax.swing.JLabel();
        titPrecio1 = new javax.swing.JLabel();
        titPrecio2 = new javax.swing.JLabel();
        BotonLimpiarTabla = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_wallpapaer = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboCategoria.setBackground(new java.awt.Color(255, 255, 255));
        jComboCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboCategoria.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jComboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 310, 50));

        txtPrecioNuevo.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioNuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioNuevo.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioNuevo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtPrecioNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 230, 40));

        txtNombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 300, 50));

        BotonBuscador.setBackground(new java.awt.Color(51, 153, 255));
        BotonBuscador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonBuscador.setForeground(new java.awt.Color(0, 0, 0));
        BotonBuscador.setText("BUSCAR");
        BotonBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscadorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 200, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Producto.setBackground(new java.awt.Color(255, 255, 255));
        jTable_Producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable_Producto.setForeground(new java.awt.Color(0, 0, 0));
        jTable_Producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Tipo", "Categoria", "Precio"
            }
        ));
        jTable_Producto.setRowHeight(30);
        jScrollPane1.setViewportView(jTable_Producto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 1160, 230));

        txtPrecioActual.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioActual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioActual.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioActual.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecioActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActualActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecioActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 230, 40));

        txtNombreSeleccionado.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreSeleccionado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreSeleccionado.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSeleccionadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 310, 40));

        BotonActualizar.setBackground(new java.awt.Color(0, 204, 255));
        BotonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonActualizar.setForeground(new java.awt.Color(0, 0, 0));
        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 390, 250, 90));

        BotonBorrar.setBackground(new java.awt.Color(255, 0, 0));
        BotonBorrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonBorrar.setForeground(new java.awt.Color(0, 0, 0));
        BotonBorrar.setText("Eliminar");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 170, 60));

        txtPrecioNuevoColectiva.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioNuevoColectiva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioNuevoColectiva.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioNuevoColectiva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtPrecioNuevoColectiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 230, 40));

        BotonActualizarTodo.setBackground(new java.awt.Color(0, 204, 255));
        BotonActualizarTodo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonActualizarTodo.setForeground(new java.awt.Color(0, 0, 0));
        BotonActualizarTodo.setText("Actualizar Todo");
        BotonActualizarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarTodoActionPerformed(evt);
            }
        });
        getContentPane().add(BotonActualizarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 250, 80));

        titEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titEliminar.setForeground(new java.awt.Color(0, 0, 0));
        titEliminar.setText("Seleccione el producto a eliminar de la tabla...");
        getContentPane().add(titEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        titBuscador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titBuscador.setForeground(new java.awt.Color(0, 0, 0));
        titBuscador.setText("Buscador de Productos:");
        getContentPane().add(titBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        titActualizacion2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titActualizacion2.setForeground(new java.awt.Color(0, 0, 0));
        titActualizacion2.setText("Actualizacion Colectiva:");
        getContentPane().add(titActualizacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        titActualizacion1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titActualizacion1.setForeground(new java.awt.Color(0, 0, 0));
        titActualizacion1.setText("Actualizacion Unitaria:");
        getContentPane().add(titActualizacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        titCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titCategoria.setForeground(new java.awt.Color(0, 0, 0));
        titCategoria.setText("Selecione Categoria:");
        getContentPane().add(titCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));

        titNombrePro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titNombrePro.setForeground(new java.awt.Color(0, 0, 0));
        titNombrePro.setText("Nombre del Producto:");
        getContentPane().add(titNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 40));

        titPrecio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titPrecio.setForeground(new java.awt.Color(0, 0, 0));
        titPrecio.setText("Precio Nuevo:");
        getContentPane().add(titPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 100, 30));

        titNombrePro1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titNombrePro1.setForeground(new java.awt.Color(0, 0, 0));
        titNombrePro1.setText("Nombre del Producto:");
        getContentPane().add(titNombrePro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, 30));

        titPrecio1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titPrecio1.setForeground(new java.awt.Color(0, 0, 0));
        titPrecio1.setText("Precio Actual:");
        getContentPane().add(titPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 100, 40));

        titPrecio2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titPrecio2.setForeground(new java.awt.Color(0, 0, 0));
        titPrecio2.setText("Precio Nuevo:");
        getContentPane().add(titPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 100, 40));

        BotonLimpiarTabla.setBackground(new java.awt.Color(255, 0, 0));
        BotonLimpiarTabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonLimpiarTabla.setForeground(new java.awt.Color(0, 0, 0));
        BotonLimpiarTabla.setText("Limpiar tabla");
        BotonLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarTablaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonLimpiarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 200, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 1160, 110));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1160, 120));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 590, 100));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 560, 100));

        jLabel_wallpapaer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo7.png"))); // NOI18N
        getContentPane().add(jLabel_wallpapaer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActualActionPerformed

    //Boton de busqueda de productos
    private void BotonBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscadorActionPerformed
        // Configurar la tabla antes de la consulta
        DefaultTableModel model = (DefaultTableModel) jTable_Producto.getModel();
        model.setRowCount(0);

        String nombrePro = txtNombreProducto.getText().trim();
        Modelo_categoria categoriaSeleccionada = (Modelo_categoria) jComboCategoria.getSelectedItem();

        // Verificar que se haya ingresado un nombre de producto
        if (nombrePro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del producto que desea buscar...");
            return;
        }

        // Verificar que se haya seleccionado una categoría
        if (categoriaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una categoría válida.");
            return;
        }

        // Realizar la solicitud a la API
        try {
            // Codificar el nombre del producto para evitar errores con espacios o caracteres especiales
            String nombreProEncoded = URLEncoder.encode(nombrePro, "UTF-8");

            // Modificar la URL para buscar con coincidencias parciales
            String apiUrl = "http://localhost:8080/ApiRest/Prod/buscador?nombre=" + nombreProEncoded + "&categoriaId=" + categoriaSeleccionada.getId();
            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");

            // Leer la respuesta de la API
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            // Cerrar las conexiones
            in.close();
            con.disconnect();

            // Parsear el JSON recibido
            JSONArray productos = new JSONArray(content.toString());

            // Verificar si hay resultados
            if (productos.length() == 0) {
                JOptionPane.showMessageDialog(this, "No se encontraron productos que coincidan con los criterios.");
                return;
            }

            // Recorrer los resultados y agregarlos al modelo de la tabla
            for (int i = 0; i < productos.length(); i++) {
                JSONObject producto = productos.getJSONObject(i);
                model.addRow(new Object[]{
                    producto.getString("cod_barra"),
                    producto.getString("nombre"),
                    producto.getString("tipo"),
                    producto.getInt("categoria_id"),
                    producto.getDouble("precio_actual")
                });

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error de búsqueda: " + e.getMessage());
        }
    }//GEN-LAST:event_BotonBuscadorActionPerformed

    private void txtNombreSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSeleccionadoActionPerformed

    // Método donde agregas el MouseListener
    private void agregarListeners() {
        jTable_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = jTable_Producto.getSelectedRow();
                if (selectedRow != -1) {
                    String nombreProducto = jTable_Producto.getValueAt(selectedRow, 2).toString(); // Columna 1 para nombre
                    String precioActual = jTable_Producto.getValueAt(selectedRow, 4).toString(); // Columna 4 para precio

                    txtNombreSeleccionado.setText(nombreProducto);
                    txtPrecioActual.setText(precioActual);
                }
            }
        });
    }

    //Boton para la actualiizacion unitaria
    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        int selectedRow = jTable_Producto.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto de la tabla para actualizar.");
            return;
        }

        String codigoProducto = jTable_Producto.getValueAt(selectedRow, 0).toString();
        String nuevoPrecioTexto = txtPrecioNuevo.getText();

        if (nuevoPrecioTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nuevo precio.");
            return;
        }

        try {
            double nuevoPrecio = Double.parseDouble(nuevoPrecioTexto);

            // Actualizar el precio a través de la API
            String apiUrl = "http://localhost:8080/ApiRest/Prod/modificar-precio" + codigoProducto;
            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("PUT");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);

            // Crear el cuerpo de la solicitud en JSON
            String jsonInputString = "{\"precio_actual\": " + nuevoPrecio + "}";
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Leer la respuesta de la API
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            con.disconnect();

            // Actualizar la tabla si la respuesta fue exitosa
            jTable_Producto.setValueAt(nuevoPrecio, selectedRow, 4);
            JOptionPane.showMessageDialog(this, "Precio actualizado correctamente.");
            limpiarTabla();
            txtNombreSeleccionado.setText("");
            txtPrecioActual.setText("");
            txtPrecioNuevo.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Precio no válido.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_BotonActualizarActionPerformed

    //Boton para eliminar productos de tabla a la hora de actualizacion colectiva
    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable_Producto.getModel();

        int selectedRow = jTable_Producto.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para eliminarlo de la tabla");
            return;
        }

        model.removeRow(selectedRow);
    }//GEN-LAST:event_BotonBorrarActionPerformed

    //Boton de actualizacion colectiva
    private void BotonActualizarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarTodoActionPerformed
        if (txtPrecioNuevoColectiva.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un nuevo precio antes de actualizar.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable_Producto.getModel();
        double nuevoPrecio = Double.parseDouble(txtPrecioNuevoColectiva.getText());

        // Crear una lista para los productos a actualizar
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("[");

        for (int i = 0; i < model.getRowCount(); i++) {
            String nombreProducto = model.getValueAt(i, 1).toString();

            // Crear el objeto JSON para el producto
            jsonBuilder.append("{")
                    .append("\"nombreProducto\": \"").append(nombreProducto).append("\", ")
                    .append("\"precioActual\": ").append(nuevoPrecio)
                    .append("}");

            // Agregar una coma si no es el último producto
            if (i < model.getRowCount() - 1) {
                jsonBuilder.append(", ");
            }
        }

        jsonBuilder.append("]"); // Cerrar el arreglo JSON
        String jsonInputString = jsonBuilder.toString();

        // Enviar actualizaciones a la API
        try {
            // Configurar la conexión
            URL url = new URL("http://localhost:8080/ApiRest/Prod/modificar-precio-colectivo");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);

            // Enviar el JSON construido
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Leer la respuesta de la API
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder content = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();

            // Recargar los datos actualizados en la tabla
            recargarDatosEnTabla();
            JOptionPane.showMessageDialog(this, "Actualización Exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se pudo realizar la actualización");
            e.printStackTrace();
        }
    }//GEN-LAST:event_BotonActualizarTodoActionPerformed

    // Método para recargar los datos en la tabla
    private void recargarDatosEnTabla() {
        String apiUrl = "http://localhost:8080/ApiRest/Prod?updated=true";
        DefaultTableModel model = (DefaultTableModel) jTable_Producto.getModel();

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");

            // Verificar el código de respuesta
            int responseCode = con.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                throw new IOException("HTTP error code: " + responseCode);
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            con.disconnect();

            // Parsear el JSON recibido
            JSONArray productos = new JSONArray(content.toString());

            // Limpiar la tabla antes de volver a llenarla
            model.setRowCount(0);

            // Recorrer los resultados y agregarlos al modelo de la tabla
            for (int i = 0; i < productos.length(); i++) {
                JSONObject producto = productos.getJSONObject(i);
                model.addRow(new Object[]{
                    producto.getString("cod_barra"),
                    producto.getString("nombre"),
                    producto.getString("tipo"),
                    producto.getInt("categoria_id"),
                    producto.getDouble("precio_actual")
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos");
            e.printStackTrace();
        }
    }

    //Boton para limpiar la tabla en caso de busqueda erronea
    private void BotonLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarTablaActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_BotonLimpiarTablaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonActualizarTodo;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonBuscador;
    private javax.swing.JButton BotonLimpiarTabla;
    private javax.swing.JComboBox<Object> jComboCategoria;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_wallpapaer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Producto;
    private javax.swing.JLabel titActualizacion1;
    private javax.swing.JLabel titActualizacion2;
    private javax.swing.JLabel titBuscador;
    private javax.swing.JLabel titCategoria;
    private javax.swing.JLabel titEliminar;
    private javax.swing.JLabel titNombrePro;
    private javax.swing.JLabel titNombrePro1;
    private javax.swing.JLabel titPrecio;
    private javax.swing.JLabel titPrecio1;
    private javax.swing.JLabel titPrecio2;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNombreSeleccionado;
    private javax.swing.JTextField txtPrecioActual;
    private javax.swing.JTextField txtPrecioNuevo;
    private javax.swing.JTextField txtPrecioNuevoColectiva;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) jTable_Producto.getModel();
        model.setRowCount(0); // Esto limpiará todas las filas de la tabla

    }

}
