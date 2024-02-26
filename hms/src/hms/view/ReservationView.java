package hms.view;

import hms.controller.ReservationController;
import hms.dto.CatagoryDto;
import hms.dto.PackageDto;
import hms.dto.ReservationDetailDto;
import hms.dto.ReservationDto;
import hms.dto.RoomDto;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReservationView extends javax.swing.JFrame {
    
    private ReservationController RESERVATION_CONTROLLER;
    String[] columnHeads_reservation = {"customer NIC", "reservaionID", "time of booking"};
    String[] columnHeads_reservationDetails = {"<html><br>roomID<br> &nbsp; </html>", "room_catgory", "package", "<html>charge<br>for<br>package</html>",
        "<html>charge<br>for<br>roomCatagory</html>", "checkIn", "checkout", "<html>no Of<br>days</html>", "sum"};
    
    public ReservationView() {
        RESERVATION_CONTROLLER = new ReservationController();
        initComponents();
        
        try {
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        DefaultTableModel dtm = new DefaultTableModel(columnHeads_reservationDetails, 0);
        reservationDetailTable.setModel(dtm);
        reservationDetailTable.getColumnModel().getColumn(5).setPreferredWidth(200);
        reservationDetailTable.getColumnModel().getColumn(6).setPreferredWidth(200);
        reservationDetailTable.getColumnModel().getColumn(8).setPreferredWidth(150);
        
        reservationTable.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tableClicked();
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        reservationTable = new javax.swing.JTable();
        deleteReservation = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reservationDetailTable = new javax.swing.JTable();
        reservationDetailLbl = new javax.swing.JLabel();

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

        reservationDetailTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(reservationDetailTable);

        reservationDetailLbl.setText("reservation details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reservationDetailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(deleteReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reservationDetailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteReservation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel reservationDetailLbl;
    private javax.swing.JTable reservationDetailTable;
    private javax.swing.JTable reservationTable;
    // End of variables declaration//GEN-END:variables

    public void loadTable() throws Exception {
        DefaultTableModel dtm = new DefaultTableModel(columnHeads_reservation, 0);
        List<ReservationDto> reservationDtos = RESERVATION_CONTROLLER.getAll();
        
        for (ReservationDto dto : reservationDtos) {
            Object[] row = {dto.getCustomerDto().getNic(), dto.getReservationID(), dto.getTime_of_booking()};
            dtm.addRow(row);
        }
        reservationTable.setModel(dtm);
        
    }
    
    public void deleteReservation() {
        if (reservationTable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "please select a reservation");
            return;
        }
        if (has_24hrs_passed()) {
            JOptionPane.showMessageDialog(this, "Can't Cancel. 24 hours has passed since making the reservation,");
            return;
        }
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
    
    public void tableClicked() {
        DefaultTableModel dtm = new DefaultTableModel(columnHeads_reservationDetails, 0);
        reservationDetailTable.setModel(dtm);
        reservationDetailTable.getColumnModel().getColumn(5).setPreferredWidth(200);
        reservationDetailTable.getColumnModel().getColumn(6).setPreferredWidth(200);
        reservationDetailTable.getColumnModel().getColumn(8).setPreferredWidth(150);
        try {
            Integer reservationID = (Integer) reservationTable.getValueAt(reservationTable.getSelectedRow(), 1);
            
            List<ReservationDetailDto> reservationDetailDtos = RESERVATION_CONTROLLER.getReservationDetailsByID(reservationID);
            
            for (ReservationDetailDto resDetDto : reservationDetailDtos) {
                Integer roomID;
                String room_catgory;
                String package_;
                Integer charge_for_package;
                Integer charge_for_roomCatagory;
                Date checkIn;
                Date checkOut;
                Integer duration_of_stay;
                Integer sumAmount;
                
                CatagoryDto catagoryDto = resDetDto.getRoomDto().getCatagoryDto();
                RoomDto roomDto = resDetDto.getRoomDto();
                PackageDto packageDto = resDetDto.getPackageDto();
                ReservationDto resDto = RESERVATION_CONTROLLER.getByID(reservationID);
                
                roomID = roomDto.getRoomId();
                
                room_catgory = catagoryDto.getCatagoryName();
                package_ = packageDto.getDescription();
                charge_for_roomCatagory = catagoryDto.getChargeForCatagory();
                charge_for_package = packageDto.getCharge_for_package();
                
                checkIn = resDto.getCheck_in_date();
                checkOut = resDto.getCheck_out_date();
                
                long daysSince1970_for_checkIn = checkIn.getTime() / (1000 * 60 * 60 * 24);
                long daysSince1970_for_checkOut = checkOut.getTime() / (1000 * 60 * 60 * 24);
                duration_of_stay = (int) (daysSince1970_for_checkOut - daysSince1970_for_checkIn);
                sumAmount = duration_of_stay * (charge_for_package + charge_for_roomCatagory);
                Object[] row = {roomID, room_catgory, package_, charge_for_package, charge_for_roomCatagory, checkIn,
                    checkOut, duration_of_stay, sumAmount};
                dtm.addRow(row);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
}
