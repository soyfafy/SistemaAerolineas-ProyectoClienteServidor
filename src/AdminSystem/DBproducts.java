package AdminSystem;

import ControlBaseDatos.DBadminsystem;
import GUI.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DBproducts extends javax.swing.JFrame {
    
    
    int xMouse, yMouse;
    
    public DBproducts() {
        initComponents();
        cargarDatosTransporte();
        cargarDatosHospedaje();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoViaje = new javax.swing.JTextField();
        txtPreciosT = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtSalida = new javax.swing.JTextField();
        txtLlegada = new javax.swing.JTextField();
        txtAsientos = new javax.swing.JTextField();
        btnAgregarT = new javax.swing.JButton();
        btnModificarT = new javax.swing.JButton();
        btnEliminarT = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaTransporte = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHospedaje = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNomHotel = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtHabitacionD = new javax.swing.JTextField();
        btnAgregarH = new javax.swing.JButton();
        btnModificarH = new javax.swing.JButton();
        btnEliminarH = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPrecioH = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));

        jLabel3.setText("# de Viaje");

        jLabel4.setText("Precios:");

        jLabel5.setText("Destino:");

        jLabel7.setText("Hora de salida:");

        jLabel8.setText("Hora de llegada:");

        jLabel9.setText("Asientos disponibles:");

        btnAgregarT.setText("Agregar");
        btnAgregarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTActionPerformed(evt);
            }
        });

        btnModificarT.setText("Modificar");
        btnModificarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTActionPerformed(evt);
            }
        });

        btnEliminarT.setText("Eliminar");
        btnEliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTActionPerformed(evt);
            }
        });

        TablaTransporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaTransporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaTransporteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaTransporte);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Transporte");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoViaje)
                            .addComponent(txtPreciosT)
                            .addComponent(txtDestino)
                            .addComponent(txtSalida)
                            .addComponent(txtLlegada)
                            .addComponent(txtAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnAgregarT)
                        .addGap(49, 49, 49)
                        .addComponent(btnModificarT)
                        .addGap(45, 45, 45)
                        .addComponent(btnEliminarT)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(226, 226, 226))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPreciosT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarT)
                    .addComponent(btnModificarT)
                    .addComponent(btnEliminarT))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setText("Panel de Productos");

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(232, 232, 232));
        jPanel3.setPreferredSize(new java.awt.Dimension(430, 491));

        jLabel10.setText("Nombre del hotel:");

        TablaHospedaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaHospedaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaHospedajeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaHospedaje);

        jLabel11.setText("Categoria:");

        jLabel12.setText("Ubicacion:");

        jLabel13.setText("Habitaciones disponibles:");

        btnAgregarH.setText("Agregar");
        btnAgregarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHActionPerformed(evt);
            }
        });

        btnModificarH.setText("Modificar");
        btnModificarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarHActionPerformed(evt);
            }
        });

        btnEliminarH.setText("Eliminar");
        btnEliminarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Hospedaje");

        jLabel14.setText("Precio:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(143, 143, 143))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtUbicacion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHabitacionD, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioH, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomHotel)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregarH)
                        .addGap(40, 40, 40)
                        .addComponent(btnModificarH)
                        .addGap(35, 35, 35)
                        .addComponent(btnEliminarH))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtNomHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtHabitacionD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPrecioH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarH)
                    .addComponent(btnModificarH)
                    .addComponent(btnEliminarH))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        btnAgregar.setText("Descuentos");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar)
                .addGap(169, 169, 169)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregar)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Ventana de descuentos
        DBdiscounts v1 = new DBdiscounts();
        v1.show();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTActionPerformed
        // codigo para agregar datos a la DB
        try {
            DBadminsystem  cc = new DBadminsystem ();
            Connection cn = cc.DBcontrolProductos();

            PreparedStatement ps = cn.prepareStatement("INSERT INTO transporte VALUES (?,?,?,?,?,?);");

            int numero_viaje = Integer.parseInt(txtCodigoViaje.getText());
            String precio = txtPreciosT.getText();
            String destino = txtDestino.getText();
            String hora_salida = txtSalida.getText();
            String hora_llegada = txtLlegada.getText();
            String asientos_disponibles = txtAsientos.getText();

            ps.setInt(1, numero_viaje);
            ps.setString(2, precio);
            ps.setString(3, destino);
            ps.setString(4, hora_salida);
            ps.setString(5, hora_llegada);
            ps.setString(6, asientos_disponibles);

            ps.executeUpdate();

            limpiarCamposTransporte();
            cargarDatosTransporte();
            JOptionPane.showMessageDialog(null, "Datos guardados exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarTActionPerformed

    private void TablaTransporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaTransporteMouseClicked
        // seleccion de datos de la tabla para hacer CRUD:
        int fila = TablaTransporte.getSelectedRow();

        txtCodigoViaje.setText(TablaTransporte.getValueAt(fila, 0).toString());
        txtPreciosT.setText(TablaTransporte.getValueAt(fila, 1).toString());
        txtDestino.setText(TablaTransporte.getValueAt(fila, 2).toString());
        txtSalida.setText(TablaTransporte.getValueAt(fila, 3).toString());
        txtLlegada.setText(TablaTransporte.getValueAt(fila, 4).toString());
        txtAsientos.setText(TablaTransporte.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_TablaTransporteMouseClicked

    private void btnModificarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTActionPerformed
        // Codigo para editar datos de la DB:
        try {
            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            PreparedStatement ps = cn.prepareStatement("UPDATE transporte SET precios = ?, destino = ?, hora_salida = ?, hora_llegada = ?, asientos_disponibles = ? WHERE numero_viaje = ?;");

            int numero_viaje = Integer.parseInt(txtCodigoViaje.getText());
            String precios = txtPreciosT.getText();
            String destino = txtDestino.getText();
            String hora_salida = txtSalida.getText();
            String hora_llegada = txtLlegada.getText();
            String asientos_disponibles = txtAsientos.getText();

            ps.setString(1, precios);
            ps.setString(2, destino);
            ps.setString(3, hora_salida);
            ps.setString(4, hora_llegada);
            ps.setString(5, asientos_disponibles);
            ps.setInt(6, numero_viaje);
            ps.executeUpdate();

            limpiarCamposTransporte();
            cargarDatosTransporte();
            JOptionPane.showMessageDialog(null, "Datos actualizados exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnModificarTActionPerformed

    private void btnEliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTActionPerformed
        // Codigo para eliminar datos de la DB:
        try {
            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            PreparedStatement ps = cn.prepareStatement("DELETE FROM transporte  WHERE numero_viaje = ?;");

            int numero_viaje = Integer.parseInt(txtCodigoViaje.getText());

            ps.setInt(1, numero_viaje);

            ps.executeUpdate();
            limpiarCamposTransporte();
            cargarDatosTransporte();
            JOptionPane.showMessageDialog(null, "Eliminado exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarTActionPerformed

    private void btnAgregarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHActionPerformed
        //CODIGO PARA AGREGAR DATOS A LA DB
        try {
            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            PreparedStatement ps = cn.prepareStatement("INSERT INTO hospedaje VALUES (?,?,?,?,?);");
           
            String nombre_hotel = txtNomHotel.getText();
            String categoria = txtCategoria.getText();
            String ubicacion = txtUbicacion.getText();
            String habitaciones_disponibles = txtHabitacionD.getText();
            String precio = txtPrecioH.getText();

            
            ps.setString(1, nombre_hotel);
            ps.setString(2, categoria);
            ps.setString(3, ubicacion);
            ps.setString(4, habitaciones_disponibles);
            ps.setString(5, precio);
            ps.executeUpdate();

            limpiarCamposHospedaje();
            cargarDatosHospedaje();
            JOptionPane.showMessageDialog(null, "Datos guardados exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarHActionPerformed

    private void TablaHospedajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaHospedajeMouseClicked
        // seleccion de datos de la tabla para hacer CRUD:
        int fila = TablaHospedaje.getSelectedRow();

        txtNomHotel.setText(TablaHospedaje.getValueAt(fila, 0).toString());
        txtCategoria.setText(TablaHospedaje.getValueAt(fila, 1).toString());
        txtUbicacion.setText(TablaHospedaje.getValueAt(fila, 2).toString());
        txtHabitacionD.setText(TablaHospedaje.getValueAt(fila, 3).toString());
        txtPrecioH.setText(TablaHospedaje.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_TablaHospedajeMouseClicked

    private void btnModificarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarHActionPerformed
        // Codigo para editar datos de la DB:
        try {
            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            PreparedStatement ps = cn.prepareStatement("UPDATE hospedaje SET categoria = ?, ubicacion = ?, habitaciones_disponibles = ?, precio = ? WHERE nombre_hotel = ?;");

            String nombre_hotel = txtNomHotel.getText();
            String categoria = txtCategoria.getText();
            String ubicacion = txtUbicacion.getText();
            String habitaciones_disponibles = txtHabitacionD.getText();
            String precio = txtPrecioH.getText();

            ps.setString(1, categoria);
            ps.setString(2, ubicacion);
            ps.setString(3, habitaciones_disponibles);
            ps.setString(4, precio);
            ps.setString(5, nombre_hotel);
            ps.executeUpdate();

            limpiarCamposHospedaje();
            cargarDatosHospedaje();
            JOptionPane.showMessageDialog(null, "Datos actualizados exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnModificarHActionPerformed

    private void btnEliminarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHActionPerformed
        // Codigo para eliminar datos de la DB:
        try {
            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            PreparedStatement ps = cn.prepareStatement("DELETE FROM hospedaje WHERE nombre_hotel = ?;");

            String nombre_hotel = txtNomHotel.getText();

            ps.setString(1, nombre_hotel);

            ps.executeUpdate();
            limpiarCamposHospedaje();
            cargarDatosHospedaje();
            JOptionPane.showMessageDialog(null, "Eliminado exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarHActionPerformed
    
    //METODO PARA CARGAR DATOS DE LA DB DE TRANSPORTE
    public void cargarDatosTransporte() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("# Viaje");
            modelo.addColumn("Precio");
            modelo.addColumn("Destino");
            modelo.addColumn("Salida");
            modelo.addColumn("Llegada");
            modelo.addColumn("Asientos Dispo");

            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM transporte");

            while (rs.next()) {
                String[] fila = new String[6];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(5);
                fila[5] = rs.getString(6);

                modelo.addRow(fila);
            }
            TablaTransporte.setModel(modelo);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    //METODO PARA LIMPIAR CAMPOS EN LOS TXT DE TRANSPORTE
    public void limpiarCamposTransporte(){
        txtCodigoViaje.setText("");
        txtPreciosT.setText("");
        txtDestino.setText("");
        txtSalida.setText("");
        txtLlegada.setText("");
        txtAsientos.setText("");
        txtCodigoViaje.requestFocus();
    }
    
    //METODO PARA CARGAR DATOS DE LA DB DE HOSPEDAJE
    public void cargarDatosHospedaje() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("Nombre");
            modelo.addColumn("Categoria");
            modelo.addColumn("Ubicacion");
            modelo.addColumn("Habitacion");
            modelo.addColumn("Precio");

            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM hospedaje");

            while (rs.next()) {
                String[] fila = new String[5];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                modelo.addRow(fila);
            }
            TablaHospedaje.setModel(modelo);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    //METODO PARA LIMPIAR CAMPOS EN LOS TXT DE HOSPEDAJE
    public void limpiarCamposHospedaje() {
        txtNomHotel.setText("");
        txtCategoria.setText("");
        txtUbicacion.setText("");
        txtHabitacionD.setText("");
        txtPrecioH.setText("");
        txtNomHotel.requestFocus();
    }
    
    /**
     * @param args the command line arguments
     */
    
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
            java.util.logging.Logger.getLogger(AdministrationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DBproducts().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaHospedaje;
    private javax.swing.JTable TablaTransporte;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarH;
    private javax.swing.JButton btnAgregarT;
    private javax.swing.JButton btnEliminarH;
    private javax.swing.JButton btnEliminarT;
    private javax.swing.JButton btnModificarH;
    private javax.swing.JButton btnModificarT;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtAsientos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigoViaje;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtHabitacionD;
    private javax.swing.JTextField txtLlegada;
    private javax.swing.JTextField txtNomHotel;
    private javax.swing.JTextField txtPrecioH;
    private javax.swing.JTextField txtPreciosT;
    private javax.swing.JTextField txtSalida;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
