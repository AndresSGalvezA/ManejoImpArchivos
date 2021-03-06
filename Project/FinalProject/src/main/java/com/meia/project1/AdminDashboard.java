package com.meia.project1;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser; //hacer busquedas, elegir archivos
import javax.swing.JOptionPane; //es tambien para la busqueda de los archivos
import javax.swing.filechooser.FileNameExtensionFilter; //para poder filtrr

/**
 *
 * @author asgas
 */
public class AdminDashboard extends javax.swing.JFrame {
    String[] currentUser;
    
    public AdminDashboard(String[] user) {
        initComponents();
        userLbl.setText(user[0]);
        currentUser = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLbl = new javax.swing.JLabel();
        userLbl = new javax.swing.JLabel();
        imgLbl = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        banUser = new javax.swing.JButton();
        backupBtn = new javax.swing.JButton();
        userField = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        BackupField = new javax.swing.JTextField();
        alertsLbl = new javax.swing.JLabel();
        MaterialesBtn = new javax.swing.JButton();
        DonacionesBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        headerLbl.setText("Panel de administrador");

        userLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLbl.setText("user");
        userLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        imgLbl.setText("img");

        updateBtn.setText("Cambiar datos");

        registerBtn.setText("Registar usuario");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Buscar usuarios");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        banUser.setText("Dar de baja a un usuario");
        banUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banUserActionPerformed(evt);
            }
        });

        backupBtn.setText("Respaldo");
        backupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupBtnActionPerformed(evt);
            }
        });

        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });

        MaterialesBtn.setText("Materiales");
        MaterialesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaterialesBtnActionPerformed(evt);
            }
        });

        DonacionesBtn.setText("Donaciones");
        DonacionesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonacionesBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Reportes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BackupField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userField)
                                    .addComponent(alertsLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(banUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(backupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(updateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registerBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MaterialesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(headerLbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(userLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(imgLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(DonacionesBtn)
                                .addGap(53, 53, 53)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(userLbl)
                .addGap(41, 41, 41)
                .addComponent(imgLbl)
                .addGap(3, 3, 3)
                .addComponent(alertsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackupField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backupBtn)))
                    .addComponent(banUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(registerBtn)
                        .addComponent(MaterialesBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DonacionesBtn)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fChooser = new JFileChooser();
        File folder;
        fChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        //int dialog = fChooser.showSaveDialog(null);
        int dialog = fChooser.showDialog(updateBtn, "folder");
        
        String FolderPath = "";
        
        if (dialog == JFileChooser.APPROVE_OPTION) {
            folder = fChooser.getSelectedFile();
            
            FolderPath = folder.getPath();
            BackupField.setText(folder.getPath());
        }
        
        
        if (!"".equals(BackupField.getText())) {
            MakeBackup(FolderPath);
        }
    }//GEN-LAST:event_backupBtnActionPerformed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        
        File mainFile = new File("C:\\MEIA\\usuario.txt");
        File binnFile = new File("C:\\MEIA\\bitacora_usuario.txt");
        FileReader mainReader = null;
        try {
            mainReader = new FileReader(mainFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        FileReader binnReader = null;
        try {
            binnReader = new FileReader(binnFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bMainReader = new BufferedReader(mainReader);
        BufferedReader bBinnReader = new BufferedReader(binnReader);
        String mainLine = "";
        String binnLine = "";
        try {
            mainLine = bMainReader.readLine();
            binnLine = bBinnReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] mainSplit;
        String[] binnSplit;
        boolean userExists = false;

        while (mainLine != null) {
            if (!"".equals(mainLine)) {
                mainSplit = mainLine.split("\\|");

                if (mainSplit[0].equals(userField.getText())) {
                    userExists = true;
                }

                if (mainSplit[0].equals(userField.getText())) {
                    //Case user is active.
                    alertsLbl.setText("Usuario encontrado.");
                    this.setSize(this.getWidth(), 365);
                    
                    
                    try {
                        mainReader.close();
                        bMainReader.close();
                    } catch (IOException ex) {
                        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }

            try {
                mainLine = bMainReader.readLine();
            } catch (IOException ex) {
                Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        alertsLbl.setText("");
        this.setSize(this.getWidth(), 365);
    }//GEN-LAST:event_formMouseMoved

    private void banUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banUserActionPerformed
        File mainFile = new File("C:\\MEIA\\usuario.txt");
        File binnFile = new File("C:\\MEIA\\bitacora_usuario.txt");
        FileReader mainReader = null;
        try {
            mainReader = new FileReader(mainFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        FileReader binnReader = null;
        try {
            binnReader = new FileReader(binnFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bMainReader = new BufferedReader(mainReader);
        BufferedReader bBinnReader = new BufferedReader(binnReader);
        String mainLine = "";
        String binnLine = "";
        try {
            mainLine = bMainReader.readLine();
            binnLine = bBinnReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] mainSplit;
        String[] binnSplit;
        boolean userExists = false;

        while (mainLine != null) {
            if (!"".equals(mainLine)) {
                mainSplit = mainLine.split("\\|");

                if (mainSplit[0].equals(userField.getText())) {
                    userExists = true;
                }

                if (mainSplit[0].equals(userField.getText())) {
                    //Case user is active.
                    alertsLbl.setText("Usuario Baneado.");
                    this.setSize(this.getWidth(), 365);
                    
                    //Usuario encontrado listo para sobre escribir
                    
                    try {
                        mainReader.close();
                        bMainReader.close();
                    } catch (IOException ex) {
                        Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }

            try {
                mainLine = bMainReader.readLine();
            } catch (IOException ex) {
                Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_banUserActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        Register registerForm = new Register();
        registerForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerBtnActionPerformed

    private void MaterialesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaterialesBtnActionPerformed
        Materiales registerForm = new Materiales();
        registerForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MaterialesBtnActionPerformed

    private void DonacionesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonacionesBtnActionPerformed
        Donaciones DonacionesDash = new Donaciones();
        DonacionesDash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DonacionesBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ReporteView ReportesDash = new ReporteView();
        ReportesDash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void MakeBackup(String path)
    {
	Date mainDate = new Date();
	SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MM-yyyy");
	File original = new File("C:\\MEIA");
	File copy = new  File(path +"\\MEIA_BACKUP" + "-" +  formattedDate.format(mainDate));
        
	getDirectorys(original, copy);
	JOptionPane.showMessageDialog(null, "Respaldo creado.");
    }

    public static void getFiles(File original, File copy)
    {
	try {
            InputStream input = new FileInputStream(original);
            OutputStream output = new FileOutputStream(copy);
            byte[] buffer = new byte[1024];
            int data;
            while ((data = input.read(buffer)) > 0) {
                output.write(buffer, 0, data);                
            }
    	
            input.close();
            output.close();
	} catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + String.valueOf(e));
	}
    }

    public static void getDirectorys(File original, File copy)
    {
        if (original.isDirectory()) {
            //Create directory.
            if (!copy.exists()) {
                copy.mkdir();
            }
		
            String [] files = original.list();
		
            for (int i = 0; i < files.length; i++) {
                getDirectorys(new File(original, files[i]), new File(copy, files[i]));
            }
        } else
        {
            getFiles(original, copy);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminDashboard(null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BackupField;
    private javax.swing.JButton DonacionesBtn;
    private javax.swing.JButton MaterialesBtn;
    private javax.swing.JLabel alertsLbl;
    private javax.swing.JButton backupBtn;
    private javax.swing.JButton banUser;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLbl;
    // End of variables declaration//GEN-END:variables
}
