/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_assignment_pdc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author anika
 */
public class ReservationLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservationLogin frame = new ReservationLogin();
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
	public ReservationLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(24, 10, 601, 58);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Reservation Login");
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(44, 114, 94, 13);
		contentPane.add(lblNewLabel_1);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(133, 98, 423, 51);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(44, 187, 91, 13);
		contentPane.add(lblNewLabel_2);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(133, 171, 423, 51);
		contentPane.add(textFieldPassword);
		textFieldPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = textFieldPassword.getText();
				String username = textFieldUsername.getText();
				if(password.contains("Login")&& username.contains("Faculty")){
					textFieldPassword.setText(null);
					textFieldUsername.setText(null);
					
					ReservationPanel fp = new ReservationPanel();
					ReservationPanel.main(null);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
					textFieldPassword.setText(null);
					textFieldUsername.setText(null);
				}
			}
		});
		btnNewButton.setBackground(new Color(250, 240, 230));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(50, 261, 100, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUsername.setText(null);
				textFieldPassword.setText(null);
			}
		});
		btnNewButton_1.setBackground(new Color(250, 240, 230));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(255, 261, 100, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBackground(new Color(250, 240, 230));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(471, 261, 100, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Go Back To Welcome Page");
		btnNewButton_3.setBackground(new Color(250, 240, 230));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(133, 325, 383, 51);
		contentPane.add(btnNewButton_3);
	}

}
