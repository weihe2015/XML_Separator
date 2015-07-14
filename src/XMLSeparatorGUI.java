
import com.l2fprod.common.swing.JDirectoryChooser;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wei0000
 */
public class XMLSeparatorGUI extends javax.swing.JFrame {

    /**
     * Creates new form XMLSeparatorGUI
     */
    public static File filePath;
    public static String userDir = System.getProperty("user.dir");
    
    public XMLSeparatorGUI() {
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

        BrowseFile = new javax.swing.JFileChooser();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        SrcDir = new javax.swing.JTextField();
        Generate = new javax.swing.JButton();
        OpenFolder = new javax.swing.JButton();
        Browse1 = new javax.swing.JButton();
        DestDir = new javax.swing.JTextField();
        Browse2 = new javax.swing.JButton();
        VersionNumber = new javax.swing.JLabel();
        ViewLogFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESRI_XML_Separator_Tool");
        setName("ESRI_XML_Separator"); // NOI18N

        Text1.setText("Please select the folder that contains xml files needed to be separated.");

        Text2.setText("Please select the folder that saves the separated xml files.");

        Generate.setText("Generate");
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });

        OpenFolder.setText("Open the separated folder");
        OpenFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFolderActionPerformed(evt);
            }
        });

        Browse1.setText("Browse Folder");
        Browse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse1ActionPerformed(evt);
            }
        });

        Browse2.setText("Browse Folder");
        Browse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse2ActionPerformed(evt);
            }
        });

        VersionNumber.setText("Version 1.0");

        ViewLogFile.setText("View Log File");
        ViewLogFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewLogFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Generate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OpenFolder))
                                .addComponent(Text2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SrcDir, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DestDir, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Browse2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Browse1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ViewLogFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(VersionNumber))
                            .addComponent(Text1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(VersionNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SrcDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Browse1))
                .addGap(42, 42, 42)
                .addComponent(Text2)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DestDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Browse2))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Generate)
                    .addComponent(OpenFolder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(ViewLogFile)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Browse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse1ActionPerformed
        // TODO add your handling code here:
        JDirectoryChooser chooser = new JDirectoryChooser();
        String folder;
        
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JDirectoryChooser.APPROVE_OPTION){
            folder = chooser.getSelectedFile().getAbsolutePath();
            SrcDir.setText(folder);
        }
    }//GEN-LAST:event_Browse1ActionPerformed

    private void Browse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse2ActionPerformed
        // TODO add your handling code here:
        JDirectoryChooser chooser = new JDirectoryChooser();
        String folder;
        
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JDirectoryChooser.APPROVE_OPTION){
            folder = chooser.getSelectedFile().getAbsolutePath();
            filePath = new File(folder);
            DestDir.setText(folder);
        }
    }//GEN-LAST:event_Browse2ActionPerformed

    private void OpenFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFolderActionPerformed
        // TODO add your handling code here:
        try{
            if(Desktop.isDesktopSupported()){
                Desktop.getDesktop().open(filePath);
            }
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_OpenFolderActionPerformed

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
        // TODO add your handling code here:
        ReadXML xml = new ReadXML();
        String infolder = SrcDir.getText();
        String outfolder = DestDir.getText();
        xml.search(infolder, outfolder);
    }//GEN-LAST:event_GenerateActionPerformed

    private void ViewLogFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewLogFileActionPerformed
        // TODO add your handling code here:
        try{
            Process p = Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe " + userDir + "\\log.txt");
            p.waitFor();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_ViewLogFileActionPerformed

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
            java.util.logging.Logger.getLogger(XMLSeparatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XMLSeparatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XMLSeparatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XMLSeparatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XMLSeparatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse1;
    private javax.swing.JButton Browse2;
    private javax.swing.JFileChooser BrowseFile;
    private javax.swing.JTextField DestDir;
    private javax.swing.JButton Generate;
    private javax.swing.JButton OpenFolder;
    private javax.swing.JTextField SrcDir;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel VersionNumber;
    private javax.swing.JButton ViewLogFile;
    // End of variables declaration//GEN-END:variables
}