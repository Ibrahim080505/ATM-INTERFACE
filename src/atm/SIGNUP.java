/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ibu
 */
public class SIGNUP extends javax.swing.JFrame {
    /**
     * Creates new form SIGNUP
     */
    public SIGNUP() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AccNum = new javax.swing.JLabel();
        ACCNUMTb = new javax.swing.JTextField();
        FirstName = new javax.swing.JLabel();
        FirstNameTb = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        AadharNum = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        LastNameTb = new javax.swing.JTextField();
        DobTb = new javax.swing.JTextField();
        AadharTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTa = new javax.swing.JTextArea();
        Phone = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        PanNum = new javax.swing.JLabel();
        Occupation = new javax.swing.JLabel();
        Dob = new javax.swing.JLabel();
        PanTb = new javax.swing.JTextField();
        PhoneTb = new javax.swing.JTextField();
        OccupationTb = new javax.swing.JTextField();
        EducationTb = new javax.swing.JComboBox<>();
        Education = new javax.swing.JLabel();
        GenderCb = new javax.swing.JComboBox<>();
        Submit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("INFINITY - SAVINGS");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabel1.setText("SIGNUP FORM");

        AccNum.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        AccNum.setText("ACCOUNT NUM:");

        ACCNUMTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACCNUMTbActionPerformed(evt);
            }
        });

        FirstName.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        FirstName.setText("FIRST NAME:");

        FirstNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTbActionPerformed(evt);
            }
        });

        LastName.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        LastName.setText("LAST NAME:");

        AadharNum.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        AadharNum.setText("AADHAR NUM :");

        Address.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        Address.setText("ADDRESS:");

        LastNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTbActionPerformed(evt);
            }
        });

        DobTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DobTbActionPerformed(evt);
            }
        });

        AadharTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AadharTbActionPerformed(evt);
            }
        });

        AddressTa.setColumns(20);
        AddressTa.setRows(5);
        jScrollPane1.setViewportView(AddressTa);

        Phone.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        Phone.setText("PHONE NUMBER:");

        Gender.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        Gender.setText("GENDER");

        PanNum.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        PanNum.setText("PAN NUMBER:");

        Occupation.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        Occupation.setText("OCCUPATION:");

        Dob.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        Dob.setText("DOB:");

        PanTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanTbActionPerformed(evt);
            }
        });

        PhoneTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTbActionPerformed(evt);
            }
        });

        OccupationTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OccupationTbActionPerformed(evt);
            }
        });

        EducationTb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SSLC", "DIPLOMO", "12TH", "UG", "PG", "MBA " }));
        EducationTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationTbActionPerformed(evt);
            }
        });

        Education.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        Education.setText("EDUCATION:");

        GenderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        GenderCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderCbActionPerformed(evt);
            }
        });

        Submit.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        Submit.setText("SUBMIT");
        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitMouseClicked(evt);
            }
        });
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("BACK");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccNum)
                    .addComponent(FirstName)
                    .addComponent(LastName)
                    .addComponent(Dob)
                    .addComponent(Gender)
                    .addComponent(Education))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ACCNUMTb, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(FirstNameTb, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(LastNameTb, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(DobTb, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(EducationTb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GenderCb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Phone)
                    .addComponent(PanNum)
                    .addComponent(Occupation)
                    .addComponent(AadharNum)
                    .addComponent(Address))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanTb, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AadharTb, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OccupationTb, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(369, 369, 369))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(344, 344, 344))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(325, 325, 325))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ACCNUMTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AadharTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AadharNum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanNum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DobTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Occupation, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dob, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OccupationTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Education, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EducationTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(262, 262, 262))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ACCNUMTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACCNUMTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACCNUMTbActionPerformed

    private void FirstNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameTbActionPerformed

    private void LastNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTbActionPerformed

    private void DobTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DobTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DobTbActionPerformed

    private void AadharTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AadharTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AadharTbActionPerformed

    private void PanTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PanTbActionPerformed

    private void PhoneTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTbActionPerformed

    private void OccupationTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OccupationTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OccupationTbActionPerformed

    private void EducationTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EducationTbActionPerformed

    private void GenderCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderCbActionPerformed
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Statement st = null;
        private void clear()
        {
            ACCNUMTb.setText("");
            FirstNameTb.setText("");
            LastNameTb.setText("");
            DobTb.setText("");
            EducationTb.setSelectedIndex(-1);
            AddressTa.setText("");
            OccupationTb.setText("");
            PhoneTb.setText("");
            AadharTb.setText("");
            PanTb.setText("");
        }
    private void SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseClicked
                       
    if (ACCNUMTb.getText().isEmpty() || FirstNameTb.getText().isEmpty() || LastNameTb.getText().isEmpty() || DobTb.getText().isEmpty() || PanTb.getText().isEmpty() || AadharTb.getText().isEmpty() || OccupationTb.getText().isEmpty() || AddressTa.getText().isEmpty() || PhoneTb.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Missing Details");
    } else {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/atmdb", "root", "");
             PreparedStatement Add = con.prepareStatement("INSERT INTO AccountTbl VALUES(?,?,?,?,?,?,?,?,?,?,?,?)")) {
             
            Add.setInt(1, Integer.parseInt(ACCNUMTb.getText()));
            Add.setString(2, FirstNameTb.getText());
            Add.setString(3, LastNameTb.getText());
            Add.setString(4, DobTb.getText());
            Add.setString(5, GenderCb.getSelectedItem().toString());
            Add.setString(6, PhoneTb.getText());
            Add.setString(7, AddressTa.getText());
            Add.setString(8, EducationTb.getSelectedItem().toString());
            Add.setString(9, OccupationTb.getText());
            Add.setString(10, PanTb.getText());
            Add.setString(11, AadharTb.getText());
            Add.setInt(12, 0);
            int row = Add.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Account Saved Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to Save Account");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }



    
    }//GEN-LAST:event_SubmitMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       new LOGIN().setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_jLabel5MouseClicked

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
       new LOGIN().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_SubmitActionPerformed

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
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIGNUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ACCNUMTb;
    private javax.swing.JLabel AadharNum;
    private javax.swing.JTextField AadharTb;
    private javax.swing.JLabel AccNum;
    private javax.swing.JLabel Address;
    private javax.swing.JTextArea AddressTa;
    private javax.swing.JLabel Dob;
    private javax.swing.JTextField DobTb;
    private javax.swing.JLabel Education;
    private javax.swing.JComboBox<String> EducationTb;
    private javax.swing.JLabel FirstName;
    private javax.swing.JTextField FirstNameTb;
    private javax.swing.JLabel Gender;
    private javax.swing.JComboBox<String> GenderCb;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameTb;
    private javax.swing.JLabel Occupation;
    private javax.swing.JTextField OccupationTb;
    private javax.swing.JLabel PanNum;
    private javax.swing.JTextField PanTb;
    private javax.swing.JLabel Phone;
    private javax.swing.JTextField PhoneTb;
    private javax.swing.JButton Submit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}