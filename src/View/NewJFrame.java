/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.DB_Connection;
import Control.MovieCatalog;
import Control.ShowingCatalog;
//import Control.SeatHandler;
//import Model.Seats;
import javafx.scene.control.PasswordField;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author Simon_
 */
public class NewJFrame extends javax.swing.JFrame {
DB_Connection jens = DB_Connection.getInstace();
//Seats seat = new Seats();
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        pnlN = new javax.swing.JPanel();
        btnPnl = new javax.swing.JPanel();
        okBtn = new javax.swing.JButton();
        cnclBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pnlE = new javax.swing.JPanel();
        pnlW = new javax.swing.JPanel();
        pnlC = new javax.swing.JPanel();
        usrLblPnl = new javax.swing.JPanel();
        usrLbl = new javax.swing.JLabel();
        userTxtPnl = new javax.swing.JPanel();
        usrTxt = new javax.swing.JTextField();
        psswrLblPnl = new javax.swing.JPanel();
        psswrdLbl = new javax.swing.JLabel();
        psswrdTxtPnl = new javax.swing.JPanel();
        passwordField = new javax.swing.JPasswordField();
        hostLbl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hostTxtPnl = new javax.swing.JPanel();
        hostTF = new javax.swing.JTextField();
        portPnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        portTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dbNameTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 51, 55));

        pnlN.setPreferredSize(new java.awt.Dimension(400, 75));
        getContentPane().add(pnlN, java.awt.BorderLayout.PAGE_START);

        btnPnl.setPreferredSize(new java.awt.Dimension(400, 39));

        okBtn.setText("OK");
        okBtn.setPreferredSize(new java.awt.Dimension(67, 25));
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        btnPnl.add(okBtn);

        cnclBtn.setText("Cancel");
        btnPnl.add(cnclBtn);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        btnPnl.add(jButton1);

        getContentPane().add(btnPnl, java.awt.BorderLayout.PAGE_END);

        pnlE.setPreferredSize(new java.awt.Dimension(75, 251));
        getContentPane().add(pnlE, java.awt.BorderLayout.LINE_END);

        pnlW.setPreferredSize(new java.awt.Dimension(75, 251));
        getContentPane().add(pnlW, java.awt.BorderLayout.LINE_START);

        pnlC.setPreferredSize(new java.awt.Dimension(300, 240));

        usrLblPnl.setPreferredSize(new java.awt.Dimension(80, 26));

        usrLbl.setText("Username");
        usrLblPnl.add(usrLbl);

        pnlC.add(usrLblPnl);

        userTxtPnl.setPreferredSize(new java.awt.Dimension(155, 36));

        usrTxt.setText("postgres");
        usrTxt.setPreferredSize(new java.awt.Dimension(155, 26));
        usrTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrTxtActionPerformed(evt);
            }
        });
        userTxtPnl.add(usrTxt);

        pnlC.add(userTxtPnl);

        psswrLblPnl.setPreferredSize(new java.awt.Dimension(80, 26));

        psswrdLbl.setText("Password");
        psswrLblPnl.add(psswrdLbl);

        pnlC.add(psswrLblPnl);

        psswrdTxtPnl.setPreferredSize(new java.awt.Dimension(155, 36));

        passwordField.setText("root");
        passwordField.setPreferredSize(new java.awt.Dimension(155, 26));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        psswrdTxtPnl.add(passwordField);

        pnlC.add(psswrdTxtPnl);

        hostLbl.setPreferredSize(new java.awt.Dimension(80, 26));

        jLabel1.setText("Hostname");
        hostLbl.add(jLabel1);

        pnlC.add(hostLbl);

        hostTF.setText("localhost");
        hostTF.setPreferredSize(new java.awt.Dimension(155, 26));
        hostTxtPnl.add(hostTF);

        pnlC.add(hostTxtPnl);

        portPnl.setPreferredSize(new java.awt.Dimension(80, 26));

        jLabel2.setText("Port");
        portPnl.add(jLabel2);

        pnlC.add(portPnl);

        portTF.setText("5432");
        portTF.setPreferredSize(new java.awt.Dimension(155, 26));
        jPanel1.add(portTF);

        pnlC.add(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(80, 26));

        jLabel3.setText("Database Name");
        jPanel2.add(jLabel3);

        pnlC.add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(155, 26));

        dbNameTF.setPreferredSize(new java.awt.Dimension(155, 26));
        dbNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbNameTFActionPerformed(evt);
            }
        });
        jPanel3.add(dbNameTF);

        pnlC.add(jPanel3);

        getContentPane().add(pnlC, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usrTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrTxtActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        // TODO add your handling code here:
        
        String user = usrTxt.getText();
        String password = new String(passwordField.getText());
        String hostName = hostTF.getText();
        String port = portTF.getText();
        String DBname = dbNameTF.getText();
        jens.setDBname(DBname);
        jens.setHostName(hostName);
        jens.setPassword(password);
        jens.setPort(port);
        jens.setUser(user);
        if(DB_Connection.connect(user, password, hostName, port, DBname) != null){
            JOptionPane.showMessageDialog(null,"User found");
            jens.queryPerson();
            MovieCatalog.queryMovie();
            ShowingCatalog.queryHall();
            setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "User not found");
        }
    }//GEN-LAST:event_okBtnActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void dbNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dbNameTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
      
      //  System.out.println(seat.testa());
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnPnl;
    private javax.swing.JButton cnclBtn;
    private javax.swing.JTextField dbNameTF;
    private javax.swing.JPanel hostLbl;
    private javax.swing.JTextField hostTF;
    private javax.swing.JPanel hostTxtPnl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton okBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel pnlC;
    private javax.swing.JPanel pnlE;
    private javax.swing.JPanel pnlN;
    private javax.swing.JPanel pnlW;
    private javax.swing.JPanel portPnl;
    private javax.swing.JTextField portTF;
    private javax.swing.JPanel psswrLblPnl;
    private javax.swing.JLabel psswrdLbl;
    private javax.swing.JPanel psswrdTxtPnl;
    private javax.swing.JPanel userTxtPnl;
    private javax.swing.JLabel usrLbl;
    private javax.swing.JPanel usrLblPnl;
    private javax.swing.JTextField usrTxt;
    // End of variables declaration//GEN-END:variables
}
