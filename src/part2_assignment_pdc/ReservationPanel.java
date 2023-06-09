/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_assignment_pdc;

/**
 *
 * @author anika
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReservationPanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservationPanel frame = new ReservationPanel();
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
	public ReservationPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 413);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBounds(10, 10, 520, 79);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Reservation Panel");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("The total cost is =");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(39, 115, 273, 33);
		contentPane.add(lblNewLabel_1);
		
		JButton btnClick1 = new JButton("CLICK");
		btnClick1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "200$ per day");
			}
		});
		btnClick1.setFont(new Font("Arial", Font.BOLD, 16));
		btnClick1.setBounds(343, 123, 85, 21);
		contentPane.add(btnClick1);
		
		JLabel lblNewLabel_2 = new JLabel("Total cost for staying over 2 days=");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(38, 177, 274, 21);
		contentPane.add(lblNewLabel_2);
		
		JButton btnClick2 = new JButton("CLICK");
		btnClick2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "100$ per day ");
			}
		});
		btnClick2.setFont(new Font("Arial", Font.BOLD, 15));
		btnClick2.setBounds(343, 177, 85, 21);
		contentPane.add(btnClick2);
	}
}
