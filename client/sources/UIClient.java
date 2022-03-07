package sources;

import controllers.ClientController;
import controllers.Controller;
import controllers.ControllerFile;
import controllers.UIController;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

/**
 *
 * @author Raziel
 */
public class UIClient extends javax.swing.JFrame {

    private Controller ct;
    private UIController ctui;
    private String route_txt;
    private ControllerFile cf;
    private ClientController cc;
    
    public UIClient() {
        initComponents();
        ct = new Controller(jLabelClock1);
        ctui = new UIController();
        disableTxtFields();
        ct.iniciar();
        jButtonSend.setEnabled(false);
        cf = new ControllerFile();
        //START THE CLIENT CONTROLLER
        cc = new ClientController();
        cc.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelClock1 = new javax.swing.JLabel();
        jTextHour1 = new javax.swing.JTextField();
        jTextMin1 = new javax.swing.JTextField();
        jTextSec1 = new javax.swing.JTextField();
        jButtonModify1 = new javax.swing.JButton();
        jLabelRoute = new javax.swing.JLabel();
        jButtonOpenFile = new javax.swing.JButton();
        jButtonSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelClock1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelClock1.setText("jLabel1");

        jTextHour1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextHour1.setText("0");
        jTextHour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHour1ActionPerformed(evt);
            }
        });

        jTextMin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextMin1.setText("0");
        jTextMin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMin1ActionPerformed(evt);
            }
        });

        jTextSec1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextSec1.setText("0");
        jTextSec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSec1ActionPerformed(evt);
            }
        });

        jButtonModify1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonModify1.setText("Detener");
        jButtonModify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModify1ActionPerformed(evt);
            }
        });

        jLabelRoute.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRoute.setText("jLabel1");

        jButtonOpenFile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonOpenFile.setText("Seleccionar Archivo");
        jButtonOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenFileActionPerformed(evt);
            }
        });

        jButtonSend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSend.setText("Enviar");
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonModify1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabelClock1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextHour1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13)
                                    .addComponent(jTextMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13)
                                    .addComponent(jTextSec1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonOpenFile)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSend))
                            .addComponent(jLabelRoute))))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabelClock1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModify1)
                .addGap(39, 39, 39)
                .addComponent(jLabelRoute)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOpenFile)
                    .addComponent(jButtonSend))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextSec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSec1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSec1ActionPerformed

    private void jTextMin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMin1ActionPerformed

    private void jTextHour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHour1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHour1ActionPerformed

    private void jButtonModify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModify1ActionPerformed
        modify(jTextHour1, jTextMin1, jTextSec1, jButtonModify1, 1);
    }//GEN-LAST:event_jButtonModify1ActionPerformed

    private void jButtonOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpenFileActionPerformed
        JFileChooser fc = new JFileChooser();
        route_txt="";
        int select = fc.showOpenDialog(this);
        if(select==JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            jLabelRoute.setText(file.getAbsolutePath());
            route_txt+=file.getAbsolutePath();
            cf.setRoute(route_txt);
            cf.readFile();
            //PASS THE LIST AND THE HOUR TO THE CLIENT CONTROLLER
            cc.setList(cf.getList());
            cc.setHour(ct.toString());
            jButtonSend.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonOpenFileActionPerformed

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
        cc.setExe(true);
    }//GEN-LAST:event_jButtonSendActionPerformed

    
    
    public void modify(JTextField hour, JTextField minute, JTextField second,
            JButton modifyButton, int numberClock){
        //TRUE WHEN THE CLOCK IS BOUT TO BE MODIFIED
        //FALSE IF THE USER HAD ENTERED THE NEW VALUES
        if(!hour.isEnabled()){
            hour.setEnabled(true);
            minute.setEnabled(true);
            second.setEnabled(true);
            ct.modify(true);
            modifyButton.setText("Modificar");
        }else{
            //THE ADJUST FUNCTION WILL VERIFY IF THE FILEDS AREN'T EMPTY 
            //IF THEIR VALUES ARE BIGGER THAN THEY SHOULD, LIKE HOUR=45 IT'LL ADJUST THEM
            ctui.adjust(hour, minute, second);
            //PASSING VALUES THE THREAD CONTROLLER
            ct.modify(false, ctui.getHour(), ctui.getMinute(), ctui.getSecond());
            hour.setEnabled(false);
            minute.setEnabled(false);
            second.setEnabled(false);
            modifyButton.setText("Detener");
        }
    }
    
    public void disableTxtFields(){
        jTextHour1.setEnabled(false);
        jTextMin1.setEnabled(false);
        jTextSec1.setEnabled(false);
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
            java.util.logging.Logger.getLogger(UIClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonModify1;
    private javax.swing.JButton jButtonOpenFile;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JLabel jLabelClock1;
    private javax.swing.JLabel jLabelRoute;
    private javax.swing.JTextField jTextHour1;
    private javax.swing.JTextField jTextMin1;
    private javax.swing.JTextField jTextSec1;
    // End of variables declaration//GEN-END:variables
}
