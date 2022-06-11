package finalproject;

import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

public class AdminLogin extends javax.swing.JFrame {

   
    public AdminLogin() {
        initComponents();
    }
public static String Hashing(String raw){

        System.out.println(DigestUtils.md5Hex(raw));
        
        return DigestUtils.md5Hex(raw);
      }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        passT = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 80, 20));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        userT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTActionPerformed(evt);
            }
        });
        getContentPane().add(userT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 130, -1));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        passT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTActionPerformed(evt);
            }
        });
        getContentPane().add(passT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Admin Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sc111.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        backend info = new backend();
          
		String username = userT.getText();
		String password = passT.getText();
		backend SG = new backend();
                String hashedCheck=Hashing(passT.getText());/////
                String UseR = SG.getAdmName();
                String PswD = SG.getPswd();
                
                      if(UseR.equals(username) && PswD.equals(hashedCheck)) {
		   	
                        AdminLogin.this.dispose();
		   	
                        admingui window = new admingui();
			window.mainframeadmin.setVisible(true);
                        
                       // new admingui.setvisible(true);
	    	
		   	}
		   	else if(username=="" && password=="") {
		   		    	
		   		  JOptionPane.showMessageDialog(null, "Please enter a value ");
                                    }
                             else {
		   		    JOptionPane.showMessageDialog(null, "The username/passowrd are invalid");
                                                userT.setText("");
						passT.setText("");
		   		    }
    
                      
		
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTActionPerformed

    private void passTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTActionPerformed


    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passT;
    private javax.swing.JTextField userT;
    // End of variables declaration//GEN-END:variables
}
