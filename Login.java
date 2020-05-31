import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
	
	
	private JLabel title,imgLabel;
	private JButton admin,user,exit;
	private JPanel panel;
	private ImageIcon img;
	
	
	public Login()
	{
		super("Login Page");
		this.setSize(750,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		img = new ImageIcon("LoginPage.jpg.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,750,200);
		panel.add(imgLabel); 
		
		title=new JLabel("Choose one of them");
		title.setBounds(300,80,50,80);
		panel.add(title);
		
		admin = new JButton("Admin");
		admin.setBounds(230,220,100,30);
		admin.setBackground(Color.ORANGE);
		panel.add(admin);
		admin.addActionListener(this);
		
		
		user = new JButton("User");
		user.setBounds(350,220,100,30);
		user.setBackground(Color.ORANGE);
		panel.add(user);
		user.addActionListener(this);
		
			
		exit = new JButton("Exit");
		exit.setBounds(300,280,100,30);
		exit.setBackground(Color.ORANGE);
		panel.add(exit);
		exit.addActionListener(this);
		
		
		
		
		
		this.add(panel);
		
	}
	
	
	
	public void actionPerformed(ActionEvent e)
		{ 
		String s = e.getActionCommand();
		if(s=="Exit"){
			System.exit(0);
		}
		else if(s=="Admin")
		{
		AdminLogin a = new AdminLogin();
         a.setVisible(true);	
		this.setVisible(false);
		}
		else if(s=="User")
		{
		UserLogin ul = new UserLogin();
        ul.setVisible(true);	
		this.setVisible(false);
		}
		else{}
		
        }
	
	
	
	
	
	
	
	
	
}