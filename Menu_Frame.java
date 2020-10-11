import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Menu_Frame extends JFrame {
	
	ButtonGroup bg=new ButtonGroup();
	//veg textFields..
	private JTextField textFieldFF;
	private JTextField textField_1VS;
	private JTextField textField_2WF;
	private JTextField textField_3CB;
	private JTextField textField_4CT;
	private JTextField textField_5MS;
	private JTextField textField_6PW;
	private JTextField textField_7PK;
	private JTextField textField_8SS;
	//non-veg textFields..
	private JTextField textField_9CB;
	private JTextField textField_10CCK;
	private JTextField textField_11EN;
	private JTextField textField_12CES;
	private JTextField textField_13CMS;
	private JTextField textField_14GC;
	private JTextField textField_15CM;
	private JTextField textField_16CC;
	private JTextField textField_17C65;
	
	private JFrame fromMenu_Frame;
	private JTextField textFieldsubTotal;
	private JTextField txtRs;
	
	double priceFF=79,priceVS=99,priceWF=99,priceCB=119,priceCT=89,priceMS=99,pricePW=119,pricePK=149,priceSS=89;
	double priceCBurger=99,priceCCK=129,priceEN=99,priceCES=99,priceCMS=89,priceGC=119,priceCM=119,priceCC=149,priceC65=119;
	
	double subtotal,total,tax=3.57;
	private JTextField textFieldTotal;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Frame frame = new Menu_Frame();
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
	public Menu_Frame() {
		getContentPane().setBackground(new Color(0, 0, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768); 
		//setting absolute layout.
		getContentPane().setLayout(null);
		// to start windows in center position..
	    setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
				
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 57, 1289, 32);
		getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(42, 77, 139, 174);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton VEGrdbtnNewRadioButton = new JRadioButton("VEG");
		VEGrdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		VEGrdbtnNewRadioButton.setBackground(new Color(34, 139, 34));
		VEGrdbtnNewRadioButton.setBounds(6, 22, 127, 26);
		panel.add(VEGrdbtnNewRadioButton);
		
		JRadioButton NONVEGrdbtnNewRadioButton = new JRadioButton("NON-VEG");
		NONVEGrdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		NONVEGrdbtnNewRadioButton.setBackground(new Color(255, 0, 0));
		NONVEGrdbtnNewRadioButton.setBounds(6, 71, 127, 26);
		panel.add(NONVEGrdbtnNewRadioButton);
		
		JRadioButton ALLrdbtnNewRadioButton = new JRadioButton("ALL");
		ALLrdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ALLrdbtnNewRadioButton.setBounds(6, 120, 127, 26);
		panel.add(ALLrdbtnNewRadioButton);
		
		bg.add(VEGrdbtnNewRadioButton);
		bg.add(NONVEGrdbtnNewRadioButton);
		bg.add(ALLrdbtnNewRadioButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(224, 77, 1042, 174);
		panel_1.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		final JCheckBox chckbxFrenchfries = new JCheckBox("French fries");
		chckbxFrenchfries.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxFrenchfries.setBounds(46, 20, 163, 25);
		panel_1.add(chckbxFrenchfries);
		
		final JCheckBox chckbxVegShawarma = new JCheckBox("V. Shawarma");
		chckbxVegShawarma.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxVegShawarma.setBounds(46, 69, 163, 25);
		panel_1.add(chckbxVegShawarma);
		
		final JCheckBox chckbxWafllefries = new JCheckBox("Waffle fries");
		chckbxWafllefries.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxWafllefries.setBounds(46, 116, 163, 25);
		panel_1.add(chckbxWafllefries);
		
		final JCheckBox chckbxCheeseBiscuits = new JCheckBox("Cheese biscuits");
		chckbxCheeseBiscuits.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxCheeseBiscuits.setBounds(374, 20, 163, 25);
		panel_1.add(chckbxCheeseBiscuits);
		
		final JCheckBox chckbxCheeseTots = new JCheckBox("Cheese tots");
		chckbxCheeseTots.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxCheeseTots.setBounds(374, 69, 163, 25);
		panel_1.add(chckbxCheeseTots);
		
		final JCheckBox chckbxMozzarellaSticks = new JCheckBox("Mozzarella sticks");
		chckbxMozzarellaSticks.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxMozzarellaSticks.setBounds(374, 116, 163, 25);
		panel_1.add(chckbxMozzarellaSticks);
		
		final JCheckBox chckbxPotatoWedges = new JCheckBox("Potato wedges");
		chckbxPotatoWedges.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxPotatoWedges.setBounds(706, 20, 163, 25);
		panel_1.add(chckbxPotatoWedges);
		
		final JCheckBox chckbxPaneerKabab = new JCheckBox("Paneer kabab");
		chckbxPaneerKabab.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxPaneerKabab.setBounds(706, 69, 163, 25);
		panel_1.add(chckbxPaneerKabab);
		
		final JCheckBox chckbxSpSalad = new JCheckBox("Special salad");
		chckbxSpSalad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxSpSalad.setBounds(706, 116, 163, 25);
		panel_1.add(chckbxSpSalad);
		
		JLabel lblNewLabel = new JLabel("Rs. 79/-");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(283, 20, 71, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblRs = new JLabel("Rs. 99/-");
		lblRs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs.setBounds(283, 69, 71, 25);
		panel_1.add(lblRs);
		
		JLabel lblRs_1 = new JLabel("Rs. 99/-");
		lblRs_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs_1.setBounds(283, 116, 71, 25);
		panel_1.add(lblRs_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(347, 20, 22, 121);
		panel_1.add(separator_1);
		
		JLabel lblRs_2 = new JLabel("Rs. 119/-");
		lblRs_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs_2.setBounds(612, 20, 71, 25);
		panel_1.add(lblRs_2);
		
		JLabel lblRs_3 = new JLabel("Rs. 89/-");
		lblRs_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs_3.setBounds(612, 69, 71, 25);
		panel_1.add(lblRs_3);
		
		JLabel lblRs_4 = new JLabel("Rs. 99/-");
		lblRs_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs_4.setBounds(612, 116, 71, 25);
		panel_1.add(lblRs_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(681, 20, 22, 121);
		panel_1.add(separator_2);
		
		JLabel lblRs_5 = new JLabel("Rs. 119/-");
		lblRs_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs_5.setBounds(948, 20, 71, 25);
		panel_1.add(lblRs_5);
		
		JLabel lblRs_6 = new JLabel("Rs. 149/-");
		lblRs_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs_6.setBounds(948, 69, 71, 25);
		panel_1.add(lblRs_6);
		
		JLabel lblRs_7 = new JLabel("Rs. 89/-");
		lblRs_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs_7.setBounds(948, 116, 71, 25);
		panel_1.add(lblRs_7);
		
		textFieldFF = new JTextField();
		textFieldFF.setBounds(216, 20, 57, 25);
		panel_1.add(textFieldFF);
		textFieldFF.setColumns(10);
		
		textField_1VS = new JTextField();
		textField_1VS.setColumns(10);
		textField_1VS.setBounds(216, 69, 57, 25);
		panel_1.add(textField_1VS);
		
		textField_2WF = new JTextField();
		textField_2WF.setColumns(10);
		textField_2WF.setBounds(216, 116, 57, 25);
		panel_1.add(textField_2WF);
		
		textField_3CB = new JTextField();
		textField_3CB.setColumns(10);
		textField_3CB.setBounds(545, 20, 57, 25);
		panel_1.add(textField_3CB);
		
		textField_4CT = new JTextField();
		textField_4CT.setColumns(10);
		textField_4CT.setBounds(545, 69, 57, 25);
		panel_1.add(textField_4CT);
		
		textField_5MS = new JTextField();
		textField_5MS.setColumns(10);
		textField_5MS.setBounds(545, 116, 57, 25);
		panel_1.add(textField_5MS);
		
		textField_6PW = new JTextField();
		textField_6PW.setColumns(10);
		textField_6PW.setBounds(876, 20, 57, 25);
		panel_1.add(textField_6PW);
		
		textField_7PK = new JTextField();
		textField_7PK.setColumns(10);
		textField_7PK.setBounds(876, 69, 57, 25);
		panel_1.add(textField_7PK);
		
		textField_8SS = new JTextField();
		textField_8SS.setColumns(10);
		textField_8SS.setBounds(875, 116, 57, 25);
		panel_1.add(textField_8SS);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(224, 287, 1042, 174);
		getContentPane().add(panel_2);
		
		final JCheckBox chckbxChickenBurger = new JCheckBox("Chicken burger");
		chckbxChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxChickenBurger.setBounds(46, 20, 163, 25);
		panel_2.add(chckbxChickenBurger);
		
		final JCheckBox chckbxChickenCheeseKabab = new JCheckBox("Ch. cheese kabab");
		chckbxChickenCheeseKabab.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxChickenCheeseKabab.setBounds(46, 69, 163, 25);
		panel_2.add(chckbxChickenCheeseKabab);
		
		final JCheckBox chckbxEggNoodles = new JCheckBox("Egg noodles");
		chckbxEggNoodles.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxEggNoodles.setBounds(46, 116, 163, 25);
		panel_2.add(chckbxEggNoodles);
		
		final JCheckBox chckbxChickeneggSandwich = new JCheckBox("Ch-Egg Sandwich");
		chckbxChickeneggSandwich.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxChickeneggSandwich.setBounds(375, 20, 163, 25);
		panel_2.add(chckbxChickeneggSandwich);
		
		final JCheckBox chckbxChMozzarellaSticks = new JCheckBox("Ch. mozzarella sticks");
		chckbxChMozzarellaSticks.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxChMozzarellaSticks.setBounds(375, 69, 163, 25);
		panel_2.add(chckbxChMozzarellaSticks);
		
		final JCheckBox chckbxGarlicChicken = new JCheckBox("Garlic chicken");
		chckbxGarlicChicken.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxGarlicChicken.setBounds(375, 116, 163, 25);
		panel_2.add(chckbxGarlicChicken);
		
		final JCheckBox chckbxChManchurian = new JCheckBox("Ch. manchurian");
		chckbxChManchurian.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxChManchurian.setBounds(706, 20, 163, 25);
		panel_2.add(chckbxChManchurian);
		
		final JCheckBox chckbxCrispyChicken = new JCheckBox("Crispy chicken");
		chckbxCrispyChicken.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxCrispyChicken.setBounds(706, 69, 163, 25);
		panel_2.add(chckbxCrispyChicken);
		
		final JCheckBox chckbxChicken65 = new JCheckBox("Chicken 65");
		chckbxChicken65.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxChicken65.setBounds(706, 116, 163, 25);
		panel_2.add(chckbxChicken65);
		
		JLabel lblRs_8 = new JLabel("Rs. 99/-");
		lblRs_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs_8.setBounds(283, 20, 71, 25);
		panel_2.add(lblRs_8);
		
		JLabel lblRs_9 = new JLabel("Rs. 129/-");
		lblRs_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs_9.setBounds(283, 69, 71, 25);
		panel_2.add(lblRs_9);
		
		JLabel label_2 = new JLabel("Rs. 99/-");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(283, 116, 71, 25);
		panel_2.add(label_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(347, 20, 22, 121);
		panel_2.add(separator_3);
		
		JLabel lblRs_10 = new JLabel("Rs. 99/-");
		lblRs_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs_10.setBounds(612, 20, 71, 25);
		panel_2.add(lblRs_10);
		
		JLabel label_4 = new JLabel("Rs. 89/-");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(612, 69, 71, 25);
		panel_2.add(label_4);
		
		JLabel lblRs_11 = new JLabel("Rs. 119/-");
		lblRs_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs_11.setBounds(612, 116, 71, 25);
		panel_2.add(lblRs_11);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(681, 20, 22, 121);
		panel_2.add(separator_4);
		
		JLabel label_6 = new JLabel("Rs. 119/-");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(948, 20, 71, 25);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("Rs. 149/-");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(948, 69, 71, 25);
		panel_2.add(label_7);
		
		JLabel lblRs_12 = new JLabel("Rs. 119/-");
		lblRs_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRs_12.setBounds(948, 116, 71, 25);
		panel_2.add(lblRs_12);
		
		textField_9CB = new JTextField();
		textField_9CB.setColumns(10);
		textField_9CB.setBounds(216, 20, 57, 25);
		panel_2.add(textField_9CB);
		
		textField_10CCK = new JTextField();
		textField_10CCK.setColumns(10);
		textField_10CCK.setBounds(216, 69, 57, 25);
		panel_2.add(textField_10CCK);
		
		textField_11EN = new JTextField();
		textField_11EN.setColumns(10);
		textField_11EN.setBounds(216, 116, 57, 25);
		panel_2.add(textField_11EN);
		
		textField_12CES = new JTextField();
		textField_12CES.setColumns(10);
		textField_12CES.setBounds(545, 20, 57, 25);
		panel_2.add(textField_12CES);
		
		textField_13CMS = new JTextField();
		textField_13CMS.setColumns(10);
		textField_13CMS.setBounds(545, 69, 57, 25);
		panel_2.add(textField_13CMS);
		
		textField_14GC = new JTextField();
		textField_14GC.setColumns(10);
		textField_14GC.setBounds(545, 116, 57, 25);
		panel_2.add(textField_14GC);
		
		textField_15CM = new JTextField();
		textField_15CM.setColumns(10);
		textField_15CM.setBounds(875, 20, 57, 25);
		panel_2.add(textField_15CM);
		
		textField_16CC = new JTextField();
		textField_16CC.setColumns(10);
		textField_16CC.setBounds(875, 69, 57, 25);
		panel_2.add(textField_16CC);
		
		textField_17C65 = new JTextField();
		textField_17C65.setColumns(10);
		textField_17C65.setBounds(875, 116, 57, 25);
		panel_2.add(textField_17C65);
//......................................................................................................................................................................		
		// Disabling every check box in the beginning...
		
		//veg dishes..
		chckbxFrenchfries.setEnabled(false);
		chckbxVegShawarma.setEnabled(false);
		chckbxWafllefries.setEnabled(false);
		chckbxCheeseBiscuits.setEnabled(false);
		chckbxCheeseTots.setEnabled(false);
		chckbxMozzarellaSticks.setEnabled(false);
		chckbxPotatoWedges.setEnabled(false);
		chckbxPaneerKabab.setEnabled(false);
		chckbxSpSalad.setEnabled(false);
		
		//non-veg dishes..
		chckbxChickenBurger.setEnabled(false);
		chckbxChickenCheeseKabab.setEnabled(false);
		chckbxEggNoodles.setEnabled(false);
		chckbxChickeneggSandwich.setEnabled(false);
		chckbxChMozzarellaSticks.setEnabled(false);
		chckbxGarlicChicken.setEnabled(false);
		chckbxChicken65.setEnabled(false);
		chckbxChManchurian.setEnabled(false);
		chckbxCrispyChicken.setEnabled(false);
		
		//disabling every textField in the beginning..
		//veg..
		 textFieldFF.setEnabled(false);
		 textField_1VS.setEnabled(false);
		 textField_2WF.setEnabled(false);
		 textField_3CB.setEnabled(false);
		 textField_4CT.setEnabled(false);
		 textField_5MS.setEnabled(false);
		 textField_6PW.setEnabled(false);
		 textField_7PK.setEnabled(false);
		 textField_8SS.setEnabled(false);
		
		// non-veg...
		      textField_9CB.setEnabled(false);
			  textField_10CCK.setEnabled(false);
			  textField_11EN.setEnabled(false);
			  textField_12CES.setEnabled(false);
			  textField_13CMS.setEnabled(false);
			  textField_14GC.setEnabled(false);
			  textField_15CM.setEnabled(false);
			  textField_16CC.setEnabled(false);
			  textField_17C65.setEnabled(false);
			  
			  JPanel panel_3 = new JPanel();
			  panel_3.setBackground(Color.LIGHT_GRAY);
			  panel_3.setBounds(42, 287, 139, 174);
			  getContentPane().add(panel_3); //absolute layout...
			  panel_3.setLayout(null);
			  
			  final JPanel panel_4 = new JPanel();
			  panel_4.setBounds(42, 502, 1224, 183);
			  panel_4.setBackground(Color.LIGHT_GRAY);
			  getContentPane().add(panel_4);
			  panel_4.setLayout(null);
			  
			  final JLabel label_subTotal = new JLabel("SUB- TOTAL (Rs.) :");
			  label_subTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
			  label_subTotal.setBounds(6, 25, 165, 26);
			  panel_4.add(label_subTotal);
			  
			  JLabel lbl_Tax = new JLabel("TAX (Rs.) :");
			  lbl_Tax.setFont(new Font("Tahoma", Font.PLAIN, 18));
			  lbl_Tax.setBounds(6, 78, 165, 26);
			  panel_4.add(lbl_Tax);
			  
			  textFieldsubTotal = new JTextField();
			  textFieldsubTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
			  textFieldsubTotal.setEditable(false);
			  textFieldsubTotal.setBounds(181, 25, 127, 25);
			  panel_4.add(textFieldsubTotal);
			  textFieldsubTotal.setColumns(10);
			  
			  txtRs = new JTextField();
			  txtRs.setFont(new Font("Tahoma", Font.PLAIN, 18));
			  txtRs.setText("3.57");
			  txtRs.setEditable(false);
			  txtRs.setColumns(10);
			  txtRs.setBounds(181, 78, 127, 25);
			  panel_4.add(txtRs);
			  
			  final JLabel lbl_Total = new JLabel("TOTAL (Rs.) :");
			  lbl_Total.setFont(new Font("Tahoma", Font.PLAIN, 18));
			  lbl_Total.setBounds(6, 133, 165, 26);
			  panel_4.add(lbl_Total);
			  
			  textFieldTotal = new JTextField();
			  textFieldTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
			  textFieldTotal.setEditable(false);
			  textFieldTotal.setColumns(10);
			  textFieldTotal.setBounds(181, 133, 127, 25);
			  panel_4.add(textFieldTotal);
			  
			  JTextArea txtrThankYou = new JTextArea();
			  txtrThankYou.setFont(new Font("Monospaced", Font.PLAIN, 30));
			  txtrThankYou.setBackground(Color.LIGHT_GRAY);
			  txtrThankYou.setText("Thank you ! Do visit again !");
			  txtrThankYou.setBounds(502, 53, 555, 78);
			  panel_4.add(txtrThankYou);
			  panel_4.setVisible(false);
			  
			  JButton btnNewButtonPROCEED = new JButton("PROCEED");
			  btnNewButtonPROCEED.addActionListener(new ActionListener() {
			  	public void actionPerformed(ActionEvent e) {
			  		
			  		if(chckbxFrenchfries.isSelected()==true) {
			  			subtotal=subtotal+priceFF * Double.parseDouble(textFieldFF.getText());
			  		}
			  		if(chckbxVegShawarma.isSelected()==true) {
			  			subtotal=subtotal+priceVS * Double.parseDouble(textField_1VS.getText());
			  		}
			  		if(chckbxWafllefries.isSelected()==true) {
			  			subtotal=subtotal+priceWF * Double.parseDouble(textField_2WF.getText());
			  		}
			  		if(chckbxCheeseBiscuits.isSelected()==true) {
			  			subtotal=subtotal+priceCB * Double.parseDouble(textField_3CB.getText());
			  		}
			  		if(chckbxCheeseTots.isSelected()==true) {
			  			subtotal=subtotal+priceCT * Double.parseDouble(textField_4CT.getText());
			  		}
			  		if(chckbxMozzarellaSticks.isSelected()==true) {
			  			subtotal=subtotal+priceMS * Double.parseDouble(textField_5MS.getText());
			  		}
			  		if(chckbxPotatoWedges.isSelected()==true) {
			  			subtotal=subtotal+pricePW * Double.parseDouble(textField_6PW.getText());
			  		}
			  		if(chckbxPaneerKabab.isSelected()==true) {
			  			subtotal=subtotal+pricePK * Double.parseDouble(textField_7PK.getText());
			  		}
			  		if(chckbxSpSalad.isSelected()==true) {
			  			subtotal=subtotal+priceSS * Double.parseDouble(textField_8SS.getText());
			  		}
			  		// non veg.....
			  		
			  		if(chckbxChickenBurger.isSelected()==true) {
			  			subtotal=subtotal+priceCBurger * Double.parseDouble(textField_9CB.getText());
			  		}
			  		if(chckbxChickenCheeseKabab.isSelected()==true) {
			  			subtotal=subtotal+priceCCK * Double.parseDouble(textField_10CCK.getText());
			  		}
			  		if(chckbxEggNoodles.isSelected()==true) {
			  			subtotal=subtotal+priceEN * Double.parseDouble(textField_11EN.getText());
			  		}
			  		if(chckbxChickeneggSandwich.isSelected()==true) {
			  			subtotal=subtotal+priceCES * Double.parseDouble(textField_12CES.getText());
			  		}
			  		if(chckbxChMozzarellaSticks.isSelected()==true) {
			  			subtotal=subtotal+priceCMS * Double.parseDouble(textField_13CMS.getText());
			  		}
			  		if(chckbxGarlicChicken.isSelected()==true) {
			  			subtotal=subtotal+priceGC * Double.parseDouble(textField_14GC.getText());
			  		}
			  		if(chckbxChicken65.isSelected()==true) {
			  			subtotal=subtotal+priceC65 * Double.parseDouble(textField_17C65.getText());
			  		}
			  		if(chckbxChManchurian.isSelected()==true) {
			  			subtotal=subtotal+priceCM * Double.parseDouble(textField_15CM.getText());
			  		}
			  		if(chckbxCrispyChicken.isSelected()==true) {
			  			subtotal=subtotal+priceCC * Double.parseDouble(textField_16CC.getText());
			  		}
			  		
			  		
			  		textFieldsubTotal.setText(Double.toString(subtotal));
			  		total=subtotal+tax;
			  		textFieldTotal.setText(Double.toString(total));
			  		panel_4.setVisible(true);
			  		subtotal=0;
			  		
			  		
			  	}
			  });
			  btnNewButtonPROCEED.setFont(new Font("Tahoma", Font.PLAIN, 18));
			  btnNewButtonPROCEED.setBounds(6, 27, 127, 26);
			  panel_3.add(btnNewButtonPROCEED);
			  
			  JButton btnRESET = new JButton("RESET");
			  btnRESET.addActionListener(new ActionListener() {
			  	public void actionPerformed(ActionEvent arg0) {
			  		
			  		 textFieldFF.setText(null);
					 textField_1VS.setText(null);
					 textField_2WF.setText(null);
					 textField_3CB.setText(null);
					 textField_4CT.setText(null);
					 textField_5MS.setText(null);
					 textField_6PW.setText(null);
					 textField_7PK.setText(null);
					 textField_8SS.setText(null);
			  		
					  textField_9CB.setText(null);
					  textField_10CCK.setText(null);
					  textField_11EN.setText(null);
					  textField_12CES.setText(null);
					  textField_13CMS.setText(null);
					  textField_14GC.setText(null);
					  textField_15CM.setText(null);
					  textField_16CC.setText(null);
					  textField_17C65.setText(null);
					  
					  chckbxChickenBurger.setSelected(false);
						chckbxChickenCheeseKabab.setSelected(false);
						chckbxEggNoodles.setSelected(false);
						chckbxChickeneggSandwich.setSelected(false);
						chckbxChMozzarellaSticks.setSelected(false);
						chckbxGarlicChicken.setSelected(false);
						chckbxChicken65.setSelected(false);
						chckbxChManchurian.setSelected(false);
						chckbxCrispyChicken.setSelected(false);
						
						chckbxFrenchfries.setSelected(false);
						chckbxVegShawarma.setSelected(false);
						chckbxWafllefries.setSelected(false);
						chckbxCheeseBiscuits.setSelected(false);
						chckbxCheeseTots.setSelected(false);
						chckbxMozzarellaSticks.setSelected(false);
						chckbxPotatoWedges.setSelected(false);
						chckbxPaneerKabab.setSelected(false);
						chckbxSpSalad.setSelected(false);
						
					textFieldTotal.setText(null);
					textFieldsubTotal.setText(null);
					panel_4.setVisible(false);

			  	}
			  });
			  btnRESET.setFont(new Font("Tahoma", Font.PLAIN, 18));
			  btnRESET.setBounds(6, 78, 127, 26);
			  panel_3.add(btnRESET);
			  
			  JButton btnEXIT = new JButton("EXIT");
			  btnEXIT.addActionListener(new ActionListener() {
			  	public void actionPerformed(ActionEvent e) {
			  		fromMenu_Frame =new JFrame("Exit");
			  		if(JOptionPane.showConfirmDialog(fromMenu_Frame, "Do you really want to exit?","Menu List",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
			  			System.exit(0);
			  		}
			  		
			  	}
			  });
			  btnEXIT.setFont(new Font("Tahoma", Font.PLAIN, 18));
			  btnEXIT.setBounds(6, 125, 127, 26);
			  panel_3.add(btnEXIT);
			  
			  JButton logOutbtnNewButton = new JButton("LOGOUT");
			  logOutbtnNewButton.addActionListener(new ActionListener() {
			  	public void actionPerformed(ActionEvent arg0) {
			  		
			  	/*	Login_System a=new Login_System();
			  		Login_System.main(null); */
			  		dispose();
			  	}
			  });
			  logOutbtnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
			  logOutbtnNewButton.setBounds(1212, 11, 127, 26);
			  getContentPane().add(logOutbtnNewButton);
			  
			  JLabel lblNewLabel_1 = new JLabel("\"Eat like no one is watching ! Don't worry we'll keep it secret. \"");
			  lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
			  lblNewLabel_1.setForeground(Color.YELLOW);
			  lblNewLabel_1.setBounds(350, 11, 732, 35);
			  getContentPane().add(lblNewLabel_1);
			  
			 
//.......................................................................................................................................................................
			  
		// Now starts the radio button selection coding...
		
		VEGrdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//disabling non veg...
				chckbxChickenBurger.setEnabled(false);
				chckbxChickenCheeseKabab.setEnabled(false);
				chckbxEggNoodles.setEnabled(false);
				chckbxChickeneggSandwich.setEnabled(false);
				chckbxChMozzarellaSticks.setEnabled(false);
				chckbxGarlicChicken.setEnabled(false);
				chckbxChicken65.setEnabled(false);
				chckbxChManchurian.setEnabled(false);
				chckbxCrispyChicken.setEnabled(false);
				
				// un-checking the boxes...
				chckbxChickenBurger.setSelected(false);
				chckbxChickenCheeseKabab.setSelected(false);
				chckbxEggNoodles.setSelected(false);
				chckbxChickeneggSandwich.setSelected(false);
				chckbxChMozzarellaSticks.setSelected(false);
				chckbxGarlicChicken.setSelected(false);
				chckbxChicken65.setSelected(false);
				chckbxChManchurian.setSelected(false);
				chckbxCrispyChicken.setSelected(false);
				
			      textField_9CB.setText(null);
				  textField_10CCK.setText(null);
				  textField_11EN.setText(null);
				  textField_12CES.setText(null);
				  textField_13CMS.setText(null);
				  textField_14GC.setText(null);
				  textField_15CM.setText(null);
				  textField_16CC.setText(null);
				  textField_17C65.setText(null);

				
				// enabling veg...
				chckbxFrenchfries.setEnabled(true);
				chckbxVegShawarma.setEnabled(true);
				chckbxWafllefries.setEnabled(true);
				chckbxCheeseBiscuits.setEnabled(true);
				chckbxCheeseTots.setEnabled(true);
				chckbxMozzarellaSticks.setEnabled(true);
				chckbxPotatoWedges.setEnabled(true);
				chckbxPaneerKabab.setEnabled(true);
				chckbxSpSalad.setEnabled(true);
				
				// textFields ....
				//veg..
				 textFieldFF.setEnabled(true);
				 textField_1VS.setEnabled(true);
				 textField_2WF.setEnabled(true);
				 textField_3CB.setEnabled(true);
				 textField_4CT.setEnabled(true);
				 textField_5MS.setEnabled(true);
				 textField_6PW.setEnabled(true);
				 textField_7PK.setEnabled(true);
				 textField_8SS.setEnabled(true);
				 //non-veg...
				 textField_9CB.setEnabled(false);
				  textField_10CCK.setEnabled(false);
				  textField_11EN.setEnabled(false);
				  textField_12CES.setEnabled(false);
				  textField_13CMS.setEnabled(false);
				  textField_14GC.setEnabled(false);
				  textField_15CM.setEnabled(false);
				  textField_16CC.setEnabled(false);
				  textField_17C65.setEnabled(false);
			}
		}
				
				);
//..........................................................................................................................................................................		
			NONVEGrdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//disabling non veg...
				chckbxChickenBurger.setEnabled(true);
				chckbxChickenCheeseKabab.setEnabled(true);
				chckbxEggNoodles.setEnabled(true);
				chckbxChickeneggSandwich.setEnabled(true);
				chckbxChMozzarellaSticks.setEnabled(true);
				chckbxGarlicChicken.setEnabled(true);
				chckbxChicken65.setEnabled(true);
				chckbxChManchurian.setEnabled(true);
				chckbxCrispyChicken.setEnabled(true);
				
				// enabling veg...
				chckbxFrenchfries.setEnabled(false);
				chckbxVegShawarma.setEnabled(false);
				chckbxWafllefries.setEnabled(false);
				chckbxCheeseBiscuits.setEnabled(false);
				chckbxCheeseTots.setEnabled(false);
				chckbxMozzarellaSticks.setEnabled(false);
				chckbxPotatoWedges.setEnabled(false);
				chckbxPaneerKabab.setEnabled(false);
				chckbxSpSalad.setEnabled(false);
				
				// check box ....
				//veg..
				 textFieldFF.setEnabled(false);
				 textField_1VS.setEnabled(false);
				 textField_2WF.setEnabled(false);
				 textField_3CB.setEnabled(false);
				 textField_4CT.setEnabled(false);
				 textField_5MS.setEnabled(false);
				 textField_6PW.setEnabled(false);
				 textField_7PK.setEnabled(false);
				 textField_8SS.setEnabled(false);
				 //non-veg...
				 textField_9CB.setEnabled(true);
				  textField_10CCK.setEnabled(true);
				  textField_11EN.setEnabled(true);
				  textField_12CES.setEnabled(true);
				  textField_13CMS.setEnabled(true);
				  textField_14GC.setEnabled(true);
				  textField_15CM.setEnabled(true);
				  textField_16CC.setEnabled(true);
				  textField_17C65.setEnabled(true);
				  
				  //textFields..
				  textFieldFF.setText(null);
					 textField_1VS.setText(null);
					 textField_2WF.setText(null);
					 textField_3CB.setText(null);
					 textField_4CT.setText(null);
					 textField_5MS.setText(null);
					 textField_6PW.setText(null);
					 textField_7PK.setText(null);
					 textField_8SS.setText(null);
					 
					 //un-checking...
					 chckbxFrenchfries.setSelected(false);
						chckbxVegShawarma.setSelected(false);
						chckbxWafllefries.setSelected(false);
						chckbxCheeseBiscuits.setSelected(false);
						chckbxCheeseTots.setSelected(false);
						chckbxMozzarellaSticks.setSelected(false);
						chckbxPotatoWedges.setSelected(false);
						chckbxPaneerKabab.setSelected(false);
						chckbxSpSalad.setSelected(false);
			}
		}
				
				);
//.........................................................................................................................................................................
			
			ALLrdbtnNewRadioButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					
					chckbxFrenchfries.setEnabled(true);
					chckbxVegShawarma.setEnabled(true);
					chckbxWafllefries.setEnabled(true);
					chckbxCheeseBiscuits.setEnabled(true);
					chckbxCheeseTots.setEnabled(true);
					chckbxMozzarellaSticks.setEnabled(true);
					chckbxPotatoWedges.setEnabled(true);
					chckbxPaneerKabab.setEnabled(true);
					chckbxSpSalad.setEnabled(true);
					
					chckbxChickenBurger.setEnabled(true);
					chckbxChickenCheeseKabab.setEnabled(true);
					chckbxEggNoodles.setEnabled(true);
					chckbxChickeneggSandwich.setEnabled(true);
					chckbxChMozzarellaSticks.setEnabled(true);
					chckbxGarlicChicken.setEnabled(true);
					chckbxChicken65.setEnabled(true);
					chckbxChManchurian.setEnabled(true);
					chckbxCrispyChicken.setEnabled(true);
					
					 textField_9CB.setEnabled(true);
					  textField_10CCK.setEnabled(true);
					  textField_11EN.setEnabled(true);
					  textField_12CES.setEnabled(true);
					  textField_13CMS.setEnabled(true);
					  textField_14GC.setEnabled(true);
					  textField_15CM.setEnabled(true);
					  textField_16CC.setEnabled(true);
					  textField_17C65.setEnabled(true);
					  
					  textFieldFF.setEnabled(true);
						 textField_1VS.setEnabled(true);
						 textField_2WF.setEnabled(true);
						 textField_3CB.setEnabled(true);
						 textField_4CT.setEnabled(true);
						 textField_5MS.setEnabled(true);
						 textField_6PW.setEnabled(true);
						 textField_7PK.setEnabled(true);
						 textField_8SS.setEnabled(true);
				
				}}
					);

		
	}
}
