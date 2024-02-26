package hms.view;

public class HomeView extends javax.swing.JFrame {

    public HomeView() {
        this.setResizable(false);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        makeReservationBtn = new javax.swing.JButton();
        packageBtn = new javax.swing.JButton();
        reservationBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Hotel Management System");

        makeReservationBtn.setText("make a reservation");
        makeReservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeReservationBtnActionPerformed(evt);
            }
        });

        packageBtn.setText("View/Update packages");
        packageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageBtnActionPerformed(evt);
            }
        });

        reservationBtn.setText("View/Cancel Reeservation");
        reservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(packageBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(makeReservationBtn)
                                .addGap(42, 42, 42)
                                .addComponent(reservationBtn)))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeReservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(packageBtn)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void makeReservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeReservationBtnActionPerformed
        new MakeReservationView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_makeReservationBtnActionPerformed

    private void reservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationBtnActionPerformed
        new MakeReservationView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reservationBtnActionPerformed

    private void packageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageBtnActionPerformed
        new PackageView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_packageBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton makeReservationBtn;
    private javax.swing.JButton packageBtn;
    private javax.swing.JButton reservationBtn;
    // End of variables declaration//GEN-END:variables
}
