
package finalproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MainLogin extends javax.swing.JFrame {

    public MainLogin() {
        initComponents();
        String username123 = usernameT.getText();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordT = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym Managment System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordT.setBackground(new java.awt.Color(102, 102, 102));
        passwordT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTActionPerformed(evt);
            }
        });
        getContentPane().add(passwordT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 110, 30));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Admin Login");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/businessman_80px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        usernameT.setBackground(new java.awt.Color(102, 102, 102));
        usernameT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        usernameT.setForeground(new java.awt.Color(204, 204, 204));
        usernameT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTFocusLost(evt);
            }
        });
        usernameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTActionPerformed(evt);
            }
        });
        getContentPane().add(usernameT, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 110, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Welcome to the gym");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ezgif.com-gif-maker.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        MainLogin.this.dispose();
	AdminLogin window = new AdminLogin();
        window.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        try{
            Connection conn = null;
            conn = DBconnector.connect();  
                
            String username = usernameT.getText();
            String password = passwordT.getText();
		
            ResultSet rs = null;
            String sql = "SELECT * from `members` where Username='"+username+"'and Password='"+password+"' ";
            PreparedStatement pst = conn.prepareStatement(sql);
		
            rs = pst.executeQuery(sql);

            if(rs.next()) {
                       
                MainLogin.this.dispose();
		new members().setVisible(true);    
		}
            
            else if(username=="" && password=="") {
		   		    	
                    JOptionPane.showMessageDialog(null, "Please enter a value ");
                }
            
            else {
		JOptionPane.showMessageDialog(null, "The username/passowrd are invalid");
		usernameT.setText("");
                passwordT.setText("");
                }
    
            } 
        
	catch(Exception z ) {
            System.out.println("the error was" + z.getMessage());
        }
        

        
    }//GEN-LAST:event_jButton1ActionPerformed
 


    private void passwordTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTActionPerformed

    private void usernameTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTActionPerformed

    private void usernameTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTFocusLost
        try {
            Connection con = null;
            con = connectionDB.connect();  
            String username = usernameT.getText();
            String q = "INSERT INTO `extra` (`Username`) VALUES ('"+usernameT.getText()+"')"; 
            
            PreparedStatement pst = con.prepareStatement(q);
            pst.execute();            
            }
        
        catch(Exception e1){
            JOptionPane.showMessageDialog(null, "Data not inserted");
            System.out.println("The error was: "+e1);
            }       
        
    }//GEN-LAST:event_usernameTFocusLost


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
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField passwordT;
    public javax.swing.JTextField usernameT;
    // End of variables declaration//GEN-END:variables
}
