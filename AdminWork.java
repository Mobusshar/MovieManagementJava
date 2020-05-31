import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AdminWork  extends JFrame implements ActionListener
{
	private JLabel title,imgLabel;
	private JButton add,adduser,delete,exit,back,update;
	private JPanel panel;
	private ImageIcon img;

	
	
	
	public AdminWork()
	
	{
		super(" Admin Work");
		this.setSize(750,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		
		title = new JLabel("Choose ");
		title.setBounds(350,130,100,30);
		panel.add(title);
		
		add=new JButton ("Add Movie");
		add.setBounds(300,200,100,30);
		panel.add(add);
		add.addActionListener(this);
		
		delete=new JButton ("Delete Movie");
		delete.setBounds(300,250,100,30);
		panel.add(delete);
		delete.addActionListener(this);
		
		back=new JButton ("Logout");
		back.setBounds(300,300,100,30);
		panel.add(back);
		back.addActionListener(this);
		
		exit=new JButton ("Exit");
		exit.setBounds(400,250,100,30);
		panel.add(exit);
		exit.addActionListener(this);
		
		adduser=new JButton ("Add User");
		adduser.setBounds(300,150,100,30);
		panel.add(adduser);
		adduser.addActionListener(this);
		
		update=new JButton ("Update");
		update.setBounds(300,350,100,30);
		panel.add(update);
		update.addActionListener(this);
		
		img = new ImageIcon("AdminWork.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(30,0,200,450);
		panel.add(imgLabel);
		
		this.add(panel);
		
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		
		if(s=="Logout")
		{
		AdminLogin al = new AdminLogin();	
        al.setVisible(true);	
		this.setVisible(false);
			
		}
		else if(s=="Add Movie")
		{
			AddMovie am=new AddMovie();
			am.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(s=="Update")
		{
			Update up=new Update();
			up.setVisible(true);
			this.setVisible(false);
			
		}
		else if(s=="Exit")
		{
			System.exit(0);
		}
		else if(s=="Delete Movie")
		{
			DeleteMovie dm=new DeleteMovie();
			dm.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(s=="Add User")
		{
			AddUser da=new AddUser();
			da.setVisible(true);
			this.setVisible(false);
			
		}
		else{}
	}
	
	
}
