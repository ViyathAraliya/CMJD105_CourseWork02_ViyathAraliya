package hms.view;

import hms.controller.CatagoryController;
import hms.controller.RoomController;
import hms.controller.PackageContoller;
import hms.controller.ReservationController;
import hms.dto.BookingDatesDto;
import hms.dto.CatagoryDto;
import hms.dto.CustomerDto;
import hms.dto.PackageDto;
import hms.dto.ReservationDetailDto;
import hms.dto.ReservationDto;
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
    private final ReservationController RESEERVATION_CONTROLLER;
    // private List<Integer> roomIds;

    private List<ReservationDetailDto> reservationDetailDtos = new ArrayList<>();
    ;
    private String reservationDetailsString = "<html> reservation details <br>";
    private List<BookingDatesDto> bookingDatesDtos = new ArrayList<>();

    public MakeReservationView() {

          this.setResizable(false);
        CATAGORY_CONTROLLER = new CatagoryController();
        ROOM_CONTROLLER = new RoomController();
        PACKAGE_CONTROLER = new PackageContoller();
        RESEERVATION_CONTROLLER = new ReservationController();

        initComponents();
        setFieldsAndDates();
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
        reservationDetaillsLbl = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();

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
        makeReservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeReservationBtnActionPerformed(evt);
            }
        });

        homeMenuBtn.setText("back to home ");
        homeMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuBtnActionPerformed(evt);
            }
        });

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

        reservationDetaillsLbl.setText("reservation details:");

        clearBtn.setText("clear form");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(packageLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(packageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addRoomBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(makeReservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reservationDetaillsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                .addComponent(checkOutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(checkOutDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(messageLblCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(customerTitleLble, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nicLbl)
                            .addComponent(nicField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
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
                        .addComponent(reservationDetaillsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtn)
                        .addGap(18, 18, 18)
                        .addComponent(makeReservationBtn)
                        .addGap(18, 18, 18)
                        .addComponent(homeMenuBtn)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addRoomBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addressLbl)
                                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(packageLbl)
                                .addComponent(packageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkInDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInDateFieldActionPerformed

    private void addRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomBtnActionPerformed
        try {
            addRoom();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_addRoomBtnActionPerformed

    private void makeReservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeReservationBtnActionPerformed
        try {
            makeReservation();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }      // TODO add your handling code here:
    }//GEN-LAST:event_makeReservationBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearForm();// TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    private void homeMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuBtnActionPerformed
        new HomeView().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_homeMenuBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRoomBtn;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField checkInDateField;
    private javax.swing.JLabel checkInDateLbl;
    private javax.swing.JTextField checkOutDateField;
    private javax.swing.JLabel checkOutLbl;
    private javax.swing.JButton clearBtn;
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
    private javax.swing.JLabel reservationDetaillsLbl;
    private javax.swing.JTable room_table;
    // End of variables declaration//GEN-END:variables

    private void loadTable_dates_are_validated() throws Exception {
        List<RoomDto> roomDtos = ROOM_CONTROLLER.getAll();
        String[] titles = {"roomID", "catagoryName", "charge for catagory",
            "availibilty", "reason if unavailable"};

        DefaultTableModel dtm = new DefaultTableModel(null, titles);
        for (int i = 0; i < roomDtos.size(); i++) {
            RoomDto roomDto = roomDtos.get(i);
            CatagoryDto catagoryDto = CATAGORY_CONTROLLER.getById(roomDto.getCatagoryDto().getId());
            String catagoyName = catagoryDto.getCatagoryName();
            Integer chargeForCatgory = catagoryDto.getChargeForCatagory();

            String availabilty = "";
            String description = "";
            Date checkInDate = new SimpleDateFormat("MM/dd/yyyy").parse(checkInDateField.getText());
            Date checkOutDate = new SimpleDateFormat("MM/dd/yyyy").parse(checkOutDateField.getText());
            /*_____checking booking dates__________*/
            List<BookingDatesDto> bookingDatesDtos = roomDto.getBookingDatesDtos();
            if (bookingDatesDtos.size() == 0) {
                availabilty = "available";
                description = "-";
            } else {
                l2:
                for (BookingDatesDto bookingDatesDto : bookingDatesDtos) {
                    Date checkInDate_inBookingDates = bookingDatesDto.getCheckInDate();
                    Date checkOutDate_inBookingDates = bookingDatesDto.getCheckOutDate();

                    if ((checkInDate.before(checkInDate_inBookingDates) && checkOutDate.before(checkInDate_inBookingDates))
                            || checkInDate.after(checkOutDate_inBookingDates) && checkOutDate.after(checkOutDate_inBookingDates)) {
                        availabilty = "available";
                        description = "-";
                    } else {
                        availabilty = "booked";
                        description = "<html> booked for <br>" + new SimpleDateFormat("MM/dd/yyyy").format(checkInDate_inBookingDates)
                                + "-<br>" + new SimpleDateFormat("MM/dd/yyyy").format(checkOutDate_inBookingDates);

                        break l2;
                    }

                }
            }
            /*______end check in booking dates_______*/
            Object[] row = {roomDto.getRoomId(), catagoyName, chargeForCatgory, availabilty, description};
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
            CatagoryDto catagoryDto = CATAGORY_CONTROLLER.getById(roomDto.getCatagoryDto().getId());
            String catagoyName = catagoryDto.getCatagoryName();
            Integer chargeForCatgory = catagoryDto.getChargeForCatagory();

            String isAvailable = "select dates first";
            String description = "-";

            Object[] row = {roomDto.getRoomId(), catagoyName, chargeForCatgory, isAvailable, description};
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

    private void addRoom() throws Exception {
        if (room_table.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "please select a room from the table");
            return;
        }
        if (dates_are_validated() == false) {
            JOptionPane.showMessageDialog(this, "please enter valid checkIn and checkOut dates");
            return;
        }

        if (((String) room_table.getValueAt(room_table.getSelectedRow(), 3)).equals("booked")) {
            JOptionPane.showMessageDialog(this, "The room you selected is already booked"
            );
            return;
        }

        Integer roomId = (Integer) room_table.getValueAt(room_table.getSelectedRow(), 0);
        for (ReservationDetailDto dto : reservationDetailDtos) {
            if (dto.getRoomDto().getRoomId() == roomId) {
                JOptionPane.showMessageDialog(this, "This room has already been added");
                return;
            }
        }

        if (((String) packageComboBox.getSelectedItem()).equals("-select a package")) {
            JOptionPane.showMessageDialog(this, "Please select a package for this room");
            return;
        }

        String packageDescription = (String) packageComboBox
                .getSelectedItem();

        /*new*/
        Date check_in_date = new SimpleDateFormat("MM/dd/yyyy").parse(checkInDateField.getText());
        Date check_out_date = new SimpleDateFormat("MM/dd/yyyy").parse(checkOutDateField.getText());
        String catogoryName = (String) room_table.getValueAt(room_table.getSelectedRow(), 1);//error here

        CatagoryDto catagoryDto = CATAGORY_CONTROLLER.getByName(catogoryName);
        RoomDto roomDto = ROOM_CONTROLLER.getById(roomId);

        /*---seting booking detailDto----*/
        BookingDatesDto bookingDatesDto = new BookingDatesDto(roomId, check_in_date, check_out_date);
        bookingDatesDtos.add(bookingDatesDto);
        roomDto.setBookingDatesDtos(bookingDatesDtos);

        ReservationDetailDto reservationDetailDto
                = new ReservationDetailDto(PACKAGE_CONTROLER
                        .getByDescription(packageDescription),
                        roomDto);

        reservationDetailDtos.add(reservationDetailDto);

        reservationDetailsString = reservationDetailsString + " Room No : " + roomId
                + ", Package : " + packageDescription + "<br>";

        reservationDetaillsLbl.setText(reservationDetailsString);
        disableCustomerDetailFields();

    }

    public void loadPackageCombpBoxes() {
        try {
            List<PackageDto> packageDtos = PACKAGE_CONTROLER.getAll();
            packageComboBox.addItem("-select a package");
            for (PackageDto dto : packageDtos) {
                packageComboBox.addItem(dto.getDescription());
            }
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

    private boolean package_is_selected() {
        if (packageComboBox.getSelectedItem().equals("-select a package")) {
            return false;
        }
        return true;
    }

    private void makeReservation() throws Exception {
        
        //setFieldsAndDates();
        if (all_fields_filled() == false) {
            JOptionPane.showMessageDialog(this, "please fill all the fields");
            return;
        }
        
        if (reservationDetailDtos.size() == 0) {
            JOptionPane.showMessageDialog(this, "please a select rooms and packages");
            return;
        }
        
        
        CustomerDto customerDto = new CustomerDto(customerNameField.getText(),
                nicField.getText(), phoneNumberField.getText(),
                emailField.getText(), addressField.getText());
        //Date date = new SimpleDateFormat("MM/dd/yyyy").parse(dateFieldText);
        ReservationDto reservationDto = new ReservationDto(new Date(),
                new SimpleDateFormat("MM/dd/yyyy").parse(checkInDateField.getText()),
                new SimpleDateFormat("MM/dd/yyyy").parse(checkOutDateField.getText()),
                bookingDatesDtos,
                customerDto, reservationDetailDtos);
        
        clearForm();
        JOptionPane.showMessageDialog(this, RESEERVATION_CONTROLLER.makeReservation(reservationDto));
    }

    private void setFieldsAndDates() {
        customerNameField.setText("Viyath");
        nicField.setText("933554520V");
        phoneNumberField.setText("0702476555");
        emailField.setText("viyatharaliya@gmail.com");
        addressField.setText("240/41D,yatiwawela katugastota");
        checkInDateField.setText((""));
        checkOutDateField.setText("");
    }

    private void disableCustomerDetailFields() {
        customerNameField.setEditable(false);
        nicField.setEditable(false);
        phoneNumberField.setVisible(false);
        emailField.setEditable(false);
        addressField.setEditable(false);
    }

    private void clearForm() {

        reservationDetailDtos = new ArrayList<>();;
        reservationDetailsString = "<html> reservation details <br>";
        bookingDatesDtos = new ArrayList<>();
        reservationDetaillsLbl.setText(reservationDetailsString);
        enableCustomerDetailFields();
    }

    private void enableCustomerDetailFields() {
        customerNameField.setEditable(true);
        nicField.setEditable(true);
        phoneNumberField.setVisible(true);
        emailField.setEditable(true);
        addressField.setEditable(true);
    }

}
