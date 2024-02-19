package hms.view;

import hms.controller.CatagoryController;
import hms.controller.RoomController;
import hms.dto.CatagoryDto;
import hms.dto.RoomDto;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class MakeReservationView extends javax.swing.JFrame {

    private final CatagoryController CATAGORY_CONTROLLER;
    private final RoomController ROOM_CONTROLLER;

    public MakeReservationView() {
        CATAGORY_CONTROLLER = new CatagoryController();
        ROOM_CONTROLLER = new RoomController();
        initComponents();
        loadCatagoryComboBox();
        checkInDateField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                checkInDateField.setText("");
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
        checkInDateField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

                setTextToFromDateLbl();
            try{
                if(isCheckInDate_After_checkOutDate()){
                            messageLblCheckIn.setText("check in date should be before the check out date");}}catch(Exception ex){
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setTextToFromDateLbl();
               // fromDateLbl.setText(dateValidation(checkOutDateField.getText()));
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setTextToFromDateLbl();
               // fromDateLbl.setText(dateValidation(checkOutDateField.getText()));
            }

        });
        checkOutDateField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                checkOutDateField.setText("");
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

        checkOutDateField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                setTextToCheckOutDateLbl();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setTextToCheckOutDateLbl();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setTextToCheckOutDateLbl();
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerNameLbl = new javax.swing.JLabel();
        nicLbl = new javax.swing.JLabel();
        phoneNumberLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        customerNameField = new javax.swing.JTextField();
        nicField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        customerTitleLble = new javax.swing.JLabel();
        packageLbl = new javax.swing.JLabel();
        checkInDateLbl = new javax.swing.JLabel();
        roomCatagoryLbl = new javax.swing.JLabel();
        catagoryComboBox = new javax.swing.JComboBox<>();
        packageComboBox = new javax.swing.JComboBox<>();
        checkInDateField = new javax.swing.JTextField();
        makeReservationBtn = new javax.swing.JButton();
        homeMenuBtn = new javax.swing.JButton();
        checkOutLbl = new javax.swing.JLabel();
        checkOutDateField = new javax.swing.JTextField();
        messageLblCheckIn = new javax.swing.JLabel();
        messageLblCheckOut = new javax.swing.JLabel();
        pickRoomBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerNameLbl.setText("Customer Name");

        nicLbl.setText("NIC/Passport Number");

        phoneNumberLbl.setText("phone number");

        emailLbl.setText("E-Mail");

        addressLbl.setText("Address");

        customerTitleLble.setText("Customer Details");

        packageLbl.setText("Package ");

        checkInDateLbl.setText("check in date");

        roomCatagoryLbl.setText("Room catagory");

        catagoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagoryComboBoxActionPerformed(evt);
            }
        });

        checkInDateField.setForeground(new java.awt.Color(102, 102, 102));
        checkInDateField.setText("MM/dd/yyyy");
        checkInDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInDateFieldActionPerformed(evt);
            }
        });

        makeReservationBtn.setText("make reservation");

        homeMenuBtn.setText("back to home ");

        checkOutLbl.setText("check out date");

        checkOutDateField.setForeground(new java.awt.Color(102, 102, 102));
        checkOutDateField.setText("MM/dd/yyyy");

        messageLblCheckIn.setText(".");

        messageLblCheckOut.setText(".");

        pickRoomBtn.setText("pick a room");
        pickRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickRoomBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(customerTitleLble, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(579, 593, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nicLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneNumberLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerNameField)
                    .addComponent(nicField)
                    .addComponent(phoneNumberField)
                    .addComponent(emailField)
                    .addComponent(addressField, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(packageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roomCatagoryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(catagoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(packageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkInDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(checkOutDateField)
                                    .addComponent(checkInDateField, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(messageLblCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(messageLblCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pickRoomBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(makeReservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(customerTitleLble)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLbl)
                    .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catagoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomCatagoryLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicLbl)
                    .addComponent(nicField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packageLbl)
                    .addComponent(packageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberLbl)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkInDateLbl)
                        .addComponent(checkInDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(messageLblCheckIn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkOutDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(messageLblCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailLbl)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkOutLbl)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLbl)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pickRoomBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeReservationBtn)
                    .addComponent(homeMenuBtn))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkInDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInDateFieldActionPerformed

    private void catagoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagoryComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catagoryComboBoxActionPerformed

    private void pickRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickRoomBtnActionPerformed
        try {

            //isBookTillDate_After_BookFromFromDate(checkOutDateField.getText()) ||
            //dateValidation(checkOutDateField.getText()))){}
            loadTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }    // TODO add your handling code here:
    }//GEN-LAST:event_pickRoomBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JComboBox<String> catagoryComboBox;
    private javax.swing.JTextField checkInDateField;
    private javax.swing.JLabel checkInDateLbl;
    private javax.swing.JTextField checkOutDateField;
    private javax.swing.JLabel checkOutLbl;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JLabel customerNameLbl;
    private javax.swing.JLabel customerTitleLble;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JButton homeMenuBtn;
    private javax.swing.JButton makeReservationBtn;
    private javax.swing.JLabel messageLblCheckIn;
    private javax.swing.JLabel messageLblCheckOut;
    private javax.swing.JTextField nicField;
    private javax.swing.JLabel nicLbl;
    private javax.swing.JComboBox<String> packageComboBox;
    private javax.swing.JLabel packageLbl;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLbl;
    private javax.swing.JButton pickRoomBtn;
    private javax.swing.JLabel roomCatagoryLbl;
    // End of variables declaration//GEN-END:variables

    private void loadCatagoryComboBox() {
        catagoryComboBox.addItem("-select room catagory");
        try {
            List<CatagoryDto> catagoryDtos = CATAGORY_CONTROLLER.getAll();
            for (CatagoryDto dto : catagoryDtos) {
                catagoryComboBox.addItem(dto.getDescription());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void setTextToFromDateLbl() {
        messageLblCheckIn.setText(dateValidation(checkInDateField.getText()));
        messageLblCheckIn.setForeground(Color.red);
        messageLblCheckIn.setFont(messageLblCheckIn.getFont().deriveFont(Font.PLAIN));
    }

    private void setTextToCheckOutDateLbl() {
        messageLblCheckOut.setText(dateValidation(checkOutDateField.getText()));
        messageLblCheckOut.setForeground(Color.red);
        messageLblCheckOut.setFont(messageLblCheckOut.getFont().deriveFont(Font.PLAIN));
        try {
            if (isCheckInDate_After_checkOutDate() == false) {
                messageLblCheckOut.setText("checkout date should be after the checking date");
            }
        } catch (Exception e) {
           

        }

    }

    private String dateValidation(String checkOutDate) {
        try {
            Date dateInfield = new SimpleDateFormat("MM/dd/yyyy").parse(checkOutDate);
            if (dateInfield.before(new Date())) {
                return "The date you entered has already passed";
            } else {
                return "";
            }
        } catch (Exception e) {
            return "date format : MM/dd/yyyy";
        }
    }

    private boolean isCheckInDate_After_checkOutDate() throws Exception {
        Date fromDate = new SimpleDateFormat("MM/dd/yyyy").parse(checkInDateField.getText());
        Date tillDate = new SimpleDateFormat("MM/dd/yyyy").parse(checkOutDateField.getText());
        return fromDate.before(tillDate);
    }

    private void loadTable() throws Exception {

        JFrame tableFrame = new JFrame();
        tableFrame.setSize(600, 200);
        tableFrame.setLayout(new GridLayout());

        tableFrame.setVisible(true);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVisible(true);
        JTable table = new JTable();

        List<RoomDto> roomDtos = ROOM_CONTROLLER.getAll();

        table.setVisible(true);
        String[] titles = {"roomID", "availibilty", " "};

        scrollPane.setViewportView(table);
        tableFrame.add(scrollPane);
        DefaultTableModel dtm = new DefaultTableModel(null, titles);
        for (int i = 0; i < roomDtos.size(); i++) {
            RoomDto roomDto = roomDtos.get(i);
            boolean isAvailable;
            String description;
            Date checkInDate = new SimpleDateFormat("MM/dd/yyyy").parse(checkInDateField.getText());
            Date checkOutDate = new SimpleDateFormat("MM/dd/yyyy").parse(checkOutDateField.getText());
            l1:
            if (roomDto.getCheck_in_date() == null && roomDto.getCheck_out_date() == null) {
                isAvailable = true;
                description = "-";
                break l1;
            } else if ((checkInDate.before(roomDto.getCheck_in_date()) && checkOutDate.before(roomDto.getCheck_in_date()))
                    || (checkInDate.after(roomDto.getCheck_out_date()) && checkOutDate.after(roomDto.getCheck_out_date()))) {
                isAvailable = true;
                description = "-";
            } else {
                isAvailable = false;
                description = "booked during " + new SimpleDateFormat("MM/dd/yyyy").format(roomDto.getCheck_in_date())
                        + "-" + new SimpleDateFormat("MM/dd/yyyy").format(roomDto.getCheck_out_date());
            }
            Object[] row = {roomDto.getId(), isAvailable, description};
            dtm.addRow(row);
        }
        table.setModel(dtm);
        table.setVisible(true);
    }

}
