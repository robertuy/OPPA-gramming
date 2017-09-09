package softEng;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EmployeeSlip extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeSlip frame = new EmployeeSlip();
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
	public EmployeeSlip() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 390);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(43, 72, 470, 132);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Emp ID", "Name"}));
		comboBox.setBounds(192, 33, 106, 20);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(146, 74, 200, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPaySlip = new JLabel("Pay Slip");
		lblPaySlip.setBounds(43, 25, 200, 50);
		contentPane.add(lblPaySlip);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(43, 215, 460, 82);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(73, 29, 89, 42);
		panel_1.add(btnSave);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(269, 29, 89, 42);
		panel_1.add(btnClose);
	}

}
