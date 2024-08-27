package Vista;

import Controladores.control_Ventas;
import Modelos.Modelo_Venta;
import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.util.List;
import java.util.Date;
import java.text.ParseException;

public class Historial_Ventas extends javax.swing.JInternalFrame {

    public Historial_Ventas() {

        initComponents();
        this.setTitle("Historial de Ventas");
        this.setSize(new Dimension(1290, 700));

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

        //Bloqueo de txt para el usuario
        txtTotalGeneral.setEditable(false);
        txtEfectivo.setEditable(false);
        txtTransferencia.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titPrincipal = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jwallPaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        titPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titPrincipal.setText(" Historial de Ventas ");
        titPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(titPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        titBuscador.setBackground(new java.awt.Color(0, 0, 0));
        titBuscador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titBuscador.setForeground(new java.awt.Color(0, 0, 0));
        titBuscador.setText("Buscador por tipo de pago :");
        getContentPane().add(titBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jBotonBuscarPago.setBackground(new java.awt.Color(0, 153, 255));
        jBotonBuscarPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBotonBuscarPago.setForeground(new java.awt.Color(0, 0, 0));
        jBotonBuscarPago.setText("Buscar ");
        jBotonBuscarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarPagoActionPerformed(evt);
            }
        });
        getContentPane().add(jBotonBuscarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 120, 40));

        jTipodePago.setBackground(new java.awt.Color(255, 255, 255));
        jTipodePago.setForeground(new java.awt.Color(0, 0, 0));
        jTipodePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Transferencia" }));
        getContentPane().add(jTipodePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableDescripcionHistorial.setBackground(new java.awt.Color(255, 255, 255));
        jTableDescripcionHistorial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 950, 450));

        BotonGeneral.setBackground(new java.awt.Color(102, 204, 255));
        BotonGeneral.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonGeneral.setForeground(new java.awt.Color(0, 0, 0));
        BotonGeneral.setText("Busqueda General");
        BotonGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGeneralActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 160, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Busqueda General :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscador por fecha : (ej: 01/05/2024)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 320, -1));

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 160, 40));

        jBotonBuscarFecha.setBackground(new java.awt.Color(0, 153, 255));
        jBotonBuscarFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBotonBuscarFecha.setForeground(new java.awt.Color(0, 0, 0));
        jBotonBuscarFecha.setText("Buscar");
        jBotonBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarFechaActionPerformed(evt);
            }
        });
        getContentPane().add(jBotonBuscarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 120, 40));

        txtTotalGeneral.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalGeneral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTotalGeneral.setForeground(new java.awt.Color(0, 0, 0));
        txtTotalGeneral.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalGeneral.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 153, 153)));
        getContentPane().add(txtTotalGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 240, 80));

        txtEfectivo.setBackground(new java.awt.Color(255, 255, 255));
        txtEfectivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEfectivo.setForeground(new java.awt.Color(0, 0, 0));
        txtEfectivo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 170, 230, 40));

        txtTransferencia.setBackground(new java.awt.Color(255, 255, 255));
        txtTransferencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTransferencia.setForeground(new java.awt.Color(0, 0, 0));
        txtTransferencia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransferenciaActionPerformed(evt);
            }
        });
        getContentPane().add(txtTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, 230, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total de Transferencia");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Total de Efectivo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 140, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Total del dia:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        txtKiosco.setBackground(new java.awt.Color(255, 255, 255));
        txtKiosco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtKiosco.setForeground(new java.awt.Color(0, 0, 0));
        txtKiosco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtKiosco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 430, 230, 40));

        txtComida.setBackground(new java.awt.Color(255, 255, 255));
        txtComida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtComida.setForeground(new java.awt.Color(0, 0, 0));
        txtComida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 350, 230, 40));

        txtPanaderia.setBackground(new java.awt.Color(255, 255, 255));
        txtPanaderia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPanaderia.setForeground(new java.awt.Color(0, 0, 0));
        txtPanaderia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPanaderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPanaderiaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPanaderia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 510, 230, 40));

        txtDulce.setBackground(new java.awt.Color(255, 255, 255));
        txtDulce.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDulce.setForeground(new java.awt.Color(0, 0, 0));
        txtDulce.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDulce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDulceActionPerformed(evt);
            }
        });
        getContentPane().add(txtDulce, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 590, 230, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Total Comida");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total Dulce");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Total Kiosco");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Total Panaderia");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 480, -1, -1));

        jwallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg"))); // NOI18N
        getContentPane().add(jwallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Busca la ventas segun el tipo de pago
    private void jBotonBuscarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarPagoActionPerformed
        control_Ventas cont = new control_Ventas();
        String detalle = (String) jTipodePago.getSelectedItem();

        List<Modelo_Venta> ventas = cont.buscarSegunTipo(detalle);

        if (!ventas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ventas encontradas con éxito");
            actualizarTabla(ventas);
            
            // Calcular el total de ventas y los totales por tipo de pago
                double totalVenta = 0;
                double totalEfectivo = 0;
                double totalTransferencia = 0;

                for (Modelo_Venta venta : ventas) {
                    totalVenta += venta.getMontoTotal();
                    if ("Efectivo".equals(venta.getTipo())) {
                        totalEfectivo += venta.getMontoTotal();
                    } else if ("Transferencia".equals(venta.getTipo())) {
                        totalTransferencia += venta.getMontoTotal();
                    }
                }

                // Mostrar los totales en los campos de texto
                txtTotalGeneral.setText(String.valueOf(totalVenta));
                txtEfectivo.setText(String.valueOf(totalEfectivo));
                txtTransferencia.setText(String.valueOf(totalTransferencia));
            
            
        } else {
            JOptionPane.showMessageDialog(this, "Ventas no encontradas");
        }

    }//GEN-LAST:event_jBotonBuscarPagoActionPerformed

    private void BotonGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGeneralActionPerformed
        //Instanciamos la conexion y la tabla
        Connection con = Conexion.Conexion_BD.conectar();
        DefaultTableModel model = new DefaultTableModel();

        //Formateamos la fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActual = dateFormat.format(new Date());

        //consulta sql 
        String sql = "select detalle, montoKiosco, montoComida, montoPanaderia, montoPostre, montoTotal, horaVenta from Venta "
                + "where DATE(horaVenta) = '" + fechaActual + "'";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Agregar columnas al modelo
            model.addColumn("Detalle");
            model.addColumn("Kiosco");
            model.addColumn("Panaderia");
            model.addColumn("Comida");
            model.addColumn("Dulces");
            model.addColumn("Monto");
            model.addColumn("Hora de Venta");

            // Formateador para la fecha y hora
            SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat desiredFormat = new SimpleDateFormat("dd/MM HH:mm");

            //Para almacenar el total de la venta
            double totalVenta = 0;
            double totalEfectivo = 0;
            double totalTransferencia = 0;

            // Iterar a través del ResultSet y agregar filas al modelo
            while (rs.next()) {
                Object[] row = new Object[7]; // Array para almacenar los datos de cada fila
                row[0] = rs.getString("detalle");
                row[1] = rs.getDouble("montoKiosco");
                row[2] = rs.getDouble("montoPanaderia");
                row[3] = rs.getDouble("montoComida");
                row[4] = rs.getDouble("montoPostre");
                row[5] = rs.getDouble("montoTotal");

                // Sumar el montoTotal al totalVenta
                totalVenta += rs.getDouble("montoTotal");

                // Sumar los montos según el tipo de pago
                String tipoPago = rs.getString("detalle");
                if ("Efectivo".equals(tipoPago)) {
                    totalEfectivo += rs.getDouble("montoTotal");
                } else if ("Transferencia".equals(tipoPago)) {
                    totalTransferencia += rs.getDouble("montoTotal");
                }

                // Formatear la fecha y hora
                String horaVenta = rs.getString("horaVenta");
                try {
                    Date date = originalFormat.parse(horaVenta);
                    row[6] = desiredFormat.format(date);
                } catch (ParseException e) {
                    row[6] = horaVenta;
                }

                model.addRow(row); // Agregar fila al modelo
            }

            // Asignar el modelo a la tabla jTableDescripcionHistorial
            jTableDescripcionHistorial.getTableHeader().setReorderingAllowed(false);//para bloquear las columnas del usuario
            Historial_Ventas.jTableDescripcionHistorial.setModel(model);

            txtTotalGeneral.setText(String.valueOf(totalVenta));
            txtEfectivo.setText(String.valueOf(totalEfectivo));
            txtTransferencia.setText(String.valueOf(totalTransferencia));

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar las ventas: " + e.getMessage());
        }

    }//GEN-LAST:event_BotonGeneralActionPerformed

    private void jBotonBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarFechaActionPerformed
        control_Ventas cont = new control_Ventas();
        String fecha = txtFecha.getText().trim(); // Obtener la fecha desde el campo de texto

        if (!fecha.matches("\\d{2}/\\d{2}/\\d{4}")) { // Validar el formato de la fecha
            JOptionPane.showMessageDialog(this, "El formato de la fecha es incorrecto. Use el formato DD/MM/AAAA");
        } else {
            List<Modelo_Venta> ventas = cont.buscarPorFecha(fecha);

            if (!ventas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ventas encontradas con éxito");
                actualizarTabla(ventas);

                // Calcular el total de ventas y los totales por tipo de pago
                double totalVenta = 0;
                double totalEfectivo = 0;
                double totalTransferencia = 0;

                for (Modelo_Venta venta : ventas) {
                    totalVenta += venta.getMontoTotal();
                    if ("Efectivo".equals(venta.getTipo())) {
                        totalEfectivo += venta.getMontoTotal();
                    } else if ("Transferencia".equals(venta.getTipo())) {
                        totalTransferencia += venta.getMontoTotal();
                    }
                }

                // Mostrar los totales en los campos de texto
                txtTotalGeneral.setText(String.valueOf(totalVenta));
                txtEfectivo.setText(String.valueOf(totalEfectivo));
                txtTransferencia.setText(String.valueOf(totalTransferencia));

            } else {
                JOptionPane.showMessageDialog(this, "No se encontraron ventas para la fecha indicada");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGeneral;
    private javax.swing.JButton jBotonBuscarFecha;
    private javax.swing.JButton jBotonBuscarPago;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel titPrincipal;
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
