package com.meia.project1;

import java.io.*;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author asgas
 */
public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        alertsLbl.setText("");
        //Header.setIcon(new ImageIcon("../logo.png"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header1Lbl = new javax.swing.JLabel();
        header2Lbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        userField = new javax.swing.JTextField();
        userLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        passField = new javax.swing.JTextField();
        registerLbl = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        alertsLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesión");
        setResizable(false);

        header1Lbl.setText(" Comunidad de reciclaje");

        header2Lbl.setText("Bienvenido. Por favor, inicie sesión.");

        loginBtn.setBackground(new java.awt.Color(204, 255, 204));
        loginBtn.setText("Iniciar sesión");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 153, 153));
        exitBtn.setText("Salir");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        userLbl.setText("Usuario");

        passLbl.setText("Contraseña");

        registerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLbl.setText("¿Aún no tiene una cuenta?");

        registerBtn.setText("Registrarse");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        alertsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertsLbl.setText("lblAlerts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passLbl)
                            .addComponent(userLbl)
                            .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(alertsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(header1Lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(header2Lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(registerBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(exitBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(registerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(header1Lbl)
                .addGap(30, 30, 30)
                .addComponent(header2Lbl)
                .addGap(18, 18, 18)
                .addComponent(userLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(passLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alertsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(registerLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerBtn)
                .addGap(31, 31, 31)
                .addComponent(exitBtn)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea salir?", "¿Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        //File mainFile = new File("C:\\MEIA\\usuario.txt");
        //File binnFile = new File("C:\\MEIA\\bitacora_usuario.txt");
        File descMainFile = new File("C:\\MEIA\\desc_usuario.txt");
        File descBinnFile = new File("C:\\MEIA\\desc_bitacora_usuario.txt");
        
        try {
            FileReader descMainReader;
            FileReader descBinnReader;
            
            
            //If file exists. If not, show error.
            if (descMainFile.exists() && descBinnFile.exists()) {
                //There is some users.
                
                
                
            } else {
                //Significa que es el primer usuario.
                Register registerForm = new Register();
                registerForm.setVisible(true);
                this.setVisible(false);
            }
        } catch (IOException e) {
            alertsLbl.setText("Error: " + String.valueOf(e));
        }        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        File mainFile = new File("C:\\MEIA\\usuarios.txt");
        File descFile = new File("C:\\MEIA\\desc_usuarios.txt");
        Register registerForm = new Register();
        registerForm.setVisible(true);
        this.setVisible(false);
        
        try {
            //Valida si el archivo existe. Si no, lo crea.
            if (!mainFile.createNewFile() && !descFile.createNewFile()) {
                //Significa que ya hay usuarios previos.
            } else {
                //Significa que es el primer usuario que ingresa.
            }
        } catch (IOException e) {
            alertsLbl.setText("Error: " + String.valueOf(e));
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertsLbl;
    private javax.swing.JButton exitBtn;
    private static javax.swing.JLabel header1Lbl;
    private javax.swing.JLabel header2Lbl;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField passField;
    private javax.swing.JLabel passLbl;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel registerLbl;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLbl;
    // End of variables declaration//GEN-END:variables
}
