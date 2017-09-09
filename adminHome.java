package softEng;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class adminHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminHome frame = new adminHome();
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
	public adminHome() {
		setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 132, 308, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnEmployee = new JButton("Employee Payroll Management System");
		btnEmployee.setBounds(10, 11, 288, 58);
		panel.add(btnEmployee);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 23, 857, 86);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 223, 308, 222);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Account Setting");
		btnNewButton.setBounds(10, 11, 288, 31);
		panel_2.add(btnNewButton);
		
		JButton btnApplicationManager = new JButton("Application Manager");
		btnApplicationManager.setBounds(10, 56, 288, 31);
		panel_2.add(btnApplicationManager);
		
		JButton btnLogHistory = new JButton("Log History");
		btnLogHistory.setBounds(10, 101, 288, 31);
		panel_2.add(btnLogHistory);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(10, 143, 288, 31);
		panel_2.add(btnAbout);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(10, 180, 288, 31);
		panel_2.add(btnLogout);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(365, 132, 512, 313);
		contentPane.add(panel_3);
	}

}
