import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class AddMovie extends JFrame implements ActionListener
{
	private JLabel name, id, dir, cat, price, red;
	private JLabel uname,uid,upass,uemail;
	private JTextField unametf,uidtf,upasstf,uemailtf;
	private Button adduser;
	private JTextField nametf, idtf,dirtf,cattf,pricetf,redtf;
	private JButton back, exit,add;
	private JPanel panel;
	public AddMovie()
	{
		super("");
		
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
		
		dir = new JLabel("Director : ");
		dir.setBounds(100,100,150,30);
		panel.add(dir);
		
		dirtf = new JTextField();
		dirtf.setBounds(260,100,100,30);
		panel.add(dirtf);
		
		cat = new JLabel(" catagory: ");
		cat.setBounds(100,150,150,30);
		panel.add(cat);
		
		cattf = new JTextField();
		cattf.setBounds(260,150,100,30);
		panel.add(cattf);
		
		price= new JLabel("Price : ");
		price.setBounds(100,200,150,30);
		panel.add(price);
		
		pricetf = new JTextField();
		pricetf.setBounds(260,200,100,30);
		panel.add(pricetf);
		
		red = new JLabel("Release Date: ");
		red.setBounds(100, 250, 150, 30);
		panel.add(red);
		
		redtf =new JTextField();
		redtf.setBounds(260, 250, 100, 30);
		panel.add(redtf);
		
		id= new JLabel("Id: ");
		id.setBounds(100, 300, 150, 30);
		panel.add(id);
		
		idtf =new JTextField();
		idtf.setBounds(260, 300, 100, 30);
		panel.add(idtf);
		
		back = new JButton("Logout");
		back.setBounds(100, 350, 80, 30);
		back.addActionListener(this);
		panel.add(back);
		
		add = new JButton("ADD Movie");
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
		String query = "INSERT INTO addmovie VALUES ('"+nametf.getText()+"','"+dirtf.getText()+"','"+cattf.getText()+"','"+pricetf.getText()+"','"+redtf.getText()+"','"+idtf.getText()+"');";
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


