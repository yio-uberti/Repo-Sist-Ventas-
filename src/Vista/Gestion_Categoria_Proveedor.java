package Vista;

import Controladores.control_Cat_Proveedor;
import Modelos.Modelo_categoria;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class Gestion_Categoria_Proveedor extends javax.swing.JInternalFrame {

    public int idCategoria = 0;

    public Gestion_Categoria_Proveedor() {
        initComponents();
        setTitle("Gestion de Categoria-Proveedor");
        this.setSize(new Dimension(500, 350));

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

        this.cargarCategoriaProveedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCategoria = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jBotonEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtDescProveedor = new javax.swing.JTextField();
        titDescripcion = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestion de Categoria-Proveedor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCategoria.setBackground(new java.awt.Color(255, 255, 255));
        jTableCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jTableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(jTableCategoria);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 240));

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Boton para Borrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jBotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 150, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDescProveedor.setBackground(new java.awt.Color(255, 255, 255));
        txtDescProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescProveedor.setForeground(new java.awt.Color(0, 0, 0));
        txtDescProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtDescProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, 138, -1));

        titDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        titDescripcion.setText("Descripcion");
        jPanel3.add(titDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 150, 70));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg"))); // NOI18N
        jLabel_wallpaper.setText("jLabel1");
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonEliminarActionPerformed
        //Eliminamos la categoria seleccionada
        if (!txtDescProveedor.getText().isEmpty()) {
            Modelo_categoria catProveedor = new Modelo_categoria();
            control_Cat_Proveedor cont = new control_Cat_Proveedor();

            catProveedor.setDescripcion(txtDescProveedor.getText().trim());
            if (!cont.eliminar(idCategoria)) {
                JOptionPane.showMessageDialog(null, "Proveedor eliminado");
                txtDescProveedor.setText("");
                this.cargarCategoriaProveedor();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar Proveedor");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleecione un Proveedor");
        }
    }//GEN-LAST:event_jBotonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableCategoria;
    private javax.swing.JLabel titDescripcion;
    private javax.swing.JTextField txtDescProveedor;
    // End of variables declaration//GEN-END:variables

    //Metodo para mostrar provedores registrados
    private void cargarCategoriaProveedor() {
        Connection con = Conexion.Conexion_BD.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select id, descripcion from Categoria ";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Gestion_Categoria_Proveedor.jTableCategoria = new JTable(model);
            Gestion_Categoria_Proveedor.jScrollPane1.setViewportView(Gestion_Categoria_Proveedor.jTableCategoria);

            model.addColumn("id");
            model.addColumn("Nombre Proveedor");

            while (rs.next()) {
                Object fila[] = new Object[2];

                for (int i = 0; i < 2; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();

        } catch (Exception e) {
            System.out.println("Error al mostrar la tabla categorias" + e);
        }

        jTableCategoria.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTableCategoria.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idCategoria = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDaosCategoriaSelecionada(idCategoria);
                }
            }
        });
    }

    private void EnviarDaosCategoriaSelecionada(int idCategoria) {
        try {
            Connection con = Conexion.Conexion_BD.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from Categoria where id = '" + idCategoria + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtDescProveedor.setText(rs.getString("descripcion"));
            }
            con.close();

        } catch (Exception e) {
            System.out.println("Error al selecionar categoria" + e);
        }

    }

}
