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

public class DBdiscounts extends javax.swing.JFrame {
    
    
    int xMouse, yMouse;
    
    public DBdiscounts() {
        initComponents();
        cargarDatosDescuentos();
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
        TablaDescuentos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodDesc = new javax.swing.JTextField();
        txtVencimiento = new javax.swing.JTextField();
        txtPorcentaje = new javax.swing.JTextField();
        btnAgregarDesc = new javax.swing.JButton();
        btnModificarDesc = new javax.swing.JButton();
        btnEliminarDesc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(953, 584));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

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
        jLabel6.setText("Panel de Descuentos");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        TablaDescuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaDescuentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDescuentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDescuentos);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 390, 250));

        jLabel1.setText("Codigo:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel2.setText("Porcentaje:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jLabel3.setText("Fecha de vencimiento:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));
        bg.add(txtCodDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 300, 30));
        bg.add(txtVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 300, 30));
        bg.add(txtPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 300, 30));

        btnAgregarDesc.setText("Agregar");
        btnAgregarDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDescActionPerformed(evt);
            }
        });
        bg.add(btnAgregarDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        btnModificarDesc.setText("Modificar");
        btnModificarDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDescActionPerformed(evt);
            }
        });
        bg.add(btnModificarDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        btnEliminarDesc.setText("Eliminar");
        btnEliminarDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDescActionPerformed(evt);
            }
        });
        bg.add(btnEliminarDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

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

    private void btnAgregarDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDescActionPerformed
        //CODIGO PARA AGREGAR DATOS A LA DB    
        try {
            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            PreparedStatement ps = cn.prepareStatement("INSERT INTO descuentos VALUES (?,?,?);");

            String codigo_descuento = txtCodDesc.getText();
            String porcentaje = txtPorcentaje.getText();
            String fecha_vencimiento = txtVencimiento.getText();

            ps.setString(1, codigo_descuento);
            ps.setString(2, porcentaje);
            ps.setString(3, fecha_vencimiento);
            ps.executeUpdate();

            limpiarCamposHospedaje();
            cargarDatosDescuentos();
            JOptionPane.showMessageDialog(null, "Datos guardados exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarDescActionPerformed

    private void btnModificarDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDescActionPerformed
        // Codigo para editar datos de la DB:
        try {
            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            PreparedStatement ps = cn.prepareStatement("UPDATE descuentos SET porcentaje = ?, fecha_vencimiento = ? WHERE codigo_descuento = ?;");

            String codigo_descuento = txtCodDesc.getText();
            String porcentaje = txtPorcentaje.getText();
            String fecha_vencimiento = txtVencimiento.getText();
            
            ps.setString(1, porcentaje);
            ps.setString(2, fecha_vencimiento);
            ps.setString(3, codigo_descuento);
            ps.executeUpdate();

            limpiarCamposHospedaje();
            cargarDatosDescuentos();
            JOptionPane.showMessageDialog(null, "Datos actualizados exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnModificarDescActionPerformed

    private void TablaDescuentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDescuentosMouseClicked
        // seleccion de datos de la tabla para hacer CRUD:
        int fila = TablaDescuentos.getSelectedRow();

        txtCodDesc.setText(TablaDescuentos.getValueAt(fila, 0).toString());
        txtPorcentaje.setText(TablaDescuentos.getValueAt(fila, 1).toString());
        txtVencimiento.setText(TablaDescuentos.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_TablaDescuentosMouseClicked

    private void btnEliminarDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDescActionPerformed
        // Codigo para eliminar datos de la DB:
        try {
            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            PreparedStatement ps = cn.prepareStatement("DELETE FROM descuentos WHERE codigo_descuento = ?;");

            String codigo_descuento = txtCodDesc.getText();

            ps.setString(1, codigo_descuento);

            ps.executeUpdate();
            limpiarCamposHospedaje();
            cargarDatosDescuentos();
            JOptionPane.showMessageDialog(null, "Eliminado exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarDescActionPerformed
    
    //METODO PARA CARGAR DATOS DE LA DB DE HOSPEDAJE
    public void cargarDatosDescuentos() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("Codigo");
            modelo.addColumn("Porcentaje");
            modelo.addColumn("Vencimiento");

            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM descuentos");

            while (rs.next()) {
                String[] fila = new String[3];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                modelo.addRow(fila);
            }
            TablaDescuentos.setModel(modelo);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    //METODO PARA LIMPIAR CAMPOS EN LOS TXT DE HOSPEDAJE
    public void limpiarCamposHospedaje() {
        txtCodDesc.setText("");
        txtPorcentaje.setText("");
        txtVencimiento.setText("");
        txtCodDesc.requestFocus();
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
                new DBdiscounts().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDescuentos;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregarDesc;
    private javax.swing.JButton btnEliminarDesc;
    private javax.swing.JButton btnModificarDesc;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodDesc;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables
}
