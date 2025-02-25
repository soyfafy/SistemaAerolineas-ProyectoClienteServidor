package AdminSystem;

import ControlBaseDatos.DBadminsystem;
import GUI.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DBusersMoreInfo extends javax.swing.JFrame {
    
    
    int xMouse, yMouse;
    
    public DBusersMoreInfo() {
        initComponents();
        cargarDatosMasInfo();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPersonas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNacimiento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIDpersona = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnAgregarMasInfo = new javax.swing.JButton();
        btnModificarMasInfo = new javax.swing.JButton();
        btnEliminarMasInfo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(232, 232, 232));
        bg.setPreferredSize(new java.awt.Dimension(953, 584));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(232, 232, 232));

        exitTxt.setBackground(new java.awt.Color(232, 232, 232));
        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("🢀");
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
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setText("Mas informacion");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        TablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPersonas);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 740, 130));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("ID Persona:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        bg.add(txtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 210, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nombre:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));
        bg.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 210, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nacimiento:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 210, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Dirrecion:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));
        bg.add(txtIDpersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 52, 210, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Telefono:");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));
        bg.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 210, 30));

        btnAgregarMasInfo.setText("Agregar");
        btnAgregarMasInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMasInfoActionPerformed(evt);
            }
        });
        bg.add(btnAgregarMasInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        btnModificarMasInfo.setText("Modificar");
        btnModificarMasInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMasInfoActionPerformed(evt);
            }
        });
        bg.add(btnModificarMasInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        btnEliminarMasInfo.setText("Eliminar");
        btnEliminarMasInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMasInfoActionPerformed(evt);
            }
        });
        bg.add(btnEliminarMasInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Apellido:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        bg.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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

    private void TablaPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPersonasMouseClicked
        // seleccion de datos de la tabla para hacer CRUD:
        int fila = TablaPersonas.getSelectedRow();

        txtIDpersona.setText(TablaPersonas.getValueAt(fila, 0).toString());
        txtNombre.setText(TablaPersonas.getValueAt(fila, 1).toString());
        txtApellido.setText(TablaPersonas.getValueAt(fila, 2).toString());
        txtNacimiento.setText(TablaPersonas.getValueAt(fila, 3).toString());
        txtDireccion.setText(TablaPersonas.getValueAt(fila, 4).toString());
        txtTelefono.setText(TablaPersonas.getValueAt(fila, 5).toString());

    }//GEN-LAST:event_TablaPersonasMouseClicked

    private void btnAgregarMasInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMasInfoActionPerformed
        // codigo para agregar datos a la DB
        try {
            DBadminsystem  cc = new DBadminsystem ();
            Connection cn = cc.DBcontrolCredenciales();

            PreparedStatement ps = cn.prepareStatement("INSERT INTO personas VALUES (?,?,?,?,?,?);");

            int id_persona = Integer.parseInt(txtIDpersona.getText());
            String nombre = txtNombre.getText();
            String last_name = txtApellido.getText();
            String birth_date = txtNacimiento.getText();
            String address = txtDireccion.getText();
            String phone = txtTelefono.getText();

            ps.setInt(1, id_persona);
            ps.setString(2, nombre);
            ps.setString(3, last_name);
            ps.setString(4, birth_date);
            ps.setString(5, address);
            ps.setString(6, phone);
            ps.executeUpdate();

            limpiarCamposMasInfo();
            cargarDatosMasInfo();
            JOptionPane.showMessageDialog(null, "Datos guardados exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarMasInfoActionPerformed

    private void btnModificarMasInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMasInfoActionPerformed
        // Codigo para editar datos de la DB:
        try {
            DBadminsystem  cc = new DBadminsystem ();
            Connection cn = cc.DBcontrolCredenciales();

            PreparedStatement ps = cn.prepareStatement("UPDATE personas SET name = ?, last_name = ?, birth_date = ?, address = ?, phone = ? WHERE id_persona = ?;");

            int id_persona = Integer.parseInt(txtIDpersona.getText());
            String nombre = txtNombre.getText();
            String last_name = txtApellido.getText();
            String birth_date = txtNacimiento.getText();
            String address = txtDireccion.getText();
            String phone = txtTelefono.getText();

            ps.setString(1, nombre);
            ps.setString(2, last_name);
            ps.setString(3, birth_date);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.setInt(6, id_persona);
            ps.executeUpdate();

            limpiarCamposMasInfo();
            cargarDatosMasInfo();
            JOptionPane.showMessageDialog(null, "Datos actualizados exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnModificarMasInfoActionPerformed

    private void btnEliminarMasInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMasInfoActionPerformed
        // Codigo para eliminar datos de la DB:
        try {
            DBadminsystem  cc = new DBadminsystem ();
            Connection cn = cc.DBcontrolCredenciales();

            PreparedStatement ps = cn.prepareStatement("DELETE FROM personas  WHERE id_persona = ?;");

            int id_persona = Integer.parseInt(txtIDpersona.getText());

            ps.setInt(1, id_persona);
            ps.executeUpdate();

            limpiarCamposMasInfo();
            cargarDatosMasInfo();
            JOptionPane.showMessageDialog(null, "Eliminado exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarMasInfoActionPerformed
    
    //METODO PARA CARGAR DATOS DE LA DB DE HOSPEDAJE
    public void cargarDatosMasInfo() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("ID");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");
            modelo.addColumn("NACIMIENTO");
            modelo.addColumn("DIRECCION");
            modelo.addColumn("TELEFONO");

            DBadminsystem  cc = new DBadminsystem ();
            Connection cn = cc.DBcontrolCredenciales();

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM personas");

            while (rs.next()) {
                String[] fila = new String[6];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);

                modelo.addRow(fila);
            }
            TablaPersonas.setModel(modelo);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    //METODO PARA LIMPIAR CAMPOS EN LOS TXT DE HOSPEDAJE
    public void limpiarCamposMasInfo() {
        txtIDpersona.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtNacimiento.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
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
                new DBusersMoreInfo().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPersonas;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregarMasInfo;
    private javax.swing.JButton btnEliminarMasInfo;
    private javax.swing.JButton btnModificarMasInfo;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIDpersona;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
