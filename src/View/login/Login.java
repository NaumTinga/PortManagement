/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.login;

/**
 *
 * @author dalto
 */
public class Login extends javax.swing.JFrame 
{

  /**
   * Creates new form loginFrame
   */
  public Login() 
  {
    initComponents();
    setExtendedState(MAXIMIZED_BOTH);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    leftPanel = new javax.swing.JPanel();
    rightPanel = new javax.swing.JPanel();
    jPanel1 = new javax.swing.JPanel();
    txtUserName = new javax.swing.JTextField();
    txtPasswoard = new javax.swing.JPasswordField();
    jButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

    leftPanel.setBackground(new java.awt.Color(38, 86, 186));
    leftPanel.setVerifyInputWhenFocusTarget(false);

    javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
    leftPanel.setLayout(leftPanelLayout);
    leftPanelLayout.setHorizontalGroup(
      leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 460, Short.MAX_VALUE)
    );
    leftPanelLayout.setVerticalGroup(
      leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 540, Short.MAX_VALUE)
    );

    getContentPane().add(leftPanel);

    rightPanel.setBackground(new java.awt.Color(255, 255, 255));
    rightPanel.setLayout(new java.awt.GridBagLayout());

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    txtUserName.setBackground(java.awt.SystemColor.menu);
    txtUserName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
    txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txtUserName.setText("Username");
    txtUserName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

    txtPasswoard.setBackground(java.awt.SystemColor.menu);
    txtPasswoard.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txtPasswoard.setText("jPasswordField1");
    txtPasswoard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

    jButton1.setBackground(new java.awt.Color(38, 86, 186));
    jButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("Login");
    jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton1.setContentAreaFilled(false);
    jButton1.setFocusPainted(false);
    jButton1.setOpaque(true);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(79, 79, 79)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtPasswoard, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(93, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(26, Short.MAX_VALUE)
        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(txtPasswoard, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(23, 23, 23))
    );

    rightPanel.add(jPanel1, new java.awt.GridBagConstraints());

    getContentPane().add(rightPanel);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) 
  {
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
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new Login().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel leftPanel;
  private javax.swing.JPanel rightPanel;
  private javax.swing.JPasswordField txtPasswoard;
  private javax.swing.JTextField txtUserName;
  // End of variables declaration//GEN-END:variables
}
