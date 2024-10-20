package Vista;

import Controladores.control_Cuenta;
import Modelos.Modelo_Cuenta;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

public class Historial_Anterior extends javax.swing.JInternalFrame {

    public Historial_Anterior() {

        initComponents();
        this.setTitle("Historial de Ventas Anteriores");
        this.setSize(new Dimension(1290, 650));

        cargarCuentasComboBox();

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

    private void cargarCuentasComboBox() {
        control_Cuenta cont = new control_Cuenta();
        List<Modelo_Cuenta> cuentas = cont.getListaCuentas();

        jComboCuenta.removeAllItems();

        jComboCuenta.addItem("Seleccionar...");

        for (Modelo_Cuenta cuenta : cuentas) {
            jComboCuenta.addItem(cuenta);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBotonBuscar = new javax.swing.JButton();
        TxtFecha = new javax.swing.JTextField();
        jComboCuenta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        txtTotalGeneral = new javax.swing.JTextField();
        txtTransferencia = new javax.swing.JTextField();
        txtComida = new javax.swing.JTextField();
        txtDulce = new javax.swing.JTextField();
        txtKiosco = new javax.swing.JTextField();
        txtPanaderia = new javax.swing.JTextField();
        jComboTipoPago = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        marco1 = new javax.swing.JLabel();
        marco2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDescripcionVentas = new javax.swing.JTable();
        jwallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBotonBuscar.setBackground(new java.awt.Color(0, 153, 204));
        jBotonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBotonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jBotonBuscar.setText("Buscar");
        jBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 870, 30));

        TxtFecha.setBackground(new java.awt.Color(255, 255, 255));
        TxtFecha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtFecha.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(TxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 270, 30));

        jComboCuenta.setBackground(new java.awt.Color(255, 255, 255));
        jComboCuenta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboCuenta.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jComboCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 270, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese una Fecha:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione el tipo de pago que desea ver:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 360, 30));

        txtEfectivo.setBackground(new java.awt.Color(255, 255, 255));
        txtEfectivo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtEfectivo.setForeground(new java.awt.Color(0, 0, 0));
        txtEfectivo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEfectivoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 160, 300, 40));

        txtTotalGeneral.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalGeneral.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtTotalGeneral.setForeground(new java.awt.Color(0, 0, 0));
        txtTotalGeneral.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalGeneral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 4));
        txtTotalGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalGeneralActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotalGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 60, 300, 60));

        txtTransferencia.setBackground(new java.awt.Color(255, 255, 255));
        txtTransferencia.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtTransferencia.setForeground(new java.awt.Color(0, 0, 0));
        txtTransferencia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 240, 300, 40));

        txtComida.setBackground(new java.awt.Color(255, 255, 255));
        txtComida.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtComida.setForeground(new java.awt.Color(0, 0, 0));
        txtComida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 330, 200, 40));

        txtDulce.setBackground(new java.awt.Color(255, 255, 255));
        txtDulce.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtDulce.setForeground(new java.awt.Color(0, 0, 0));
        txtDulce.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtDulce, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 540, 200, 40));

        txtKiosco.setBackground(new java.awt.Color(255, 255, 255));
        txtKiosco.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtKiosco.setForeground(new java.awt.Color(0, 0, 0));
        txtKiosco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtKiosco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 400, 200, 40));

        txtPanaderia.setBackground(new java.awt.Color(255, 255, 255));
        txtPanaderia.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtPanaderia.setForeground(new java.awt.Color(0, 0, 0));
        txtPanaderia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtPanaderia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 470, 200, 40));

        jComboTipoPago.setBackground(new java.awt.Color(255, 255, 255));
        jComboTipoPago.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboTipoPago.setForeground(new java.awt.Color(0, 0, 0));
        jComboTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Efectivo", "Transferencia" }));
        getContentPane().add(jComboTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 250, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Total:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 30, 70, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Total Transferencia:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 210, 180, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total Efectivo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dulce");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, 120, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Comida");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, 110, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Kiosco");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 400, 110, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Panaderia");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 120, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Seleccione una cuenta:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, 30));

        marco1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        marco1.setForeground(new java.awt.Color(0, 0, 0));
        marco1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(marco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 340, 290));

        marco2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        getContentPane().add(marco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, 340, 290));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableDescripcionVentas.setBackground(new java.awt.Color(255, 255, 255));
        jTableDescripcionVentas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTableDescripcionVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableDescripcionVentas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableDescripcionVentas.setColumnSelectionAllowed(true);
        jTableDescripcionVentas.setEnabled(false);
        jTableDescripcionVentas.setFillsViewportHeight(true);
        jTableDescripcionVentas.setGridColor(new java.awt.Color(255, 255, 255));
        jTableDescripcionVentas.setPreferredSize(new java.awt.Dimension(1000, 0));
        jTableDescripcionVentas.setRowHeight(30);
        jScrollPane1.setViewportView(jTableDescripcionVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, 870, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 870, 470));

        jwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg"))); // NOI18N
        getContentPane().add(jwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Busqueda de ls ventas pasada 
    private void jBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarActionPerformed

        Object cuentaSeleccionada = jComboCuenta.getSelectedItem();
        String tipoPago = (String) jComboTipoPago.getSelectedItem(); // Obtener el tipo de pago
        String fecha = TxtFecha.getText().trim();
        int id = 0;

        if (!fecha.matches("\\d{2}/\\d{2}/\\d{4}")) { // Validar el formato de la fecha
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida o revise el formato. Use el formato DD/MM/AAAA");
        } else {
            if (cuentaSeleccionada instanceof Modelo_Cuenta cuenta) {
                id = cuenta.getId();
                System.out.println("ID seleccionado: " + id);

                // Convertir la fecha de DD/MM/AAAA a yyyy-MM-dd
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                // Parsear la fecha y luego formatearla
                LocalDate fechaConvertida = LocalDate.parse(fecha, inputFormatter);
                String fechaFormateada = fechaConvertida.format(outputFormatter);

                // Construir la URL con tipo de pago, fecha y cuenta
                String urlAPI = "http://localhost:8080/ApiRest/Ven/buscar-ventas?fecha=" + fechaFormateada + "&idCuenta=" + id;

                // Si se ha seleccionado un tipo de pago, lo incluimos en la URL
                if (tipoPago != null && !tipoPago.equals("Seleccionar")) {
                    urlAPI += "&tipoPago=" + tipoPago;
                }

                // Mostrar la URL en la consola (opcional)
                System.out.println("URL API: " + urlAPI);

                
                // Resto del código para realizar la consulta y mostrar resultados en la tabla
                DefaultTableModel model = new DefaultTableModel();
                
                try {
                    // Hacer una solicitud GET a la API
                    URL url = new URL(urlAPI);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    con.setRequestMethod("GET");
                    con.setRequestProperty("Content-Type", "application/json");
                    con.setDoOutput(true);

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

                    // Parsear el JSON usando org.json
                    JSONArray ventasArray = new JSONArray(content.toString());

                    // Agregar columnas al modelo
                    model.addColumn("Detalle");
                    model.addColumn("Kiosco");
                    model.addColumn("Panaderia");
                    model.addColumn("Comida");
                    model.addColumn("Dulces");
                    model.addColumn("Monto");
                    model.addColumn("Hora de Venta");

                    // Para almacenar el total de la venta
                    double totalVenta = 0, totalEfectivo = 0, totalTransferencia = 0,
                            totalComida = 0, totalKiosco = 0, totalPanaderia = 0, totalDulce = 0;

                    // Formatos de fecha
                    SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); // Ajusta a ISO 8601
                    SimpleDateFormat desiredFormat = new SimpleDateFormat("dd/MM HH:mm");

                    // Iterar a través del JSONArray de ventas
                    for (int i = 0; i < ventasArray.length(); i++) {
                        JSONObject venta = ventasArray.getJSONObject(i);
                        Object[] row = new Object[7];
                        row[0] = venta.getString("detalle");
                        row[1] = venta.getDouble("monto_kiosco");
                        row[2] = venta.getDouble("monto_panaderia");
                        row[3] = venta.getDouble("monto_comida");
                        row[4] = venta.getDouble("monto_postre");
                        row[5] = venta.getDouble("monto_total");

                        totalVenta += venta.getDouble("monto_total");

                        if ("Efectivo".equals(venta.getString("detalle"))) {
                            totalEfectivo += venta.getDouble("monto_total");
                        } else if ("Transferencia".equals(venta.getString("detalle"))) {
                            totalTransferencia += venta.getDouble("monto_total");
                        }

                        totalKiosco += venta.getDouble("monto_kiosco");
                        totalPanaderia += venta.getDouble("monto_panaderia");
                        totalComida += venta.getDouble("monto_comida");
                        totalDulce += venta.getDouble("monto_postre");

                        // Formatear la fecha y hora
                        String horaVenta = venta.getString("hora_venta");
                        try {
                            Date fechaHora = inputFormat.parse(horaVenta); // Usar inputFormat para parsear
                            row[6] = desiredFormat.format(fechaHora); // Formatear usando desiredFormat
                        } catch (ParseException e) {
                            e.printStackTrace();
                            row[6] = "Error en formato"; // O algún valor por defecto
                        }

                        model.addRow(row);
                    }

                    // Asignar el modelo a la tabla jTableDescripcionHistorial
                    Historial_Anterior.jTableDescripcionVentas.setModel(model);
                    txtTotalGeneral.setText(String.valueOf(totalVenta));
                    //Ventas segun tipo de pago
                    txtEfectivo.setText(String.valueOf(totalEfectivo));
                    txtTransferencia.setText(String.valueOf(totalTransferencia));

                    //Clasificacion del usuario
                    txtKiosco.setText(String.valueOf(totalKiosco));
                    txtPanaderia.setText(String.valueOf(totalPanaderia));
                    txtComida.setText(String.valueOf(totalComida));
                    txtDulce.setText(String.valueOf(totalDulce));

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error al cargar las ventas: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una cuenta");
            }
        }
    }//GEN-LAST:event_jBotonBuscarActionPerformed

    private void txtEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEfectivoActionPerformed

    private void txtTotalGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalGeneralActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JButton jBotonBuscar;
    private javax.swing.JComboBox<Object> jComboCuenta;
    private javax.swing.JComboBox<String> jComboTipoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTableDescripcionVentas;
    private javax.swing.JLabel jwallpaper;
    private javax.swing.JLabel marco1;
    private javax.swing.JLabel marco2;
    private javax.swing.JTextField txtComida;
    private javax.swing.JTextField txtDulce;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtKiosco;
    private javax.swing.JTextField txtPanaderia;
    private javax.swing.JTextField txtTotalGeneral;
    private javax.swing.JTextField txtTransferencia;
    // End of variables declaration//GEN-END:variables
}
