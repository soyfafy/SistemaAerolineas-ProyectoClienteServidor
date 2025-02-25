package GUI;

import AdminSystem.*;
import ControlBaseDatos.DBadminsystem;
import GUI.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Timer;

public class FacturacionHospedaje extends javax.swing.JFrame {


    int xMouse, yMouse;

    public FacturacionHospedaje() {
        initComponents();
        codigoRandom();
        CargarDatosJcombox();

        // Crear objeto Date y obtener fecha actual
        Date fechaActual = new Date();

        // Formatear fecha de acuerdo al formato deseado
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formatoFecha.format(fechaActual);

        // Mostrar fecha en JTextField
        txtEmision.setText(fechaFormateada);

        //NO SELECCIONAR TXT IMPUESTOS y DETALLES
        txtImpuestos.setEditable(false);
        txtDetalles.setEditable(false);

        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        txtHabitacionD = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtNomHotel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnConfirmarDatos = new javax.swing.JButton();
        btnConfirmarCompra = new javax.swing.JButton();
        jcbMetodoPago = new javax.swing.JComboBox<>();
        jcbDescuentos = new javax.swing.JComboBox<>();
        btnCalculoPrecios = new javax.swing.JButton();
        txtPrecioH = new javax.swing.JTextField();
        txtNumFactura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmision = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDetalles = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPrecioTaxs = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtImpuestos = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPrecioNeto = new javax.swing.JTextField();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));

        exitTxt.setBackground(new java.awt.Color(0, 0, 0));
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

        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));
        getContentPane().add(txtHabitacionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 200, -1));
        getContentPane().add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, -1));
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, -1));
        getContentPane().add(txtNomHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 200, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Habitacion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Ubicacion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Categoria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nombre Hotel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("# Factura:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Precio TAXS:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        btnConfirmarDatos.setBackground(new java.awt.Color(0, 152, 82));
        btnConfirmarDatos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnConfirmarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmarDatos.setText("Confirmar Datos");
        btnConfirmarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 140, 110));

        btnConfirmarCompra.setBackground(new java.awt.Color(255, 153, 51));
        btnConfirmarCompra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnConfirmarCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmarCompra.setText("Confirmar Compra");
        btnConfirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 140, 110));

        jcbMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta", "Efectivo" }));
        getContentPane().add(jcbMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 200, -1));

        jcbDescuentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDescuentosActionPerformed(evt);
            }
        });
        getContentPane().add(jcbDescuentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 200, -1));

        btnCalculoPrecios.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnCalculoPrecios.setText("Calcular Precios");
        btnCalculoPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoPreciosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculoPrecios, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 120, -1));
        getContentPane().add(txtPrecioH, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 80, -1));
        getContentPane().add(txtNumFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 80, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Fecha Emision:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));
        getContentPane().add(txtEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 110, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Detalles:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        txtDetalles.setText("Consultas al 800-SOPORTE");
        txtDetalles.setToolTipText("");
        getContentPane().add(txtDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 200, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Metodo Pago:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Precio Bruto:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        txtPrecioTaxs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioTaxsActionPerformed(evt);
            }
        });
        txtPrecioTaxs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioTaxsKeyReleased(evt);
            }
        });
        getContentPane().add(txtPrecioTaxs, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 100, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Impuestos:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        txtImpuestos.setText("15%");
        txtImpuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpuestosActionPerformed(evt);
            }
        });
        getContentPane().add(txtImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 200, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Descuento Aplicado:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Precio Neto:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));
        getContentPane().add(txtPrecioNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 80, -1));

        FONDO.setForeground(new java.awt.Color(255, 255, 255));
        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/VENTANA-FACTURAS.jpg"))); // NOI18N
        FONDO.setToolTipText("");
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void txtImpuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpuestosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpuestosActionPerformed

    private void txtPrecioTaxsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioTaxsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioTaxsActionPerformed

    private void txtPrecioTaxsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioTaxsKeyReleased

    }//GEN-LAST:event_txtPrecioTaxsKeyReleased


    private void btnCalculoPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoPreciosActionPerformed
    // Obtener el elemento seleccionado
        String elementoSeleccionado = (String) jcbDescuentos.getSelectedItem();
        
    // Convertir el elemento seleccionado a un valor entero
        int descuentoInt = Integer.parseInt(elementoSeleccionado);

    // Convertir el descuento a su valor decimal correspondiente
        double descuentoDecimal = (double) descuentoInt / 100;
        
    // Declarar la variable que almacenará el valor del JTextField
        double valor;

    // Obtener el valor actual del JTextField
        String precio = txtPrecioH.getText();

    // Verificar si el texto no está vacío antes de convertirlo a un número
        if (!precio.isEmpty()) {
            // Convertir el texto a un número y almacenarlo en la variable
            valor = Double.parseDouble(precio);

            // Hacer algo con el valor, como aplicar un descuento e impuesto
            double impuesto = valor * 0.15;
            double precioConImpuesto = valor + impuesto;
            
            double descuento = valor * descuentoDecimal;
            double precioConDescuento = valor - descuento;

            // Mostrar el resultado en otro JTextField
            txtPrecioTaxs.setText(Double.toString(precioConImpuesto));
            txtPrecioNeto.setText(Double.toString(precioConDescuento));
        }
    }//GEN-LAST:event_btnCalculoPreciosActionPerformed

    
    private void jcbDescuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDescuentosActionPerformed

    }//GEN-LAST:event_jcbDescuentosActionPerformed

    private void btnConfirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarCompraActionPerformed
        // codigo para agregar datos a la DB
        try {
            DBadminsystem  cc = new DBadminsystem ();
            Connection cn = cc.DBcontrolProductos();

            PreparedStatement ps = cn.prepareStatement("INSERT INTO facturacion VALUES (?,?,?,?,?,?,?,?);");

            int numero_factura = Integer.parseInt(txtNumFactura.getText());
            String fecha_emision = txtEmision.getText();
            String detalles = txtDetalles.getText();
            String metodo_pago = jcbMetodoPago.getSelectedItem().toString();
            String precio_bruto = txtPrecioH.getText();
            String impuestos = txtImpuestos.getText();
            String descuentos_aplicados = jcbDescuentos.getSelectedItem().toString();
            String precio_neto = txtPrecioNeto.getText();

            ps.setInt(1, numero_factura);
            ps.setString(2, fecha_emision);
            ps.setString(3, detalles);
            ps.setString(4, metodo_pago);
            ps.setString(5, precio_bruto);
            ps.setString(6, impuestos);
            ps.setString(7, descuentos_aplicados);
            ps.setString(8, precio_neto);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Compra exitósamente!");


        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        dispose();
        Reservacion v1 = new Reservacion();
        v1.show();
    }//GEN-LAST:event_btnConfirmarCompraActionPerformed

    private void btnConfirmarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarDatosActionPerformed
        // Codigo para eliminar datos de la DB:
        try {
            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            PreparedStatement ps = cn.prepareStatement("DELETE FROM hospedaje WHERE nombre_hotel = ?;");

            String nombre_hotel = txtNomHotel.getText();

            ps.setString(1, nombre_hotel);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Datos Confirmados exitósamente!");

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnConfirmarDatosActionPerformed

//METODO PARA CARGAR DATOS DE LA DB DE VUELOS
//    public void actualizarTablaVuelos() {
//        try {
//            DefaultTableModel modelo = new DefaultTableModel();
//
//            modelo.addColumn("# Vuelo");
//            modelo.addColumn("Provedor");
//            modelo.addColumn("Destino");
//            modelo.addColumn("FechaSalida");
//            modelo.addColumn("FechaLlegada");
//            modelo.addColumn("Asientos_Disponibles");
//            modelo.addColumn("Precio");
//
//            DBadminsystem cc = new DBadminsystem();
//            Connection cn = cc.DBcontrolProductos();
//
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery("SELECT * FROM vuelos");
//
//            while (rs.next()) {
//                String[] fila = new String[7];
//                fila[0] = rs.getString(1);
//                fila[1] = rs.getString(2);
//                fila[2] = rs.getString(3);
//                fila[3] = rs.getString(4);
//                fila[4] = rs.getString(5);
//                fila[5] = rs.getString(6);
//                fila[6] = rs.getString(7);
//                modelo.addRow(fila);
//            }
//            TablaCompraVuelos.setModel(modelo);
//
//        } catch (SQLException ex) {
//            System.err.println(ex.getMessage());
//        }
//    }
    
    //Metodo para calcular el % de descuento
    public void CargarDatosJcombox() {
                try {
            // Establecer la conexión a la base de datos

            DBadminsystem cc = new DBadminsystem();
            Connection cn = cc.DBcontrolProductos();

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT porcentaje FROM descuentos");

            // Iterar a través de los resultados y agregar cada elemento al JComboBox
            while (rs.next()) {
                String nombreCategoria = rs.getString("porcentaje");
                jcbDescuentos.addItem(nombreCategoria);
            }

            // Cerrar la conexión y liberar los recursos
            rs.close();
            st.close();
            cn.close();

        } catch (SQLException e) {
            // Manejar cualquier error de conexión o consulta SQL
            System.err.println("Error al cargar datos al JComboBox: " + e.getMessage());
        }
    }
    
//MEOTODO PARA GENERAR CODIGO RANDOM
    public void codigoRandom() {
// Crear un temporizador que se ejecute cada segundo
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear objeto Random
                Random rnd = new Random();

                // Generar código aleatorio de 6 dígitos
                int codigo = 100000 + rnd.nextInt(900000);

                // Mostrar código generado en JTextField
                txtNumFactura.setText(Integer.toString(codigo));
            }
        });

// Iniciar el temporizador
        timer.start();
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
                new FacturacionHospedaje().setVisible(true);
            }
        }
        );
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnCalculoPrecios;
    private javax.swing.JButton btnConfirmarCompra;
    private javax.swing.JButton btnConfirmarDatos;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcbDescuentos;
    private javax.swing.JComboBox<String> jcbMetodoPago;
    public javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDetalles;
    private javax.swing.JTextField txtEmision;
    public javax.swing.JTextField txtHabitacionD;
    private javax.swing.JTextField txtImpuestos;
    public javax.swing.JTextField txtNomHotel;
    private javax.swing.JTextField txtNumFactura;
    public javax.swing.JTextField txtPrecioH;
    private javax.swing.JTextField txtPrecioNeto;
    private javax.swing.JTextField txtPrecioTaxs;
    public javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
