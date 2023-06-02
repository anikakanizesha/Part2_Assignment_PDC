/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_assignment_pdc;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

/**
 *
 * @author anika
 */

public class AdminLogin extends JFrame{
    
    private JPanel contentPane;
    private JTextField textFieldUsername;
    private JTextField textFieldPassword;
    
    //**Launch The Application**//
    
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                try{
                    AdminLogin frame = new AdminLogin();
                    frame.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
        });
    }
    
    //**Create the frame**//
    public AdminLogin(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 649, 445);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(225, 204, 204));
        contentPane.setBorder(new LineBorder(new Color(0,0,0),3,true));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(230, 230, 250));
        panel.setBorder(new LineBorder(new Color(0,0,0),2,true));
        panel.setBounds(57,23,525,65);
        contentPane.add(panel);
        
        JLabel lblNewLabel = new JLabel("Login for Admin");
        lblNewLabel.setForeground(new Color(25,25,112));
        lblNewLabel.setBackground(UIManager.getColor("CheckBox.background"));
        lblNewLabel.setFont(new Font("Meadow", Font.BOLD, 30));
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Username");
        lblNewLabel.setFont(new Font("Meadow", Font.BOLD, 18));
        lblNewLabel_1.setBounds(62,126,94,13);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Password");
        lblNewLabel.setFont(new Font("Meadow", Font.BOLD, 18));
        lblNewLabel_1.setBounds(62,174,94,13);
        panel.add(lblNewLabel_2);
        
        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(166, 109,324,46);
        contentPane.add(textFieldUsername);
        textFieldUsername.setColumns(10);
        
        textFieldPassword = new JTextField();
        textFieldPassword.setBounds(166, 174,324,46);
        contentPane.add(textFieldPassword);
        textFieldPassword.setColumns(10);
        
        JButton btnNewButton = new JButton("LOGIN");
        btnNewButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String password = textFieldPassword.getText();
                String username = textFieldUsername.getText();
                if(password.contains("Login")&& username.contains("Admin")){
                    textFieldPassword.setText(null);
                    textFieldUsername.setText(null);
                }
                
                
            }
            
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}
