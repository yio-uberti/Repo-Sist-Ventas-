package Vista;

import Controladores.control_Cat_Proveedor;
import Modelos.Modelo_categoria;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class Ingreso_Categoria_Proveedor extends javax.swing.JInternalFrame {

    public Ingreso_Categoria_Proveedor() {
        initComponents();
        setTitle("Ingreso de Categoria-Proveedor");
        this.setSize(new Dimension(550,300));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonIngresar = new javax.swing.JButton();
        txtNombreProveedor = new javax.swing.JTextField();
        titNombreP = new javax.swing.JLabel();
        titVentana = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonIngresar.setBackground(new java.awt.Color(0, 204, 0));
        botonIngresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(0, 0, 0));
        botonIngresar.setText("Ingresar Categoria");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 210, 40));

        txtNombreProveedor.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreProveedor.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 210, 30));

        titNombreP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titNombreP.setForeground(new java.awt.Color(0, 0, 0));
        titNombreP.setText("Nombre del Proveedor");
        getContentPane().add(titNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        titVentana.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titVentana.setForeground(new java.awt.Color(0, 0, 0));
        titVentana.setText("Ingreso de Nueva Categoria-Proveedor");
        getContentPane().add(titVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 538, 314));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        
        Modelo_categoria catProveedor = new Modelo_categoria();      
        control_Cat_Proveedor controlProvedor = new control_Cat_Proveedor();
        
        catProveedor.setDescripcion(txtNombreProveedor.getText().trim());
        //Validamos campos vacios
        if(txtNombreProveedor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de un proveedor");
            txtNombreProveedor.setBackground(Color.red);
        
        } else {
            catProveedor.setDescripcion(txtNombreProveedor.getText().trim());
            if(controlProvedor.guardar(catProveedor)){
                JOptionPane.showMessageDialog(null, "Guardado exitoso");
                txtNombreProveedor.setBackground(Color.green);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
            }
        }
        
        txtNombreProveedor.setText("");
        
    }//GEN-LAST:event_botonIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JLabel titNombreP;
    private javax.swing.JLabel titVentana;
    private javax.swing.JTextField txtNombreProveedor;
    // End of variables declaration//GEN-END:variables
}
