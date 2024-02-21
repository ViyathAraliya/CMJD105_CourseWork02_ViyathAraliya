package hms.view;

import hms.controller.CatagoryController;
import hms.controller.RoomController;
import hms.controller.PackageContoller;
import hms.dto.CatagoryDto;
import hms.dto.PackageDto;
import hms.dto.RoomDto;
import java.awt.Color;

import java.awt.Font;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class MakeReservationView extends javax.swing.JFrame {

    private final CatagoryController CATAGORY_CONTROLLER;
    private final RoomController ROOM_CONTROLLER;
    private final PackageContoller PACKAGE_CONTROLER;
    private List<Integer> roomIds;
    

    public MakeReservationView() {
        roomIds = new ArrayList<>();
        CATAGORY_CONTROLLER = new CatagoryController();
        ROOM_CONTROLLER = new RoomController();
        PACKAGE_CONTROLER = new PackageContoller();

        initComponents();
        loadPackageCombpBoxes();
        try {
            loadTable_dates_are_not_validated();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    e.getMessage());
        }

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
                messageLblCheckInText();
                try {
                    loadTable();
                } catch (Exception ex) {
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                messageLblCheckInText();
                try {
                    loadTable();
                } catch (Exception ex) {
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                messageLblCheckInText();
                try {
                    loadTable();
                } catch (Exception ex) {
                }
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
                messageLblCheckOutText();
                try {
                    loadTable();
                } catch (Exception ex) {
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                messageLblCheckOutText();
                try {
                    loadTable();
                } catch (Exception ex) {
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                messageLblCheckOutText();
                try {
                    loadTable();
                } catch (Exception ex) {
                }
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
        packageComboBox = new javax.swing.JComboBox<>();
        checkInDateField = new javax.swing.JTextField();
        makeReservationBtn = new javax.swing.JButton();
        homeMenuBtn = new javax.swing.JButton();
        checkOutLbl = new javax.swing.JLabel();
        checkOutDateField = new javax.swing.JTextField();
        messageLblCheckIn = new javax.swing.JLabel();
        messageLblCheckOut = new javax.swing.JLabel();
        addRoomBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        room_table = new javax.swing.JTable();
        addedRoomsLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerNameLbl.setText("Customer Name");

        nicLbl.setText("NIC/Passport Number");

        phoneNumberLbl.setText("phone number");

        emailLbl.setText("E-Mail");

        addressLbl.setText("Address");

        customerTitleLble.setText("Customer Details");

        packageLbl.setText("Package ");

        checkInDateLbl.setText("check in date");

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

        addRoomBtn.setText("add selected room");
        addRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomBtnActionPerformed(evt);
            }
        });

        room_table.setModel(new javax.swing.table.DefaultTableModel(
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
        room_table.setRowHeight(60);
        jScrollPane1.setViewportView(room_table);

        addedRoomsLbl.setText("added rooms:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkInDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkInDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(messageLblCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(packageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(packageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkOutDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(messageLblCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addRoomBtn)
                                .addGap(42, 42, 42)
                                .addComponent(addedRoomsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(customerTitleLble, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(makeReservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(customerTitleLble)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLbl)
                    .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nicLbl)
                                    .addComponent(nicField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(packageLbl)
                                    .addComponent(packageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumberLbl)
                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkInDateLbl)
                        .addComponent(checkInDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(messageLblCheckIn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOutLbl)
                    .addComponent(checkOutDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLblCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressLbl)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addRoomBtn))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addedRoomsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(makeReservationBtn)
                        .addGap(9, 9, 9)
                        .addComponent(homeMenuBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkInDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInDateFieldActionPerformed

    private void addRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomBtnActionPerformed
        addRoom();        // TODO add your handling code here:
    }//GEN-LAST:event_addRoomBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoomBtn;
    private javax.swing.JLabel addedRoomsLbl;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLbl;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makeReservationBtn;
    private javax.swing.JLabel messageLblCheckIn;
    private javax.swing.JLabel messageLblCheckOut;
    private javax.swing.JTextField nicField;
    private javax.swing.JLabel nicLbl;
    private javax.swing.JComboBox<String> packageComboBox;
    private javax.swing.JLabel packageLbl;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLbl;
    private javax.swing.JTable room_table;
    // End of variables declaration//GEN-END:variables

    private void loadTable_dates_are_validated() throws Exception {
        List<RoomDto> roomDtos = ROOM_CONTROLLER.getAll();
        String[] titles = {"roomID", "catagoryName", "charge for catagory",
            "availibilty", "reason if unavailable"};

        DefaultTableModel dtm = new DefaultTableModel(null, titles);
        for (int i = 0; i < roomDtos.size(); i++) {
            RoomDto roomDto = roomDtos.get(i);
            CatagoryDto catagoryDto = CATAGORY_CONTROLLER.getById(roomDto.getCatagoryID());
            String catagoyName = catagoryDto.getCatagoryName();
            Integer chargeForCatgory = catagoryDto.getChargeForCatagory();

            String isAvailable;
            String description;
            Date checkInDate = new SimpleDateFormat("MM/dd/yyyy").parse(checkInDateField.getText());
            Date checkOutDate = new SimpleDateFormat("MM/dd/yyyy").parse(checkOutDateField.getText());
            l1:
            if (roomDto.getCheck_in_date() == null && roomDto.getCheck_out_date() == null) {
                isAvailable = "available";//true;
                description = "-";
                break l1;
            } else if ((checkInDate.before(roomDto.getCheck_in_date()) && checkOutDate.before(roomDto.getCheck_in_date()))
                    || (checkInDate.after(roomDto.getCheck_out_date()) && checkOutDate.after(roomDto.getCheck_out_date()))) {
                isAvailable = "available";//true;
                description = "-";
            } else {
                isAvailable = "booked";//false;
                description = "<html>booked during<br>" + new SimpleDateFormat("MM/dd/yyyy").format(roomDto.getCheck_in_date())
                        + " to<br>" + new SimpleDateFormat("MM/dd/yyyy").format(roomDto.getCheck_out_date()) + "</html>";
            }
            Object[] row = {roomDto.getId(), catagoyName, chargeForCatgory, isAvailable, description};
            dtm.addRow(row);
        }
        room_table.setModel(dtm);

    }

    private void loadTable_dates_are_not_validated() throws Exception {
        List<RoomDto> roomDtos = ROOM_CONTROLLER.getAll();
        String[] titles
                = {"<html><br>roomId<br><br></html>", "<html>room catagory</html>", "<html>charge<br>for<br>catagory</html>",
                    "<html>availibilty</html>", "<html>reason<br>if<br>unavailable</html>"};

        DefaultTableModel dtm = new DefaultTableModel(null, titles);
        for (int i = 0; i < roomDtos.size(); i++) {
            RoomDto roomDto = roomDtos.get(i);
            CatagoryDto catagoryDto = CATAGORY_CONTROLLER.getById(roomDto.getCatagoryID());
            String catagoyName = catagoryDto.getCatagoryName();
            Integer chargeForCatgory = catagoryDto.getChargeForCatagory();

            String isAvailable = "select dates first";
            String description = "-";

            Object[] row = {roomDto.getId(), catagoyName, chargeForCatgory, isAvailable, description};
            dtm.addRow(row);
        }

        room_table.setModel(dtm);

    }

    private boolean isDateFormatCorrect(String dateFieldText) {
        try {
            Date date = new SimpleDateFormat("MM/dd/yyyy").parse(dateFieldText);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean date_has_not_passed_yet(String dateFieldText) {

        try {
            Date date = new SimpleDateFormat("MM/dd/yyyy").parse(dateFieldText);
            return date.after(new Date());

        } catch (Exception e) {
            return false;//will be handled isDateFormateCorrect method
        }
    }

    private boolean is_checkOutDate_after_checkInDate() {
        try {
            Date checkInDate = new SimpleDateFormat("MM/dd/yyyy").parse(checkInDateField.getText());
            Date checkOutDate = new SimpleDateFormat("MM/dd/yyyy").parse(checkOutDateField.getText());
            return checkOutDate.after(checkInDate);

        } catch (Exception e) {
            return false;
        }
    }

    private String textInCheckInDateLbl() {
        String checkInDateText = checkInDateField.getText();
        if (isDateFormatCorrect(checkInDateText) == false) {
            return "date formate : MM/dd/yyyy";
        }
        if (date_has_not_passed_yet(checkInDateText) == false) {
            return "the date you entered has already passed";
        }
        if (isDateFormatCorrect(checkOutDateField.getText()) && is_checkOutDate_after_checkInDate() == false) {
            return "check in date should be before the check out date";
        }
        return "";
    }

    private String textInCheckOutDateLbl() {
        String checkOutDateText = checkOutDateField.getText();
        if (isDateFormatCorrect(checkOutDateText) == false) {
            return "date formate : MM/dd/yyyy";
        }
        if (date_has_not_passed_yet(checkOutDateText) == false) {
            return "the date you entered has already passed";
        }
        if (isDateFormatCorrect(checkOutDateField.getText()) && is_checkOutDate_after_checkInDate() == false) {
            return "check out date should be after the check in date";
        }
        return "";
    }

    public void messageLblCheckInText() {
        messageLblCheckIn.setText(textInCheckInDateLbl());
        messageLblCheckIn.setForeground(Color.red);
        messageLblCheckIn.setFont(messageLblCheckOut.getFont().deriveFont(Font.PLAIN));

        messageLblCheckOut.setText(textInCheckOutDateLbl());
        messageLblCheckOut.setForeground(Color.red);
        messageLblCheckOut.setFont(messageLblCheckOut.getFont().deriveFont(Font.PLAIN));

    }

    private void messageLblCheckOutText() {
        messageLblCheckOut.setText(textInCheckOutDateLbl());
        messageLblCheckOut.setForeground(Color.red);
        messageLblCheckOut.setFont(messageLblCheckOut.getFont().deriveFont(Font.PLAIN));

        messageLblCheckIn.setText(textInCheckInDateLbl());
        messageLblCheckIn.setForeground(Color.red);
        messageLblCheckIn.setFont(messageLblCheckOut.getFont().deriveFont(Font.PLAIN));
    }

    private boolean dates_are_validated() {
        if (isDateFormatCorrect(checkInDateField.getText()) == false) {
            // JOptionPane.showMessageDialog(this, "incorrect date format in \"check in date\" field");
            return false;
        }
        if (isDateFormatCorrect(checkOutDateField.getText()) == false) {
            //JOptionPane.showMessageDialog(this, "incorrect date format in \" check in date\" field");
            return false;
        }
        if (date_has_not_passed_yet(checkInDateField.getText()) == false) {
            //JOptionPane.showMessageDialog(this, " date you entered as \"check in date\"  has already passed");
            return false;
        }
        if (is_checkOutDate_after_checkInDate() == false) {
            //JOptionPane.showMessageDialog(this, "\"check out date\" should be after the \"check in date\"");
            return false;
        }
        return true;
    }

    private void loadTable() throws Exception {
        if (dates_are_validated()) {
            loadTable_dates_are_validated();
        } else {
            loadTable_dates_are_not_validated();
        }
    }

    private void addRoom() {
        if (room_table.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "please select a room from the table");
            return;
        }
        if (dates_are_validated() == false) {
            JOptionPane.showMessageDialog(this, "please enter valid checkIn and checkOut dates");
            return;
        }

        if (((String) room_table.getValueAt(room_table.getSelectedRow(), 3)).equals("booked")) {
            JOptionPane.showMessageDialog(this, "The room you selected is unavailalble"
                    + "for your prefered dates");
            return;
        }
        Integer roomId = (Integer) room_table.getValueAt(room_table.getSelectedRow(), 0);
        if (roomIds.contains(roomId)) {
            JOptionPane.showMessageDialog(this, "This room has already been added");
            return;
        }
        roomIds.add(roomId);
        String roomIDs = "<html>added rooms : ";
        for (Integer roomID : roomIds) {
            roomIDs = roomIDs + "<br>room no " + roomID;//"<html>First line<br>Second line</html>"
        }
        roomIDs = roomIDs + "</html>";
        addedRoomsLbl.setText(roomIDs);

    }

    public void loadPackageCombpBoxes() {
        try {
            List<PackageDto> packageDtos = PACKAGE_CONTROLER.getAll();
            packageComboBox.addItem("-select a package");
            for(PackageDto dto: packageDtos){
                packageComboBox.addItem(dto.getDescription());}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    private boolean all_fields_filled() {
        if (customerNameField.getText().isEmpty()) {
            return false;
        }
        if (nicField.getText().isEmpty()) {
            return false;
        }
        if (phoneNumberField.getText().isEmpty()) {
            return false;
        }
        if (emailField.getText().isEmpty()) {
            return false;
        }
        if (addressField.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    private boolean package_is_selected(){
        if(packageComboBox.getSelectedItem().equals("-select a package")){
            return false;}
        return true;
    }

}
