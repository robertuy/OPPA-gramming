package SoftEng;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addEmployee frame = new addEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public addEmployee() {
		setTitle("Add Employee");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 358);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 38, 253, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIdNumber = new JLabel("ID Number: 000000");
		lblIdNumber.setBounds(10, 11, 107, 21);
		panel.add(lblIdNumber);
		
		JLabel lblName = new JLabel("First Name: ");
		lblName.setBounds(10, 48, 72, 14);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(92, 45, 133, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 76, 133, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(92, 107, 133, 20);
		panel.add(textField_2);
		
		JLabel lblMiddleName = new JLabel("Middle Name: ");
		lblMiddleName.setBounds(10, 79, 72, 14);
		panel.add(lblMiddleName);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(10, 110, 72, 14);
		panel.add(lblLastName);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(10, 146, 46, 14);
		panel.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(66, 142, 57, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFmale = new JRadioButton("Female");
		rdbtnFmale.setBounds(141, 142, 69, 23);
		panel.add(rdbtnFmale);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(10, 171, 72, 14);
		panel.add(lblAge);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		comboBox.setBounds(92, 172, 41, 20);
		panel.add(comboBox);
		
		JLabel lblContact = new JLabel("Contact # :");
		lblContact.setBounds(10, 242, 72, 14);
		panel.add(lblContact);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(92, 239, 133, 20);
		panel.add(textField_3);
		
		JLabel lblBirthDay = new JLabel("Birth Day:");
		lblBirthDay.setBounds(10, 211, 72, 14);
		panel.add(lblBirthDay);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(92, 208, 133, 20);
		panel.add(textField_4);
		
		JLabel lblAddEmployee = new JLabel("PERSONAL INFORMATION");
		lblAddEmployee.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddEmployee.setBounds(10, 11, 253, 26);
		contentPane.add(lblAddEmployee);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(295, 91, 331, 159);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(10, 11, 72, 14);
		panel_1.add(lblPosition);
		
		JLabel lblEmploymentStatus = new JLabel("Employment Status:");
		lblEmploymentStatus.setBounds(10, 51, 117, 14);
		panel_1.add(lblEmploymentStatus);
		
		JLabel lblCompanyDepartment = new JLabel("Company Department:");
		lblCompanyDepartment.setBounds(10, 89, 141, 14);
		panel_1.add(lblCompanyDepartment);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(161, 8, 130, 20);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(161, 48, 130, 20);
		panel_1.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(161, 86, 130, 20);
		panel_1.add(comboBox_3);
		
		JLabel lblDateHired = new JLabel("Date Hired:");
		lblDateHired.setBounds(10, 117, 107, 21);
		panel_1.add(lblDateHired);
		
		JLabel lblAugust = new JLabel("August 12, 2017");
		lblAugust.setBounds(161, 117, 107, 21);
		panel_1.add(lblAugust);
		
		JLabel lblCompanyDeployment = new JLabel("COMPANY DEPLOYMENT");
		lblCompanyDeployment.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCompanyDeployment.setBounds(295, 54, 230, 26);
		contentPane.add(lblCompanyDeployment);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setBounds(293, 277, 98, 26);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(407, 277, 98, 26);
		contentPane.add(btnClear);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main m = new Main();
				m.setVisible(true);
				dispose();
			}
		});
		btnClose.setBounds(528, 277, 98, 26);
		contentPane.add(btnClose);
		setLocationRelativeTo(null);
	}
}
