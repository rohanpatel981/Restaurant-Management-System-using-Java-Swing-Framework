import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.awt.Color;

public class Login_System {

	private JFrame frmJavaMiniproject;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JFrame fromLoginSystem;

	/**
	 * Launch the application...
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_System window = new Login_System();
					window.frmJavaMiniproject.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_System() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaMiniproject = new JFrame();
		frmJavaMiniproject.setTitle("JAVA MINI-PROJECT");
		frmJavaMiniproject.getContentPane().setBackground(new Color(70, 130, 180));
		frmJavaMiniproject.setBounds(0, 0, 1366, 768);
		frmJavaMiniproject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaMiniproject.getContentPane().setLayout(null);
		
		JLabel lblLoginSystem = new JLabel("RMRP FOOD CORNER");
		lblLoginSystem.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLoginSystem.setBounds(537, 11, 295, 35);
		frmJavaMiniproject.getContentPane().add(lblLoginSystem);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(1045, 174, 189, 21);
		frmJavaMiniproject.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PASSWORD :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(894, 209, 120, 26);
		frmJavaMiniproject.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("USERNAME :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsername.setBounds(894, 174, 120, 20);
		frmJavaMiniproject.getContentPane().add(lblUsername);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(1045, 212, 189, 21);
		frmJavaMiniproject.getContentPane().add(txtPassword);
		
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username= txtUsername.getText();
				String password= txtPassword.getText();
				
				if(password.contains("raosaheb") && username.contains("pranav") || password.contains("rohan") && username.contains("rohan") || password.contains("mahi") && username.contains("mahendra") || password.contains("shooter") && username.contains("reeya")) {
					JOptionPane.showMessageDialog(null, "Logged in successfully.");
					
					// to start next page..
					Menu_Frame one= new Menu_Frame();
					Menu_Frame.main(null);			
					//fromLoginSystem.setVisible(false);
				
				}
				else
					if(username.isEmpty() || password.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please enter username and password.","Login Error",JOptionPane.ERROR_MESSAGE);
					}
				else {
					JOptionPane.showMessageDialog(null, "Invalid login details","Login Error",JOptionPane.ERROR_MESSAGE);
				}
					
				
			}
		});
		btnLogin.setBounds(1200, 257, 127, 26);
		frmJavaMiniproject.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(918, 257, 127, 26);
		frmJavaMiniproject.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fromLoginSystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(fromLoginSystem, "Do you really want to exit ?","Login System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnExit.setBounds(1200, 25, 127, 26);
		frmJavaMiniproject.getContentPane().add(btnExit);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(806, 88, 26, 591);
		frmJavaMiniproject.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(29, 57, 1299, 26);
		frmJavaMiniproject.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		//lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Rohan\\Desktop\\01.jpg"));
		Image img=new ImageIcon(this.getClass().getResource("01.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(148, 226, 521, 389);
		frmJavaMiniproject.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(894, 324, 395, 2);
		frmJavaMiniproject.getContentPane().add(separator_3);
		
		JTextArea txtrpullUpA = new JTextArea();
		txtrpullUpA.setEditable(false);
		txtrpullUpA.setBackground(new Color(173, 216, 230));
		txtrpullUpA.setForeground(Color.RED);
		txtrpullUpA.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 17));
		txtrpullUpA.setText("\u201CPull up a chair. Take a taste. Come join us. Life is so endlessly delicious.\u201D ");
		txtrpullUpA.setBounds(98, 148, 646, 28);
		frmJavaMiniproject.getContentPane().add(txtrpullUpA);
		
		JLabel lblNewLabel_membership = new JLabel("Only for paid members. Contact the desk for the same !");
		lblNewLabel_membership.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_membership.setBounds(829, 88, 498, 46);
		frmJavaMiniproject.getContentPane().add(lblNewLabel_membership);
		
		JTextArea txtrTheProjectHave = new JTextArea();
		txtrTheProjectHave.setEditable(false);
		txtrTheProjectHave.setText("The project has been made by the following group\r\nmembers :\r\nPlease click the button below to view more about group\r\nmembers :\r\n");
		txtrTheProjectHave.setForeground(Color.RED);
		txtrTheProjectHave.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 17));
		txtrTheProjectHave.setBackground(new Color(173, 216, 230));
		txtrTheProjectHave.setBounds(842, 379, 485, 108);
		frmJavaMiniproject.getContentPane().add(txtrTheProjectHave);
		
		JButton btnNewButtonClickHere = new JButton("Click here");
		btnNewButtonClickHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				group_members a=new group_members();
				group_members.main(null);
				
				
			}
		});
		btnNewButtonClickHere.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButtonClickHere.setBounds(1030, 549, 127, 26);
		frmJavaMiniproject.getContentPane().add(btnNewButtonClickHere);
		
		JLabel lblNewLabel_2 = new JLabel("Since 1998");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(306, 74, 189, 49);
		frmJavaMiniproject.getContentPane().add(lblNewLabel_2);
	}
}
