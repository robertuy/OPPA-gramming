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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class newEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newEmployee frame = new newEmployee();
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
	public newEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 67, 727, 378);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstname = new JLabel("First name");
		lblFirstname.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblFirstname.setBounds(10, 86, 86, 35);
		panel.add(lblFirstname);
		
		JLabel lblMiddleName = new JLabel("Middle name");
		lblMiddleName.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblMiddleName.setBounds(10, 132, 86, 35);
		panel.add(lblMiddleName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblLastName.setBounds(10, 178, 86, 35);
		panel.add(lblLastName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblPassword.setBounds(10, 232, 86, 35);
		panel.add(lblPassword);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblDestination.setBounds(369, 86, 86, 35);
		panel.add(lblDestination);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblAddress.setBounds(10, 278, 86, 35);
		panel.add(lblAddress);
		
		JLabel lblBirthDay = new JLabel("Birth day");
		lblBirthDay.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblBirthDay.setBounds(369, 178, 86, 35);
		panel.add(lblBirthDay);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblGender.setBounds(369, 232, 86, 35);
		panel.add(lblGender);
		
		JLabel lblContactNo = new JLabel("Contact no.");
		lblContactNo.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblContactNo.setBounds(369, 278, 86, 35);
		panel.add(lblContactNo);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblAge.setBounds(369, 132, 86, 35);
		panel.add(lblAge);
		
		textField = new JTextField();
		textField.setBounds(122, 281, 200, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 82, 200, 28);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 135, 200, 28);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(122, 181, 200, 28);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 231, 200, 28);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(481, 281, 200, 28);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(481, 86, 200, 28);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(481, 135, 200, 28);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(481, 181, 200, 28);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(481, 235, 200, 28);
		panel.add(textField_9);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Cambria Math", Font.BOLD, 11));
		btnSave.setBounds(176, 320, 89, 23);
		panel.add(btnSave);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeePayroll ee = new EmployeePayroll();
				dispose();
				ee.setVisible(true);
			}
		});
		btnClose.setFont(new Font("Cambria Math", Font.BOLD, 11));
		btnClose.setBounds(542, 320, 89, 23);
		panel.add(btnClose);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblEmployeeId.setBounds(10, 10, 86, 35);
		panel.add(lblEmployeeId);
		
		JLabel label = new JLabel("0000000");
		label.setFont(new Font("Cambria Math", Font.BOLD, 12));
		label.setBounds(132, 10, 86, 35);
		panel.add(label);
		
		JLabel lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPersonalInformation.setBounds(42, 25, 200, 31);
		contentPane.add(lblPersonalInformation);
		
		setLocationRelativeTo(null);
	}

}
