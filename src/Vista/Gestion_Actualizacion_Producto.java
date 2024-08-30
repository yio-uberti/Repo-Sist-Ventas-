package Vista;

//Importaciones
import Controladores.control_Cat_Proveedor;
import Modelos.Modelo_categoria;
import java.awt.Dimension;
import java.sql.*;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Gestion_Actualizacion_Producto extends javax.swing.JInternalFrame {

    public Gestion_Actualizacion_Producto() {
        initComponents();
        this.setTitle("Gestion de Productos");
        this.setSize(new Dimension(1230, 650));

        jTable_Producto.getTableHeader().setReorderingAllowed(false); //para bloquear las columnas del usuario
        cargarCategoriasEnComboBox();
        agregarListeners();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
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
        // Crear instancia del controlador y de categorias
        control_Cat_Proveedor controlCategoria = new control_Cat_Proveedor(null);
        List<Modelo_categoria> categorias = controlCategoria.getListaCategorias();

        // Agregar categorías al JComboBox
        for (Modelo_categoria categoria : categorias) {
            jComboCategoria.addItem(categoria);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboCategoria = new javax.swing.JComboBox<>();
        txtPrecioNuevo = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        BotonBuscador = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Producto = new javax.swing.JTable();
        txtPrecioActual = new javax.swing.JTextField();
        txtNombreSeleccionado = new javax.swing.JTextField();
        BotonActualizar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        txtPrecioNuevoColectiva = new javax.swing.JTextField();
        BotonActualizarTodo = new javax.swing.JButton();
        titEliminar = new javax.swing.JLabel();
        titBuscador = new javax.swing.JLabel();
        titActualizacion2 = new javax.swing.JLabel();
        titActualizacion1 = new javax.swing.JLabel();
        titCategoria = new javax.swing.JLabel();
        titNombrePro = new javax.swing.JLabel();
        titPrecio = new javax.swing.JLabel();
        titNombrePro1 = new javax.swing.JLabel();
        titPrecio1 = new javax.swing.JLabel();
        titPrecio2 = new javax.swing.JLabel();
        BotonLimpiarTabla = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_wallpapaer = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboCategoria.setBackground(new java.awt.Color(255, 255, 255));
        jComboCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboCategoria.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jComboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 310, 50));

        txtPrecioNuevo.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioNuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioNuevo.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioNuevo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtPrecioNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 230, 40));

        txtNombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 300, 50));

        BotonBuscador.setBackground(new java.awt.Color(51, 153, 255));
        BotonBuscador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonBuscador.setForeground(new java.awt.Color(0, 0, 0));
        BotonBuscador.setText("BUSCAR");
        BotonBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscadorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 200, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Producto.setBackground(new java.awt.Color(255, 255, 255));
        jTable_Producto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable_Producto.setForeground(new java.awt.Color(0, 0, 0));
        jTable_Producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Tipo", "Categoria", "Precio"
            }
        ));
        jTable_Producto.setRowHeight(30);
        jScrollPane1.setViewportView(jTable_Producto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 1160, 230));

        txtPrecioActual.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioActual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioActual.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioActual.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecioActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActualActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecioActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 230, 40));

        txtNombreSeleccionado.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreSeleccionado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreSeleccionado.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSeleccionadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 310, 40));

        BotonActualizar.setBackground(new java.awt.Color(0, 204, 255));
        BotonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonActualizar.setForeground(new java.awt.Color(0, 0, 0));
        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 390, 250, 90));

        BotonBorrar.setBackground(new java.awt.Color(255, 0, 0));
        BotonBorrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonBorrar.setForeground(new java.awt.Color(0, 0, 0));
        BotonBorrar.setText("Eliminar");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 170, 60));

        txtPrecioNuevoColectiva.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioNuevoColectiva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioNuevoColectiva.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioNuevoColectiva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(txtPrecioNuevoColectiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 230, 40));

        BotonActualizarTodo.setBackground(new java.awt.Color(0, 204, 255));
        BotonActualizarTodo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonActualizarTodo.setForeground(new java.awt.Color(0, 0, 0));
        BotonActualizarTodo.setText("Actualizar Todo");
        BotonActualizarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarTodoActionPerformed(evt);
            }
        });
        getContentPane().add(BotonActualizarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 250, 80));

        titEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titEliminar.setForeground(new java.awt.Color(0, 0, 0));
        titEliminar.setText("Seleccione el producto a eliminar de la tabla...");
        getContentPane().add(titEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        titBuscador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titBuscador.setForeground(new java.awt.Color(0, 0, 0));
        titBuscador.setText("Buscador de Productos:");
        getContentPane().add(titBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        titActualizacion2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titActualizacion2.setForeground(new java.awt.Color(0, 0, 0));
        titActualizacion2.setText("Actualizacion Colectiva:");
        getContentPane().add(titActualizacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        titActualizacion1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titActualizacion1.setForeground(new java.awt.Color(0, 0, 0));
        titActualizacion1.setText("Actualizacion Unitaria:");
        getContentPane().add(titActualizacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        titCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titCategoria.setForeground(new java.awt.Color(0, 0, 0));
        titCategoria.setText("Selecione Categoria:");
        getContentPane().add(titCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));

        titNombrePro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titNombrePro.setForeground(new java.awt.Color(0, 0, 0));
        titNombrePro.setText("Nombre del Producto:");
        getContentPane().add(titNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 40));

        titPrecio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titPrecio.setForeground(new java.awt.Color(0, 0, 0));
        titPrecio.setText("Precio Nuevo:");
        getContentPane().add(titPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 100, 30));

        titNombrePro1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titNombrePro1.setForeground(new java.awt.Color(0, 0, 0));
        titNombrePro1.setText("Nombre del Producto:");
        getContentPane().add(titNombrePro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, 30));

        titPrecio1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titPrecio1.setForeground(new java.awt.Color(0, 0, 0));
        titPrecio1.setText("Precio Actual:");
        getContentPane().add(titPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 100, 40));

        titPrecio2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        titPrecio2.setForeground(new java.awt.Color(0, 0, 0));
        titPrecio2.setText("Precio Nuevo:");
        getContentPane().add(titPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 100, 40));

        BotonLimpiarTabla.setBackground(new java.awt.Color(255, 0, 0));
        BotonLimpiarTabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonLimpiarTabla.setForeground(new java.awt.Color(0, 0, 0));
        BotonLimpiarTabla.setText("Limpiar tabla");
        BotonLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarTablaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonLimpiarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 200, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 1160, 110));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1160, 120));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 590, 100));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 560, 100));

        jLabel_wallpapaer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo7.png"))); // NOI18N
        getContentPane().add(jLabel_wallpapaer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActualActionPerformed

    //Boton de busqueda de productos
    private void BotonBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscadorActionPerformed
        // Configurar la tabla antes de la consulta
        DefaultTableModel model = (DefaultTableModel) jTable_Producto.getModel();
        model.setRowCount(0);  

        String nombrePro = txtNombreProducto.getText().trim();
        Modelo_categoria categoriaSeleccionada = (Modelo_categoria) jComboCategoria.getSelectedItem();

        // Verificar que se haya ingresado un nombre de producto
        if (nombrePro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del producto que desea buscar...");
            return;
        }

        // Verificar que se haya seleccionado una categoría
        if (categoriaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una categoría válida.");
            return;
        }

        // Verificar la conexión a la base de datos
        try (Connection con = Conexion.Conexion_BD.conectar()) {
            // Preparar la consulta SQL con parámetros
            String sql = "SELECT Cod_Barra, nombre_Producto, tipo, categoria_id, precio_Actual "
                    + "FROM Producto WHERE nombre_Producto LIKE ? AND categoria_id = ?";
            try (PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
                ps.setString(1, "%" + nombrePro + "%");  // Buscar coincidencias parciales
                ps.setInt(2, categoriaSeleccionada.getId());

                // Ejecutar la consulta
                try (ResultSet rs = ps.executeQuery()) {
                    // Verificar si hay resultados
                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(this, "No se encontraron productos que coincidan con los criterios.");
                        return; // Salir si no se encuentran resultados
                    }

                    // Volver al inicio del ResultSet
                    rs.beforeFirst();

                    // Recorrer los resultados y agregarlos al modelo de la tabla
                    while (rs.next()) {
                        model.addRow(new Object[]{
                            rs.getString("Cod_Barra"),
                            rs.getString("nombre_Producto"),
                            rs.getString("tipo"),
                            rs.getInt("categoria_id"),
                            rs.getDouble("precio_Actual")
                        });
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de búsqueda: verifique que el producto exista o que la categoría seleccionada sea la correcta.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_BotonBuscadorActionPerformed

    private void txtNombreSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSeleccionadoActionPerformed

    // Método donde agregas el MouseListener
    private void agregarListeners() {
        jTable_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = jTable_Producto.getSelectedRow();
                if (selectedRow != -1) {
                    String nombreProducto = jTable_Producto.getValueAt(selectedRow, 2).toString(); // Columna 1 para nombre
                    String precioActual = jTable_Producto.getValueAt(selectedRow, 4).toString(); // Columna 4 para precio

                    txtNombreSeleccionado.setText(nombreProducto);
                    txtPrecioActual.setText(precioActual);
                }
            }
        });
    }

    //Boton para la actualiizacion unitaria
    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        // Verificar si se ha seleccionado una fila en la tabla
        int selectedRow = jTable_Producto.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto de la tabla para actualizar.");
            return;
        }

        // Obtener el código del producto seleccionado (columna 0) y el nuevo precio desde el campo de texto
        String codigoProducto = jTable_Producto.getValueAt(selectedRow, 0).toString();
        String nuevoPrecioTexto = txtPrecioNuevo.getText();

        // Validar que se haya ingresado un precio válido
        if (nuevoPrecioTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nuevo precio.");
            return;
        }

        try {
            double nuevoPrecio = Double.parseDouble(nuevoPrecioTexto);

            // Actualizar el precio en la base de datos y en la tabla
            if (actualizarPrecioProducto(codigoProducto, nuevoPrecio)) {
                jTable_Producto.setValueAt(nuevoPrecio, selectedRow, 4);  // Columna 4 para el precio
                JOptionPane.showMessageDialog(this, "Precio actualizado correctamente.");
            }
            txtNombreProducto.setText("");
            txtNombreSeleccionado.setText("");
            txtPrecioNuevo.setText("");
            txtPrecioActual.setText("");
            limpiarTabla();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Precio no válido.");
        }
    }//GEN-LAST:event_BotonActualizarActionPerformed

    //Boton para eliminar productos de tabla a la hora de actualizacion colectiva
    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable_Producto.getModel();

        // Verificar si se ha seleccionado una fila en la tabla
        int selectedRow = jTable_Producto.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para eliminarlo de la 'Tabla'");
            return;

        }
        model.removeRow(selectedRow);

    }//GEN-LAST:event_BotonBorrarActionPerformed

    //Boton de actualizacion colectiva
    private void BotonActualizarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarTodoActionPerformed

        if (txtPrecioNuevoColectiva.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un nuevo precio antes de actualizar.");
            return; // Salir del método si no hay valor en el campo de texto
        }

        // Sentencia sql y modelo de la tabla
        String sqlUpdate = "UPDATE Producto SET precio_Actual = ? WHERE nombre_Producto LIKE ?";
        DefaultTableModel model = (DefaultTableModel) jTable_Producto.getModel();

        try (Connection con = Conexion.Conexion_BD.conectar(); PreparedStatement pstUpdate = con.prepareStatement(sqlUpdate)) {

            // Actualizar precios en la base de datos
            for (int i = 0; i < model.getRowCount(); i++) {
                // Obtener el nombre del producto y el nuevo precio del campo de texto
                String nombreProducto = model.getValueAt(i, 1).toString();
                double nuevoPrecio = Double.parseDouble(txtPrecioNuevoColectiva.getText());

                // Configurar los parámetros de la consulta
                pstUpdate.setDouble(1, nuevoPrecio);
                pstUpdate.setString(2, "%" + nombreProducto + "%");

                // Ejecutar la consulta de actualización
                pstUpdate.executeUpdate();
            }

            // Recargar los datos actualizados en la tabla
            recargarDatosEnTabla();

            JOptionPane.showMessageDialog(this, "Actualización Exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No se pudo realizar la actualización");
            e.printStackTrace(); // Imprimir el stack trace para depuración
        }

    }//GEN-LAST:event_BotonActualizarTodoActionPerformed

    // Método para recargar los datos en la tabla
    private void recargarDatosEnTabla() {
        String sqlSelect = "SELECT Cod_Barra, nombre_Producto, tipo, categoria_id, precio_Actual FROM Producto";
        DefaultTableModel model = (DefaultTableModel) jTable_Producto.getModel();

        try (Connection con = Conexion.Conexion_BD.conectar(); PreparedStatement pst = con.prepareStatement(sqlSelect); ResultSet rs = pst.executeQuery()) {

            // Limpiar la tabla antes de volver a llenarla
            model.setRowCount(0);

            // Recorrer los resultados y agregarlos al modelo de la tabla
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("Cod_Barra"),
                    rs.getString("nombre_Producto"),
                    rs.getString("tipo"),
                    rs.getInt("categoria_id"),
                    rs.getDouble("precio_Actual")
                });
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos");
            e.printStackTrace(); // Imprimir el stack trace para depuración
        }
    }

    //Boton para limpiar la tabla en caso de busqueda erronea
    private void BotonLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarTablaActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_BotonLimpiarTablaActionPerformed

    // Método para actualizar el precio del producto en la base de datos
    private boolean actualizarPrecioProducto(String codigoProducto, double nuevoPrecio) {
        String sql = "UPDATE Producto SET precio_Actual = ? WHERE Cod_Barra = ?";
        try (Connection con = Conexion.Conexion_BD.conectar(); PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setDouble(1, nuevoPrecio);
            pst.setString(2, codigoProducto);
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar el producto: " + e.getMessage());
            System.out.println(e.getMessage());
            return false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonActualizarTodo;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonBuscador;
    private javax.swing.JButton BotonLimpiarTabla;
    private javax.swing.JComboBox<Object> jComboCategoria;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_wallpapaer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Producto;
    private javax.swing.JLabel titActualizacion1;
    private javax.swing.JLabel titActualizacion2;
    private javax.swing.JLabel titBuscador;
    private javax.swing.JLabel titCategoria;
    private javax.swing.JLabel titEliminar;
    private javax.swing.JLabel titNombrePro;
    private javax.swing.JLabel titNombrePro1;
    private javax.swing.JLabel titPrecio;
    private javax.swing.JLabel titPrecio1;
    private javax.swing.JLabel titPrecio2;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNombreSeleccionado;
    private javax.swing.JTextField txtPrecioActual;
    private javax.swing.JTextField txtPrecioNuevo;
    private javax.swing.JTextField txtPrecioNuevoColectiva;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla() {
        DefaultTableModel model = (DefaultTableModel) jTable_Producto.getModel();
        model.setRowCount(0); // Esto limpiará todas las filas de la tabla

    }

}
