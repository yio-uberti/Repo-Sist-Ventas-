package Vista;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JDesktopPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

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

        this.cargarVentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titPrincipal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDescripcionHistorial = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        titPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titPrincipal.setText(" Historial de Ventas ");
        titPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(titPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 950, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableDescripcionHistorial;
    private javax.swing.JLabel titPrincipal;
    // End of variables declaration//GEN-END:variables

    private void cargarVentas() {
        Connection con = Conexion.Conexion_BD.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select id, detalle, montoKiosco, montoComida, montoPanaderia, montoTotal, horaVenta from Venta ";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Agregar columnas al modelo
            model.addColumn("ID");
            model.addColumn("Detalle");
            model.addColumn("Monto Kiosco");
            model.addColumn("Monto Comida");
            model.addColumn("Monto Panadería");
            model.addColumn("Monto");
            model.addColumn("Hora de Venta");

            // Iterar a través del ResultSet y agregar filas al modelo
            while (rs.next()) {
                Object[] row = new Object[7]; // Array para almacenar los datos de cada fila
                row[0] = rs.getInt("id");
                row[1] = rs.getString("detalle");
                row[2] = rs.getDouble("montoKiosco");
                row[3] = rs.getDouble("montoComida");
                row[4] = rs.getDouble("montoPanaderia");
                row[5] = rs.getDouble("montoTotal");
                row[6] = rs.getString("horaVenta");
                            
                model.addRow(row); // Agregar fila al modelo
            }

            // Asignar el modelo a la tabla jTableDescripcionHistorial
            Historial_Ventas.jTableDescripcionHistorial.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar las ventas: " + e.getMessage());
        } 

    }

}
