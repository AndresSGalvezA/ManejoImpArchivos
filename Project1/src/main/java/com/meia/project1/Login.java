package com.meia.project1;

import java.io.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
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
        
        if (!userField.getText().equals("") && !passField.getText().equals("")) {
            File mainFile = new File("C:\\MEIA\\usuario.txt");
            File binnFile = new File("C:\\MEIA\\bitacora_usuario.txt");
            
            //If there is more than one user. If not, go to register.
            if (binnFile.length() > 0 ) {
                FileReader mainReader;
                FileReader binnReader;

                try {
                    mainReader = new FileReader(mainFile);
                    binnReader = new FileReader(binnFile);
                    BufferedReader bMainReader = new BufferedReader(mainReader);
                    BufferedReader bBinnReader = new BufferedReader(binnReader);
                    String mainLine = "";
                    String binnLine = "";
                    
                    try {
                        mainLine = bMainReader.readLine();
                        binnLine = bBinnReader.readLine();
                        String[] mainSplit;
                        String[] binnSplit;
                        boolean userExists = false;
                        
                        while (mainLine != null) {
                            if (!"".equals(mainLine)) {
                                mainSplit = mainLine.split("\\|");
                                
                                if (mainSplit[0].equals(userField.getText())) {
                                    userExists = true;
                                }
                                
                                if (mainSplit[0].equals(userField.getText()) && mainSplit[3].equals(cipherPass(passField.getText(), "encriptacionpuraduraparaarchivos"))) {
                                    //Case user is active.
                                    if (mainSplit[9].equals("1")) {
                                        //If role is administrator or user.
                                        if (mainSplit[4].equals("1")) {
                                            AdminDashboard dashboard = new AdminDashboard(mainSplit);
                                            dashboard.setVisible(true);
                                        } else {
                                            UserDashboard dashboard = new UserDashboard(mainSplit);
                                            dashboard.setVisible(true);
                                        }
                                    } else {
                                        alertsLbl.setText("Usuario desactivado.");
                                    }
                                    
                                    mainReader.close();
                                    bMainReader.close();
                                    this.setVisible(false);
                                    break;
                                }
                            }

                            mainLine = bMainReader.readLine();
                        }
                        
                        while (binnLine != null) {
                            if (!"".equals(binnLine)) {
                                binnSplit = binnLine.split("\\|");
                                
                                if (binnSplit[0].equals(userField.getText())) {
                                    userExists = true;
                                }
                                
                                if (binnSplit[0].equals(userField.getText()) && binnSplit[3].equals(cipherPass(passField.getText(), "encriptacionpuraduraparaarchivos"))) {
                                    //Case user is active.
                                    if (binnSplit[9].equals("1")) {
                                        //If role is administrator or user.
                                        if (binnSplit[4].equals("1")) {
                                            AdminDashboard dashboard = new AdminDashboard(binnSplit);
                                            dashboard.setVisible(true);
                                        } else {
                                            UserDashboard dashboard = new UserDashboard(binnSplit);
                                            dashboard.setVisible(true);
                                        }
                                    } else {
                                        alertsLbl.setText("Usuario desactivado.");
                                    }
                                    
                                    binnReader.close();
                                    bBinnReader.close();
                                    this.setVisible(false);
                                    break;
                                }
                            }

                            binnLine = bBinnReader.readLine();
                        }
                        
                        alertsLbl.setText("Credenciales inválidas.");
                        
                        if (!userExists) {
                            Register register = new Register();
                            register.setVisible(true);
                            this.setVisible(false);
                        }
                    } catch (IOException e) {
                        alertsLbl.setText(String.valueOf(e));
                    }
                } catch (FileNotFoundException e) {
                    alertsLbl.setText("Error al ubicar los archivos.");
                }
            } else {
                Register register = new Register();
                register.setVisible(true);
                this.setVisible(false);
            }
        } else {
            alertsLbl.setText("Debe llenar todos los campos.");
        }       
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        File mainFile = new File("C:\\MEIA\\usuario.txt");
        File descMainFile = new File("C:\\MEIA\\desc_usuario.txt");
        File binnFile = new File("C:\\MEIA\\bitacora_usuario.txt");
        File descBinnFile = new File("C:\\MEIA\\desc_bitacora_usuario.txt");
        
        try {
            //If file doesn't exists, creates it.
            boolean mainFileE = mainFile.createNewFile();
            boolean descMainFileE = descMainFile.createNewFile();
            boolean binnFileE = mainFile.createNewFile();
            boolean descBinnFileE = descMainFile.createNewFile();
            Register registerForm = new Register();
            registerForm.setVisible(true);
            this.setVisible(false);
        } catch (IOException e) {
            alertsLbl.setText("Error: " + String.valueOf(e));
        }
    }//GEN-LAST:event_registerBtnActionPerformed
    
    //Used to cipher password with AES.
    public String cipherPass(String pass, String ENCRYPT_KEY) {
        try {
            Key aesKey = new SecretKeySpec(ENCRYPT_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);
            byte[] pwd = cipher.doFinal(pass.getBytes());
            String cPwd = new String(pwd);
            String rPwd = "";
            
            for (int i = 0; i < cPwd.length(); i++) {
                if (Character.isDigit(cPwd.charAt(i))) {
                    rPwd += cPwd.charAt(i);
                }
            }
            
            return rPwd + "aam";
                    
        } catch(InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            alertsLbl.setText(String.valueOf(e));
        }
        
        return null;
    } 
    
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
