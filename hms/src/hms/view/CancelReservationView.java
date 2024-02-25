package hms.view;

import hms.controller.ReservationController;
import hms.dto.ReservationDto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CancelReservationView extends javax.swing.JFrame {

    private ReservationController RESERVATION_CONTROLLER;
    String[] columnHeads = {"customer NIC", "reservaionID", "time of booking"};
   

    public CancelReservationView() {
        RESERVATION_CONTROLLER = new ReservationController();
        initComponents();
        try {
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        reservationTable = new javax.swing.JTable();
        deleteReservation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(reservationTable);

        deleteReservation.setText("<html>delete<br> reservation<html>");
        deleteReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteReservationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(deleteReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteReservationActionPerformed
        deleteReservation();
       try{ loadTable();}catch(Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());}// TODO add your handling code here:
    }//GEN-LAST:event_deleteReservationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteReservation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reservationTable;
    // End of variables declaration//GEN-END:variables

    public void loadTable() throws Exception {
 DefaultTableModel dtm = new DefaultTableModel(columnHeads, 0);
        List<ReservationDto> reservationDtos = RESERVATION_CONTROLLER.getAll();

        for (ReservationDto dto : reservationDtos) {
            Object[] row = {dto.getCustomerDto().getNic(), dto.getReservationID(), dto.getTime_of_booking()};
            dtm.addRow(row);
        }
        reservationTable.setModel(dtm);

    }

    public void deleteReservation() {
        Integer reservationID = (Integer) reservationTable.getValueAt(reservationTable.getSelectedRow(), 1);
        try {
            String msg = RESERVATION_CONTROLLER.delete(reservationID);
            JOptionPane.showMessageDialog(this, msg);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

}
