package com.meia.project1;

import java.io.*;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.crypto.BadPaddingException;
import java.security.InvalidKeyException;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.IllegalBlockSizeException;

/**
 *
 * @author asgas
 */
public class Register extends javax.swing.JFrame {
    public Register() {
        initComponents();
        alertsLbl.setText("");
        securityLbl.setText("seguridad: ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLbl = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lastnameField = new javax.swing.JTextField();
        lastnameLbl = new javax.swing.JLabel();
        passField = new javax.swing.JTextField();
        passLbl = new javax.swing.JLabel();
        birhLbl = new javax.swing.JLabel();
        securityLbl = new javax.swing.JLabel();
        birthField = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        phoneLbl = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        photoLbl = new javax.swing.JLabel();
        photoBtn = new javax.swing.JButton();
        photoField = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        alertsLbl = new javax.swing.JLabel();
        userLbl = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setResizable(false);

        headerLbl.setText("Registro");

        jLabel1.setText("Nombre");

        lastnameLbl.setText("Apellido");

        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passFieldKeyPressed(evt);
            }
        });

        passLbl.setText("Contraseña");

        birhLbl.setText("Fecha de nacimiento");

        securityLbl.setText("seguridad: ");

        emailLbl.setText("Correo alterno");

        phoneLbl.setText("Teléfono");

        photoLbl.setText("Fotografía");

        photoBtn.setText("Cargar fotografía...");
        photoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoBtnActionPerformed(evt);
            }
        });

        registerBtn.setBackground(new java.awt.Color(204, 255, 204));
        registerBtn.setText("Registrarse");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        alertsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alertsLbl.setText("alertsLbl");
        alertsLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        userLbl.setText("Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(registerBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(headerLbl)))
                        .addGap(0, 145, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(alertsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photoField, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(photoLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(birhLbl)
                            .addComponent(birthField)
                            .addComponent(jLabel1)
                            .addComponent(userLbl)
                            .addComponent(userField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(phoneLbl)
                                .addComponent(lastnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(phoneField))
                            .addComponent(lastnameLbl)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLbl)))
                    .addComponent(photoBtn)
                    .addComponent(passLbl)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securityLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLbl)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(userLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameLbl)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birhLbl)
                    .addComponent(phoneLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(photoLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photoBtn)
                .addGap(18, 18, 18)
                .addComponent(passLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securityLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(alertsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerBtn)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Used to show password security
    private void passFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyPressed
        if (!"".equals(passField.getText())) {
            String[] scores = getScores();
            String[] results = getResults();

            if (scores != null) {
                if (passField.getText().length() < Integer.parseInt(scores[0])) {
                    securityLbl.setText("Use al menos " + scores[0] + " caracteres.");
                } else {
                    int score = 0, uppercaseLetters = 0, letters = 0, numbers = 0, symbols = 0;
                    String securityMsg = "";
                    
                    for (int i = 0; i < passField.getText().length(); i++) {
                        if (Character.isUpperCase(passField.getText().charAt(i))) {
                            uppercaseLetters++;
                            letters++;
                        } else if (Character.isLetter(passField.getText().charAt(i))) {
                            letters++;
                        } else if (Character.isDigit(passField.getText().charAt(i))) {
                            numbers++;
                        } else {
                            symbols++;
                        }
                    }
                    
                    score += Integer.parseInt(scores[1]) * passField.getText().length(); //Total chars.
                    score += Integer.parseInt(scores[2]) * uppercaseLetters; //Uppercase letters.
                    score += Integer.parseInt(scores[3]) + letters; //Total letters.
                    score += Integer.parseInt(scores[4]) + numbers; //Total nums.
                    score += (Integer.parseInt(scores[5]) + passField.getText().length()) * symbols; //Total symbols.
                    
                    if (letters == passField.getText().length()) {
                        score -= Integer.parseInt(scores[6]);
                    }
                    
                    if (numbers == passField.getText().length()) {
                        score -= Integer.parseInt(scores[7]);
                    }
                    
                    for (int i = 0; i < results.length; i++) {
                        String[] range = results[i].split(",");
                        
                        if (Integer.parseInt(range[0]) <= score && Integer.parseInt(range[1]) >= score) {
                            securityMsg = switch (i) {
                                case 0 -> "contraseña insegura";
                                case 1 -> "contraseña poco segura";
                                case 2 -> "contraseña segura";
                                default -> "contraseña muy segura";
                            };
                        }
                    }
                    
                    securityLbl.setText("seguridad: " + securityMsg);
                }
            } else {
                alertsLbl.setText("Error del sistema.");
            }
        } else {
            securityLbl.setText("debe ingresar una contraseña");
        }
    }//GEN-LAST:event_passFieldKeyPressed
    
    //Used to register users.
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        alertsLbl.setText("");
        
        //Case is there any empty fields.
        if (userField.getText().equals("") || emailField.getText().equals("") || nameField.getText().equals("") ||
            lastnameField.getText().equals("") || birthField.getText().equals("") || emailField.getText().equals("") ||
            phoneField.getText().equals("") || passField.getText().equals("") || emailField.getText().equals("") ||
            photoField.getText().equals("")) {
            alertsLbl.setText("Debe llenar todos los campos.");
        } else {
            //Case password security is ok.
            if (securityLbl.getText().equals("seguridad: contraseña segura") || securityLbl.getText().equals("seguridad: contraseña muy segura")) {
                if (emailField.getText().contains("@")) {
                    if (phoneField.getText().matches("[0-9]+")) {
                        alertsLbl.setText("Todo bien :).");
                    } else {
                        alertsLbl.setText("Debe ingresar un teléfono válido.");
                    }
                } else {
                    alertsLbl.setText("Debe ingresar un correo válido.");
                }
                
                String ENCRYPT_KEY = "encriptacionpuraduraparaarchivos"; //16, 24 or 32 bytes.
                String cipherPass = cipherPass(passField.getText(), ENCRYPT_KEY);
            } else {
                alertsLbl.setText("Debe ingresar una contraseña más segura.");
            }
        }
    }//GEN-LAST:event_registerBtnActionPerformed
    
    //Used to select an image.
    private void photoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoBtnActionPerformed
        String[] formats = new String[] { "png", "jpg", "jpeg", "tiff", "ico", "bmp" };
        JFileChooser fChooser = new JFileChooser();
        FileNameExtensionFilter fnFilter = new FileNameExtensionFilter("Imagen", formats);
        File imageFile;
        fChooser.setFileFilter(fnFilter);
        int dialog = fChooser.showOpenDialog(this);
        
        if (dialog == JFileChooser.APPROVE_OPTION) {
            imageFile = fChooser.getSelectedFile();
            photoField.setText(imageFile.getPath());
        }
    }//GEN-LAST:event_photoBtnActionPerformed
    
    //Used to get scores of password security.
    public String[] getScores() {
        File file = new File("C:\\MEIA\\pwd\\puntuacion.txt");
        String[] scores = new String[8];
        
        if (file.exists()) {
            FileReader reader;
            
            try {
                reader = new FileReader(file);
                BufferedReader bReader = new BufferedReader(reader);
                
                try {
                    for (int i = 0; i < 8; i++) {
                        scores[i] = bReader.readLine();
                    }
                    
                    reader.close();
                    bReader.close();
                    return scores;
                }
                catch (IOException ex) {
                    alertsLbl.setText(ex.getMessage());
                }
            }
            catch (FileNotFoundException ex) {
                alertsLbl.setText(ex.getMessage());
            }
        }
        else {
            alertsLbl.setText("No se encontró un validador de contraseñas.");
        }
        
        return null;
    }
    
    //Used to get results of password security range.
    public String[] getResults() {
        File file = new File("C:\\MEIA\\pwd\\resultado.txt");
        String[] results = new String[4];
        
        if (file.exists()) {
            FileReader reader;
            
            try {
                reader = new FileReader(file);
                BufferedReader bReader = new BufferedReader(reader);
                
                try {
                    for (int i = 0; i < 4; i++) {
                        results[i] = bReader.readLine();
                    }
                    
                    reader.close();
                    bReader.close();
                    return results;
                }
                catch (IOException ex) {
                    alertsLbl.setText(ex.getMessage());
                }
            }
            catch (FileNotFoundException ex) {
                alertsLbl.setText(ex.getMessage());
            }
        }
        else {
            alertsLbl.setText("No se encontró un validador de contraseñas.");
        }
        
        return null;
    }
    
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertsLbl;
    private javax.swing.JLabel birhLbl;
    private javax.swing.JTextField birthField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JLabel lastnameLbl;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField passField;
    private javax.swing.JLabel passLbl;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JButton photoBtn;
    private javax.swing.JTextField photoField;
    private javax.swing.JLabel photoLbl;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel securityLbl;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLbl;
    // End of variables declaration//GEN-END:variables
}