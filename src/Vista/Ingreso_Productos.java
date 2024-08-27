package Vista;

//impportanciones
import Controladores.control_Cat_Proveedor;
import Controladores.control_Producto;
import Modelos.Modelo_Producto;
import Modelos.Modelo_categoria;
import java.awt.*;
import javax.swing.*;
import java.util.List;

//Comienzo de la clase
public class Ingreso_Productos extends javax.swing.JInternalFrame {

    public Ingreso_Productos() {
        initComponents();
        setTitle("Ingreso de Producto");

        cargarCategoriasEnComboBox();

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

    private void cargarCategoriasEnComboBox() {
        // Crear instancia del controlador
        control_Cat_Proveedor controlCategoria = new control_Cat_Proveedor(null);

        // Obtener lista de categorías
        List<Modelo_categoria> categorias = controlCategoria.getListaCategorias();

        // Agregar categorías al JComboBox
        for (Modelo_categoria categoria : categorias) {
            jComboCategoria.addItem(categoria.getDescripcion());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigoBarra = new javax.swing.JTextField();
        titNombreProducto = new javax.swing.JLabel();
        titCategoria = new javax.swing.JLabel();
        jComboCategoria = new javax.swing.JComboBox<>();
        titTipo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        comboTipoProducto = new javax.swing.JComboBox<>();
        botonIngresarProd = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        titPrecio = new javax.swing.JLabel();
        titCodigoBarra1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(550, 400));
        setMinimumSize(new java.awt.Dimension(550, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoBarra.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoBarra.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigoBarra.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCodigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBarraActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 190, 30));

        titNombreProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        titNombreProducto.setText("Nombre");
        getContentPane().add(titNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        titCategoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titCategoria.setForeground(new java.awt.Color(255, 255, 255));
        titCategoria.setText("Categoria");
        getContentPane().add(titCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jComboCategoria.setBackground(new java.awt.Color(255, 255, 255));
        jComboCategoria.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jComboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 190, 30));

        titTipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titTipo.setForeground(new java.awt.Color(255, 255, 255));
        titTipo.setText("Tipo");
        getContentPane().add(titTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 30));

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Ingreso de Productos");
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        comboTipoProducto.setBackground(new java.awt.Color(255, 255, 255));
        comboTipoProducto.setForeground(new java.awt.Color(0, 0, 0));
        comboTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kiosco", "Panaderia", "Comida", "Postre" }));
        getContentPane().add(comboTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 190, 30));

        botonIngresarProd.setBackground(new java.awt.Color(0, 204, 204));
        botonIngresarProd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonIngresarProd.setForeground(new java.awt.Color(0, 0, 0));
        botonIngresarProd.setText("Ingresar");
        botonIngresarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarProdActionPerformed(evt);
            }
        });
        getContentPane().add(botonIngresarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 190, 70));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 190, 30));

        titPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titPrecio.setForeground(new java.awt.Color(255, 255, 255));
        titPrecio.setText("Precio");
        getContentPane().add(titPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, 30));

        titCodigoBarra1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titCodigoBarra1.setForeground(new java.awt.Color(255, 255, 255));
        titCodigoBarra1.setText("Codigo Barra");
        getContentPane().add(titCodigoBarra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        txtNombre1.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre1.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 190, 30));

        jLabel_Wallpaper.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBarraActionPerformed

    private void botonIngresarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarProdActionPerformed
        // Instancias de otras clases:
        Modelo_Producto pro = new Modelo_Producto();
        control_Producto cont = new control_Producto();

        //Validar Campos
        if (txtCodigoBarra.getText().equals("") || txtNombre1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete el campo de codigo barra o el nombre del producto");
            txtCodigoBarra.setBackground(Color.red);
            txtNombre1.setBackground(Color.red);

        } else {
            //consulta para ver si el producto ya existe
            if (!cont.existeProducto(txtCodigoBarra.getText().trim())) {
                try {

                    pro.setCod_barra(txtCodigoBarra.getText().trim());
                    pro.setNombre(txtNombre1.getText().trim());
                    pro.setTipo(comboTipoProducto.getSelectedItem().toString());
                    String precioTXT = "";
                    double Precio = 0.00;
                    precioTXT = txtPrecio.getText().trim();
                    boolean aux = false;

                    //Metodo en caso de que el usuario ingrese un numero con coma
                    //ya que la coma se considera como punto decimal
                    for (int i = 0; i < precioTXT.length(); i++) {
                        if (precioTXT.charAt(i) == ',') {
                            String precioNuevo = precioTXT.replace(",", ".");
                            Precio = Double.parseDouble(precioNuevo);
                            aux = true;
                        }
                    }
                    //Evaluar la condicion
                    if (aux == true) {
                        pro.setPrecio_Actual(Precio);
                    } else {
                        Precio = Double.parseDouble(precioTXT);
                        pro.setPrecio_Actual(Precio);
                    }

                    //Registrar producto
                    if (cont.guardar(pro)) {
                        JOptionPane.showMessageDialog(null, "Producto Registrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al Guardar");
                    }

                    //metodos de limpieza de campos
                    this.Limpiar();

                } catch (Exception e) {
                    System.out.println("Error en: " + e);
                }

            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe en la Base de Datos");
            }
        }
    }//GEN-LAST:event_botonIngresarProdActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresarProd;
    private javax.swing.JComboBox<String> comboTipoProducto;
    private javax.swing.JComboBox<String> jComboCategoria;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel titCategoria;
    private javax.swing.JLabel titCodigoBarra1;
    private javax.swing.JLabel titNombreProducto;
    private javax.swing.JLabel titPrecio;
    private javax.swing.JLabel titTipo;
    private javax.swing.JTextField txtCodigoBarra;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables

    // Metodo para limpiar Campos
    private void Limpiar() {
        txtCodigoBarra.setText("");
        txtNombre1.setText("");
        txtPrecio.setText("");
    }
}
