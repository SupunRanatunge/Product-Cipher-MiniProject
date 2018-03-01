
package Cipher.Package;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


/**
 *
 * @author supun
 */
public class MyProductCipher extends javax.swing.JFrame {
    File file;
    int key;
    ArrayList<Character> output;
    
    public MyProductCipher() {
        initComponents();
        this.setLocationRelativeTo(null);               //center the UI
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFile = new javax.swing.JTextField();
        jKey = new javax.swing.JTextField();
        jSelectFile = new javax.swing.JButton();
        jEncrypt = new javax.swing.JButton();
        jDecrypt = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jExit = new javax.swing.JButton();

        fileChooser.setDialogTitle("Select the text file you want to ENCRYPT!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Text File :");

        jLabel2.setText("Key     :");

        jTextFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFileActionPerformed(evt);
            }
        });

        jSelectFile.setText("Select File");
        jSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelectFileActionPerformed(evt);
            }
        });

        jEncrypt.setText("Encrypt");
        jEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEncryptActionPerformed(evt);
            }
        });

        jDecrypt.setText("Decrypt");
        jDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDecryptActionPerformed(evt);
            }
        });

        jClear.setText("Clear");

        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFile, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jKey, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSelectFile)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEncrypt)
                .addGap(30, 30, 30)
                .addComponent(jDecrypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jExit)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSelectFile))
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jClear)
                            .addComponent(jExit))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEncrypt)
                            .addComponent(jDecrypt))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFileActionPerformed

    private void jSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectFileActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);                           //selecting a text file
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        this.file = fileChooser.getSelectedFile();
        jTextFile.setText(file.getAbsolutePath());
    } else {
        System.out.println("File access cancelled by user.");
    }
        
    }//GEN-LAST:event_jSelectFileActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
            System.exit(0);                                                                //exit button
    }//GEN-LAST:event_jExitActionPerformed

    private void jEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEncryptActionPerformed
        key = Integer.parseInt(jKey.getText());
        CipherMethods st = new CipherMethods();
        try {
            st.substitute_txt(file,key);
            
        } catch (IOException ex) {
            Logger.getLogger(MyProductCipher.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jEncryptActionPerformed

    private void jDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDecryptActionPerformed
        CipherMethods cm = new CipherMethods();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("Encrypted.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyProductCipher.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String line = br.readLine();
            System.out.println(line);
            cm.dec_substitute_txt(line, key);
        } catch (IOException ex) {
            Logger.getLogger(MyProductCipher.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(MyProductCipher.class.getName()).log(Level.SEVERE, null, ex);
            }
}
        
    }//GEN-LAST:event_jDecryptActionPerformed

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
            java.util.logging.Logger.getLogger(MyProductCipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyProductCipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyProductCipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyProductCipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyProductCipher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jClear;
    private javax.swing.JButton jDecrypt;
    private javax.swing.JButton jEncrypt;
    private javax.swing.JButton jExit;
    private javax.swing.JTextField jKey;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jSelectFile;
    private javax.swing.JTextField jTextFile;
    // End of variables declaration//GEN-END:variables
}
