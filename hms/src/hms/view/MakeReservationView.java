package hms.view;

import hms.controller.CatagoryController;
import hms.dto.CatagoryDto;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MakeReservationView extends javax.swing.JFrame {

    private final CatagoryController CATAGORY_CONTROLLER;

    public MakeReservationView() {
        CATAGORY_CONTROLLER = new CatagoryController();
        initComponents();
        loadCatagoryComboBox();
        bookFromDateField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                bookFromDateField.setText("");
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
        bookFromDateField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

                setTextToFromDateLbl();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setTextToFromDateLbl();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setTextToFromDateLbl();
            }

        });
        bookTillDateField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                bookTillDateField.setText("");
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

        bookTillDateField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                setTextToTillDateLbl();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setTextToTillDateLbl();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setTextToTillDateLbl();
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
        fromDateLbl = new javax.swing.JLabel();
        roomCatagoryLbl = new javax.swing.JLabel();
        catagoryComboBox = new javax.swing.JComboBox<>();
        packageComboBox = new javax.swing.JComboBox<>();
        bookFromDateField = new javax.swing.JTextField();
        makeReservationBtn = new javax.swing.JButton();
        homeMenuBtn = new javax.swing.JButton();
        toLbl = new javax.swing.JLabel();
        bookTillDateField = new javax.swing.JTextField();
        pickRoomBtn = new javax.swing.JButton();
        messageLblFromDate = new javax.swing.JLabel();
        messageLblTillDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerNameLbl.setText("Customer Name");

        nicLbl.setText("NIC/Passport Number");

        phoneNumberLbl.setText("phone number");

        emailLbl.setText("E-Mail");

        addressLbl.setText("Address");

        customerTitleLble.setText("Customer Details");

        packageLbl.setText("Package ");

        fromDateLbl.setText("book from");

        roomCatagoryLbl.setText("Room catagory");

        bookFromDateField.setForeground(new java.awt.Color(102, 102, 102));
        bookFromDateField.setText("MM/dd/yyyy");
        bookFromDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookFromDateFieldActionPerformed(evt);
            }
        });

        makeReservationBtn.setText("make reservation");

        homeMenuBtn.setText("back to home ");

        toLbl.setText("book till");

        bookTillDateField.setForeground(new java.awt.Color(102, 102, 102));
        bookTillDateField.setText("MM/dd/yyyy");

        pickRoomBtn.setText("pick a room");

        messageLblFromDate.setText(".");

        messageLblTillDate.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(customerTitleLble, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(579, 579, 579))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
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
                                            .addComponent(fromDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(toLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bookTillDateField)
                                            .addComponent(bookFromDateField, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(messageLblFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(messageLblTillDate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pickRoomBtn)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(makeReservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(homeMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                        .addComponent(fromDateLbl)
                        .addComponent(bookFromDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(messageLblFromDate)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookTillDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageLblTillDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(toLbl))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailLbl)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLbl)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pickRoomBtn))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeReservationBtn)
                    .addComponent(homeMenuBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookFromDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookFromDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookFromDateFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField bookFromDateField;
    private javax.swing.JTextField bookTillDateField;
    private javax.swing.JComboBox<String> catagoryComboBox;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JLabel customerNameLbl;
    private javax.swing.JLabel customerTitleLble;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel fromDateLbl;
    private javax.swing.JButton homeMenuBtn;
    private javax.swing.JButton makeReservationBtn;
    private javax.swing.JLabel messageLblFromDate;
    private javax.swing.JLabel messageLblTillDate;
    private javax.swing.JTextField nicField;
    private javax.swing.JLabel nicLbl;
    private javax.swing.JComboBox<String> packageComboBox;
    private javax.swing.JLabel packageLbl;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLbl;
    private javax.swing.JButton pickRoomBtn;
    private javax.swing.JLabel roomCatagoryLbl;
    private javax.swing.JLabel toLbl;
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
        messageLblFromDate.setText(dateValidation(bookFromDateField.getText()));
        messageLblFromDate.setForeground(Color.red);
        messageLblFromDate.setFont(messageLblFromDate.getFont().deriveFont(Font.PLAIN));
    }

    private void setTextToTillDateLbl() {
        messageLblTillDate.setText(dateValidation(bookTillDateField.getText()));
        messageLblTillDate.setForeground(Color.red);
        messageLblTillDate.setFont(messageLblTillDate.getFont().deriveFont(Font.PLAIN));
        try {
            if (isBookTillDate_After_BookFromFromDate() == false) {
                messageLblTillDate.setText("checkout date should be after checkin date");
            }
        } catch (Exception e) {
            messageLblTillDate.setText(e.getMessage());
        }

    }

    private String dateValidation(String textInTextField) {
        try {
            Date dateInfield = new SimpleDateFormat("MM/dd/yyyy").parse(textInTextField);
            if (dateInfield.before(new Date())) {
                return "The date you entered has already passed";
            } else {
                return "";
            }
        } catch (Exception e) {
            return "date format : MM/dd/yyyy";
        }
    }

    private boolean isBookTillDate_After_BookFromFromDate() throws Exception {
        Date fromDate = new SimpleDateFormat("MM/dd/yyyy").parse(bookFromDateField.getText());
        Date tillDate = new SimpleDateFormat("MM/dd/yyyy").parse(bookTillDateField.getText());
        return fromDate.before(tillDate);
    }

}
