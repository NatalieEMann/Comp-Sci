// package APCompSci.Assignments.Assign2;

// /*
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
//  */
// public class CalcFrame extends javax.swing.JFrame {
//     int InputX = 0;
//     int InputY = 0;
//     /**
//      * Creates new form CalcFrame
//      */
//     public CalcFrame() {
//         initComponents();
//     }
//     /**
//      * This method is called from within the constructor to initialize the form.
//      * WARNING: Do NOT modify this code. The content of this method is always
//      * regenerated by the Form Editor.
//      */
//     @SuppressWarnings("unchecked")
//     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//     private void initComponents() {

//         jTitle = new javax.swing.JLabel();
//         jInput2 = new javax.swing.JTextField();
//         jText2 = new javax.swing.JTextField();
//         jText1 = new javax.swing.JTextField();
//         jInput1 = new javax.swing.JTextField();
//         jPanelBack = new javax.swing.JPanel();
//         jClearBut = new javax.swing.JButton();
//         jPlusBut = new javax.swing.JButton();
//         jSubBut = new javax.swing.JButton();
//         jMulBut = new javax.swing.JButton();
//         jDivBut = new javax.swing.JButton();
//         jTextA = new javax.swing.JTextField();
//         jAns = new javax.swing.JTextField();

//         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//         setPreferredSize(new java.awt.Dimension(500, 550));
//         getContentPane().setLayout(null);

//         jTitle.setFont(new java.awt.Font("Lucida Fax", 0, 48)); // NOI18N
//         jTitle.setText("Calculator");
//         jTitle.setPreferredSize(new java.awt.Dimension(250, 50));
//         getContentPane().add(jTitle);
//         jTitle.setBounds(125, 20, 250, 50);

//         jInput2.setFont(new java.awt.Font("Lucida Fax", 0, 48)); // NOI18N
//         jInput2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
//         jInput2.setBorder(javax.swing.BorderFactory.createLineBorder(null));
//         jInput2.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 jInput2ActionPerformed(evt);
//             }
//         });
//         getContentPane().add(jInput2);
//         jInput2.setBounds(95, 170, 390, 65);

//         jText2.setEditable(false);
//         jText2.setBackground(new java.awt.Color(153, 153, 153));
//         jText2.setFont(new java.awt.Font("Lucida Fax", 0, 13)); // NOI18N
//         jText2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
//         jText2.setText("Input 2");
//         jText2.setBorder(javax.swing.BorderFactory.createLineBorder(null));
//         getContentPane().add(jText2);
//         jText2.setBounds(15, 170, 65, 65);

//         jText1.setEditable(false);
//         jText1.setBackground(new java.awt.Color(153, 153, 153));
//         jText1.setFont(new java.awt.Font("Lucida Fax", 0, 13)); // NOI18N
//         jText1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
//         jText1.setText("Input 1");
//         jText1.setBorder(javax.swing.BorderFactory.createLineBorder(null));
//         getContentPane().add(jText1);
//         jText1.setBounds(15, 90, 65, 65);

//         jInput1.setFont(new java.awt.Font("Lucida Fax", 0, 48)); // NOI18N
//         jInput1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
//         jInput1.setBorder(javax.swing.BorderFactory.createLineBorder(null));
//         getContentPane().add(jInput1);
//         jInput1.setBounds(95, 90, 390, 65);

//         jPanelBack.setBackground(new java.awt.Color(153, 153, 153));
//         jPanelBack.setBorder(javax.swing.BorderFactory.createBevelBorder(null));

//         jClearBut.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
//         jClearBut.setText("Clear");
//         jClearBut.setBorder(javax.swing.BorderFactory.createBevelBorder(null));
//         jClearBut.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 jClearButActionPerformed(evt);
//             }
//         });

//         jPlusBut.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
//         jPlusBut.setText("+");
//         jPlusBut.setBorder(javax.swing.BorderFactory.createBevelBorder(null));

//         jSubBut.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
//         jSubBut.setText("-");
//         jSubBut.setBorder(javax.swing.BorderFactory.createBevelBorder(null));

//         jMulBut.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
//         jMulBut.setText("*");
//         jMulBut.setBorder(javax.swing.BorderFactory.createBevelBorder(null));

//         jDivBut.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
//         jDivBut.setText("/");
//         jDivBut.setBorder(javax.swing.BorderFactory.createBevelBorder(null));

//         jTextA.setFont(new java.awt.Font("Lucida Fax", 0, 20)); // NOI18N
//         jTextA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
//         jTextA.setText("Answer");
//         jTextA.setBorder(javax.swing.BorderFactory.createLineBorder(null));

//         jAns.setFont(new java.awt.Font("Lucida Fax", 0, 48)); // NOI18N
//         jAns.setHorizontalAlignment(javax.swing.JTextField.LEFT);
//         jAns.setBorder(javax.swing.BorderFactory.createLineBorder(null));

//         javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
//         jPanelBack.setLayout(jPanelBackLayout);
//         jPanelBackLayout.setHorizontalGroup(
//             jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(jPanelBackLayout.createSequentialGroup()
//                 .addGap(15, 15, 15)
//                 .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackLayout.createSequentialGroup()
//                         .addComponent(jTextA, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
//                         .addGap(15, 15, 15)
//                         .addComponent(jAns, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
//                     .addComponent(jClearBut, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
//                     .addGroup(jPanelBackLayout.createSequentialGroup()
//                         .addComponent(jPlusBut, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
//                         .addGap(15, 15, 15)
//                         .addComponent(jSubBut, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
//                         .addGap(18, 18, 18)
//                         .addComponent(jMulBut, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
//                         .addGap(15, 15, 15)
//                         .addComponent(jDivBut, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                 .addGap(15, 15, 15))
//         );
//         jPanelBackLayout.setVerticalGroup(
//             jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(jPanelBackLayout.createSequentialGroup()
//                 .addGap(15, 15, 15)
//                 .addComponent(jClearBut, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(15, 15, 15)
//                 .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                     .addComponent(jPlusBut, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
//                     .addComponent(jSubBut, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
//                     .addComponent(jMulBut, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
//                     .addComponent(jDivBut, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
//                 .addGap(15, 15, 15)
//                 .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                     .addComponent(jTextA, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
//                     .addComponent(jAns))
//                 .addGap(15, 15, 15))
//         );

//         getContentPane().add(jPanelBack);
//         jPanelBack.setBounds(15, 250, 470, 285);

//         pack();
//     }// </editor-fold>//GEN-END:initComponents

//     private void jInput1ActionPerformed(java.awt.event.ActionEvent evt) {
        
//     }
//     private void jInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInput2ActionPerformed
        
//     }//GEN-LAST:event_jInput2ActionPerformed

//     private void jClearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearButActionPerformed
//     }//GEN-LAST:event_jClearButActionPerformed

//     /**
//      * @param args the command line arguments
//      */
//     public static void main(String args[]) {
//         /* Set the Nimbus look and feel */
//         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//         /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//          * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//          */
//         try {
//             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException ex) {
//             java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (InstantiationException ex) {
//             java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (IllegalAccessException ex) {
//             java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }
//         //</editor-fold>

//         /* Create and display the form */
//         java.awt.EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 new CalcFrame().setVisible(true);
//             }
//         });
//     }

//     // Variables declaration - do not modify//GEN-BEGIN:variables
//     private javax.swing.JTextField jAns;
//     private javax.swing.JButton jClearBut;
//     private javax.swing.JButton jDivBut;
//     private javax.swing.JTextField jInput1;
//     private javax.swing.JTextField jInput2;
//     private javax.swing.JButton jMulBut;
//     private javax.swing.JPanel jPanelBack;
//     private javax.swing.JButton jPlusBut;
//     private javax.swing.JButton jSubBut;
//     private javax.swing.JTextField jText1;
//     private javax.swing.JTextField jText2;
//     private javax.swing.JTextField jTextA;
//     private javax.swing.JLabel jTitle;
//     // End of variables declaration//GEN-END:variables
// }
