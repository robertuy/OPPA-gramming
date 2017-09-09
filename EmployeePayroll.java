package softEng;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeePayroll extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeePayroll frame = new EmployeePayroll();
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
	public EmployeePayroll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 533);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblP = new JLabel("Payroll System");
		lblP.setFont(new Font("Cambria Math", Font.BOLD, 14));
		lblP.setBounds(10, 10, 132, 30);
		contentPane.add(lblP);
		
		JLabel lblEmployeePayrollSystem = new JLabel("EMPLOYEE PAYROLL SYSTEM");
		lblEmployeePayrollSystem.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblEmployeePayrollSystem.setBounds(387, 23, 438, 64);
		contentPane.add(lblEmployeePayrollSystem);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 81, 247, 343);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Main Menu");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 0, 74, 35);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Payroll System");
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnNewButton.setBounds(20, 30, 211, 23);
		panel.add(btnNewButton);
		
		JButton btnAttendance = new JButton("Attendance");
		btnAttendance.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnAttendance.setBounds(20, 64, 211, 23);
		panel.add(btnAttendance);
		
		JLabel lblActions = new JLabel("Actions");
		lblActions.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblActions.setBounds(10, 93, 74, 35);
		panel.add(lblActions);
		
		JButton btnNewWorker = new JButton("New Employee");
		btnNewWorker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newEmployee e = new newEmployee();
				dispose();
				e.setVisible(true);
			}
		});
		btnNewWorker.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnNewWorker.setBounds(20, 125, 211, 23);
		panel.add(btnNewWorker);
		
		JButton btnEmployeeRecords = new JButton("Employee Records");
		btnEmployeeRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeRecords er = new EmployeeRecords();
				er.setVisible(true);
			}
		});
		btnEmployeeRecords.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnEmployeeRecords.setBounds(20, 159, 211, 23);
		panel.add(btnEmployeeRecords);
		
		JButton btnDesignation = new JButton("Designation");
		btnDesignation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DesignationInfo di = new DesignationInfo();
				dispose();
				di.setVisible(true);
			}
		});
		btnDesignation.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnDesignation.setBounds(20, 193, 211, 23);
		panel.add(btnDesignation);
		
		JButton btnPayrollSlip = new JButton("Payroll Slip");
		btnPayrollSlip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeSlip es = new EmployeeSlip();
				es.setVisible(true);
			}
		});
		btnPayrollSlip.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnPayrollSlip.setBounds(20, 227, 211, 23);
		panel.add(btnPayrollSlip);
		
		JButton btnPayrollReports = new JButton("Payroll Reports");
		btnPayrollReports.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnPayrollReports.setBounds(20, 261, 211, 23);
		panel.add(btnPayrollReports);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnClose.setBounds(20, 295, 211, 23);
		panel.add(btnClose);
		
		JLabel lblPayrollManagementSystem = new JLabel("Payroll Management System | All Rights Reserved 2017");
		lblPayrollManagementSystem.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblPayrollManagementSystem.setBounds(288, 454, 392, 30);
		contentPane.add(lblPayrollManagementSystem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(270, 81, 607, 343);
		contentPane.add(panel_1);
		setLocationRelativeTo(null);
	}

	
	
}
