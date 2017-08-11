package SoftEng;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Payroll extends JFrame {

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

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payroll frame = new Payroll();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Payroll() {
		setTitle("Payroll");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 358);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdNumber = new JLabel("ID NUMBER");
		lblIdNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdNumber.setBounds(36, 50, 70, 24);
		contentPane.add(lblIdNumber);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(140, 55, 46, 14);
		contentPane.add(lblName);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 73, 208, 218);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 88, 173);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(108, 11, 90, 173);
		panel.add(textArea_1);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setBounds(108, 195, 89, 23);
		panel.add(btnSelect);
		
		textField = new JTextField();
		textField.setBounds(109, 24, 109, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSearch.setBounds(36, 25, 46, 14);
		contentPane.add(lblSearch);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(264, 46, 365, 127);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName_1 = new JLabel("Name:");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName_1.setBounds(10, 11, 46, 14);
		panel_1.add(lblName_1);
		
		JLabel lblIdNumber_1 = new JLabel("ID Number:");
		lblIdNumber_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdNumber_1.setBounds(10, 35, 86, 14);
		panel_1.add(lblIdNumber_1);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDepartment.setBounds(10, 58, 86, 14);
		panel_1.add(lblDepartment);
		
		JLabel lblHoursWorked = new JLabel("Hours Worked:");
		lblHoursWorked.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHoursWorked.setBounds(10, 82, 86, 14);
		panel_1.add(lblHoursWorked);
		
		JLabel lblPayRate = new JLabel("Pay Rate:");
		lblPayRate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPayRate.setBounds(10, 108, 86, 14);
		panel_1.add(lblPayRate);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(137, 8, 173, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 32, 173, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(137, 55, 173, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(137, 79, 173, 20);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(137, 105, 173, 20);
		panel_1.add(textField_5);
		
		JLabel lblEmployee = new JLabel("EMPLOYEE");
		lblEmployee.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmployee.setBounds(264, 27, 89, 24);
		contentPane.add(lblEmployee);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(241, 200, 291, 108);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblGrossPay_1 = new JLabel("Gross Pay:");
		lblGrossPay_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGrossPay_1.setBounds(10, 11, 80, 14);
		panel_2.add(lblGrossPay_1);
		
		JLabel lblFederalTax = new JLabel("Federal Tax:");
		lblFederalTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFederalTax.setBounds(10, 42, 80, 14);
		panel_2.add(lblFederalTax);
		
		JLabel lblGrossPay = new JLabel("Net Pay:");
		lblGrossPay.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGrossPay.setBounds(10, 72, 68, 14);
		panel_2.add(lblGrossPay);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(100, 8, 173, 20);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(100, 39, 173, 20);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(100, 69, 173, 20);
		panel_2.add(textField_8);
		
		JLabel lblPayrollInformation = new JLabel("PAYROLL INFORMATION");
		lblPayrollInformation.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPayrollInformation.setBounds(243, 177, 155, 24);
		contentPane.add(lblPayrollInformation);
		
		JButton btnCompute = new JButton("COMPUTE");
		btnCompute.setBounds(542, 200, 99, 23);
		contentPane.add(btnCompute);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(542, 234, 99, 23);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main m = new Main();
				m.setVisible(true);
				dispose();
			}
		});
		btnExit.setBounds(542, 268, 99, 23);
		contentPane.add(btnExit);
		setLocationRelativeTo(null);
	}
}
