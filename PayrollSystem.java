package softEng;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PayrollSystem extends JFrame {

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
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayrollSystem frame = new PayrollSystem();
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
	public PayrollSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(10, 11, 867, 434);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Payment");
		lblNewLabel.setBounds(10, 0, 123, 50);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 50, 242, 96);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID :");
		lblNewLabel_1.setBounds(77, 0, 83, 37);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 27, 222, 27);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(60, 65, 115, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(667, 11, 165, 71);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(284, 31, 295, 96);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("From :");
		lblNewLabel_3.setBounds(10, 0, 121, 36);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("To :");
		lblNewLabel_4.setBounds(187, -7, 200, 50);
		panel_3.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 31, 135, 54);
		panel_3.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(150, 31, 135, 54);
		panel_3.add(comboBox_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 160, 259, 274);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Information\r\n");
		lblNewLabel_2.setBounds(10, 0, 141, 36);
		panel_4.add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(32, 53, 200, 23);
		textField_6.setColumns(10);
		panel_4.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(32, 97, 200, 23);
		textField_7.setColumns(10);
		panel_4.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(32, 147, 200, 23);
		textField_8.setColumns(10);
		panel_4.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(32, 192, 200, 23);
		textField_9.setColumns(10);
		panel_4.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(32, 240, 200, 23);
		textField_10.setColumns(10);
		panel_4.add(textField_10);
		
		JLabel lblNewLabel_9 = new JLabel("Employee ID :");
		lblNewLabel_9.setBounds(89, 31, 96, 23);
		panel_4.add(lblNewLabel_9);
		
		JLabel lblEmployeeName = new JLabel("Employee Name :");
		lblEmployeeName.setBounds(89, 73, 96, 23);
		panel_4.add(lblEmployeeName);
		
		JLabel lblDesignation = new JLabel("Designation :");
		lblDesignation.setBounds(89, 123, 96, 23);
		panel_4.add(lblDesignation);
		
		JLabel lblRatePerHour = new JLabel("Rate Per Hour :");
		lblRatePerHour.setBounds(89, 170, 96, 23);
		panel_4.add(lblRatePerHour);
		
		JLabel lblOverTimeRate = new JLabel("Over Time Rate  :");
		lblOverTimeRate.setBounds(89, 218, 96, 23);
		panel_4.add(lblOverTimeRate);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(284, 136, 285, 223);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Payroll Computation\r\n");
		lblNewLabel_5.setBounds(10, 0, 200, 33);
		panel_5.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Present Days:");
		lblNewLabel_6.setBounds(93, 24, 117, 26);
		panel_5.add(lblNewLabel_6);
		
		JLabel lblWorkingHours = new JLabel("Working Hours :");
		lblWorkingHours.setBounds(93, 65, 117, 26);
		panel_5.add(lblWorkingHours);
		
		JLabel lblOverTimeHours = new JLabel("Over Time Hours :");
		lblOverTimeHours.setBounds(93, 113, 117, 26);
		panel_5.add(lblOverTimeHours);
		
		JLabel lblGrossPay = new JLabel("Gross Pay :");
		lblGrossPay.setBounds(93, 156, 117, 26);
		panel_5.add(lblGrossPay);
		
		textField_1 = new JTextField();
		textField_1.setBounds(46, 44, 200, 23);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(46, 84, 200, 23);
		panel_5.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(46, 132, 200, 23);
		panel_5.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(46, 176, 200, 36);
		panel_5.add(textField_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(284, 370, 259, 53);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Next Pay :");
		lblNewLabel_8.setBounds(106, 0, 97, 26);
		panel_6.add(lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(26, 20, 223, 23);
		panel_6.add(textField_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(589, 93, 268, 270);
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblLateSummary = new JLabel("Late Summary :\r\n");
		lblLateSummary.setBounds(87, 11, 96, 23);
		panel_7.add(lblLateSummary);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(36, 33, 200, 23);
		panel_7.add(textField_11);
		
		JLabel lblSss = new JLabel("SSS :\r\n");
		lblSss.setBounds(87, 56, 96, 23);
		panel_7.add(lblSss);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(36, 78, 200, 23);
		panel_7.add(textField_12);
		
		JLabel lblPagibig = new JLabel("Pag-Ibig  :\r\n");
		lblPagibig.setBounds(87, 105, 96, 23);
		panel_7.add(lblPagibig);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(36, 125, 200, 23);
		panel_7.add(textField_13);
		
		JLabel lblOthersoptional = new JLabel("Others (Optional) :\r\n");
		lblOthersoptional.setBounds(78, 157, 133, 23);
		panel_7.add(lblOthersoptional);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(36, 178, 200, 23);
		panel_7.add(textField_14);
		
		JLabel lblTotalDeductions = new JLabel("Total Deductions :\r\n");
		lblTotalDeductions.setBounds(87, 212, 96, 23);
		panel_7.add(lblTotalDeductions);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(36, 237, 200, 23);
		panel_7.add(textField_15);
		
		JLabel lblDeductions = new JLabel("Deductions");
		lblDeductions.setBounds(0, 0, 112, 22);
		panel_7.add(lblDeductions);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(589, 370, 268, 53);
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(187, 19, 71, 23);
		panel_8.add(btnClose);
		
		JLabel lblNewLabel_7 = new JLabel("Actions");
		lblNewLabel_7.setBounds(0, 0, 99, 14);
		panel_8.add(lblNewLabel_7);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeViewRecords evr = new EmployeeViewRecords();
				evr.setVisible(true);
			}
		});
		btnView.setBounds(93, 19, 84, 23);
		panel_8.add(btnView);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setBounds(10, 19, 73, 23);
		panel_8.add(btnNewButton_1);
	}

}
