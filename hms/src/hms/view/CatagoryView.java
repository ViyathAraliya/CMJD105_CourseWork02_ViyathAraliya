package hms.view;

import hms.controller.CatagoryController;
import hms.dto.CatagoryDto;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CatagoryView extends javax.swing.JFrame {

    private CatagoryController CATAGORY_CONTROLLER;

    public CatagoryView() {
        CATAGORY_CONTROLLER = new CatagoryController();
        initComponents();
        loadTable();
        catagoryTable.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                 selectCatagory();
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
        catagoryIdField.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        catagoryTable = new javax.swing.JTable();
        catorgoryIdLbl = new javax.swing.JLabel();
        catagoryNameLbl = new javax.swing.JLabel();
        descriptionLbl = new javax.swing.JLabel();
        chargeLble = new javax.swing.JLabel();
        catagoryIdField = new javax.swing.JTextField();
        catagoryNameField = new javax.swing.JTextField();
        descriptionField = new javax.swing.JTextField();
        chargeField = new javax.swing.JTextField();
        updateLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        catagoryTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(catagoryTable);

        catorgoryIdLbl.setText("catagoryID");

        catagoryNameLbl.setText("catagory name");

        descriptionLbl.setText("description");

        chargeLble.setText("charge for catagory");

        updateLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updateLbl.setText("update");

        homeBtn.setText("back To Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(updateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(catagoryNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(catorgoryIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(descriptionLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chargeLble, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(catagoryIdField)
                                        .addComponent(catagoryNameField)
                                        .addComponent(descriptionField)
                                        .addComponent(chargeField, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeBtn)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateLbl)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(catorgoryIdLbl)
                            .addComponent(catagoryIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(catagoryNameLbl)
                            .addComponent(catagoryNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descriptionLbl)
                            .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chargeLble)
                            .addComponent(chargeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeBtn)
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
    this.dispose();
    new HomeView().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_homeBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
            update();        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField catagoryIdField;
    private javax.swing.JTextField catagoryNameField;
    private javax.swing.JLabel catagoryNameLbl;
    private javax.swing.JTable catagoryTable;
    private javax.swing.JLabel catorgoryIdLbl;
    private javax.swing.JTextField chargeField;
    private javax.swing.JLabel chargeLble;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JLabel descriptionLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel updateLbl;
    // End of variables declaration//GEN-END:variables

    public void loadTable() {
        String[] columnHeads = {"catagoryID", "catagory name", "description", "charge for catagory"};
        DefaultTableModel dtm = new DefaultTableModel(columnHeads, 0);
        try {
            List<CatagoryDto> dtos = CATAGORY_CONTROLLER.getAll();
            for (CatagoryDto dto : dtos) {
                Object[] row = {dto.getId(), dto.getCatagoryName(), dto.getDescription(), dto.getChargeForCatagory()};
                dtm.addRow(row);
            }
            
            catagoryTable.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }

    public void selectCatagory() {
        String id = (Integer) catagoryTable.getValueAt(catagoryTable.getSelectedRow(), 0) + "";
        String name = (String) catagoryTable.getValueAt(catagoryTable.getSelectedRow(), 1);
        String description = (String) catagoryTable.getValueAt(catagoryTable.getSelectedRow(), 2);
        Integer charge = (Integer) catagoryTable.getValueAt(catagoryTable.getSelectedRow(), 3);
        
        catagoryIdField.setText(id);
        catagoryNameField.setText(name);
        descriptionField.setText(description);
        chargeField.setText(charge+"");
    }
    
    public void update(){
    try{
        String updateMsg=CATAGORY_CONTROLLER.update(new CatagoryDto(Integer.parseInt(catagoryIdField.getText()), catagoryNameField.getText(), descriptionField.getText(), Integer.parseInt(chargeField.getText())));
        JOptionPane.showMessageDialog(this, updateMsg);
        loadTable();
    }catch(Exception e){
    JOptionPane.showMessageDialog(this, e.getMessage());}
    }

}
