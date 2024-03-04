package hms.view;

import hms.controller.CatagoryController;
import hms.controller.PackageContoller;
import javax.swing.JOptionPane;

public class HomeView extends javax.swing.JFrame {
private final PackageContoller PACKAGE_CONTROLLER;
private final CatagoryController CATAGORY_CONTROLER;
    public HomeView() {
        PACKAGE_CONTROLLER=new PackageContoller();
        CATAGORY_CONTROLER=new CatagoryController();
        this.setResizable(false);
        initComponents();
        checkPackageAndCatgories();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        makeReservationBtn = new javax.swing.JButton();
        packageBtn = new javax.swing.JButton();
        reservationBtn = new javax.swing.JButton();
        roomBtn = new javax.swing.JButton();
        catagoryBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        noteLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Hotel Management System");

        makeReservationBtn.setText("make a reservation");
        makeReservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeReservationBtnActionPerformed(evt);
            }
        });

        packageBtn.setText("manage packages");
        packageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageBtnActionPerformed(evt);
            }
        });

        reservationBtn.setText("View/Cancel Reservation");
        reservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationBtnActionPerformed(evt);
            }
        });

        roomBtn.setText("manage rooms");
        roomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomBtnActionPerformed(evt);
            }
        });

        catagoryBtn.setText("manage catagories");
        catagoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagoryBtnActionPerformed(evt);
            }
        });

        homeBtn.setText("Edit Customer Information");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        noteLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        noteLbl.setForeground(new java.awt.Color(255, 0, 51));
        noteLbl.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(packageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catagoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(noteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 118, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(makeReservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(reservationBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(packageBtn)
                        .addGap(18, 18, 18)
                        .addComponent(catagoryBtn)
                        .addGap(18, 18, 18)
                        .addComponent(roomBtn))
                    .addComponent(noteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeReservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(homeBtn)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        noteLbl.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void makeReservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeReservationBtnActionPerformed
        new MakeReservationView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_makeReservationBtnActionPerformed

    private void reservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationBtnActionPerformed
        new ReservationView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reservationBtnActionPerformed

    private void packageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageBtnActionPerformed
        new PackageView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_packageBtnActionPerformed

    private void roomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomBtnActionPerformed
        new RoomView().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_roomBtnActionPerformed

    private void catagoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagoryBtnActionPerformed
        this.dispose();
        new CatagoryView().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_catagoryBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        this.dispose();
        new CustomerView().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_homeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton catagoryBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton makeReservationBtn;
    private javax.swing.JLabel noteLbl;
    private javax.swing.JButton packageBtn;
    private javax.swing.JButton reservationBtn;
    private javax.swing.JButton roomBtn;
    // End of variables declaration//GEN-END:variables

 public void checkPackageAndCatgories(){
     try{
     if(PACKAGE_CONTROLLER.getAll().size()==0 || CATAGORY_CONTROLER.getAll().size()==0){
         noteLbl.setText("<html>NOTE :  add a package and a catagory <br>before performing other operations<br>(essential for loading JComboBoxes) </html>");
     }
     
     }catch(Exception e){
         JOptionPane.showMessageDialog(this,e.getMessage());
                 }
 }
}

