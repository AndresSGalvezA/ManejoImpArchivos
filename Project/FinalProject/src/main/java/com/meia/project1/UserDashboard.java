package com.meia.project1;

import java.io.*;

/**
 *
 * @author asgas
 */
public class UserDashboard extends javax.swing.JFrame {
    String[] currentUser;
    
    public UserDashboard(String[] user) {
        initComponents();
        userLbl.setText(user[0]);
        alertsLbl.setText("");
        currentUser = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userLbl = new javax.swing.JLabel();
        imgLbl = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        banBtn = new javax.swing.JButton();
        alertsLbl = new javax.swing.JLabel();
        RecyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Panel de usuario");

        userLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLbl.setText("user");

        imgLbl.setText("img");

        updateBtn.setText("Cambiar datos");

        banBtn.setText("Darse de baja");
        banBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banBtnActionPerformed(evt);
            }
        });

        alertsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertsLbl.setText("alerts");
        alertsLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        RecyBtn.setText("Donar");
        RecyBtn.setActionCommand("Donar");
        RecyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecyBtnMouseClicked(evt);
            }
        });
        RecyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(userLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(updateBtn)
                        .addGap(18, 18, 18)
                        .addComponent(banBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(imgLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(alertsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RecyBtn)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(userLbl)
                .addGap(64, 64, 64)
                .addComponent(imgLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(banBtn))
                .addGap(11, 11, 11)
                .addComponent(RecyBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertsLbl)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void banBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banBtnActionPerformed
        //TODO
    }//GEN-LAST:event_banBtnActionPerformed

    private void RecyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecyBtnActionPerformed
        RecycleDashboard dashboard = new RecycleDashboard(userLbl.getText());
        dashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RecyBtnActionPerformed

    private void RecyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecyBtnMouseClicked
        
        
    }//GEN-LAST:event_RecyBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new UserDashboard(null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecyBtn;
    private javax.swing.JLabel alertsLbl;
    private javax.swing.JButton banBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel userLbl;
    // End of variables declaration//GEN-END:variables
}
