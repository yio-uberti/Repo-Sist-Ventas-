package Vista;

//Importaciones
import Controladores.control_Cat_Proveedor;
import Modelos.Modelo_categoria;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;
import org.json.*;

public class Gestion_Categoria extends javax.swing.JInternalFrame {

    public int idCategoria = 0;

    public Gestion_Categoria() {
        initComponents();
        setTitle("Alta y Gestion de Categoria");
        this.setSize(new Dimension(1000, 350));

        this.cargarCategoria();

        // Centrar el JInternalFrame en su contenedor principal
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombreCategoria = new javax.swing.JTextField();
        BotonIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreNuevo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCategoria = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jBotonEliminar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestion de Categoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 30));

        txtNombreCategoria.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCategoria.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNombreCategoria.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 300, 40));

        BotonIngresar.setBackground(new java.awt.Color(0, 204, 153));
        BotonIngresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonIngresar.setForeground(new java.awt.Color(0, 0, 0));
        BotonIngresar.setText("Ingresar");
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 300, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Categoria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ingreso de Nueva Categoria");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtNombreNuevo.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreNuevo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNombreNuevo.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreNuevo.setToolTipText("");
        getContentPane().add(txtNombreNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 180, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCategoria.setBackground(new java.awt.Color(255, 255, 255));
        jTableCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableCategoria.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTableCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jTableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCategoria.setRowHeight(25);
        jScrollPane1.setViewportView(jTableCategoria);
        if (jTableCategoria.getColumnModel().getColumnCount() > 0) {
            jTableCategoria.getColumnModel().getColumn(0).setResizable(false);
            jTableCategoria.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTableCategoria.getColumnModel().getColumn(1).setResizable(false);
            jTableCategoria.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 370, 240));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jBotonEliminar.setBackground(new java.awt.Color(255, 0, 0));
        jBotonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBotonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jBotonEliminar.setText("Eliminar");
        jBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonEliminarActionPerformed(evt);
            }
        });

        BotonActualizar.setBackground(new java.awt.Color(0, 204, 102));
        BotonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonActualizar.setForeground(new java.awt.Color(0, 0, 0));
        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 180, 120));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nuevo Nombre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 580, 300));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 300));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg"))); // NOI18N
        jLabel_wallpaper.setText("jLabel1");
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton para eliminar la categoria
    private void jBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonEliminarActionPerformed

        int select = jTableCategoria.getSelectedRow();

        if (select != -1) {
            idCategoria = Integer.parseInt(jTableCategoria.getValueAt(select, 0).toString());

            control_Cat_Proveedor cont = new control_Cat_Proveedor();

            if (!cont.eliminar(idCategoria)) {
                JOptionPane.showMessageDialog(null, "Categoria eliminada de manera exitosa");
                this.cargarCategoria();

            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar Categoria");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione un Categoria");
        }
        this.cargarCategoria();
    }//GEN-LAST:event_jBotonEliminarActionPerformed

    //Boton para ingresar una nueva categoria
    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed

        //Instanciamos
        Modelo_categoria cat = new Modelo_categoria();
        control_Cat_Proveedor cont = new control_Cat_Proveedor();

        cat.setDescripcion(txtNombreCategoria.getText().trim());
        //Validamos campos vacios
        if (txtNombreCategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de la categoria");
            txtNombreCategoria.setBackground(Color.red);

        } else {
            cat.setDescripcion(txtNombreCategoria.getText().trim());
            try {
                if (cont.guardar(cat)) {
                    JOptionPane.showMessageDialog(null, "Guardado exitoso");

                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }
            } catch (JSONException ex) {
                Logger.getLogger(Gestion_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        txtNombreCategoria.setText("");
        this.cargarCategoria();
    }//GEN-LAST:event_BotonIngresarActionPerformed

    //Boton de actulizacion o cambio del nombre de la categoria
    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed

        if (!txtNombreNuevo.getText().isEmpty()) {

            String nuevoNombre = txtNombreNuevo.getText().trim();

            // Definir la URL de la API (asegúrate de que sea la correcta en tu caso)
            String apiURL = "http://localhost:8080/ApiRest/Cate" + idCategoria;

            try {
                // Crear la conexión HTTP
                URL url = new URL(apiURL);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();

                // Configurar la conexión para enviar datos a través de POST o PUT
                con.setRequestMethod("PUT");
                con.setRequestProperty("Content-Type", "application/json");
                con.setDoOutput(true);  // Habilitar el envío de datos

                // Crear el cuerpo de la solicitud con el nuevo nombre de categoría
                String jsonInputString = "{\"nombre_categoria\": \"" + nuevoNombre + "\"}";

                // Enviar los datos a la API
                try (OutputStream os = con.getOutputStream()) {
                    byte[] input = jsonInputString.getBytes("utf-8");
                    os.write(input, 0, input.length);
                }

                // Verificar la respuesta de la API
                int responseCode = con.getResponseCode();

                if (responseCode == HttpURLConnection.HTTP_OK) {
                    JOptionPane.showMessageDialog(null, "Nombre de categoría actualizado con éxito");
                    txtNombreNuevo.setText("");  // Limpiar el campo de texto
                    this.cargarCategoria();  // Recargar la tabla para mostrar los cambios
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar la categoría. Código de respuesta: " + responseCode);
                }

                con.disconnect();  // Cerrar la conexión

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en la conexión a la API: " + e.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una categoría y escriba un nuevo nombre");
        }

// Recargar la tabla
        this.cargarCategoria();
    }//GEN-LAST:event_BotonActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton jBotonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableCategoria;
    private javax.swing.JTextField txtNombreCategoria;
    private javax.swing.JTextField txtNombreNuevo;
    // End of variables declaration//GEN-END:variables

    private void cargarCategoria() {
        // Crear el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");

        // URL de la API que devuelve las categorías
        String apiURL = "http://localhost:8080/ApiRest/Cate";

        try {
            // Crear la conexión HTTP a la API
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");

            // Verificar si la conexión fue exitosa (código 200)
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Leer la respuesta de la API
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                // Cerrar el flujo de entrada
                in.close();

                // Parsear la respuesta JSON
                JSONArray categoriasArray = new JSONArray(content.toString());

                // Recorrer los elementos del array y agregarlos al modelo de la tabla
                for (int i = 0; i < categoriasArray.length(); i++) {
                    JSONObject categoria = categoriasArray.getJSONObject(i);
                    Object[] row = new Object[2];
                    row[0] = categoria.getInt("id");
                    row[1] = categoria.getString("nombre_categoria");
                    model.addRow(row);
                }

                // Asignar el modelo a la tabla
                jTableCategoria.setModel(model);
                jTableCategoria.getTableHeader().setReorderingAllowed(false);

                // Ajustar el tamaño de las columnas
                jTableCategoria.getColumnModel().getColumn(0).setPreferredWidth(10);
                jTableCategoria.getColumnModel().getColumn(1).setPreferredWidth(150);

            } else {
                JOptionPane.showMessageDialog(null, "Error al cargar las categorías. Código de respuesta: " + responseCode);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la API: " + e.getMessage());
        }
    }

}
