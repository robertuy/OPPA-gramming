package softEng;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AppManager extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppManager frame = new AppManager();
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
	public AppManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 533);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(45, 49, 423, 304);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Username:");
		label.setFont(new Font("Cambria Math", Font.BOLD, 12));
		label.setBounds(20, 11, 70, 33);
		panel.add(label);
		
		textField = new JTextField();
		textField.setBounds(20, 35, 383, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblPassword.setBounds(20, 61, 70, 33);
		panel.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(20, 85, 383, 26);
		panel.add(textField_1);
		
		JLabel lblRetypePassword = new JLabel("Re-type Password");
		lblRetypePassword.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblRetypePassword.setBounds(20, 112, 143, 33);
		panel.add(lblRetypePassword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(20, 135, 383, 26);
		panel.add(textField_2);
		
		JLabel lblAge = new JLabel("Secret question");
		lblAge.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblAge.setBounds(20, 156, 166, 33);
		panel.add(lblAge);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(20, 186, 383, 26);
		panel.add(textField_3);
		
		JLabel lblGender = new JLabel("Secret answer");
		lblGender.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblGender.setBounds(20, 210, 143, 33);
		panel.add(lblGender);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(20, 236, 383, 26);
		panel.add(textField_4);
		
		JRadioButton rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.setBounds(20, 269, 109, 23);
		panel.add(rdbtnAdmin);
		
		JRadioButton rdbtnUser = new JRadioButton("User");
		rdbtnUser.setBounds(203, 269, 109, 23);
		panel.add(rdbtnUser);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(45, 434, 440, 56);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAction = new JLabel("Action");
		lblAction.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblAction.setBounds(10, 0, 70, 33);
		panel_1.add(lblAction);
		
		JButton btnNewAccount = new JButton("New Account");
		btnNewAccount.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewAccount.setBounds(34, 22, 364, 23);
		panel_1.add(btnNewAccount);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(45, 364, 423, 59);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSubmit.setBounds(27, 11, 371, 37);
		panel_2.add(btnSubmit);
		
		JLabel lblAccountRegistration = new JLabel("Account registration");
		lblAccountRegistration.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblAccountRegistration.setBounds(45, 10, 201, 33);
		contentPane.add(lblAccountRegistration);
		
		JLabel lblRegisteredAccounts = new JLabel("Registered Accounts");
		lblRegisteredAccounts.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblRegisteredAccounts.setBounds(497, 10, 200, 33);
		contentPane.add(lblRegisteredAccounts);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(497, 49, 368, 374);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.setBounds(10, 24, 348, 301);
		panel_3.add(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(495, 434, 370, 56);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblActions = new JLabel("Actions");
		lblActions.setBounds(10, 0, 70, 33);
		panel_4.add(lblActions);
		lblActions.setFont(new Font("Cambria Math", Font.BOLD, 12));
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(20, 22, 130, 23);
		panel_4.add(btnNewButton);
		
		JButton btnDeleteAccount = new JButton("Delete Account");
		btnDeleteAccount.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDeleteAccount.setBounds(215, 22, 145, 23);
		panel_4.add(btnDeleteAccount);
	}
}
