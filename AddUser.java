import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class AddUser extends JFrame implements ActionListener
{
	
	
	private JLabel name, id, pass, email;
	
	
	private JTextField nametf, idtf,passtf,emailtf;
	private JButton back, exit,add;
	private JPanel panel;
	public AddUser()
	{
		super("Add Movie");
		
		this.setSize(1000, 1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		name = new JLabel("Name : ");
		name.setBounds(100,50,150,30);
		panel.add(name);
		
		nametf= new JTextField();
		nametf.setBounds(260,50,100,30);
		panel.add(nametf);
		
		id = new JLabel("Id : ");
		id.setBounds(100,100,150,30);
		panel.add(id);
		
		idtf = new JTextField();
		idtf.setBounds(260,100,100,30);
		panel.add(idtf);
		
		pass = new JLabel(" Password: ");
		pass.setBounds(100,150,150,30);
		panel.add(pass);
		
		passtf = new JTextField();
		passtf.setBounds(260,150,100,30);
		panel.add(passtf);
		
		email= new JLabel("Email : ");
		email.setBounds(100,200,150,30);
		panel.add(email);
		
		emailtf = new JTextField();
		emailtf.setBounds(260,200,100,30);
		panel.add(emailtf);
		
		
		
		back = new JButton("Logout");
		back.setBounds(100, 350, 80, 30);
		back.addActionListener(this);
		panel.add(back);
		
		add = new JButton("ADD User");
		add.setBounds(190, 350, 80, 30);
		add.addActionListener(this);
		panel.add(add);
		
		exit = new JButton("Exit");
		exit.setBounds(280, 350, 80, 30);
		exit.addActionListener(this);
		panel.add(exit);
		
		
		
		
		
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		
		if(s.equals(exit.getText()))
		{
			System.exit(0);
		}
		else if(s.equals(add.getText()))
		{
			Add();
		}
		else if(s.equals(back.getText()))
		{
			Login l = new Login();
			l.setVisible(true);
			this.setVisible(false);
		}
	}
	public void Add()
	{
		String query = "INSERT INTO user VALUES ('"+name.getText()+"','"+id.getText()+"','"+pass.getText()+"','"+email.getText()+"');";
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "");
			Statement stm = con.createStatement();
			stm.execute(query);
			stm.close();
			con.close();
					
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
    }
}
	
	
	
	
	
	
	
	
	
