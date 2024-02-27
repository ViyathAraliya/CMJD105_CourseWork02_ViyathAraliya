package hms.view;

import hms.controller.CatagoryController;
import hms.controller.RoomController;
import hms.dto.BookingDatesDto;
import hms.dto.CatagoryDto;
import hms.dto.RoomDto;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RoomView extends javax.swing.JFrame {

    private RoomController ROOM_CONTROLLER;
    private CatagoryController CATAGORY_CONTROLLER;
    String[] roomsColumnHeads = {"RoomID", "Catagory"};
    String[] bookingsColumnHeads = {"reservationID", "checkIn Date", "check out"};

    public RoomView() {
        this.setResizable(false);
        ROOM_CONTROLLER = new RoomController();
        CATAGORY_CONTROLLER = new CatagoryController();
        this.setResizable(false);
        initComponents();
        DefaultTableModel bookingsDtm = new DefaultTableModel(bookingsColumnHeads, 0);
        bookingsTable.setModel(bookingsDtm);
        loadCatgoryComboBox();
        loadRoomTable();
        roomTable.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loadBookingsTable();
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
        roomTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookingsTable = new javax.swing.JTable();
        bookingDatesLbl = new javax.swing.JLabel();
        roomTableLbl = new javax.swing.JLabel();
        catagoryLbl = new javax.swing.JLabel();
        addRoomLbl = new javax.swing.JLabel();
        catagoryComboBox = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        roomTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(roomTable);

        bookingsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(bookingsTable);

        bookingDatesLbl.setText("bookings (select a room from the rooms table)");

        roomTableLbl.setText("rooms");

        catagoryLbl.setText("catagory");

        addRoomLbl.setText("add new room");

        catagoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select catagory" }));

        addBtn.setText("add ");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roomTableLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookingDatesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(catagoryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addRoomLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(catagoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(addRoomLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catagoryLbl)
                    .addComponent(catagoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingDatesLbl)
                    .addComponent(roomTableLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        addRoom();        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel addRoomLbl;
    private javax.swing.JLabel bookingDatesLbl;
    private javax.swing.JTable bookingsTable;
    private javax.swing.JComboBox<String> catagoryComboBox;
    private javax.swing.JLabel catagoryLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable roomTable;
    private javax.swing.JLabel roomTableLbl;
    // End of variables declaration//GEN-END:variables

    public void loadRoomTable() {

        DefaultTableModel dtm = new DefaultTableModel(roomsColumnHeads, 0) {
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        try {
            List<RoomDto> roomDtos = ROOM_CONTROLLER.getAll();
            for (RoomDto roomDto : roomDtos) {
                Object[] row = {roomDto.getRoomId(), roomDto.getCatagoryDto().getCatagoryName()};
                dtm.addRow(row);
            }
            roomTable.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void loadBookingsTable() {
        DefaultTableModel dtm = new DefaultTableModel(bookingsColumnHeads, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Integer roomID = (Integer) roomTable.getValueAt(roomTable.getSelectedRow(), 0);
        try {
            List<BookingDatesDto> bookingsDtos = ROOM_CONTROLLER.getById(roomID).getBookingDatesDtos();
            for (BookingDatesDto dto : bookingsDtos) {
                Object[] row = {dto.getReservationID(), dto.getCheckInDate(), dto.getCheckOutDate()};
                dtm.addRow(row);
            }
            bookingsTable.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void loadCatgoryComboBox() {
        try {
            List<CatagoryDto> catagoryDtos = CATAGORY_CONTROLLER.getAll();

            for (CatagoryDto dto : catagoryDtos) {
                catagoryComboBox.addItem(dto.getCatagoryName());
            }

        } catch (Exception E) {

        }
    }

    public void addRoom() {
        if (((String) catagoryComboBox.getSelectedItem()).equals("-select catagory")) {
            JOptionPane.showMessageDialog(this, "please select a catagory");
            return;
        }
        try {
            CatagoryDto catgoryDto = CATAGORY_CONTROLLER.getByName((String) catagoryComboBox.getSelectedItem());
            RoomDto roomDto = new RoomDto();
            roomDto.setCatagoryDto(catgoryDto);
           ROOM_CONTROLLER.save(roomDto);
           loadRoomTable();
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

}
