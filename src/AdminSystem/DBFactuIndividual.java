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

public class DBFactuIndividual extends javax.swing.JFrame {
    
    
    int xMouse, yMouse;
    
    public DBFactuIndividual() {
        initComponents();
        cargarDatosFactuIndi();
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
        TablaFacturaIndividual = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtPrecioBrutoI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrecioNetoI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIDFactura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtImpuestosI = new javax.swing.JTextField();
        btnAgregarFactuIndi = new javax.swing.JButton();
        btnModificarFactuIndi = new javax.swing.JButton();
        btnEliminarFactuIndi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtListaProductos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

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
        jLabel6.setText("Otras Facturas");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        TablaFacturaIndividual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaFacturaIndividual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaFacturaIndividualMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaFacturaIndividual);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 740, 130));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("ID Factura:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        bg.add(txtPrecioBrutoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 210, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nombre Cliente:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        bg.add(txtPrecioNetoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 210, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Precio Bruto:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));
        bg.add(txtNomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 210, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Impuestos:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));
        bg.add(txtIDFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 52, 210, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Precio Neto:");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));
        bg.add(txtImpuestosI, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 210, 30));

        btnAgregarFactuIndi.setText("Agregar");
        btnAgregarFactuIndi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFactuIndiActionPerformed(evt);
            }
        });
        bg.add(btnAgregarFactuIndi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        btnModificarFactuIndi.setText("Modificar");
        btnModificarFactuIndi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarFactuIndiActionPerformed(evt);
            }
        });
        bg.add(btnModificarFactuIndi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        btnEliminarFactuIndi.setText("Eliminar");
        btnEliminarFactuIndi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFactuIndiActionPerformed(evt);
            }
        });
        bg.add(btnEliminarFactuIndi, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Lista Productos:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        bg.add(txtListaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 30));

        jLabel8.setText("Facturas individuales de compras de solo productos.");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

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

    private void TablaFacturaIndividualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaFacturaIndividualMouseClicked
        // seleccion de datos de la tabla para hacer CRUD:
        int fila = TablaFacturaIndividual.getSelectedRow();

        txtIDFactura.setText(TablaFacturaIndividual.getValueAt(fila, 0).toString());
        txtNomCliente.setText(TablaFacturaIndividual.getValueAt(fila, 1).toString());
        txtListaProductos.setText(TablaFacturaIndividual.getValueAt(fila, 2).toString());
        txtPrecioBrutoI.setText(TablaFacturaIndividual.getValueAt(fila, 3).toString());
        txtImpuestosI.setText(TablaFacturaIndividual.getValueAt(fila, 4).toString());
        txtPrecioNetoI.setText(TablaFacturaIndividual.getValueAt(fila, 5).toString());

    }//GEN-LAST:event_TablaFacturaIndividualMouseClicked

    private void btnAgregarFactuIndiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFactuIndiActionPerformed
        // codigo para agregar datos a la DB
        try {
            DBadminsystem  cc = new DBadminsystem ();
            Connection cn = cc.DBcontrolVentas();

            PreparedStatement ps = cn.prepareStatement("INSERT INTO VentasIndividuales VALUES (?,?,?,?,?,?);");

            int id_factura = Integer.parseInt(txtIDFactura.getText());
            String nombre_cliente = txtNomCliente.getText();
            String lista_productos = txtListaProductos.getText();
            String precio_brutos = txtPrecioBrutoI.getText();
            String impuestos = txtImpuestosI.getText();
            String precio_neto = txtPrecioNetoI.getText();

            ps.setInt(1, id_factura);
            ps.setString(2, nombre_cliente);
            ps.setString(3, lista_productos);
            ps.setString(4, precio_brutos);
            ps.setString(5, impuestos);
            ps.setString(6, precio_neto);
            ps.executeUpdate();

            limpiarCamposFactuIndi();
            cargarDatosFactuIndi();
            JOptionPane.showMessageDialog(null, "Datos guardados exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarFactuIndiActionPerformed

    private void btnModificarFactuIndiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarFactuIndiActionPerformed
        // Codigo para editar datos de la DB:
        try {
            DBadminsystem  cc = new DBadminsystem ();
            Connection cn = cc.DBcontrolVentas();

            PreparedStatement ps = cn.prepareStatement("UPDATE VentasIndividuales SET nombre_cliente = ?, lista_productos = ?, precio_bruto = ?, impuestos = ?, precio_neto = ? WHERE id_factura = ?;");

            int id_factura = Integer.parseInt(txtIDFactura.getText());
            String nombre_cliente = txtNomCliente.getText();
            String lista_productos = txtListaProductos.getText();
            String precio_brutos = txtPrecioBrutoI.getText();
            String impuestos = txtImpuestosI.getText();
            String precio_neto = txtPrecioNetoI.getText();

            
            ps.setString(1, nombre_cliente);
            ps.setString(2, lista_productos);
            ps.setString(3, precio_brutos);
            ps.setString(4, impuestos);
            ps.setString(5, precio_neto);
            ps.setInt(6, id_factura);
            ps.executeUpdate();

            limpiarCamposFactuIndi();
            cargarDatosFactuIndi();
            JOptionPane.showMessageDialog(null, "Datos actualizados exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnModificarFactuIndiActionPerformed

    private void btnEliminarFactuIndiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFactuIndiActionPerformed
        // Codigo para eliminar datos de la DB:
        try {
            DBadminsystem  cc = new DBadminsystem ();
            Connection cn = cc.DBcontrolVentas();

            PreparedStatement ps = cn.prepareStatement("DELETE FROM VentasIndividuales WHERE id_factura = ?;");

            int id_factura = Integer.parseInt(txtIDFactura.getText());

            ps.setInt(1, id_factura);
            ps.executeUpdate();

            limpiarCamposFactuIndi();
            cargarDatosFactuIndi();
            JOptionPane.showMessageDialog(null, "Eliminado exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarFactuIndiActionPerformed
    
    //METODO PARA CARGAR DATOS DE LA DB DE HOSPEDAJE
    public void cargarDatosFactuIndi() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("ID");
            modelo.addColumn("Nombre Cliente");
            modelo.addColumn("Lista Productos");
            modelo.addColumn("Precio Bruto");
            modelo.addColumn("Impuestos");
            modelo.addColumn("Precio Neto");

            DBadminsystem  cc = new DBadminsystem ();
            Connection cn = cc.DBcontrolVentas();

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM VentasIndividuales");

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
            TablaFacturaIndividual.setModel(modelo);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    //METODO PARA LIMPIAR CAMPOS EN LOS TXT DE HOSPEDAJE
    public void limpiarCamposFactuIndi() {
        txtIDFactura.setText("");
        txtNomCliente.setText("");
        txtListaProductos.setText("");
        txtPrecioBrutoI.setText("");
        txtImpuestosI.setText("");
        txtPrecioNetoI.setText("");
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
                new DBFactuIndividual().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaFacturaIndividual;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregarFactuIndi;
    private javax.swing.JButton btnEliminarFactuIndi;
    private javax.swing.JButton btnModificarFactuIndi;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtIDFactura;
    private javax.swing.JTextField txtImpuestosI;
    private javax.swing.JTextField txtListaProductos;
    private javax.swing.JTextField txtNomCliente;
    private javax.swing.JTextField txtPrecioBrutoI;
    private javax.swing.JTextField txtPrecioNetoI;
    // End of variables declaration//GEN-END:variables
}
