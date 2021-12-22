package GiuaKy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Algorithms extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lbLanguage;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Algorithms frame = new Algorithms();
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
	public Algorithms() {
		setTitle("Algorithms");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 453);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbLanguage = new JLabel("");
		lbLanguage.setBounds(32, 227, 89, 23);
		contentPane.add(lbLanguage);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 97, 815, 294);
		contentPane.add(tabbedPane);
		
		JPanel pn1 = new JPanel();
		tabbedPane.addTab("Symmetric Text", null, pn1, null);
		pn1.setLayout(null);
		
		JPanel pn2 = new JPanel();
		pn2.setLayout(null);
		pn2.setBounds(0, 0, 810, 266);
		pn1.add(pn2);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel3.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Property", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Property", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel3.setBounds(34, 11, 269, 93);
		pn2.add(panel3);
		
		JLabel lblNewLabel_5_1 = new JLabel("Algorithms");
		lblNewLabel_5_1.setBounds(10, 26, 70, 14);
		panel3.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Key Size");
		lblNewLabel_1_1_1.setBounds(10, 51, 70, 14);
		panel3.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_4_1 = new JComboBox();
		comboBox_4_1.setModel(new DefaultComboBoxModel(new String[] {"DES", "DESede", "Blowfish", "AES", "RC2", "RC4", "RC5"}));
		comboBox_4_1.setBounds(121, 22, 97, 22);
		panel3.add(comboBox_4_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"56"}));
		comboBox_1_1_1.setBounds(121, 47, 97, 22);
		panel3.add(comboBox_1_1_1);
		
		JPanel pn4 = new JPanel();
		pn4.setLayout(null);
		pn4.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Property", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Options", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pn4.setBounds(487, 11, 269, 93);
		pn2.add(pn4);
		
		JLabel lblMode_1_1 = new JLabel("Mode");
		lblMode_1_1.setBounds(10, 23, 70, 14);
		pn4.add(lblMode_1_1);
		
		JLabel lblPadding_1_1 = new JLabel("Padding");
		lblPadding_1_1.setBounds(10, 48, 70, 14);
		pn4.add(lblPadding_1_1);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setModel(new DefaultComboBoxModel(new String[] {"NONE", "ECB", "CBC", "PCBR", "CTR", "CTS", "CFB", "CFB8"}));
		comboBox_2_1_1.setBounds(127, 19, 97, 22);
		pn4.add(comboBox_2_1_1);
		
		JComboBox comboBox_3_1_1 = new JComboBox();
		comboBox_3_1_1.setModel(new DefaultComboBoxModel(new String[] {"NoPadding", "PKCS5Padding", "ISO10126Padding"}));
		comboBox_3_1_1.setBounds(127, 44, 97, 22);
		pn4.add(comboBox_3_1_1);
		
		JPanel pn5 = new JPanel();
		pn5.setLayout(null);
		pn5.setBorder(new TitledBorder(null, "Browser", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pn5.setBounds(34, 131, 722, 124);
		pn2.add(pn5);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Key File");
		lblNewLabel_2_1_1.setBounds(10, 26, 53, 14);
		pn5.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Input File");
		lblNewLabel_3_1_1.setBounds(10, 50, 53, 14);
		pn5.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Output File");
		lblNewLabel_4_1_1.setBounds(10, 75, 53, 14);
		pn5.add(lblNewLabel_4_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(85, 23, 451, 20);
		pn5.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 47, 451, 20);
		pn5.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(85, 72, 451, 20);
		pn5.add(textField_2);
		
		JButton btnNewButton_4_1 = new JButton("Browser");
		btnNewButton_4_1.setBounds(566, 22, 89, 23);
		pn5.add(btnNewButton_4_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Browser");
		btnNewButton_1_1_1.setBounds(566, 46, 89, 23);
		pn5.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Browser");
		btnNewButton_2_1_1.setBounds(566, 71, 89, 23);
		pn5.add(btnNewButton_2_1_1);
		
		JPanel pn7 = new JPanel();
		tabbedPane.addTab("Symmetric File", null, pn7, null);
		pn7.setLayout(null);
		
		JPanel pn8 = new JPanel();
		pn8.setLayout(null);
		pn8.setBounds(0, 0, 810, 266);
		pn7.add(pn8);
		
		JPanel pn9 = new JPanel();
		pn9.setLayout(null);
		pn9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pn9.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Property", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Property", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pn9.setBounds(34, 11, 269, 93);
		pn8.add(pn9);
		
		JLabel lblNewLabel_5 = new JLabel("Algorithms");
		lblNewLabel_5.setBounds(10, 26, 70, 14);
		pn9.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Key Size");
		lblNewLabel_1_1.setBounds(10, 51, 70, 14);
		pn9.add(lblNewLabel_1_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(121, 22, 97, 22);
		pn9.add(comboBox_4);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(121, 47, 97, 22);
		pn9.add(comboBox_1_1);
		
		JPanel pn10 = new JPanel();
		pn10.setLayout(null);
		pn10.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Property", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Options", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pn10.setBounds(487, 11, 269, 93);
		pn8.add(pn10);
		
		JLabel lblMode_1 = new JLabel("Mode");
		lblMode_1.setBounds(10, 23, 70, 14);
		pn10.add(lblMode_1);
		
		JLabel lblPadding_1 = new JLabel("Padding");
		lblPadding_1.setBounds(10, 48, 70, 14);
		pn10.add(lblPadding_1);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(127, 19, 97, 22);
		pn10.add(comboBox_2_1);
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setBounds(127, 44, 97, 22);
		pn10.add(comboBox_3_1);
		
		JPanel pn11 = new JPanel();
		pn11.setLayout(null);
		pn11.setBorder(new TitledBorder(null, "Browser", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pn11.setBounds(34, 131, 722, 124);
		pn8.add(pn11);
		
		JLabel lblNewLabel_2_1 = new JLabel("Key File");
		lblNewLabel_2_1.setBounds(10, 26, 53, 14);
		pn11.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Input File");
		lblNewLabel_3_1.setBounds(10, 50, 53, 14);
		pn11.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Output File");
		lblNewLabel_4_1.setBounds(10, 75, 53, 14);
		pn11.add(lblNewLabel_4_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(85, 23, 451, 20);
		pn11.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(85, 47, 451, 20);
		pn11.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(85, 72, 451, 20);
		pn11.add(textField_5);
		
		JButton btnNewButton_4 = new JButton("Browser");
		btnNewButton_4.setBounds(566, 22, 89, 23);
		pn11.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("Browser");
		btnNewButton_1_1.setBounds(566, 46, 89, 23);
		pn11.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Browser");
		btnNewButton_2_1.setBounds(566, 71, 89, 23);
		pn11.add(btnNewButton_2_1);
		
		JPanel pn12 = new JPanel();
		tabbedPane.addTab("Session Key", null, pn12, null);
		pn12.setLayout(null);
		
		JPanel pn13 = new JPanel();
		pn13.setLayout(null);
		pn13.setBounds(0, 0, 810, 266);
		pn12.add(pn13);
		
		JPanel pn14 = new JPanel();
		pn14.setLayout(null);
		pn14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pn14.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Property", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Property", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pn14.setBounds(34, 11, 269, 93);
		pn13.add(pn14);
		
		JLabel lblNewLabel_6 = new JLabel("Algorithms");
		lblNewLabel_6.setBounds(10, 26, 70, 14);
		pn14.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1_2 = new JLabel("Key Size");
		lblNewLabel_1_2.setBounds(10, 51, 70, 14);
		pn14.add(lblNewLabel_1_2);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(121, 22, 97, 22);
		pn14.add(comboBox_5);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBounds(121, 47, 97, 22);
		pn14.add(comboBox_1_2);
		
		JPanel pn15 = new JPanel();
		pn15.setLayout(null);
		pn15.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Property", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Options", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pn15.setBounds(487, 11, 269, 93);
		pn13.add(pn15);
		
		JLabel lblMode_2 = new JLabel("Mode");
		lblMode_2.setBounds(10, 23, 70, 14);
		pn15.add(lblMode_2);
		
		JLabel lblPadding_2 = new JLabel("Padding");
		lblPadding_2.setBounds(10, 48, 70, 14);
		pn15.add(lblPadding_2);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setBounds(127, 19, 97, 22);
		pn15.add(comboBox_2_2);
		
		JComboBox comboBox_3_2 = new JComboBox();
		comboBox_3_2.setBounds(127, 44, 97, 22);
		pn15.add(comboBox_3_2);
		
		JPanel pn16 = new JPanel();
		pn16.setLayout(null);
		pn16.setBorder(new TitledBorder(null, "Browser", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pn16.setBounds(34, 131, 722, 124);
		pn13.add(pn16);
		
		JLabel lblNewLabel_2_2 = new JLabel("Key File");
		lblNewLabel_2_2.setBounds(10, 26, 53, 14);
		pn16.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Input File");
		lblNewLabel_3_2.setBounds(10, 50, 53, 14);
		pn16.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Output File");
		lblNewLabel_4_2.setBounds(10, 75, 53, 14);
		pn16.add(lblNewLabel_4_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(85, 23, 451, 20);
		pn16.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(85, 47, 451, 20);
		pn16.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(85, 72, 451, 20);
		pn16.add(textField_8);
		
		JButton btnNewButton_5 = new JButton("Browser");
		btnNewButton_5.setBounds(566, 22, 89, 23);
		pn16.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("Browser");
		btnNewButton_1_2.setBounds(566, 46, 89, 23);
		pn16.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("Browser");
		btnNewButton_2_2.setBounds(566, 71, 89, 23);
		pn16.add(btnNewButton_2_2);
		
		JPanel pn17 = new JPanel();
		tabbedPane.addTab("Genkey Pair", null, pn17, null);
		pn17.setLayout(null);
		
		JPanel pn18 = new JPanel();
		pn18.setLayout(null);
		pn18.setBounds(0, 0, 810, 266);
		pn17.add(pn18);
		
		JPanel pn19 = new JPanel();
		pn19.setLayout(null);
		pn19.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pn19.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Property", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Property", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pn19.setBounds(34, 11, 269, 93);
		pn18.add(pn19);
		
		JLabel lblNewLabel_7 = new JLabel("Algorithms");
		lblNewLabel_7.setBounds(10, 26, 70, 14);
		pn19.add(lblNewLabel_7);
		
		JLabel lblNewLabel_1_3 = new JLabel("Key Size");
		lblNewLabel_1_3.setBounds(10, 51, 70, 14);
		pn19.add(lblNewLabel_1_3);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(121, 22, 97, 22);
		pn19.add(comboBox_6);
		
		JComboBox comboBox_1_3 = new JComboBox();
		comboBox_1_3.setBounds(121, 47, 97, 22);
		pn19.add(comboBox_1_3);
		
		JPanel pn20 = new JPanel();
		pn20.setLayout(null);
		pn20.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Property", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Options", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pn20.setBounds(487, 11, 269, 93);
		pn18.add(pn20);
		
		JLabel lblMode_3 = new JLabel("Mode");
		lblMode_3.setBounds(10, 23, 70, 14);
		pn20.add(lblMode_3);
		
		JLabel lblPadding_3 = new JLabel("Padding");
		lblPadding_3.setBounds(10, 48, 70, 14);
		pn20.add(lblPadding_3);
		
		JComboBox comboBox_2_3 = new JComboBox();
		comboBox_2_3.setBounds(127, 19, 97, 22);
		pn20.add(comboBox_2_3);
		
		JComboBox comboBox_3_3 = new JComboBox();
		comboBox_3_3.setBounds(127, 44, 97, 22);
		pn20.add(comboBox_3_3);
		
		JPanel pn21 = new JPanel();
		pn21.setLayout(null);
		pn21.setBorder(new TitledBorder(null, "Browser", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pn21.setBounds(34, 131, 722, 124);
		pn18.add(pn21);
		
		JLabel lblNewLabel_2_3 = new JLabel("Key File");
		lblNewLabel_2_3.setBounds(10, 26, 53, 14);
		pn21.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Input File");
		lblNewLabel_3_3.setBounds(10, 50, 53, 14);
		pn21.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("Output File");
		lblNewLabel_4_3.setBounds(10, 75, 53, 14);
		pn21.add(lblNewLabel_4_3);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(85, 23, 451, 20);
		pn21.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(85, 47, 451, 20);
		pn21.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(85, 72, 451, 20);
		pn21.add(textField_11);
		
		JButton btnNewButton_6 = new JButton("Browser");
		btnNewButton_6.setBounds(566, 22, 89, 23);
		pn21.add(btnNewButton_6);
		
		JButton btnNewButton_1_3 = new JButton("Browser");
		btnNewButton_1_3.setBounds(566, 46, 89, 23);
		pn21.add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("Browser");
		btnNewButton_2_3.setBounds(566, 71, 89, 23);
		pn21.add(btnNewButton_2_3);
		
		JButton btnNewButton_3 = new JButton("Encrypt");
		btnNewButton_3.setBounds(151, 27, 158, 48);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Decrypt");
		btnNewButton_3_1.setBounds(498, 27, 158, 48);
		contentPane.add(btnNewButton_3_1);
	}
}
