/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.CarCatalog;
import model.Cars;

/**
 *
 * @author susan
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    CarCatalog carCatalog;
    public CreateJPanel(CarCatalog carCatalog) {
        initComponents();
        
        this.carCatalog = carCatalog;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        txtSerialNumber = new javax.swing.JTextField();
        lnlMake = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        checkboxAvailable = new javax.swing.JCheckBox();
        lblSeat = new javax.swing.JLabel();
        checkboxNotAvailable = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        lblSerialNumber = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtMake = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtSeat = new javax.swing.JTextField();
        lblAvailability = new javax.swing.JLabel();

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lnlMake.setText("Make:");

        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        lblYear.setText("Year:");

        checkboxAvailable.setText("Available");

        lblSeat.setText("Seat:");

        checkboxNotAvailable.setText("Not Available");

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblSerialNumber.setText("Serial Number:");

        lblModel.setText("Model:");

        jLabel1.setText("CREATE CARS");

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        lblPrice.setText("Price:");

        txtSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatActionPerformed(evt);
            }
        });

        lblAvailability.setText("Availability:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrice)
                                    .addComponent(lblAvailability)
                                    .addComponent(lnlMake)
                                    .addComponent(lblYear)
                                    .addComponent(lblSeat)
                                    .addComponent(lblSerialNumber)
                                    .addComponent(lblModel))
                                .addGap(155, 155, 155)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkboxAvailable)
                                        .addGap(35, 35, 35)
                                        .addComponent(checkboxNotAvailable))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtModel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSerialNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSeat, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtYear, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMake, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnBack)
                        .addGap(58, 58, 58)
                        .addComponent(btnSave)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrice)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAvailability)
                            .addComponent(checkboxAvailable)
                            .addComponent(checkboxNotAvailable))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnlMake)
                            .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(lblYear))
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeat)
                    .addComponent(txtSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

       int price = Integer.parseInt(txtPrice.getText());
        
     
       String make =txtMake.getText();
       int year = Integer.parseInt(txtYear.getText());
       int seat = Integer.parseInt(txtSeat.getText());
       int serialnumber = Integer.parseInt(txtSerialNumber.getText());
       String model = txtModel.getText();
       
       
      Cars c   =carCatalog.addCars();
      
      c.setPrice(price);
      
      c.setMake(make);
      c.setYear(year);
      c.setSeat(seat);
      c.setSerialnumber(serialnumber);
      c.setModel(model);
      
      JOptionPane.showMessageDialog(this, "New Car Added"); 

      txtPrice.setText("");
      checkboxAvailable.setText("");
      checkboxNotAvailable.setText("");
      txtMake.setText("");
      txtYear.setText("");
      txtSeat.setText("");
      txtSerialNumber.setText("");
      txtModel.setText("");
      
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox checkboxAvailable;
    private javax.swing.JCheckBox checkboxNotAvailable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSeat;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel lnlMake;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSeat;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
