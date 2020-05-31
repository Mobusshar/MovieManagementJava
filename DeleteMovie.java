import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class DeleteMovie extends JFrame implements ActionListener
{
	private JLabel name;
	private JTextField nametf;
	private JButton back, exit, delete;
	private JPanel panel;
	public DeleteMovie()
	{
		super("- Delete Movie");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		name = new JLabel("Enter Movie Name : ");
		name.setBounds(100,100,150,30);
		panel.add(name);
		
		nametf = new JTextField();
		nametf.setBounds(260,100,100,30);
		panel.add(nametf);
		
		back = new JButton("Logout");
		back.setBounds(100, 300, 80, 30);
		back.addActionListener(this);
		panel.add(back);
		
		delete = new JButton("Delete");
		delete.setBounds(190, 300, 80, 30);
		delete.addActionListener(this);
		panel.add(delete);
		
		exit = new JButton("EXIT");
		exit.setBounds(280, 300, 80, 30);
		exit.addActionListener(this);
		panel.add(exit);
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		
		if(s.equals(back.getText()))
		{
			AdminWork aw = new AdminWork();	
        aw.setVisible(true);	
		this.setVisible(false);
		
		}
		else if(s.equals(delete.getText()))
		{
			deleteFromDB();
		}
		else if(s.equals(exit.getText()))
		{
			Login l = new Login();
			l.setVisible(true);
			this.setVisible(false);
		}
	}
	
	public void deleteFromDB()
	{
		String query = "DELETE from addmovie where name='"+nametf.getText()+"';";
		System.out.println("hello");
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
