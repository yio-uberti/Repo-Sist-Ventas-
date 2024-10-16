package Vista;

import Controladores.control_Cuenta;
import Modelos.Modelo_Cuenta;
import Modelos.Modelo_Venta;
import java.awt.*;
import javax.swing.JDesktopPane;
import javax.swing.SwingUtilities;
import javax.swing.*;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Historial_Ventas extends javax.swing.JInternalFrame {

    public Historial_Ventas() {

        initComponents();
        this.setTitle("Historial de Ventas del dia actual");
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

        //Bloqueo de txt para el usuario
        txtTotalGeneral.setEditable(false);
        txtEfectivo.setEditable(false);
        txtTransferencia.setEditable(false);
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

        titBuscador = new javax.swing.JLabel();
        jBotonBuscarPago = new javax.swing.JButton();
        jTipodePago = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDescripcionHistorial = new javax.swing.JTable();
        BotonGeneral = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jBotonBuscarFecha = new javax.swing.JButton();
        txtTotalGeneral = new javax.swing.JTextField();
        txtEfectivo = new javax.swing.JTextField();
        txtTransferencia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKiosco = new javax.swing.JTextField();
        txtComida = new javax.swing.JTextField();
        txtPanaderia = new javax.swing.JTextField();
        txtDulce = new javax.swing.JTextField();
        jComboCuenta = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jwallPaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titBuscador.setBackground(new java.awt.Color(0, 0, 0));
        titBuscador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titBuscador.setForeground(new java.awt.Color(0, 0, 0));
        titBuscador.setText("Buscador por tipo de pago :");
        getContentPane().add(titBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jBotonBuscarPago.setBackground(new java.awt.Color(0, 153, 255));
        jBotonBuscarPago.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jBotonBuscarPago.setForeground(new java.awt.Color(0, 0, 0));
        jBotonBuscarPago.setText("Buscar ");
        jBotonBuscarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarPagoActionPerformed(evt);
            }
        });
        getContentPane().add(jBotonBuscarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 120, 40));

        jTipodePago.setBackground(new java.awt.Color(255, 255, 255));
        jTipodePago.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTipodePago.setForeground(new java.awt.Color(0, 0, 0));
        jTipodePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Transferencia" }));
        getContentPane().add(jTipodePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableDescripcionHistorial.setBackground(new java.awt.Color(255, 255, 255));
        jTableDescripcionHistorial.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTableDescripcionHistorial.setForeground(new java.awt.Color(0, 0, 0));
        jTableDescripcionHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Detalle/Tipo de Pago", "Kiosco", "Panaderia", "Comida", "Postre", "Monto", "Hora y Fecha "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDescripcionHistorial.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableDescripcionHistorial.setColumnSelectionAllowed(true);
        jTableDescripcionHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableDescripcionHistorial.setEnabled(false);
        jTableDescripcionHistorial.setFillsViewportHeight(true);
        jTableDescripcionHistorial.setGridColor(new java.awt.Color(255, 255, 255));
        jTableDescripcionHistorial.setPreferredSize(new java.awt.Dimension(1000, 0));
        jTableDescripcionHistorial.setRequestFocusEnabled(false);
        jTableDescripcionHistorial.setRowHeight(30);
        jTableDescripcionHistorial.setShowGrid(false);
        jScrollPane1.setViewportView(jTableDescripcionHistorial);
        jTableDescripcionHistorial.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableDescripcionHistorial.getColumnModel().getColumnCount() > 0) {
            jTableDescripcionHistorial.getColumnModel().getColumn(0).setResizable(false);
            jTableDescripcionHistorial.getColumnModel().getColumn(0).setPreferredWidth(250);
            jTableDescripcionHistorial.getColumnModel().getColumn(1).setResizable(false);
            jTableDescripcionHistorial.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTableDescripcionHistorial.getColumnModel().getColumn(2).setResizable(false);
            jTableDescripcionHistorial.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTableDescripcionHistorial.getColumnModel().getColumn(3).setResizable(false);
            jTableDescripcionHistorial.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTableDescripcionHistorial.getColumnModel().getColumn(4).setResizable(false);
            jTableDescripcionHistorial.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTableDescripcionHistorial.getColumnModel().getColumn(5).setResizable(false);
            jTableDescripcionHistorial.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTableDescripcionHistorial.getColumnModel().getColumn(6).setResizable(false);
            jTableDescripcionHistorial.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 950, 500));

        BotonGeneral.setBackground(new java.awt.Color(102, 204, 255));
        BotonGeneral.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonGeneral.setForeground(new java.awt.Color(0, 0, 0));
        BotonGeneral.setText("Busqueda General");
        BotonGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGeneralActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 270, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Busqueda General :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscador por fecha : (ej: 01/05/2024)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 320, -1));

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 160, 40));

        jBotonBuscarFecha.setBackground(new java.awt.Color(0, 153, 255));
        jBotonBuscarFecha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jBotonBuscarFecha.setForeground(new java.awt.Color(0, 0, 0));
        jBotonBuscarFecha.setText("Buscar");
        jBotonBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarFechaActionPerformed(evt);
            }
        });
        getContentPane().add(jBotonBuscarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 120, 40));

        txtTotalGeneral.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalGeneral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTotalGeneral.setForeground(new java.awt.Color(0, 0, 0));
        txtTotalGeneral.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalGeneral.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 153, 153)));
        getContentPane().add(txtTotalGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 130, 240, 80));

        txtEfectivo.setBackground(new java.awt.Color(255, 255, 255));
        txtEfectivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEfectivo.setForeground(new java.awt.Color(0, 0, 0));
        txtEfectivo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 250, 230, 40));

        txtTransferencia.setBackground(new java.awt.Color(255, 255, 255));
        txtTransferencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTransferencia.setForeground(new java.awt.Color(0, 0, 0));
        txtTransferencia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransferenciaActionPerformed(evt);
            }
        });
        getContentPane().add(txtTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 230, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total de Transferencia");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Total de Efectivo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Total");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 50, -1));

        txtKiosco.setBackground(new java.awt.Color(255, 255, 255));
        txtKiosco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtKiosco.setForeground(new java.awt.Color(0, 0, 0));
        txtKiosco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtKiosco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 450, 150, 40));

        txtComida.setBackground(new java.awt.Color(255, 255, 255));
        txtComida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtComida.setForeground(new java.awt.Color(0, 0, 0));
        txtComida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 400, 150, 40));

        txtPanaderia.setBackground(new java.awt.Color(255, 255, 255));
        txtPanaderia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPanaderia.setForeground(new java.awt.Color(0, 0, 0));
        txtPanaderia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPanaderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPanaderiaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPanaderia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 500, 150, 40));

        txtDulce.setBackground(new java.awt.Color(255, 255, 255));
        txtDulce.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDulce.setForeground(new java.awt.Color(0, 0, 0));
        txtDulce.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDulce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDulceActionPerformed(evt);
            }
        });
        getContentPane().add(txtDulce, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 550, 150, 40));

        jComboCuenta.setBackground(new java.awt.Color(255, 255, 255));
        jComboCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboCuenta.setForeground(new java.awt.Color(0, 0, 0));
        jComboCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        jComboCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 230, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Comida");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 400, -1, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dulce");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 550, 50, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Kiosco");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 450, -1, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Panaderia");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 500, -1, 40));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 100, 270, 280));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 390, 270, 210));

        jwallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg"))); // NOI18N
        getContentPane().add(jwallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Busca la ventas segun el tipo de pago
    private void jBotonBuscarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarPagoActionPerformed
        // Obtener tipo de pago del JComboBox
        String tipoPago = (String) jTipodePago.getSelectedItem();

        // Obtener la fecha actual
        LocalDate today = LocalDate.now();
        String fecha = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Construir la URL
        String urlAPI = "http://localhost:8080/ApiRest/Ven/por-tipo-y-fecha?tipoPago=" + tipoPago + "&fecha=" + fecha;

        DefaultTableModel model = new DefaultTableModel();

        try {
            // Configurar conexión
            URL url = new URL(urlAPI);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);

            int responseCode = con.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                System.out.println("Error en la respuesta: " + responseCode);
                return;
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder content = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            // Cerrar las conexiones
            in.close();
            con.disconnect();

            JSONArray ventasArray = new JSONArray(content.toString());

            model.addColumn("Detalle");
            model.addColumn("Kiosco");
            model.addColumn("Panadería");
            model.addColumn("Comida");
            model.addColumn("Dulces");
            model.addColumn("Monto");
            model.addColumn("Hora de Venta");

            double totalVenta = 0, totalEfectivo = 0, totalTransferencia = 0,
                    totalComida = 0, totalKiosco = 0, totalPanaderia = 0, totalDulce = 0;

            // No necesitas formatear la fecha aquí
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

                // Extraer la hora completa de la venta
                String horaVenta = venta.getString("hora_venta");
                // Parsear la cadena a LocalDateTime
                LocalDateTime fechaHora = LocalDateTime.parse(horaVenta);

                // Crear formateadores para el día, mes y hora
                DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("dd/MM");
                DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm");

                // Formatear la fecha y la hora
                String fechaFormateada = fechaHora.format(fechaFormatter);//dia y mes
                String horaFormateada = fechaHora.format(horaFormatter);//hora y minuto

                // Combinar la fecha y la hora en el formato deseado
                row[6] = fechaFormateada + " " + horaFormateada;

                model.addRow(row);
            }

            Historial_Ventas.jTableDescripcionHistorial.setModel(model);
            txtTotalGeneral.setText(String.valueOf(totalVenta));
            //Ventas segun tipo pago
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
    }//GEN-LAST:event_jBotonBuscarPagoActionPerformed

    //Busqueda de todas las ventas realizadas en el dia 
    private void BotonGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGeneralActionPerformed
        // Formateamos la fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActual = dateFormat.format(new Date());
        Modelo_Cuenta cuentaSeleccionada = (Modelo_Cuenta) jComboCuenta.getSelectedItem();
        int id = 0;

        if (cuentaSeleccionada != null) {
            id = cuentaSeleccionada.getId();
            System.out.println("ID seleccionado: " + id);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una cuenta");
        }

        // URL de tu API que devuelve las ventas del día
        String urlAPI = "http://localhost:8080/ApiRest/Ven/por-fecha-y-cuenta?fecha=" + fechaActual + "&id=" + id;

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
            Historial_Ventas.jTableDescripcionHistorial.setModel(model);
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
    }//GEN-LAST:event_BotonGeneralActionPerformed

    private void jBotonBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarFechaActionPerformed
        String fecha = txtFecha.getText().trim(); // Obtener la fecha desde el campo de texto

        if (!fecha.matches("\\d{2}/\\d{2}/\\d{4}")) { // Validar el formato de la fecha
            JOptionPane.showMessageDialog(this, "El formato de la fecha es incorrecto. Use el formato DD/MM/AAAA");
        } else {

            // Convertir la fecha de DD/MM/AAAA a yyyy-MM-dd
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Parsear la fecha y luego formatearla
            LocalDate fechaConvertida = LocalDate.parse(fecha, inputFormatter);
            String fechaFormateada = fechaConvertida.format(outputFormatter);

            String urlAPI = "http://localhost:8080/ApiRest/Ven/por-fecha?fecha=" + fechaFormateada;

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
                Historial_Ventas.jTableDescripcionHistorial.setModel(model);
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
        }
        txtFecha.setText("");
    }//GEN-LAST:event_jBotonBuscarFechaActionPerformed

    private void txtTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransferenciaActionPerformed

    private void txtPanaderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPanaderiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPanaderiaActionPerformed

    private void txtDulceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDulceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDulceActionPerformed

    private void jComboCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCuentaActionPerformed

    }//GEN-LAST:event_jComboCuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGeneral;
    private javax.swing.JButton jBotonBuscarFecha;
    private javax.swing.JButton jBotonBuscarPago;
    private javax.swing.JComboBox<Object> jComboCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    public static javax.swing.JTable jTableDescripcionHistorial;
    private javax.swing.JComboBox<String> jTipodePago;
    private javax.swing.JLabel jwallPaper;
    private javax.swing.JLabel titBuscador;
    private javax.swing.JTextField txtComida;
    private javax.swing.JTextField txtDulce;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtKiosco;
    private javax.swing.JTextField txtPanaderia;
    private javax.swing.JTextField txtTotalGeneral;
    private javax.swing.JTextField txtTransferencia;
    // End of variables declaration//GEN-END:variables

    private void actualizarTabla(List<Modelo_Venta> ventas) {
        DefaultTableModel model = (DefaultTableModel) jTableDescripcionHistorial.getModel();
        jTableDescripcionHistorial.getTableHeader().setReorderingAllowed(false); //para bloquear las columnas del usuario
        model.setRowCount(0); // Limpiar la tabla

        for (Modelo_Venta venta : ventas) {
            Object[] row = new Object[7];
            row[0] = venta.getTipo();
            row[1] = venta.getMontoKiosco();
            row[2] = venta.getMontoPanaderia();
            row[3] = venta.getMontoComida();
            row[4] = venta.getMontoDulce();
            row[5] = venta.getMontoTotal();
            row[6] = venta.getHora();

            model.addRow(row);
        }
    }

}
