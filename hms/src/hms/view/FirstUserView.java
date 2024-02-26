
package hms.view;

import hms.controller.UserController;
import hms.dto.UserDto;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class FirstUserView extends javax.swing.JFrame {

    private final UserController USER_CONTROLLER;

    public FirstUserView() {
        USER_CONTROLLER = new UserController();
        initComponents();
        confirmPasswordField.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e) {
                pwdCheck();
            }

            public void removeUpdate(DocumentEvent e) {
                pwdCheck();
            }

            public void changedUpdate(DocumentEvent e) {
                pwdCheck();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmPasswordField = new javax.swing.JPasswordField();
        saveBtn = new javax.swing.JButton();
        userNameLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        phoneNumberLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        confirmPasswordLbl = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        loginMenuBtn = new javax.swing.JButton();
        messageLbl1 = new javax.swing.JLabel();
        messageLbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saveBtn.setText("register");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        userNameLbl.setText("username");

        emailLbl.setText("email");

        phoneNumberLbl.setText("phone number");

        passwordLbl.setText("password");

        confirmPasswordLbl.setText("confirm password");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Register the first user");

        role.setText("role");

        jTextField1.setEditable(false);
        jTextField1.setText("admin");

        loginMenuBtn.setText("back to login menu");
        loginMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuBtnActionPerformed(evt);
            }
        });

        messageLbl1.setText(".");

        messageLbl2.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(244, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneNumberLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(confirmPasswordLbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(messageLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(messageLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saveBtn)
                    .addComponent(loginMenuBtn))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLbl)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(role)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLbl)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmPasswordLbl)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(messageLbl2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginMenuBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        saveUser();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void loginMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuBtnActionPerformed
        loginMenu();        // TODO add your handling code here:
    }//GEN-LAST:event_loginMenuBtnActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLbl;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton loginMenuBtn;
    private javax.swing.JLabel messageLbl1;
    private javax.swing.JLabel messageLbl2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLbl;
    private javax.swing.JLabel role;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLbl;
    // End of variables declaration//GEN-END:variables

    private void saveUser() {

        UserDto userDto = new UserDto(userNameField.getText(), "admin", emailField.getText(), phoneNumberField.getText(), 
                passwordField.getPassword(),true);

        try {
            if (hasEmptityFields()) {
                JOptionPane.showMessageDialog(this, "please fill all the fields !");
                return;
            }
            if (doPasswordsMatch()) {
                USER_CONTROLLER.saveUser(userDto);
                saveBtn.setEnabled(false);
                disableFields();
                JOptionPane.showMessageDialog(this, "Registered succesfully !");
            } else {
                JOptionPane.showMessageDialog(this, "passwords dont match");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private boolean doPasswordsMatch() {

        boolean doesMatch = true;

        char[] pwd1 = passwordField.getPassword();
        char[] pwd2 = confirmPasswordField.getPassword();
        if (pwd1.length != pwd2.length) {
            return false;
        }
        for (int i = 0; i < pwd1.length; i++) {
            if (pwd1[i] != pwd2[i]) {
                doesMatch = false;
            }
        }
        return doesMatch;
    }

    private void disableFields() {
        userNameField.setEditable(false);
        emailField.setEditable(false);
        phoneNumberField.setEditable(false);
        passwordField.setEditable(false);
        confirmPasswordField.setEditable(false);
    }

    private void loginMenu() {
        new LoginView().setVisible(true);
        this.dispose();
       
    }

    public void pwdMismatchWarning() {
        messageLbl1.setText("passwords dont match");
        messageLbl1.setForeground(Color.red);
        messageLbl1.setFont(messageLbl1.getFont().deriveFont(Font.PLAIN));

        messageLbl2.setText("passwords dont match");
        messageLbl2.setForeground(Color.red);
        messageLbl2.setFont(messageLbl1.getFont().deriveFont(Font.PLAIN));
    }

    public void pwdCheck() {
        if (!doPasswordsMatch()) {
            pwdMismatchWarning();
        } else {
            messageLbl1.setText("");
            messageLbl2.setText("");
        }
    }

    public boolean hasEmptityFields() {
        
        if (userNameField.getText().isEmpty() || emailField.getText().isEmpty()
                || phoneNumberField.getText().isEmpty() || 
                passwordField.getPassword().length==0 ||
                confirmPasswordField.getPassword().length==0) {
            return true;
        } else {
            return false;
        }
    }
}
