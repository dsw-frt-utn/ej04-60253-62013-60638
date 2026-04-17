package views;

import data.Persistencia;
import domain.Marca;
import domain.Sucursal;
import domain.Vehiculo;
import domain.VehiculoCombustible;
import domain.VehiculoElectrico;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author bel
 */
public class AgregarVehiculo extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AgregarVehiculo.class.getName());

    public AgregarVehiculo() {
        initComponents();
        cargarSucursales();
        panelElectrico.setVisible(false);
        panelCombustible.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        btnAgregarVehiculo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreMarca = new javax.swing.JTextField();
        txtPaisMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        txtCapacidadCarga = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbxSucursal = new javax.swing.JComboBox<>();
        panelElectrico = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtKwhBase = new javax.swing.JTextField();
        panelCombustible = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtKmLitro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtLitrosExtra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("AGREGAR VEHÍCULO");

        jLabel2.setText("Patente:");

        btnAgregarVehiculo.setText("AGREGAR");
        btnAgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVehiculoActionPerformed(evt);
            }
        });

        jLabel3.setText("MARCA");

        jLabel4.setText("Nombre:");

        jLabel5.setText("País:");

        jLabel6.setText("Modelo:");

        jLabel7.setText("Año:");

        jLabel8.setText("Capacidad de carga:");

        jLabel9.setText("Tipo: ");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMBUSTIBLE", "ELÉCTRICO" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        jLabel10.setText("SUCURSAL");

        jLabel14.setText("-------------------------------------------------------------------------------------");

        jLabel15.setText("-------------------------------------------------------------------------------------");

        panelElectrico.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("KWH BASE");

        txtKwhBase.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelElectricoLayout = new javax.swing.GroupLayout(panelElectrico);
        panelElectrico.setLayout(panelElectricoLayout);
        panelElectricoLayout.setHorizontalGroup(
            panelElectricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElectricoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtKwhBase, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelElectricoLayout.setVerticalGroup(
            panelElectricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElectricoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelElectricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtKwhBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panelCombustible.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("KM / LITRO");

        txtKmLitro.setBackground(new java.awt.Color(204, 204, 204));

        jLabel13.setText("LITROS EXTRA");

        txtLitrosExtra.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelCombustibleLayout = new javax.swing.GroupLayout(panelCombustible);
        panelCombustible.setLayout(panelCombustibleLayout);
        panelCombustibleLayout.setHorizontalGroup(
            panelCombustibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCombustibleLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelCombustibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(panelCombustibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKmLitro, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(txtLitrosExtra))
                .addGap(63, 63, 63))
        );
        panelCombustibleLayout.setVerticalGroup(
            panelCombustibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCombustibleLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelCombustibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtKmLitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(panelCombustibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(txtLitrosExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnAgregarVehiculo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(219, 219, 219)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel6))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtModelo)
                                                .addComponent(txtAnio)
                                                .addComponent(txtCapacidadCarga)
                                                .addComponent(cbxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addGap(43, 43, 43)
                                                    .addComponent(cbxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(73, 73, 73)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNombreMarca)
                                                .addComponent(txtPatente)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtPaisMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE)))))))
                            .addGap(23, 23, 23))
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelElectrico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCombustible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPaisMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel14)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCapacidadCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelElectrico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panelCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbxSucursal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnAgregarVehiculo)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed
        String seleccion = cbxTipo.getSelectedItem().toString();

        if (seleccion.equals("ELÉCTRICO")) {
            panelElectrico.setVisible(true);
            panelCombustible.setVisible(false);
        } else {
            panelElectrico.setVisible(false);
            panelCombustible.setVisible(true);
        }
        this.pack();
        this.revalidate();
        this.repaint();

    }//GEN-LAST:event_cbxTipoActionPerformed

    private void inicializarCombos() {
        cbxSucursal.removeAllItems();
        for (domain.Sucursal s : data.Persistencia.getSucursales()) {
            cbxSucursal.addItem(s.getCodigo()); 
        }
    }

    private void cargarSucursales() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Sucursal s : Persistencia.getSucursales()) {
            model.addElement(s);
        }
        cbxSucursal.setModel(model);
    }
    
    
    private void btnAgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVehiculoActionPerformed

        try{
            String patente = txtPatente.getText();
            String nombreM = txtNombreMarca.getText();
            String paisM = txtPaisMarca.getText();
            domain.Marca marca = new domain.Marca(nombreM, paisM);
            String modelo = txtModelo.getText();
            int anio = Integer.parseInt(txtAnio.getText());
            double capacidad = Double.parseDouble(txtCapacidadCarga.getText());

            int indexSucursal = cbxSucursal.getSelectedIndex();
            domain.Sucursal sucursal = data.Persistencia.getSucursales().get(indexSucursal);

            String tipo = cbxTipo.getSelectedItem().toString();
            domain.Vehiculo nuevoVehiculo;

            if (tipo.equals("ELÉCTRICO")) {
                double kwh = Double.parseDouble(txtKwhBase.getText());
                nuevoVehiculo = new domain.VehiculoElectrico(patente, marca, modelo, anio, capacidad, sucursal, kwh);
            } else{
                double kmLitro = Double.parseDouble(txtKmLitro.getText());
                double extra = Double.parseDouble(txtLitrosExtra.getText());
                nuevoVehiculo = new domain.VehiculoCombustible(patente, marca, modelo, anio, capacidad, sucursal, kmLitro, extra);
            }

            data.Persistencia.getVehiculos().add(nuevoVehiculo);
            javax.swing.JOptionPane.showMessageDialog(this, "vehiculo agregado");
            this.dispose(); // Cerrar ventana

        } catch (NumberFormatException e){
            System.out.println("error al agregar");
        }

    }//GEN-LAST:event_btnAgregarVehiculoActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new AgregarVehiculo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarVehiculo;
    private javax.swing.JComboBox<String> cbxSucursal;
    private javax.swing.JComboBox<String> cbxTipo;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelCombustible;
    private javax.swing.JPanel panelElectrico;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtCapacidadCarga;
    private javax.swing.JTextField txtKmLitro;
    private javax.swing.JTextField txtKwhBase;
    private javax.swing.JTextField txtLitrosExtra;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombreMarca;
    private javax.swing.JTextField txtPaisMarca;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}