package softEng;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DesignationInfo extends JFrame {

	private JPanel contentPane;
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
					DesignationInfo frame = new DesignationInfo();
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
	public DesignationInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 498);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDesignationRecords = new JLabel("Designation Records\r\n");
		lblDesignationRecords.setBounds(351, 31, 124, 14);
		contentPane.add(lblDesignationRecords);
		
		JPanel panel = new JPanel();
		panel.setBounds(328, 56, 275, 236);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 259, 197);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDesignationName = new JLabel("Designation Name :\r\n\r\n");
		lblDesignationName.setBounds(88, 33, 93, 14);
		panel_1.add(lblDesignationName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(21, 48, 225, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount :\r\n");
		lblAmount.setBounds(98, 79, 57, 14);
		panel_1.add(lblAmount);
		
		textField = new JTextField();
		textField.setBounds(54, 96, 139, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Designation Info\r\n");
		lblNewLabel.setBounds(10, 8, 124, 14);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 143, 236, 43);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Save\r\n");
		btnNewButton_1.setBounds(68, 5, 107, 27);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(20, 219, 249, 170);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnShowInformation = new JButton("Show Information\r\n");
		btnShowInformation.setBounds(30, 29, 173, 23);
		panel_3.add(btnShowInformation);
		
		JButton btnModifyDesignation = new JButton("Modify Designation");
		btnModifyDesignation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifyDesignation md = new ModifyDesignation();
				dispose();
				md.setVisible(true);
			}
		});
		btnModifyDesignation.setBounds(30, 63, 173, 23);
		panel_3.add(btnModifyDesignation);
		
		JButton btnDeleteDesignation = new JButton("Delete Designation");
		btnDeleteDesignation.setBounds(30, 97, 173, 23);
		panel_3.add(btnDeleteDesignation);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeePayroll ee = new EmployeePayroll();
				dispose();
				ee.setVisible(true);
			}
		});
		btnNewButton.setBounds(30, 131, 173, 23);
		panel_3.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Actions\r\n");
		lblNewLabel_1.setBounds(0, 0, 102, 14);
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(328, 321, 275, 127);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Search By:");
		lblNewLabel_2.setBounds(102, 0, 86, 41);
		panel_4.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(40, 52, 209, 22);
		panel_4.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(40, 85, 209, 22);
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		setLocationRelativeTo(null);
	}

}
