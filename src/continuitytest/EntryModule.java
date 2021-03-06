/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continuitytest;

import javax.swing.JOptionPane;

/**
 *
 * @author Chaurasia
 */
public class EntryModule extends javax.swing.JInternalFrame {

    Main mRef;

    /**
     * Creates new form EntryModule
     */
    public EntryModule(Main m) {
        initComponents();
        mRef = m;
        type_select.removeAllItems();
        getCarTypes();
    }

    public void getCarTypes() {
        type_select.addItem(new ComboItem("XXS", "1"));
        type_select.addItem(new ComboItem("XS", "2"));
        type_select.addItem(new ComboItem("M", "3"));
        type_select.addItem(new ComboItem("L", "4"));
        type_select.addItem(new ComboItem("XL", "5"));
        type_select.addItem(new ComboItem("XXL", "6"));
        type_select.addItem(new ComboItem("S", "7"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelVehicleNumber = new javax.swing.JLabel();
        textVehiclePlate = new javax.swing.JTextField();
        labelVehicleType = new javax.swing.JLabel();
        type_select = new javax.swing.JComboBox();
        buttonParkbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        labelVehicleNumber.setText("Enter Vehicle Number");

        labelVehicleType.setText("Select Vehicle Type");

        type_select.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        type_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_selectActionPerformed(evt);
            }
        });

        buttonParkbtn.setText("Park ");
        buttonParkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonParkbtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        console.setColumns(20);
        console.setRows(5);
        jScrollPane1.setViewportView(console);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelVehicleNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textVehiclePlate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelVehicleType)
                                .addGap(18, 18, 18)
                                .addComponent(type_select, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonParkbtn)))
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVehicleNumber)
                    .addComponent(textVehiclePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVehicleType)
                    .addComponent(type_select, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonParkbtn))
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void type_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_selectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_selectActionPerformed

    private void buttonParkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonParkbtnActionPerformed

        if (String.valueOf(textVehiclePlate.getText().toString().trim()).length() >= 4) {

            Object item = type_select.getSelectedItem();
            String value = ((ComboItem) item).getValue();
            //JOptionPane.showMessageDialog(null, value);

            int status = mRef.queryNumber(String.valueOf(textVehiclePlate.getText().toString().trim()));
            if (status == 0) {
                JOptionPane.showMessageDialog(null, "Car Already Parked");
                textVehiclePlate.setText("");
                textVehiclePlate.requestFocus();
            } else {
                //   JOptionPane.showMessageDialog(null, "Continue to Park");
                mRef.queryAvailableSpace(Integer.valueOf(value), String.valueOf(textVehiclePlate.getText().toString().trim()));
                textVehiclePlate.setText("");
                textVehiclePlate.requestFocus();

                /*
            API Details 
            queryNumber : Checks if the plate number of the car for duplicate entry
            queryAvailableSpace : Car Model id AND plate Number to query and Get Response 
            getCarBlock : get the location of the block where the car is blocked
            freeCarBlock : remove the entry and mark block free again
                 */
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Car Plate Number [REQUIRED 4 ]");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonParkbtnActionPerformed

    public void ConsoleMsg(String msg) {

        console.append("\n" + msg);
        console.setCaretPosition(console.getDocument().getLength());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonParkbtn;
    private javax.swing.JTextArea console;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelVehicleNumber;
    private javax.swing.JLabel labelVehicleType;
    private javax.swing.JTextField textVehiclePlate;
    private javax.swing.JComboBox type_select;
    // End of variables declaration//GEN-END:variables
}
