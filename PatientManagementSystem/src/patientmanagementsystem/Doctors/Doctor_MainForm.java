/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.Doctors;

import patientmanagementsystem.Login_Form;

/**
 *
 * @author cex
 */
public class Doctor_MainForm extends javax.swing.JFrame {

    /**
     * Creates new form Patient_MainForm
     */
    public Doctor_MainForm() {
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
        jButton_MakePrescription = new javax.swing.JButton();
        jButton_PatientHistory = new javax.swing.JButton();
        jButton_OrderMedicine = new javax.swing.JButton();
        jButton_ViewAppointments = new javax.swing.JButton();
        jButton_CreateAppointment = new javax.swing.JButton();
        jButton_PatientNotes = new javax.swing.JButton();
        jButton_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Doctor");

        jButton_MakePrescription.setText("Make Prescription");
        jButton_MakePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MakePrescriptionActionPerformed(evt);
            }
        });

        jButton_PatientHistory.setText("View Patient History");
        jButton_PatientHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PatientHistoryActionPerformed(evt);
            }
        });

        jButton_OrderMedicine.setText("Order Medicine");
        jButton_OrderMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OrderMedicineActionPerformed(evt);
            }
        });

        jButton_ViewAppointments.setText("View Appointments");
        jButton_ViewAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ViewAppointmentsActionPerformed(evt);
            }
        });

        jButton_CreateAppointment.setText("Create Appointment");
        jButton_CreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CreateAppointmentActionPerformed(evt);
            }
        });

        jButton_PatientNotes.setText("Patient Notes");
        jButton_PatientNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PatientNotesActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton_Back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jButton_ViewAppointments))
                            .addComponent(jButton_CreateAppointment, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_PatientNotes, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_OrderMedicine)
                            .addComponent(jButton_PatientHistory)
                            .addComponent(jButton_MakePrescription))))
                .addGap(0, 146, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_MakePrescription)
                    .addComponent(jButton_ViewAppointments))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CreateAppointment)
                    .addComponent(jButton_OrderMedicine))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_PatientHistory)
                    .addComponent(jButton_PatientNotes))
                .addGap(35, 35, 35)
                .addComponent(jButton_Back)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ViewAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ViewAppointmentsActionPerformed
        ViewAppointments_Doctor_Form pmf = new ViewAppointments_Doctor_Form();
        pmf.setVisible(true);
    }//GEN-LAST:event_jButton_ViewAppointmentsActionPerformed

    private void jButton_PatientNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PatientNotesActionPerformed
        PatientNotes_Doctor_Form pmf = new PatientNotes_Doctor_Form();
        pmf.setVisible(true);
    }//GEN-LAST:event_jButton_PatientNotesActionPerformed

    private void jButton_MakePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MakePrescriptionActionPerformed
        MakePrescription_Doctor_Form pmf = new MakePrescription_Doctor_Form();
        pmf.setVisible(true);
    }//GEN-LAST:event_jButton_MakePrescriptionActionPerformed

    private void jButton_CreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CreateAppointmentActionPerformed
        CreateAppointment_Doctor_Form pmf = new CreateAppointment_Doctor_Form();
        pmf.setVisible(true);
    }//GEN-LAST:event_jButton_CreateAppointmentActionPerformed

    private void jButton_PatientHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PatientHistoryActionPerformed
        ViewPatientHistory_Doctor_Form pmf = new ViewPatientHistory_Doctor_Form();
        pmf.setVisible(true);
    }//GEN-LAST:event_jButton_PatientHistoryActionPerformed

    private void jButton_OrderMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OrderMedicineActionPerformed
        OrderMedicine_Doctor_Form pmf = new OrderMedicine_Doctor_Form();
        pmf.setVisible(true);
    }//GEN-LAST:event_jButton_OrderMedicineActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_CreateAppointment;
    private javax.swing.JButton jButton_MakePrescription;
    private javax.swing.JButton jButton_OrderMedicine;
    private javax.swing.JButton jButton_PatientHistory;
    private javax.swing.JButton jButton_PatientNotes;
    private javax.swing.JButton jButton_ViewAppointments;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
