package finalproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Desktop;
import java.net.URL;

import javax.swing.JScrollPane;
public class admingui {

	public JFrame mainframeadmin;
	private JTextField txtName;
	private JTextField txtDate;
	private JTextField txtExp;
	private JTable tabela;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTable table_1;
	private JTextField textField_5;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					admingui window = new admingui();
					window.mainframeadmin.setVisible(true);
			
			}
		});
	}

public admingui() {
		initialize();
}
/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		mainframeadmin = new JFrame();
		mainframeadmin.setTitle("Admin Welcome");
		mainframeadmin.getContentPane().setBackground(new Color(255, 255, 255));
		mainframeadmin.setBounds(100, 100, 1078, 744);
		mainframeadmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBackground(new Color(153, 0, 0));
		
		JPanel mainCardPanel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(mainframeadmin.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(buttonsPanel, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(mainCardPanel, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(buttonsPanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
				.addComponent(mainCardPanel, GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
		);
		mainCardPanel.setLayout(new CardLayout(0, 0));
		
		JPanel mainpic = new JPanel();
		mainpic.setBackground(new Color(0, 0, 0));
		mainCardPanel.add(mainpic, "name_29326132299400");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(admingui.class.getResource("/resources/welcomadmin.png")));
		GroupLayout gl_mainpic = new GroupLayout(mainpic);
		gl_mainpic.setHorizontalGroup(
			gl_mainpic.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_mainpic.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 777, Short.MAX_VALUE)
					.addGap(0))
		);
		gl_mainpic.setVerticalGroup(
			gl_mainpic.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_mainpic.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
					.addContainerGap())
		);
		mainpic.setLayout(gl_mainpic);
		
		JPanel costumers = new JPanel();
		costumers.setBackground(new Color(0, 0, 0));
		mainCardPanel.add(costumers, "name_29329669265900");
		costumers.setLayout(null);
		
		JButton btnNewButton_11 = new JButton(";)");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=dQw4w9WgXcQ").toURI());
			    } catch (Exception e1) {
			        e1.printStackTrace();
			    }
			}
		});
		btnNewButton_11.setBounds(713, 671, 41, 23);
		costumers.add(btnNewButton_11);
		
		JLabel lblNewLabel_1 = new JLabel("Costumers List");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 35));
		lblNewLabel_1.setBounds(262, 11, 375, 49);
		costumers.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 67, 65, 34);
		costumers.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Date Started:");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(10, 112, 125, 34);
		costumers.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Date Expiring:");
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(10, 161, 125, 34);
		costumers.add(lblNewLabel_2_1_1);
		
		txtName = new JTextField();
		txtName.setBounds(140, 70, 184, 34);
		costumers.add(txtName);
		txtName.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(140, 112, 184, 34);
		costumers.add(txtDate);
		
		txtExp = new JTextField();
		txtExp.setColumns(10);
		txtExp.setBounds(140, 161, 184, 34);
		costumers.add(txtExp);
		
		JButton btnNewButton_1 = new JButton("Insert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtName.getText();
	      	    String dateStart = txtDate.getText();
	            String dateExpired = txtExp.getText();
	            
	              try{
                          
                         
                          
		        	Connection con = null;
		   		    con = connectionDB.connect();  

		            }//end of try
		            
		            
		            catch(Exception e1){
		            JOptionPane.showMessageDialog(null, "Db error");
		                System.out.println("The error was: "+e1);
		            }//end of catch
	           
	        
	             try {
		        	Connection con = null;
		   		    con = connectionDB.connect();  

		           String q = "INSERT INTO `gym_clients` (`Name`, `Date Joined`, `Expiration`) VALUES ('"+name+"','"+dateStart+"','"+dateExpired+"')"; 
		           PreparedStatement pst = con.prepareStatement(q);
		           
		            
		            pst.execute();
		            
		            }//end of try
		            
		            
		            catch(Exception e1){
		            JOptionPane.showMessageDialog(null, "Data not inserted");
		                System.out.println("The error was: "+e1);
		            }//end of catch
                     
                         try {
		        Connection con = null;
		   	con = connectionDB.connect();  

		           String q = "INSERT INTO `members` (`Name`, `Date Joined`, `Expiration`) VALUES ('"+name+"','"+dateStart+"','"+dateExpired+"')"; 
		           PreparedStatement pst = con.prepareStatement(q);
		           
		            
		            pst.execute();
		            
		            }//end of try
		            
		            
		            catch(Exception e1){
		            JOptionPane.showMessageDialog(null, "Data not inserted");
		                System.out.println("The error was: "+e1);
		            }//end of catch                               
                   
                     
                        }
	            
	            
	        
                       
                        
				
	            
			});
		btnNewButton_1.setBounds(392, 71, 125, 34);
		costumers.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtName.setText("");
				txtDate.setText("");
				txtExp.setText("");

				
				
			}
		});
		btnNewButton_2.setBounds(560, 71, 125, 34);
		costumers.add(btnNewButton_2);
		
		
		
                
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				 try {
			        	Connection con = null;
			   		    con = connectionDB.connect();  

			          //  String name = txtName.getText();

			           String q = "DELETE FROM gym_clients WHERE Name='"+name+"'"; 
			           PreparedStatement pst = con.prepareStatement(q);
			            
			            pst.execute();
			            
			            }//end of try
			            
			            
			            catch(Exception e1){
			            JOptionPane.showMessageDialog(null, "Data not deleted");
			                System.out.println("The error was: "+e1);
			            }//end of catch
                                 
                                 try {
			        	Connection con = null;
			   		    con = connectionDB.connect();  

			          //  String name = txtName.getText();

			           String q = "DELETE FROM members WHERE Name='"+name+"'"; 
			           PreparedStatement pst = con.prepareStatement(q);
			            
			            pst.execute();
			            
			            }//end of try
			            
			            
			            catch(Exception e1){
			            JOptionPane.showMessageDialog(null, "Data not deleted");
			                System.out.println("The error was: "+e1);
			            }//end of catch
                        }});

		btnNewButton_4.setBounds(560, 133, 125, 34);
		costumers.add(btnNewButton_4);
		
		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(10, 253, 744, 223);
		costumers.add(scrollPane);
		
		
		
		
		tabela = new JTable();
		tabela.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				 "Name", "Date Started", "Date Expiring"
			}
		));
		scrollPane.setViewportView(tabela);
		
		tabela.getColumnModel().getColumn(0).setPreferredWidth(74);
		scrollPane.setViewportView(tabela);
	   
		try {
	        	Connection con = null;
	   		    con = connectionDB.connect();  
	   		    ResultSet rs = null;
	       
	   		    String q = "select * from gym_clients"; 
	            PreparedStatement pst = con.prepareStatement(q);
	            rs = pst.executeQuery(q);
	            while(rs.next()) {
	            	
	            	String Name = rs.getString("Name");
	            	String DateStarted = rs.getString("Date Joined");
	            	String DateExpiring = rs.getString("Expiration");
	            
	            	
	            	String table[] = {Name , DateStarted , DateExpiring };
	            	DefaultTableModel tblModel = (DefaultTableModel)tabela.getModel();
	            	tblModel.addRow(table);
	            	
	            }

	            }//end of try
	            
	            
	            catch(Exception e1){
	            JOptionPane.showMessageDialog(null, "Error :/");
	                System.out.println("The error was: "+e1);
	            }//end of catch
		
		JButton btnNewButton_3 = new JButton("Refresh Table");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				DefaultTableModel tblMode2 = (DefaultTableModel)tabela.getModel();
				tblMode2.setRowCount(0);
				try {
		        	Connection con = null;
		   		    con = connectionDB.connect();  
		   		    ResultSet rs = null;
		       
		   		    String q = "select * from gym_clients"; 
		            PreparedStatement pst = con.prepareStatement(q);
		            rs = pst.executeQuery(q);
		            while(rs.next()) {
		            	
		            	String Name = rs.getString("Name");
		            	String DateStarted = rs.getString("Date Joined");
		            	String DateExpiring = rs.getString("Expiration");
		            
		            	
		            	
		            	String table[] = {Name , DateStarted , DateExpiring };
		            	DefaultTableModel tblModel = (DefaultTableModel)tabela.getModel();
		            	tblModel.addRow(table);
		            	
		            }
		            
		            
		            }//end of try
		            
		            
		            catch(Exception e1){
		            JOptionPane.showMessageDialog(null, "Error :/");
		                System.out.println("The error was: "+e1);
		            }//end of catch
				
	
			}
		});
		btnNewButton_3.setBounds(394, 133, 123, 34);
		costumers.add(btnNewButton_3);
	
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(admingui.class.getResource("/resources/wallpaperflare.com_wallpaper.jpg")));
		lblNewLabel_6.setBounds(10, 436, 744, 297);
		costumers.add(lblNewLabel_6);
		
		JPanel createAccount = new JPanel();
		createAccount.setBackground(new Color(0, 0, 0));
		mainCardPanel.add(createAccount, "name_29336224913100");
		createAccount.setLayout(null);
		
		JButton btnNewButton_9_1 = new JButton("");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel tblMode2 = (DefaultTableModel)table_1.getModel();
				tblMode2.setRowCount(0);
				try {
		        	Connection con = null;
		   		    con = connectionDB.connect();  
		   		    ResultSet rs = null;
		       
		   		    String q = "select * from credentials"; 
		            PreparedStatement pst = con.prepareStatement(q);
		            rs = pst.executeQuery(q);
		            while(rs.next()) {
		            	
		            	String username = rs.getString("Username");
		            	String password = rs.getString("Password");
		            	
		            	
		            	
		            	String table[] = {username , password  };
		            	DefaultTableModel tblModel = (DefaultTableModel)table_1.getModel();
		            	tblModel.addRow(table);
		            	
		            }
		            
		            
		            }//end of try
		            
		            
		            catch(Exception e1){
		            JOptionPane.showMessageDialog(null, "Error :/");
		                System.out.println("The error was: "+e1);
		            }//end of catch
				
				
			}
		});
		
		JButton btnNewButton_12 = new JButton("Reset");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				txtUsername.setText("");
				txtPassword.setText("");
				
			}
		});
		btnNewButton_12.setBounds(392, 69, 98, 33);
		createAccount.add(btnNewButton_12);
		btnNewButton_9_1.setIcon(new ImageIcon(admingui.class.getResource("/resources/refresh_32px.png")));
		
		btnNewButton_9_1.setBounds(707, 243, 30, 33);
		createAccount.add(btnNewButton_9_1);
		
		JLabel lblNewLabel_3 = new JLabel("Create User Account");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.ITALIC, 26));
		lblNewLabel_3.setBounds(250, 11, 443, 47);
		createAccount.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Username:");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(10, 68, 138, 47);
		createAccount.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Password:");
		lblNewLabel_4_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4_1.setBounds(10, 139, 138, 47);
		createAccount.add(lblNewLabel_4_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(126, 68, 227, 38);
		createAccount.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(126, 139, 227, 38);
		createAccount.add(txtPassword);
		
		JButton btnNewButton_5 = new JButton("Create Account");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name = txtName.getText();	
			
	            
	        
	             try {
		        	Connection con = null;
		   		    con = connectionDB.connect();  

                            String username = txtUsername.getText();
		      	    String password = txtPassword.getText();
                            
		             String q = "INSERT INTO `credentials` (`Username`, `Password`) VALUES ('"+username+"','"+password+"')"; 
		           PreparedStatement pst = con.prepareStatement(q);
		            pst.execute();
		            
		            }//end of try
		            
		            
		            catch(Exception e1){
		            JOptionPane.showMessageDialog(null, "Data not inserted");
		                System.out.println("The error was: "+e1);
		            }//end of catch
                     try {
		        	Connection con = null;
		   		    con = connectionDB.connect();  

                            String username = txtUsername.getText();
		      	    String password = txtPassword.getText();
                            
                           
		          String q = "UPDATE members SET Username='"+username+"' ,Password='"+password+"' WHERE Name='"+name+"' "; //
                          
		           PreparedStatement pst = con.prepareStatement(q);
		            pst.execute();
		            
		            }//end of try
		            
		            
		            catch(Exception e1){
		            JOptionPane.showMessageDialog(null, "Data not inserted");
		                System.out.println("The error was: "+e1);
		            }//end of catch
                     

                     
	            }
	            
	       		
				
				
			
		});
		btnNewButton_5.setBounds(202, 197, 151, 33);
		createAccount.add(btnNewButton_5);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(38, 275, 699, 296);
		createAccount.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Username", "Password"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton_6 = new JButton("Delete Account");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				 try {
			        	Connection con = null;
			   		    con = connectionDB.connect();  
			   
			            String name = txtUsername.getText();
			            String password = txtPassword.getText();
			      

			           String q = "DELETE FROM credentials WHERE Username='"+name+"' and Password='"+password+"'  "; 
			           PreparedStatement pst = con.prepareStatement(q);
			           
			            
			            pst.execute();
			            
			            }//end of try
			            
			            
			            catch(Exception e1){
			            JOptionPane.showMessageDialog(null, "Data not deleted");
			                System.out.println("The error was: "+e1);
			            }//end of catch
					 						
				
			}
		});
                
                
                
                JButton btnNewButton_7 = new JButton("Send");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String notification = textField_5.getText();
	      
	        
	             try {
		        	Connection con = null;
		   		    con = connectionDB.connect();  
		   
  
		            
		            
		           String q = "INSERT INTO `notifications` (`Notification`) VALUES ('"+notification+"')"; 
		           PreparedStatement pst = con.prepareStatement(q);
		           
		            
		            pst.execute();
		            
		            }//end of try
		            
		            
		            catch(Exception e1){
		            JOptionPane.showMessageDialog(null, "Data not inserted");
		                System.out.println("The error was: "+e1);
		            }//end of catch
	            }
	            		
	
		});
                table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Notifications:"
			}
		));
                
        
		btnNewButton_6.setBounds(38, 593, 144, 23);
		createAccount.add(btnNewButton_6);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon(admingui.class.getResource("/resources/wp3018849.jpg")));
		lblNewLabel_8.setBounds(0, 0, 779, 705);
		createAccount.add(lblNewLabel_8);
		
		JPanel sendNotifications = new JPanel();
		sendNotifications.setBackground(new Color(0, 0, 0));
		mainCardPanel.add(sendNotifications, "name_29454808326900");
		sendNotifications.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Notification Center");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblNewLabel_5.setBounds(252, 11, 404, 48);
		sendNotifications.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(32, 80, 712, 59);
		sendNotifications.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnSendNotifications_7 = new JButton("Send");
		btnNewButton_7.setBounds(493, 149, 251, 38);
		sendNotifications.add(btnNewButton_7);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(32, 323, 687, 217);
		sendNotifications.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Notifications:"
			}
		));
		scrollPane_2.setViewportView(table_2);
                scrollPane_2.setViewportView(table_2);
		
		tabela.getColumnModel().getColumn(0).setPreferredWidth(74);
		scrollPane_2.setViewportView(table_2);
	   
		try {
	        	Connection con = null;
	   		    con = connectionDB.connect();  
	   		    ResultSet rs = null;
	       
	   		    String q = "select * from notifications"; 
	            PreparedStatement pst = con.prepareStatement(q);
	            rs = pst.executeQuery(q);
	            while(rs.next()) {
	            	
	            	String Notif = rs.getString("Notification");
	            	
	            
	            	
	            	
	            	String table[] = {Notif };
	            	DefaultTableModel tblModel = (DefaultTableModel)table_2.getModel();
	            	tblModel.addRow(table);
	            	
	            }
	            
	            
	          
	            
	            
	            }//end of try
	            
	            
	            catch(Exception e1){
	            JOptionPane.showMessageDialog(null, "Error :/");
	                System.out.println("The error was: "+e1);
	            }//end of catch
		
		//JButton btnNewButton_8 = new JButton("Delete selected notification");
		//btnNewButton_8.setBounds(464, 551, 251, 38);
		//sendNotifications.add(btnNewButton_8);
                JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DefaultTableModel tblMode3 = (DefaultTableModel)table_2.getModel();
				tblMode3.setRowCount(0);
				try {
		        	Connection con = null;
		   		    con = connectionDB.connect();  
		   		    ResultSet rs = null;
		       
		   		    String q = "select * from notifications"; 
		            PreparedStatement pst = con.prepareStatement(q);
		            rs = pst.executeQuery(q);
		            while(rs.next()) {
		            	
		            	String notification = rs.getString("Notification");
		            	
		            	
		            	
		            	
		            	String table[] = {notification};
		            	DefaultTableModel tblMode2 = (DefaultTableModel)table_2.getModel();
		            	tblMode2.addRow(table);
		            	
		            }
		            
		            
		          
		            
		            
		            }//end of try
		            
		            
		            catch(Exception e1){
		            JOptionPane.showMessageDialog(null, "Error :/");
		                System.out.println("The error was: "+e1);
		            }//end of catch
				
				
				
				
				
				
	
				
			}
		});
		
			btnNewButton_9.setOpaque(false);
			btnNewButton_9.setContentAreaFilled(false);
			btnNewButton_9.setBorderPainted(false);
		
		    btnNewButton_9.setIcon(new ImageIcon(admingui.class.getResource("/resources/refresh_32px.png")));
		    btnNewButton_9.setBounds(637, 272, 85, 48);
		    sendNotifications.add(btnNewButton_9);
		
		
		
			btnNewButton_9.setOpaque(false);
			btnNewButton_9.setContentAreaFilled(false);
			btnNewButton_9.setBorderPainted(false);
                        
		
		btnNewButton_9.setIcon(new ImageIcon(admingui.class.getResource("/resources/refresh_32px.png")));
		btnNewButton_9.setBounds(637, 272, 85, 48);
		sendNotifications.add(btnNewButton_9);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(admingui.class.getResource("/resources/wp2563942_760x700.jpg")));
		
				lblNewLabel_7.setBounds(-224, -172, 767, 705);
				sendNotifications.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("Costumers");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNewButton.setIcon(new ImageIcon(admingui.class.getResource("/resources/son_goku_32px.png")));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				costumers.setVisible(true);
				sendNotifications.setVisible(false);
				createAccount.setVisible(false);
				mainpic.setVisible(false);
				
				
			}
		});
		
		JButton btnCreateUserAccount = new JButton("User Accounts");
		btnCreateUserAccount.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnCreateUserAccount.setIcon(new ImageIcon(admingui.class.getResource("/resources/icons8_my_computer_50px_1.png")));
		
		
		btnCreateUserAccount.setForeground(Color.WHITE);
		btnCreateUserAccount.setBackground(Color.BLACK);
		btnCreateUserAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				costumers.setVisible(false);
				sendNotifications.setVisible(false);
				createAccount.setVisible(true);
				mainpic.setVisible(false);
			
			}
		});
		
		JButton btnSendNotifications = new JButton("Send Notifications");
		btnSendNotifications.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnSendNotifications.setIcon(new ImageIcon(admingui.class.getResource("/resources/icons8_sms_30px.png")));
	
		btnSendNotifications.setForeground(Color.WHITE);
		btnSendNotifications.setBackground(Color.BLACK);
		btnSendNotifications.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				costumers.setVisible(false);
				sendNotifications.setVisible(true);
				createAccount.setVisible(false);
				mainpic.setVisible(false);
			}
		});
		
		JButton btnNewButton_10 = new JButton("LogOut");
		btnNewButton_10.setForeground(new Color(255, 255, 255));
		btnNewButton_10.setBackground(new Color(0, 0, 0));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainframeadmin.dispose();
                                MainLogin window = new MainLogin();
                                window.setVisible(true);
			}
		});
		GroupLayout gl_buttonsPanel = new GroupLayout(buttonsPanel);
		gl_buttonsPanel.setHorizontalGroup(
			gl_buttonsPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_buttonsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_10))
				.addComponent(btnSendNotifications, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
				.addComponent(btnCreateUserAccount, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
				.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
		);
		gl_buttonsPanel.setVerticalGroup(
			gl_buttonsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_buttonsPanel.createSequentialGroup()
					.addGap(133)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
					.addGap(130)
					.addComponent(btnCreateUserAccount, GroupLayout.PREFERRED_SIZE, 58, Short.MAX_VALUE)
					.addGap(122)
					.addComponent(btnSendNotifications, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
					.addGap(87)
					.addComponent(btnNewButton_10)
					.addGap(35))
		);
		buttonsPanel.setLayout(gl_buttonsPanel);
		mainframeadmin.getContentPane().setLayout(groupLayout);
		
		
                        
                
                }}

	