package Vista;

import Controladores.control_Producto;
import Modelos.Modelo_Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ventana_Ventas extends javax.swing.JInternalFrame {

    String codBarra;
    
    public Ventana_Ventas() {
        initComponents();
        setTitle("Facturacion");
        this.setSize(new Dimension(900,650));
        this.setLocation(500, 100); // largo y altura de posicion
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titCant = new javax.swing.JLabel();
        titCodigoBarra = new javax.swing.JLabel();
        titProducto = new javax.swing.JLabel();
        cantProducto = new javax.swing.JTextField();
        codigoBarra = new javax.swing.JTextField();
        nombreProducto = new javax.swing.JTextField();
        subTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        titTotal = new javax.swing.JLabel();
        registroVentas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDescripcionVenta = new javax.swing.JTable();
        vueltoVenta = new javax.swing.JTextField();
        tipoPago = new javax.swing.JComboBox<>();
        titTipoPago = new javax.swing.JLabel();
        titVuelto = new javax.swing.JLabel();
        jButtonAñadir = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(740, 441));
        setMinimumSize(new java.awt.Dimension(740, 441));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titCant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titCant.setForeground(new java.awt.Color(0, 0, 0));
        titCant.setText("Cant");
        getContentPane().add(titCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        titCodigoBarra.setBackground(new java.awt.Color(255, 255, 255));
        titCodigoBarra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titCodigoBarra.setForeground(new java.awt.Color(0, 0, 0));
        titCodigoBarra.setText("Codigo Barra");
        getContentPane().add(titCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        titProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titProducto.setForeground(new java.awt.Color(0, 0, 0));
        titProducto.setText("Producto");
        getContentPane().add(titProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        cantProducto.setBackground(new java.awt.Color(255, 255, 255));
        cantProducto.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(cantProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 50, 30));

        codigoBarra.setBackground(new java.awt.Color(255, 255, 255));
        codigoBarra.setForeground(new java.awt.Color(0, 0, 0));
        codigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoBarraActionPerformed(evt);
            }
        });
        getContentPane().add(codigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 32));

        nombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        nombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProductoActionPerformed(evt);
            }
        });
        getContentPane().add(nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 180, 30));

        subTotal.setBackground(new java.awt.Color(255, 255, 255));
        subTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subTotal.setForeground(new java.awt.Color(0, 0, 0));
        subTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subTotalActionPerformed(evt);
            }
        });
        getContentPane().add(subTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 250, 80));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 190, 30));

        titTotal.setBackground(new java.awt.Color(255, 255, 255));
        titTotal.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        titTotal.setForeground(new java.awt.Color(0, 0, 0));
        titTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titTotal.setText("TOTAL");
        titTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(titTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 80, 50));

        registroVentas.setBackground(new java.awt.Color(51, 255, 0));
        registroVentas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registroVentas.setForeground(new java.awt.Color(0, 0, 0));
        registroVentas.setText("Registrar Venta");
        registroVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroVentasActionPerformed(evt);
            }
        });
        getContentPane().add(registroVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 160, 110));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDescripcionVenta.setBackground(new java.awt.Color(255, 255, 255));
        tablaDescripcionVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaDescripcionVenta.setForeground(new java.awt.Color(0, 0, 0));
        tablaDescripcionVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cantidad", "Detalle", "Precio Unitario", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(tablaDescripcionVenta);
        if (tablaDescripcionVenta.getColumnModel().getColumnCount() > 0) {
            tablaDescripcionVenta.getColumnModel().getColumn(0).setMaxWidth(55);
            tablaDescripcionVenta.getColumnModel().getColumn(1).setMaxWidth(280);
            tablaDescripcionVenta.getColumnModel().getColumn(2).setMaxWidth(180);
            tablaDescripcionVenta.getColumnModel().getColumn(3).setMaxWidth(180);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 630, 420));

        vueltoVenta.setBackground(new java.awt.Color(255, 255, 255));
        vueltoVenta.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(vueltoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 150, 50));

        tipoPago.setBackground(new java.awt.Color(255, 255, 255));
        tipoPago.setForeground(new java.awt.Color(0, 0, 0));
        tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Transferencia" }));
        tipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPagoActionPerformed(evt);
            }
        });
        getContentPane().add(tipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 150, -1));

        titTipoPago.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titTipoPago.setForeground(new java.awt.Color(0, 0, 0));
        titTipoPago.setText("Tipo de Pago:");
        getContentPane().add(titTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 150, 20));

        titVuelto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titVuelto.setForeground(new java.awt.Color(0, 0, 0));
        titVuelto.setText("Vuelto:");
        getContentPane().add(titVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 150, 20));

        jButtonAñadir.setBackground(new java.awt.Color(51, 255, 255));
        jButtonAñadir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAñadir.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAñadir.setText("Añadir");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 180, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Facturacion");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 200, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroVentasActionPerformed
        // boton para finalizar e ingresar una venta al sistema
    }//GEN-LAST:event_registroVentasActionPerformed

    private void tipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPagoActionPerformed
        // indica que tipo de pago realizo el cliente
    }//GEN-LAST:event_tipoPagoActionPerformed

    private void codigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoBarraActionPerformed

    }//GEN-LAST:event_codigoBarraActionPerformed

    private void nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProductoActionPerformed

    }//GEN-LAST:event_nombreProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //metodo que busca el producto en base al codigo de barra
         Modelo_Producto pro = new Modelo_Producto();
        control_Producto cont = new control_Producto();
        
        if(codigoBarra.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete el codigo de barra");
            codigoBarra.setBackground(Color.red);
        } else {
            //recibe el valor ingresado x el usuario
            if(cont.existeProducto(codigoBarra.getText().trim())){
                String codigo = codigoBarra.getText();
                nombreProducto.setText(cont.buscarProducto(codigo).getNombre());
//                PrecioActual.setText(String.valueOf(cont.buscarProducto(codigo).getPrecio_Actual()));
           
            } else {
                JOptionPane.showMessageDialog(null, "El producto seleccionado no existe");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void subTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotalActionPerformed

    //Metodo para añadir productos a la venta
    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        int cant = 0;
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantProducto;
    private javax.swing.JTextField codigoBarra;
    private javax.swing.JButton jButton1;
    private javax.swing.JToggleButton jButtonAñadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JButton registroVentas;
    private javax.swing.JTextField subTotal;
    public static javax.swing.JTable tablaDescripcionVenta;
    private javax.swing.JComboBox<String> tipoPago;
    private javax.swing.JLabel titCant;
    private javax.swing.JLabel titCodigoBarra;
    private javax.swing.JLabel titProducto;
    private javax.swing.JLabel titTipoPago;
    private javax.swing.JLabel titTotal;
    private javax.swing.JLabel titVuelto;
    private javax.swing.JTextField vueltoVenta;
    // End of variables declaration//GEN-END:variables


}
