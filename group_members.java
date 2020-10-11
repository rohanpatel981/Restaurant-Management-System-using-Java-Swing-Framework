import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class group_members extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					group_members frame = new group_members();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public group_members() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(213, 44, 25, 394);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(423, 44, 25, 394);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(636, 44, 25, 394);
		contentPane.add(separator_2);
		
		JTextArea txtrNameRohanPatel = new JTextArea();
		txtrNameRohanPatel.setEditable(false);
		txtrNameRohanPatel.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		txtrNameRohanPatel.setText("Name: Rohan Patel\r\nRoll no.: 57\r\nClass : SE- CMPN 01 \r\nBatch : G-3");
		txtrNameRohanPatel.setBounds(10, 250, 193, 147);
		contentPane.add(txtrNameRohanPatel);
		
		JTextArea txtrNameMahendraPatel = new JTextArea();
		txtrNameMahendraPatel.setEditable(false);
		txtrNameMahendraPatel.setText("Name: Mahendra\r\nPatel\r\nRoll no.: 56\r\nClass : SE- CMPN 01 \r\nBatch : G-3");
		txtrNameMahendraPatel.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		txtrNameMahendraPatel.setBounds(220, 250, 193, 147);
		contentPane.add(txtrNameMahendraPatel);
		
		JTextArea txtrNamePranavKharde = new JTextArea();
		txtrNamePranavKharde.setEditable(false);
		txtrNamePranavKharde.setText("Name: Pranav \r\nKharde\r\nRoll no.: 57\r\nClass : SE- CMPN 01 \r\nBatch : G-3");
		txtrNamePranavKharde.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		txtrNamePranavKharde.setBounds(433, 250, 193, 147);
		contentPane.add(txtrNamePranavKharde);
		
		JTextArea txtrNameReeyaNand = new JTextArea();
		txtrNameReeyaNand.setEditable(false);
		txtrNameReeyaNand.setText("Name: Reeya Nand\r\nRoll no.: 48\r\nClass : SE- CMPN 01 \r\nBatch : G-3");
		txtrNameReeyaNand.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 18));
		txtrNameReeyaNand.setBounds(641, 250, 183, 147);
		contentPane.add(txtrNameReeyaNand);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("rohan1.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 44, 193, 195);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("mahi1.png")).getImage();
		label.setIcon(new ImageIcon(img1));
		label.setBounds(220, 44, 193, 195);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("pranav.PNG")).getImage();
		label_1.setIcon(new ImageIcon(img3));
		label_1.setBounds(433, 44, 193, 195);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("reeya.PNG")).getImage();
		label_2.setIcon(new ImageIcon(img4));
		label_2.setBounds(641, 44, 183, 195);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			/*	Login_System r=new Login_System();
				Login_System.main(null);  */
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(685, 11, 127, 26);
		contentPane.add(btnNewButton);
	}
}
