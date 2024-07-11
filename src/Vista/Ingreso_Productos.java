package Vista;

//impportanciones
import Controladores.control_Producto;
import Modelos.Modelo_Producto;
import java.awt.*;
import javax.swing.*;

//Comienzo de la clase
public class Ingreso_Productos extends javax.swing.JInternalFrame {

    public Ingreso_Productos() {
        initComponents();
        setTitle("Ingreso de Producto");
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtCodigoBarra = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        titNombreProducto = new javax.swing.JLabel();
        titCodigoBarra = new javax.swing.JLabel();
        titTipo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        botonIngresarProd = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        titPrecio = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(550, 400));
        setMinimumSize(new java.awt.Dimension(550, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 190, -1));

        txtCodigoBarra.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoBarra.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigoBarra.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCodigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBarraActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 190, -1));

        txtTipo.setBackground(new java.awt.Color(255, 255, 255));
        txtTipo.setForeground(new java.awt.Color(0, 0, 0));
        txtTipo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 190, -1));

        titNombreProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        titNombreProducto.setText("Nombre");
        getContentPane().add(titNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        titCodigoBarra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titCodigoBarra.setForeground(new java.awt.Color(255, 255, 255));
        titCodigoBarra.setText("Codigo Barra");
        getContentPane().add(titCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        titTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titTipo.setForeground(new java.awt.Color(255, 255, 255));
        titTipo.setText("Tipo");
        getContentPane().add(titTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 20));

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Ingreso de Productos");
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        botonIngresarProd.setBackground(new java.awt.Color(0, 204, 204));
        botonIngresarProd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonIngresarProd.setForeground(new java.awt.Color(0, 0, 0));
        botonIngresarProd.setText("Ingresar");
        botonIngresarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarProdActionPerformed(evt);
            }
        });
        getContentPane().add(botonIngresarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 190, 40));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, -1));

        titPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titPrecio.setForeground(new java.awt.Color(255, 255, 255));
        titPrecio.setText("Precio");
        getContentPane().add(titPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 20));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBarraActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void botonIngresarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarProdActionPerformed
        // Instancias de otras clases:
        Modelo_Producto pro = new Modelo_Producto();
        control_Producto cont = new control_Producto();
        
        //Validar Campos
        if(txtCodigoBarra.getText().equals("") || txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete el campo de codigo barra o el nombre del producto");
            txtCodigoBarra.setBackground(Color.red);
            txtNombre.setBackground(Color.red);
            
        } else {
            //consulta para ver si el producto ya existe
            if(!cont.existeProducto(txtCodigoBarra.getText().trim())){
                try {
                    
                    pro.setCod_barra(txtCodigoBarra.getText().trim());
                    pro.setNombre(txtNombre.getText().trim());
                    pro.setTipo(txtTipo.getText().trim());
                    String precioTXT = "";
                    double Precio = 0.00;
                    precioTXT = txtPrecio.getText().trim();
                    boolean aux = false;
                    
                    //Metodo en caso de que el usuario ingrese un numero con coma
                    //ya que la coma se considera como punto decimal
                    for(int i = 0; i < precioTXT.length(); i++){
                        if(precioTXT.charAt(i) == ','){
                            String precioNuevo = precioTXT.replace(",", ".");
                            Precio = Double.parseDouble(precioNuevo);
                            aux = true;
                        }
                    }
                    //Evaluar la condicion
                    if(aux == true){
                        pro.setPrecio_Actual(Precio);
                    }   else {
                        Precio = Double.parseDouble(precioTXT);
                        pro.setPrecio_Actual(Precio);
                    }
                    
                    //Registrar producto
                        if(cont.guardar(pro)){
                            JOptionPane.showMessageDialog(null, "Producto Registrado");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Guardar");
                        }

                    //metodos de limpieza de campos
                    this.Limpiar();
                    
                } catch (Exception e) {
                    System.out.println("Error en: " + e);
                }
                
            }   else {
                JOptionPane.showMessageDialog(null, "El producto ya existe en la Base de Datos");
            }
        }
    }//GEN-LAST:event_botonIngresarProdActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresarProd;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel titCodigoBarra;
    private javax.swing.JLabel titNombreProducto;
    private javax.swing.JLabel titPrecio;
    private javax.swing.JLabel titTipo;
    private javax.swing.JTextField txtCodigoBarra;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables

    // Metodo para limpiar Campos
    private void Limpiar(){
        txtCodigoBarra.setText("");
        txtNombre.setText("");
        txtTipo.setText("");
    }
}
