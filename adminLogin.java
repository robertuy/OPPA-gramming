package softEng;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class adminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblPassword;
	private JPanel panel_1;
	private JButton btnLogIn;
	private JButton btnExit;
	private JPasswordField passwordField;
	private JLabel lblLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminLogin frame = new adminLogin();
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
	public adminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(36, 48, 366, 202);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(10, 0, 70, 50);
		panel.add(lblUsername);
		lblUsername.setFont(new Font("Cambria Math", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.setBounds(20, 42, 336, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Cambria Math", Font.BOLD, 12));
		lblPassword.setBounds(10, 61, 70, 50);
		panel.add(lblPassword);
		
		panel_1 = new JPanel();
		panel_1.setBounds(20, 143, 336, 48);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnLogIn.setBounds(10, 11, 89, 23);
		panel_1.add(btnLogIn);
		
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Cambria Math", Font.BOLD, 12));
		btnExit.setBounds(237, 11, 89, 23);
		panel_1.add(btnExit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(20, 96, 336, 27);
		panel.add(passwordField);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Cambria Math", Font.BOLD, 15));
		lblLogin.setBounds(175, 0, 200, 56);
		contentPane.add(lblLogin);
		
		setLocationRelativeTo(null);
	}
}
