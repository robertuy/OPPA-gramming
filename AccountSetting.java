package softEng;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AccountSetting extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private JPasswordField passwordField_4;
	private JPasswordField passwordField_5;
	private JPasswordField passwordField_6;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountSetting frame = new AccountSetting();
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
	public AccountSetting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 533);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Account Settings");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblNewLabel.setBounds(47, 11, 125, 36);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(49, 49, 386, 88);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Staff Accounts");
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 0, 103, 37);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Select Staff ID:\r\n");
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblNewLabel_2.setBounds(150, 22, 108, 29);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(150, 48, 89, 20);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(49, 167, 386, 316);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.setBounds(70, 34, 109, 23);
		panel_1.add(rdbtnAdmin);
		
		JRadioButton rdbtnUser = new JRadioButton("User");
		rdbtnUser.setBounds(223, 34, 109, 23);
		panel_1.add(rdbtnUser);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblUsername.setBounds(10, 97, 103, 37);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblPassword.setBounds(10, 139, 103, 37);
		panel_1.add(lblPassword);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblAge.setBounds(10, 182, 103, 37);
		panel_1.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblGender.setBounds(10, 230, 103, 37);
		panel_1.add(lblGender);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(101, 104, 211, 23);
		panel_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(101, 151, 211, 23);
		panel_1.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(101, 196, 211, 23);
		panel_1.add(passwordField_2);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(101, 244, 211, 23);
		panel_1.add(passwordField_3);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(223, 278, 89, 23);
		panel_1.add(btnEdit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(473, 49, 386, 88);
		contentPane.add(panel_2);
		
		JLabel label = new JLabel("Staff Accounts");
		label.setFont(new Font("Cambria Math", Font.BOLD, 12));
		label.setBounds(10, 0, 103, 37);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Select Staff ID:\r\n");
		label_1.setFont(new Font("Cambria Math", Font.BOLD, 12));
		label_1.setBounds(150, 11, 108, 29);
		panel_2.add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(150, 48, 89, 20);
		panel_2.add(comboBox_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(473, 167, 386, 316);
		contentPane.add(panel_3);
		
		JLabel lblEmployeeFullname = new JLabel("Employee Fullname");
		lblEmployeeFullname.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblEmployeeFullname.setBounds(10, 22, 103, 37);
		panel_3.add(lblEmployeeFullname);
		
		JLabel lblOldPassword = new JLabel("Old Password");
		lblOldPassword.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblOldPassword.setBounds(10, 63, 103, 37);
		panel_3.add(lblOldPassword);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblNewPassword.setBounds(10, 104, 103, 37);
		panel_3.add(lblNewPassword);
		
		passwordField_4 = new JPasswordField();
		passwordField_4.setBounds(101, 29, 211, 23);
		panel_3.add(passwordField_4);
		
		passwordField_5 = new JPasswordField();
		passwordField_5.setBounds(101, 70, 211, 23);
		panel_3.add(passwordField_5);
		
		passwordField_6 = new JPasswordField();
		passwordField_6.setBounds(101, 111, 211, 23);
		panel_3.add(passwordField_6);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(222, 145, 89, 23);
		panel_3.add(btnSave);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Employee ID", "Employee Fullname"
			}
		));
		table.setBounds(20, 196, 292, 90);
		panel_3.add(table);
		
		setLocationRelativeTo(null);
	}
}
