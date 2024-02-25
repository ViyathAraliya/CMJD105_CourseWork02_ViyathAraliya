package hms.view;

import hms.controller.ReservationController;
import hms.dto.ReservationDto;
import java.text.SimpleDateFormat;

import java.util.Date;
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
        time = new javax.swing.JButton();

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

        time.setText("jButton1");
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(time)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(deleteReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(time)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteReservationActionPerformed
        deleteReservation();
        try {
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_deleteReservationActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        has_24hrs_passed();        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteReservation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reservationTable;
    private javax.swing.JButton time;
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
        if(reservationTable.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "please select a reservation");
        return;}
        if(has_24hrs_passed()){
            JOptionPane.showMessageDialog(this, "Can't Cancel. 24 hours has passed since making the reservation,");
        return;}
        Integer reservationID = (Integer) reservationTable.getValueAt(reservationTable.getSelectedRow(), 1);
       
        try {
            String msg = RESERVATION_CONTROLLER.delete(reservationID);
            JOptionPane.showMessageDialog(this, msg);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public boolean has_24hrs_passed() {

        Date time_of_booking = (Date) reservationTable.getValueAt(reservationTable.getSelectedRow(), 2);
        Date current_Date = new Date();

        Long timeDiff = current_Date.getTime() - time_of_booking.getTime();
        if (timeDiff > (24 * 60 * 60 * 1000)) {/*time diffe in miliseconds*/
            return true;
        }
        return false;
    }

}
