package SoftEng;

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

public class Main extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setTitle("Home");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 329);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPayrollSystem = new JLabel("Payroll System");
		lblPayrollSystem.setFont(new Font("Tekton Pro", Font.BOLD, 55));
		lblPayrollSystem.setBounds(25, 31, 398, 49);
		contentPane.add(lblPayrollSystem);
		
		JPanel panel = new JPanel();
		panel.setBounds(35, 107, 374, 167);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addEmployee pv = new addEmployee();
				pv.setVisible(true);
				dispose();
			}
		});
		btnAddEmployee.setBounds(22, 78, 132, 37);
		panel.add(btnAddEmployee);
		
		JButton btnPayroll = new JButton("Payroll");
		btnPayroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Payroll v = new Payroll();
				v.setVisible(true);
				dispose();
			}
		});
		btnPayroll.setBounds(197, 78, 132, 37);
		panel.add(btnPayroll);
		setLocationRelativeTo(null);
	}

}
