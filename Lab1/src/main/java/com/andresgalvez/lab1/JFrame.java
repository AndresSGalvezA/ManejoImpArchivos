/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.andresgalvez.lab1;

import java.io.*;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author asgas
 */
public class JFrame extends javax.swing.JFrame {
    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRoute = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnGet = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lName = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lLastname = new javax.swing.JList<>();
        TFRoute = new javax.swing.JTextField();
        TFName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombres");
        jLabel1.setToolTipText("");

        jLabel2.setText("Apellidos");

        btnRoute.setText("Ruta archivo");
        btnRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRouteActionPerformed(evt);
            }
        });

        btnSave.setText("Grabar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnGet.setText("Obtener");
        btnGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 153, 153));
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lName);

        jScrollPane2.setViewportView(lLastname);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Laboratorio No. 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(121, 121, 121))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFName)
                            .addComponent(TFRoute, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 65, Short.MAX_VALUE)))))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRoute, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFRoute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRoute))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(TFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int confirmExit = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea salir?", "¿Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (confirmExit == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRouteActionPerformed
        JFileChooser fChooser = new JFileChooser();
        FileNameExtensionFilter fnFilter = new FileNameExtensionFilter("Archivo de Texto", "txt");
        File imageFile;
        fChooser.setFileFilter(fnFilter);
        int dialog = fChooser.showOpenDialog(this);
        
        if (dialog == JFileChooser.APPROVE_OPTION) {
            imageFile = fChooser.getSelectedFile();
            TFRoute.setText(imageFile.getPath());
        }
    }//GEN-LAST:event_btnRouteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (!"".equals(TFRoute.getText())) {
            String errorMsg = "";
            
            if (fillFile(TFRoute.getText(), TFName.getText(), errorMsg)) {
                JOptionPane.showMessageDialog(null, "Registro ingresado correctamente: " + TFName.getText(), "Guardar", WIDTH);
                TFName.setText("");
            }
            else {
                JOptionPane.showMessageDialog(null, "Se produjo un error al guardar: " + errorMsg, "Error", WIDTH);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo para guardar los registros.", "Error", WIDTH);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetActionPerformed
        if (!"".equals(TFRoute.getText())) {
            String errorMsg = "";
            
            if (!getContent(TFRoute.getText(), errorMsg)) {
                JOptionPane.showMessageDialog(null, "Se produjo un error al cargar: " + errorMsg, "Error", WIDTH);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo para obtener los registros.", "Error", WIDTH);
        }
    }//GEN-LAST:event_btnGetActionPerformed
    
    public boolean fillFile(String path, String content, String error) {
        File file = new File(path);
        
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(writer);
            bWriter.write(content + System.getProperty("line.separator"));
            bWriter.close();
            return true;
        }
        catch (IOException ex) {
            error = ex.getMessage();
            return false;
        }
    }
    
    public boolean getContent(String path, String error) {
        File file = new File(path);
        
        if (file.exists()) {
            FileReader reader;
            
            try {
                reader = new FileReader(file);
                BufferedReader bReader = new BufferedReader(reader);
                String line = "";
                
                try {
                    line = bReader.readLine();
                    String[] split;
                    DefaultListModel mName = new DefaultListModel();
                    DefaultListModel mLastname = new DefaultListModel();
                    
                    while (line != null) {
                        if (!"".equals(line)) {
                            split = line.split(",");
                            mName.addElement(split[0]);
                            mLastname.addElement(split[1]);
                        }
                        
                        line = bReader.readLine();
                    }
                    
                    reader.close();
                    bReader.close();
                    lName.setModel(mName);
                    lLastname.setModel(mLastname);
                    error = "";
                    return true;
                }
                catch (IOException ex) {
                    error = ex.getMessage();
                    return false;
                }
            }
            catch (FileNotFoundException ex) {
                error = ex.getMessage();
                return false;
            }
        }
        else {
            error = "No existe el archivo.";
            return false;
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFName;
    private javax.swing.JTextField TFRoute;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGet;
    private javax.swing.JButton btnRoute;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lLastname;
    private javax.swing.JList<String> lName;
    // End of variables declaration//GEN-END:variables
}