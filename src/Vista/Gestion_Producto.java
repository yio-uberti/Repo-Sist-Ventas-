package Vista;

import Controladores.control_Producto;
import Modelos.Modelo_Producto;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class Gestion_Producto extends javax.swing.JInternalFrame {

    public Gestion_Producto() {
        initComponents();
        setTitle("Actualizacion o Gestion de Productos");
        this.setSize(new Dimension(740, 280));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreProducto = new javax.swing.JTextField();
        txtCodigoBarra = new javax.swing.JTextField();
        txtPrecioActual = new javax.swing.JTextField();
        txtPrecioNuevo = new javax.swing.JTextField();
        titCodigoBarra = new javax.swing.JLabel();
        titNombreProducto = new javax.swing.JLabel();
        titPrecioActual = new javax.swing.JLabel();
        titPrecioNuevo = new javax.swing.JLabel();
        titTitulo = new javax.swing.JLabel();
        titPreguntaActualizacion = new javax.swing.JLabel();
        botonSi_ = new javax.swing.JButton();
        botonNo_ = new javax.swing.JButton();
        botonBuscar_ = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 230, 30));

        txtCodigoBarra.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoBarra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigoBarra.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBarraActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, 30));

        txtPrecioActual.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioActual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrecioActual.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActualActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecioActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 90, 30));

        txtPrecioNuevo.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrecioNuevo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtPrecioNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 90, 30));

        titCodigoBarra.setBackground(new java.awt.Color(0, 0, 0));
        titCodigoBarra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titCodigoBarra.setForeground(new java.awt.Color(255, 255, 255));
        titCodigoBarra.setText("Codigo de Barra");
        getContentPane().add(titCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        titNombreProducto.setBackground(new java.awt.Color(0, 0, 0));
        titNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        titNombreProducto.setText("Nombre del Producto");
        getContentPane().add(titNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        titPrecioActual.setBackground(new java.awt.Color(0, 0, 0));
        titPrecioActual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titPrecioActual.setForeground(new java.awt.Color(255, 255, 255));
        titPrecioActual.setText("Precio Viejo");
        getContentPane().add(titPrecioActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        titPrecioNuevo.setBackground(new java.awt.Color(0, 0, 0));
        titPrecioNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titPrecioNuevo.setForeground(new java.awt.Color(255, 255, 255));
        titPrecioNuevo.setText("Precio Nuevo");
        getContentPane().add(titPrecioNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        titTitulo.setBackground(new java.awt.Color(0, 0, 0));
        titTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titTitulo.setForeground(new java.awt.Color(255, 255, 255));
        titTitulo.setText("Actualizacion de Precio");
        getContentPane().add(titTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        titPreguntaActualizacion.setBackground(new java.awt.Color(0, 0, 0));
        titPreguntaActualizacion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        titPreguntaActualizacion.setForeground(new java.awt.Color(255, 255, 255));
        titPreguntaActualizacion.setText("¿Desea actualizar el precio?");
        getContentPane().add(titPreguntaActualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        botonSi_.setBackground(new java.awt.Color(0, 255, 0));
        botonSi_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonSi_.setForeground(new java.awt.Color(0, 0, 0));
        botonSi_.setText("SI");
        botonSi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSi_ActionPerformed(evt);
            }
        });
        getContentPane().add(botonSi_, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 180, 80, 30));

        botonNo_.setBackground(new java.awt.Color(255, 0, 0));
        botonNo_.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonNo_.setForeground(new java.awt.Color(0, 0, 0));
        botonNo_.setText("NO");
        botonNo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNo_ActionPerformed(evt);
            }
        });
        getContentPane().add(botonNo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 90, 30));

        botonBuscar_.setBackground(new java.awt.Color(0, 153, 153));
        botonBuscar_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonBuscar_.setForeground(new java.awt.Color(0, 0, 0));
        botonBuscar_.setText("BUSCAR");
        botonBuscar_.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscar_ActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, 50));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        jLabel_wallpaper.setText("jLabel1");
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 264));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActualActionPerformed

    //Boton para limapiar los campos en caso de no querer actualizar precio
    private void botonNo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNo_ActionPerformed

        Modelo_Producto pro = new Modelo_Producto();
        control_Producto cont = new control_Producto();

        if (txtCodigoBarra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete el codigo de barra");
            txtCodigoBarra.setBackground(Color.red);

            if (!cont.existeProducto(txtCodigoBarra.getText().trim())) {
                try {

                } catch (Exception e) {
                    System.out.println("Error al encontrar producto" + e);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Elija otro Producto para Actualizar");
        }
        this.Limpiar();
    }//GEN-LAST:event_botonNo_ActionPerformed

    //Boton en caso de cambio de precio
    private void botonSi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSi_ActionPerformed

        Modelo_Producto pro = new Modelo_Producto();
        control_Producto cont = new control_Producto();
        double nuevoPrecio = 0;

        if (txtCodigoBarra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete el codigo de barra");
            txtCodigoBarra.setBackground(Color.red);
        } else if (!txtCodigoBarra.getText().isEmpty() && !txtNombreProducto.getText().isEmpty() && !txtPrecioActual.getText().isEmpty() && !txtPrecioNuevo.getText().isEmpty()) {
            String codigo = txtCodigoBarra.getText();
            // metodo para chequear si ingreso un numero valido el usuario
            
            try {
                String input = txtPrecioNuevo.getText();
                nuevoPrecio = Double.parseDouble(input.replace(",", "."));
                cont.cambioPrecio(codigo, nuevoPrecio);
                
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Ingresa un valor numérico válido.");
            }
            JOptionPane.showMessageDialog(null, "Producto Actualizado");
        }
        Limpiar();
        txtPrecioNuevo.setText(" ");
    }//GEN-LAST:event_botonSi_ActionPerformed

    private void txtCodigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBarraActionPerformed

    }//GEN-LAST:event_txtCodigoBarraActionPerformed

    //Boton de busquedad de producto para su cambio de precio
    private void botonBuscar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscar_ActionPerformed
        // TODO add your handling code here:
        Modelo_Producto pro = new Modelo_Producto();
        control_Producto cont = new control_Producto();

        if (txtCodigoBarra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete el codigo de barra");
            txtCodigoBarra.setBackground(Color.red);
        } else {
            //recibe el valor ingresado x el usuario
            if (cont.existeProducto(txtCodigoBarra.getText().trim())) {
                String codigo = txtCodigoBarra.getText();
                txtNombreProducto.setText(cont.buscarProducto(codigo).getNombre());
                txtPrecioActual.setText(String.valueOf(cont.buscarProducto(codigo).getPrecio_Actual()));

            } else {
                JOptionPane.showMessageDialog(null, "El producto seleccionado no existe");
            }
        }

    }//GEN-LAST:event_botonBuscar_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar_;
    private javax.swing.JButton botonNo_;
    private javax.swing.JButton botonSi_;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JLabel titCodigoBarra;
    private javax.swing.JLabel titNombreProducto;
    private javax.swing.JLabel titPrecioActual;
    private javax.swing.JLabel titPrecioNuevo;
    private javax.swing.JLabel titPreguntaActualizacion;
    private javax.swing.JLabel titTitulo;
    private javax.swing.JTextField txtCodigoBarra;
    public javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioActual;
    private javax.swing.JTextField txtPrecioNuevo;
    // End of variables declaration//GEN-END:variables

    // Metodo para limpiar Campos
    private void Limpiar() {
        txtCodigoBarra.setText("");
        txtNombreProducto.setText("");
        txtPrecioActual.setText("");
    }
}
