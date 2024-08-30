package Vista;

import java.awt.Dimension;
import javax.swing.JDesktopPane;

public class Menu_Inicial extends javax.swing.JFrame {

    private static JDesktopPane jDesktopPane_menu;
    private String rolUsuario;
    
    public Menu_Inicial(String rol) {
        initComponents();
        this.rolUsuario = rol;
        this.setSize(new Dimension(1250, 800));
        this.setTitle("Sistema de Facturacion");
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);

        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);

        configurarMenuPorRol();
        
    }

    private void configurarMenuPorRol() {
        if ("empleado".equals(rolUsuario)) {
            // Si el usuario es un empleado, deshabilitar ciertos menús
            jMenuProducto.setEnabled(false); // Productos
            jMenuHistorial.setEnabled(false); // Historial
            jMenuCategoria.setEnabled(false); // Categoría
            jMenuCuentas.setEnabled(false);//Cuentas
        }
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBarra = new javax.swing.JMenuBar();
        jMenuProducto = new javax.swing.JMenu();
        Ingresar_Producto = new javax.swing.JMenuItem();
        Modificar_Producto = new javax.swing.JMenuItem();
        jMenuHistorial = new javax.swing.JMenu();
        Ver_Historial = new javax.swing.JMenuItem();
        jMenuFacturacion = new javax.swing.JMenu();
        menuIngresoVentas = new javax.swing.JMenuItem();
        jMenuCategoria = new javax.swing.JMenu();
        jNuevaCategoria = new javax.swing.JMenuItem();
        jGestionCategoria = new javax.swing.JMenuItem();
        jMenuCuentas = new javax.swing.JMenu();
        jNuevaCuenta = new javax.swing.JMenuItem();
        jGestionCuentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu_nuevo");
        setType(java.awt.Window.Type.POPUP);

        jMenuBarra.setBackground(new java.awt.Color(0, 102, 153));
        jMenuBarra.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBarra.setAutoscrolls(true);
        jMenuBarra.setOpaque(true);
        jMenuBarra.setPreferredSize(new java.awt.Dimension(130, 30));

        jMenuProducto.setBackground(new java.awt.Color(0, 102, 153));
        jMenuProducto.setText("Productos");
        jMenuProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuProducto.setPreferredSize(new java.awt.Dimension(150, 50));

        Ingresar_Producto.setBackground(new java.awt.Color(255, 255, 255));
        Ingresar_Producto.setForeground(new java.awt.Color(0, 0, 0));
        Ingresar_Producto.setText("Ingresar Producto");
        Ingresar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar_ProductoActionPerformed(evt);
            }
        });
        jMenuProducto.add(Ingresar_Producto);

        Modificar_Producto.setBackground(new java.awt.Color(255, 255, 255));
        Modificar_Producto.setForeground(new java.awt.Color(0, 0, 0));
        Modificar_Producto.setText("Actualizar precios");
        Modificar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_ProductoActionPerformed(evt);
            }
        });
        jMenuProducto.add(Modificar_Producto);

        jMenuBarra.add(jMenuProducto);

        jMenuHistorial.setBackground(new java.awt.Color(0, 102, 153));
        jMenuHistorial.setText("Historial");
        jMenuHistorial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuHistorial.setPreferredSize(new java.awt.Dimension(150, 50));

        Ver_Historial.setForeground(new java.awt.Color(0, 0, 0));
        Ver_Historial.setText("Ver Historial");
        Ver_Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver_HistorialActionPerformed(evt);
            }
        });
        jMenuHistorial.add(Ver_Historial);

        jMenuBarra.add(jMenuHistorial);

        jMenuFacturacion.setBackground(new java.awt.Color(0, 102, 153));
        jMenuFacturacion.setText("Facturacion        ");
        jMenuFacturacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuIngresoVentas.setBackground(new java.awt.Color(255, 255, 255));
        menuIngresoVentas.setForeground(new java.awt.Color(0, 0, 0));
        menuIngresoVentas.setText("Ingreso de Ventas");
        menuIngresoVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIngresoVentasActionPerformed(evt);
            }
        });
        jMenuFacturacion.add(menuIngresoVentas);

        jMenuBarra.add(jMenuFacturacion);

        jMenuCategoria.setBackground(new java.awt.Color(0, 102, 153));
        jMenuCategoria.setText(" Categorias      ");
        jMenuCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jNuevaCategoria.setBackground(new java.awt.Color(255, 255, 255));
        jNuevaCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jNuevaCategoria.setText("Nueva Categoria");
        jNuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevaCategoriaActionPerformed(evt);
            }
        });
        jMenuCategoria.add(jNuevaCategoria);

        jGestionCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jGestionCategoria.setText("Gestion de Categoria");
        jGestionCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionCategoriaActionPerformed(evt);
            }
        });
        jMenuCategoria.add(jGestionCategoria);

        jMenuBarra.add(jMenuCategoria);

        jMenuCuentas.setText(" Cuentas      ");
        jMenuCuentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jNuevaCuenta.setText("Nueva Cuenta");
        jNuevaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevaCuentaActionPerformed(evt);
            }
        });
        jMenuCuentas.add(jNuevaCuenta);

        jGestionCuentas.setText("Gestion de Cuentas");
        jGestionCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestionCuentasActionPerformed(evt);
            }
        });
        jMenuCuentas.add(jGestionCuentas);

        jMenuBarra.add(jMenuCuentas);

        setJMenuBar(jMenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Seccion de Facturacion
    private void menuIngresoVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIngresoVentasActionPerformed
        Ventana_Ventas ventanaVentas = new Ventana_Ventas();
        jDesktopPane_menu.add(ventanaVentas);
        ventanaVentas.setVisible(true);
    }//GEN-LAST:event_menuIngresoVentasActionPerformed

    //Seccion Productos
    private void Ingresar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar_ProductoActionPerformed
        Ingreso_Productos ingresoProducto = new Ingreso_Productos();
        jDesktopPane_menu.add(ingresoProducto);
        ingresoProducto.setVisible(true);
    }//GEN-LAST:event_Ingresar_ProductoActionPerformed

    private void Modificar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_ProductoActionPerformed
        Gestion_Actualizacion_Producto gestionProducto = new Gestion_Actualizacion_Producto();
        jDesktopPane_menu.add(gestionProducto);
        gestionProducto.setVisible(true);
    }//GEN-LAST:event_Modificar_ProductoActionPerformed

    //Historial de ventas
    private void Ver_HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver_HistorialActionPerformed
        Historial_Ventas historial = new Historial_Ventas();
        jDesktopPane_menu.add(historial);
        historial.setVisible(true);
    }//GEN-LAST:event_Ver_HistorialActionPerformed

    //Seccion de Categorias
    private void jNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevaCategoriaActionPerformed
        Ingreso_Categoria_Proveedor cateProveedor = new Ingreso_Categoria_Proveedor();
        jDesktopPane_menu.add(cateProveedor);
        cateProveedor.setVisible(true);
    }//GEN-LAST:event_jNuevaCategoriaActionPerformed

    private void jGestionCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionCategoriaActionPerformed
        Gestion_Categoria_Proveedor gCatProveedor = new Gestion_Categoria_Proveedor();
        jDesktopPane_menu.add(gCatProveedor);
        gCatProveedor.setVisible(true);
    }//GEN-LAST:event_jGestionCategoriaActionPerformed

    //Seccion de Cuentas
    private void jNuevaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevaCuentaActionPerformed
        
    }//GEN-LAST:event_jNuevaCuentaActionPerformed

    private void jGestionCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestionCuentasActionPerformed
        
    }//GEN-LAST:event_jGestionCuentasActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu_Inicial().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ingresar_Producto;
    private javax.swing.JMenuItem Modificar_Producto;
    private javax.swing.JMenuItem Ver_Historial;
    private javax.swing.JMenuItem jGestionCategoria;
    private javax.swing.JMenuItem jGestionCuentas;
    private javax.swing.JMenuBar jMenuBarra;
    private javax.swing.JMenu jMenuCategoria;
    private javax.swing.JMenu jMenuCuentas;
    private javax.swing.JMenu jMenuFacturacion;
    private javax.swing.JMenu jMenuHistorial;
    private javax.swing.JMenu jMenuProducto;
    private javax.swing.JMenuItem jNuevaCategoria;
    private javax.swing.JMenuItem jNuevaCuenta;
    private javax.swing.JMenuItem menuIngresoVentas;
    // End of variables declaration//GEN-END:variables
}
