/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Administration.UI;

/**
 *
 * @author Gayatri
 */
public class AdministratorLoginPage extends javax.swing.JPanel {

    /**
     * Creates new form admin
     */
    public AdministratorLoginPage() {
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

        txtusername = new javax.swing.JTextField();
        lbl_username = new javax.swing.JLabel();
        lbl_Hosptitle = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lbl_pswd = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 236, 197, -1));

        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_username.setText("Username:");
        add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        lbl_Hosptitle.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl_Hosptitle.setText("Administration");
        add(lbl_Hosptitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 230, 40));

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 302, 197, -1));

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pswd.setText("Password:");
        add(lbl_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 276, -1, -1));

        btn_login.setBackground(new java.awt.Color(0, 204, 204));
        btn_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 366, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin.v1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
//        if (txtUsername.getText().toString().equals("Admin") && txtPassword.getText().toString().equals("Admin")) {
//            AdministrationSplitPage ap = new AdministrationSplitPage(mainScreen, dB4OUtil, ecoSystem);
//
//            mainScreen.setContentPane(ap);
//            mainScreen.invalidate();
//            mainScreen.validate();
//            return;
//        } else {
//            JOptionPane.showMessageDialog(this, "Incorrect credential");
//        }

        String username = txtusername.getText();
        String password = txtpassword.getText();
         if(username.equals("admin") && password.equals("admin"))
        {
            AdministratorSplitPage pjf =  new AdministratorSplitPage();
            pjf.show();
            
            
        }
        
        
          
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_Hosptitle;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
