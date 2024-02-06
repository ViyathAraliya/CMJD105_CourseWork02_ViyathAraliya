package hms.view;

import hms.controller.UserController;
import hms.dto.UserDto;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author viyat
 */
public class AddNewUser extends javax.swing.JFrame {

    String role;
    private final UserController USER_CONTROLLER;

    public AddNewUser() {
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

        selectRoleCmbBx.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                selectRoleCheck();
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userNameLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        phoneNumberLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        confirmPasswordLbl = new javax.swing.JLabel();
        usernNameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        saveBtn = new javax.swing.JButton();
        roleLbl = new javax.swing.JLabel();
        selectRoleCmbBx = new javax.swing.JComboBox<>();
        messageLbl1 = new javax.swing.JLabel();
        messageLbl2 = new javax.swing.JLabel();
        messageLbl3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userNameLbl.setText("username");

        emailLbl.setText("email");

        phoneNumberLbl.setText("phone number");

        passwordLbl.setText("password");

        confirmPasswordLbl.setText("confirm password");

        saveBtn.setText("save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        roleLbl.setText("role");

        selectRoleCmbBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- please select a role", "admin", "staff" }));
        selectRoleCmbBx.setToolTipText("");
        selectRoleCmbBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectRoleCmbBxActionPerformed(evt);
            }
        });

        messageLbl1.setText(".");

        messageLbl2.setText(".");

        messageLbl3.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(confirmPasswordLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(phoneNumberLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernNameField)
                            .addComponent(emailField)
                            .addComponent(phoneNumberField)
                            .addComponent(passwordField)
                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(messageLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectRoleCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(messageLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLbl)
                    .addComponent(usernNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLbl)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordLbl)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleLbl)
                    .addComponent(selectRoleCmbBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        saveUser();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void selectRoleCmbBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectRoleCmbBxActionPerformed
        selectRole();
    }//GEN-LAST:event_selectRoleCmbBxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLbl;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel messageLbl1;
    private javax.swing.JLabel messageLbl2;
    private javax.swing.JLabel messageLbl3;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLbl;
    private javax.swing.JLabel roleLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> selectRoleCmbBx;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField usernNameField;
    // End of variables declaration//GEN-END:variables

    private void saveUser() {
        try {
            if (!doPasswordsMatch()) {
                System.out.println(doPasswordsMatch());
                JOptionPane.showMessageDialog(this, "passwords don't match");
                return;
            }
            if (doesUserNameExist()) {
                JOptionPane.showMessageDialog(this, "username already exists !");
                return;
            }
            role = selectRoleCmbBx.getSelectedItem().toString();
            UserDto userDto = new UserDto(usernNameField.getText(), role, emailField.getText(), phoneNumberField.getText(),
                    passwordField.getPassword().toString());

            if (role.equals("- please select a role")) {
                JOptionPane.showMessageDialog(this, "please select a role");
                messageLbl3.setText("please select a role");
                messageLbl3.setForeground(Color.red);
                messageLbl3.setFont(messageLbl1.getFont().deriveFont(Font.PLAIN));
                return;

            }

           USER_CONTROLLER.saveUser(userDto);
           JOptionPane.showMessageDialog(this, "user saved!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void selectRole() {

        role = selectRoleCmbBx.getSelectedItem().toString();
    }

    private boolean doesUserNameExist() throws Exception {
        return USER_CONTROLLER.doesUserNameExist(usernNameField.getText());
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

    public void selectRoleCheck() {
        if (selectRoleCmbBx.getSelectedItem().toString() == "- please select a role") {
            messageLbl3.setText("please select a role");
            messageLbl3.setForeground(Color.red);
            messageLbl3.setFont(messageLbl1.getFont().deriveFont(Font.PLAIN));
        }
    }

}
