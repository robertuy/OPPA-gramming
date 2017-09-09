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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmployeeRecords extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeRecords frame = new EmployeeRecords();
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
	public EmployeeRecords() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeRecords = new JLabel("EMPLOYEE RECORDS");
		lblEmployeeRecords.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblEmployeeRecords.setBounds(10, 10, 140, 36);
		contentPane.add(lblEmployeeRecords);
		
		JLabel lblEmployeeId = new JLabel("EMPLOYEE ID:");
		lblEmployeeId.setFont(new Font("Cambria Math", Font.BOLD, 11));
		lblEmployeeId.setBounds(10, 40, 140, 36);
		contentPane.add(lblEmployeeId);
		
		textField = new JTextField();
		textField.setBounds(91, 47, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnNewButton.setBounds(254, 46, 118, 23);
		contentPane.add(btnNewButton);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnShow.setBounds(411, 46, 118, 23);
		contentPane.add(btnShow);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnEdit.setBounds(561, 46, 118, 23);
		contentPane.add(btnEdit);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnDelete.setBounds(709, 46, 118, 23);
		contentPane.add(btnDelete);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 87, 867, 358);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(34, 33, 733, 280);
		panel.add(table);
		
		setLocationRelativeTo(null);
	}

}
