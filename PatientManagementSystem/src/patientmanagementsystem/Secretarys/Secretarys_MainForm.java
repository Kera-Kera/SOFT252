/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.Secretarys;

import patientmanagementsystem.Login_Form;

/**
 *
 * @author cex
 */
public class Secretarys_MainForm extends javax.swing.JFrame {

    /**
     * Creates new form Patient_MainForm
     */
    public Secretarys_MainForm() {
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
        jButton_ApproveAccount = new javax.swing.JButton();
        jButton_CreateAppointment = new javax.swing.JButton();
        jButton_GivePrescription = new javax.swing.JButton();
        jButton_ApproveAccountRemoval = new javax.swing.JButton();
        jButton_RemovePatient = new javax.swing.JButton();
        jButton_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Secretary");

        jButton_ApproveAccount.setText("Approve Account");
        jButton_ApproveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ApproveAccountActionPerformed(evt);
            }
        });

        jButton_CreateAppointment.setText("Create Appointment");
        jButton_CreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CreateAppointmentActionPerformed(evt);
            }
        });

        jButton_GivePrescription.setText("Give Prescription");
        jButton_GivePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GivePrescriptionActionPerformed(evt);
            }
        });

        jButton_ApproveAccountRemoval.setText("Approve Account Removal");
        jButton_ApproveAccountRemoval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ApproveAccountRemovalActionPerformed(evt);
            }
        });

        jButton_RemovePatient.setText("Remove Patients");
        jButton_RemovePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemovePatientActionPerformed(evt);
            }
        });

        jButton_Back.setText("Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButton_Back)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_GivePrescription)
                    .addComponent(jButton_RemovePatient))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_CreateAppointment)
                    .addComponent(jButton_ApproveAccount))
                .addGap(0, 104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_ApproveAccountRemoval)
                        .addGap(182, 182, 182))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ApproveAccount)
                    .addComponent(jButton_GivePrescription))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CreateAppointment)
                    .addComponent(jButton_RemovePatient))
                .addGap(18, 18, 18)
                .addComponent(jButton_ApproveAccountRemoval)
                .addGap(35, 35, 35)
                .addComponent(jButton_Back)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GivePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GivePrescriptionActionPerformed
        GivePrescription_Secretary_Form pmf = new GivePrescription_Secretary_Form();
        pmf.setVisible(true);
    }//GEN-LAST:event_jButton_GivePrescriptionActionPerformed

    private void jButton_RemovePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemovePatientActionPerformed
        RemovePatient_Secretary_Form pmf = new RemovePatient_Secretary_Form();
        pmf.setVisible(true);
    }//GEN-LAST:event_jButton_RemovePatientActionPerformed

    private void jButton_ApproveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ApproveAccountActionPerformed
        AccountApproval_Secretary_Form pmf = new AccountApproval_Secretary_Form();
        pmf.setVisible(true);
    }//GEN-LAST:event_jButton_ApproveAccountActionPerformed

    private void jButton_ApproveAccountRemovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ApproveAccountRemovalActionPerformed
        ApproveAccountRemoval_Secretary_Form pmf = new ApproveAccountRemoval_Secretary_Form();
        pmf.setVisible(true);
    }//GEN-LAST:event_jButton_ApproveAccountRemovalActionPerformed

    private void jButton_CreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CreateAppointmentActionPerformed
        CreateAppointment_Secretary_Form pmf = new CreateAppointment_Secretary_Form();
        pmf.setVisible(true);
    }//GEN-LAST:event_jButton_CreateAppointmentActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        setVisible(false);
        Login_Form pmf = new Login_Form();
        pmf.setVisible(true);
    }//GEN-LAST:event_jButton_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Secretarys_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Secretarys_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Secretarys_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Secretarys_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Secretarys_MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ApproveAccount;
    private javax.swing.JButton jButton_ApproveAccountRemoval;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_CreateAppointment;
    private javax.swing.JButton jButton_GivePrescription;
    private javax.swing.JButton jButton_RemovePatient;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}