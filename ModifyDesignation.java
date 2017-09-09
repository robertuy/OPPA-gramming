package softEng;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifyDesignation extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyDesignation frame = new ModifyDesignation();
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
	public ModifyDesignation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 452);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(10, 11, 435, 391);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit Designation");
		lblNewLabel.setBounds(10, 11, 114, 27);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(20, 49, 394, 244);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Amount :\r\n");
		lblNewLabel_2.setBounds(144, 172, 118, 34);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(101, 202, 159, 31);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 140, 357, 26);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("Designation Name :");
		lblNewLabel_3.setBounds(10, 105, 184, 34);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel_3.setBounds(103, 22, 192, 67);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Designation ID ");
		lblNewLabel_4.setBounds(0, 0, 128, 28);
		panel_3.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(30, 292, 384, 88);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Actions");
		lblNewLabel_1.setBounds(10, 11, 60, 14);
		panel_2.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Confirm\r\n");
		btnNewButton.setBounds(55, 36, 103, 41);
		panel_2.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DesignationInfo d = new DesignationInfo();
				dispose();
				d.setVisible(true);
			}
		});
		btnCancel.setBounds(231, 36, 103, 41);
		panel_2.add(btnCancel);
		
		setLocationRelativeTo(null);
	}

}
