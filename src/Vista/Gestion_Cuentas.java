package Vista;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.SwingUtilities;
import Modelos.Modelo_Cuenta;
import Controladores.control_Cuenta;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.json.*;

public class Gestion_Cuentas extends javax.swing.JInternalFrame {

    public int idCuentas = 0;
    public int idSeleccionado = 0;

    public Gestion_Cuentas() {
        initComponents();
        this.setTitle("Alta y Gestion de Cuentas");
        this.setSize(new Dimension(1000, 400));

        // Centrar el JInternalFrame en su contenedor principal
        SwingUtilities.invokeLater(new Runnable() {
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

        this.cargarCuentas();
        this.agregarListeners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreCuenta = new javax.swing.JTextField();
        BotonIngresar = new javax.swing.JButton();
        titGestion = new javax.swing.JLabel();
        titAlta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BotonEliminar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCuentas = new javax.swing.JTable();
        txtNuevoNombre = new javax.swing.JTextField();
        titSeleccion1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jwallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreCuenta.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCuenta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNombreCuenta.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 270, 40));

        BotonIngresar.setBackground(new java.awt.Color(0, 204, 102));
        BotonIngresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonIngresar.setForeground(new java.awt.Color(0, 0, 0));
        BotonIngresar.setText("Ingresar");
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 270, 50));

        titGestion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titGestion.setForeground(new java.awt.Color(0, 0, 0));
        titGestion.setText("Gestion de Cuentas");
        getContentPane().add(titGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        titAlta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titAlta.setForeground(new java.awt.Color(0, 0, 0));
        titAlta.setText("Ingreso de Nueva Cuenta");
        getContentPane().add(titAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 300, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre de la Cuenta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 200, 40));

        BotonEliminar.setBackground(new java.awt.Color(255, 0, 0));
        BotonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 180, 50));

        BotonActualizar.setBackground(new java.awt.Color(0, 204, 102));
        BotonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonActualizar.setForeground(new java.awt.Color(0, 0, 0));
        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 180, 50));

        tablaCuentas.setBackground(new java.awt.Color(255, 255, 255));
        tablaCuentas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tablaCuentas.setForeground(new java.awt.Color(0, 0, 0));
        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tablaCuentas.setRowHeight(25);
        jScrollPane1.setViewportView(tablaCuentas);
        if (tablaCuentas.getColumnModel().getColumnCount() > 0) {
            tablaCuentas.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablaCuentas.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 370, 280));

        txtNuevoNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNuevoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNuevoNombre.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNuevoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 180, 30));

        titSeleccion1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titSeleccion1.setForeground(new java.awt.Color(0, 0, 0));
        titSeleccion1.setText("Nuevo Nombre");
        getContentPane().add(titSeleccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, -1, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 600, 350));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 350));

        jwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg"))); // NOI18N
        getContentPane().add(jwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método donde agregas el MouseListener
    private void agregarListeners() {
        tablaCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = tablaCuentas.getSelectedRow();
                if (selectedRow != -1) {
                    idCuentas = (int) tablaCuentas.getValueAt(selectedRow, 0);

                }
            }
        });
    }

    //Boton para ingresar una nueva cuenta
    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed

        Modelo_Cuenta cuenta = new Modelo_Cuenta();
        control_Cuenta cont = new control_Cuenta();

        cuenta.setDescripcion(txtNombreCuenta.getText().trim());

        if (txtNombreCuenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de la cuenta");
            txtNombreCuenta.setBackground(Color.red);

        } else {
            cuenta.setDescripcion(txtNombreCuenta.getText().trim());
            try {
                if (cont.guardar(cuenta)) {
                    JOptionPane.showMessageDialog(null, "Guardado exitoso");
                    txtNombreCuenta.setBackground(Color.white);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                }
            } catch (JSONException ex) {
                Logger.getLogger(Gestion_Cuentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        txtNombreCuenta.setText("");

    }//GEN-LAST:event_BotonIngresarActionPerformed

    //Boton Actualizar
    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed

        int select = tablaCuentas.getSelectedRow();

        if (select != -1) {
            if (!txtNuevoNombre.getText().isEmpty()) {
                String nuevoNombre = txtNuevoNombre.getText().trim();

                // Obtener el ID seleccionado como un Integer
                try {
                    idCuentas = Integer.parseInt(tablaCuentas.getValueAt(select, 0).toString());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error al obtener el ID de la cuenta seleccionada.");
                    return;
                }

                if (idCuentas <= 0) {
                    JOptionPane.showMessageDialog(null, "No se ha seleccionado una cuenta válida para actualizar");
                    return;
                }

                // Conectar a la API y enviar la actualización
                try {
                    URL url = new URL("http://localhost:8080/ApiRest/Cuen/" + idCuentas);  // URL de tu API
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    con.setRequestMethod("PUT");  // Usamos PUT para actualizar
                    con.setRequestProperty("Content-Type", "application/json");
                    con.setDoOutput(true);

                    // Crear el objeto JSON para enviar los datos
                    JSONObject cuentaJson = new JSONObject();
                    cuentaJson.put("nombreCuenta", nuevoNombre);

                    // Enviar los datos JSON a la API
                    try (OutputStream os = con.getOutputStream()) {
                        byte[] input = cuentaJson.toString().getBytes("utf-8");
                        os.write(input, 0, input.length);
                    }

                    // Verificar la respuesta de la API
                    int responseCode = con.getResponseCode();
                    if (responseCode == HttpURLConnection.HTTP_OK) {
                        JOptionPane.showMessageDialog(null, "Nombre de cuenta actualizado con éxito");
                        txtNuevoNombre.setText("");  // Limpiar el campo de texto
                        this.cargarCuentas(); // Recargar la tabla para mostrar los cambios
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al actualizar la cuenta. Código de respuesta: " + responseCode);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al conectarse a la API: " + e.getMessage());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una categoría y escriba un nuevo nombre");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una Cuenta");
        }
    }//GEN-LAST:event_BotonActualizarActionPerformed

    //Boton para eliminar la cuenta
    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        int select = tablaCuentas.getSelectedRow();

        if (select != -1) {
            idCuentas = Integer.parseInt(tablaCuentas.getValueAt(select, 0).toString());

            control_Cuenta cont = new control_Cuenta();

            if (!cont.eliminar(idCuentas)) {
                JOptionPane.showMessageDialog(null, "Cuenta eliminada");
                this.cargarCuentas();

            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar Cuenta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione una Cuenta");
        }

    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void txtNombreCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCuentaActionPerformed

    private void cargarCuentas() {
        // Crear el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");

        // URL de la API que devuelve las cuentas
        String apiURL = "http://localhost:8080/ApiRest/Cuen";

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
                JSONArray cuentasArray = new JSONArray(content.toString());

                // Recorrer los elementos del array y agregarlos al modelo de la tabla
                for (int i = 0; i < cuentasArray.length(); i++) {
                    JSONObject cuenta = cuentasArray.getJSONObject(i);
                    Object[] row = new Object[2];
                    row[0] = cuenta.getInt("id");
                    row[1] = cuenta.getString("nombreCuenta");
                    model.addRow(row);
                }

                // Asignar el modelo a la tabla
                tablaCuentas.setModel(model);
                tablaCuentas.getColumnModel().getColumn(0).setPreferredWidth(10);  // Ajustar el ancho de las columnas si es necesario
                tablaCuentas.getColumnModel().getColumn(1).setPreferredWidth(150);

            } else {
                JOptionPane.showMessageDialog(null, "Error al cargar cuentas. Código de respuesta: " + responseCode);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la API: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jwallpaper;
    private static javax.swing.JTable tablaCuentas;
    private javax.swing.JLabel titAlta;
    private javax.swing.JLabel titGestion;
    private javax.swing.JLabel titSeleccion1;
    private javax.swing.JTextField txtNombreCuenta;
    private javax.swing.JTextField txtNuevoNombre;
    // End of variables declaration//GEN-END:variables
}
