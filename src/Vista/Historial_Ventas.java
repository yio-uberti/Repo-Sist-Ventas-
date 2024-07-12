package Vista;

import Controladores.control_Ventas;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JDesktopPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.util.Date;
import java.text.ParseException;

public class Historial_Ventas extends javax.swing.JInternalFrame {

    public Historial_Ventas() {

        initComponents();
        this.setTitle("Historial de Ventas");
        this.setSize(new Dimension(1000, 600));

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

        //this.cargarVentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titPrincipal = new javax.swing.JLabel();
        titBuscador = new javax.swing.JLabel();
        jBotonBuscar = new javax.swing.JButton();
        jTipodePago = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDescripcionHistorial = new javax.swing.JTable();
        BotonGeneral = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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

        jBotonBuscar.setBackground(new java.awt.Color(0, 153, 255));
        jBotonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBotonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jBotonBuscar.setText("Buscar Venta");
        jBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 160, 40));

        jTipodePago.setBackground(new java.awt.Color(255, 255, 255));
        jTipodePago.setForeground(new java.awt.Color(0, 0, 0));
        jTipodePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Transferencia" }));
        getContentPane().add(jTipodePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 180, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableDescripcionHistorial.setBackground(new java.awt.Color(255, 255, 255));
        jTableDescripcionHistorial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableDescripcionHistorial.setForeground(new java.awt.Color(0, 0, 0));
        jTableDescripcionHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Detalle/Tipo de Pago", "Kiosco", "Panaderia", "Comida", "Monto", "Hora y Fecha "
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
            jTableDescripcionHistorial.getColumnModel().getColumn(1).setResizable(false);
            jTableDescripcionHistorial.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTableDescripcionHistorial.getColumnModel().getColumn(2).setResizable(false);
            jTableDescripcionHistorial.getColumnModel().getColumn(2).setPreferredWidth(250);
            jTableDescripcionHistorial.getColumnModel().getColumn(3).setResizable(false);
            jTableDescripcionHistorial.getColumnModel().getColumn(3).setPreferredWidth(250);
            jTableDescripcionHistorial.getColumnModel().getColumn(4).setResizable(false);
            jTableDescripcionHistorial.getColumnModel().getColumn(4).setPreferredWidth(250);
            jTableDescripcionHistorial.getColumnModel().getColumn(5).setResizable(false);
            jTableDescripcionHistorial.getColumnModel().getColumn(5).setPreferredWidth(250);
            jTableDescripcionHistorial.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 950, 540));

        BotonGeneral.setBackground(new java.awt.Color(102, 204, 255));
        BotonGeneral.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonGeneral.setForeground(new java.awt.Color(0, 0, 0));
        BotonGeneral.setText("Busqueda General");
        BotonGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGeneralActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 160, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Busqueda General :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jwallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg"))); // NOI18N
        getContentPane().add(jwallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Busca la ventas segun el tipo de pago
    private void jBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarActionPerformed
        control_Ventas cont = new control_Ventas();
        String detalle = (String) jTipodePago.getSelectedItem();

        if (cont.buscarSegunTipo(detalle) != null) {
            JOptionPane.showMessageDialog(this, "Ventas encontradas con Exito");
        } else {
            JOptionPane.showMessageDialog(this, "Ventas no encontradas");
        }

    }//GEN-LAST:event_jBotonBuscarActionPerformed

    private void BotonGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGeneralActionPerformed
        Connection con = Conexion.Conexion_BD.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select detalle, montoKiosco, montoComida, montoPanaderia, montoPostre, montoTotal, horaVenta from Venta ";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Agregar columnas al modelo
//            model.addColumn("ID");
            model.addColumn("Detalle");
            model.addColumn("Monto Kiosco");
            model.addColumn("Monto Comida");
            model.addColumn("Monto Panadería");
            model.addColumn("Monto Postre");
            model.addColumn("Monto");
            model.addColumn("Hora de Venta");

            // Formateador para la fecha y hora
            SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat desiredFormat = new SimpleDateFormat("dd/MM HH:mm");

            // Iterar a través del ResultSet y agregar filas al modelo
            while (rs.next()) {
                Object[] row = new Object[7]; // Array para almacenar los datos de cada fila
//                row[0] = rs.getInt("id");
                row[0] = rs.getString("detalle");
                row[1] = rs.getDouble("montoKiosco");
                row[2] = rs.getDouble("montoComida");
                row[3] = rs.getDouble("montoPanaderia");
                row[4] = rs.getDouble("montoPostre");
                row[5] = rs.getDouble("montoTotal");

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
            Historial_Ventas.jTableDescripcionHistorial.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar las ventas: " + e.getMessage());
        }

    }//GEN-LAST:event_BotonGeneralActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGeneral;
    private javax.swing.JButton jBotonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableDescripcionHistorial;
    private javax.swing.JComboBox<String> jTipodePago;
    private javax.swing.JLabel jwallPaper;
    private javax.swing.JLabel titBuscador;
    private javax.swing.JLabel titPrincipal;
    // End of variables declaration//GEN-END:variables
}
