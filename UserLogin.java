import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class UserLogin extends JFrame implements ActionListener
{
	
	private JLabel id,pass;
	private JButton login,back,exit;
	private JPanel panel;
	private JTextField idtf;
	private JPasswordField passtf;
	private boolean flag;
	
	public UserLogin(){
		
		super("User Login page");
		this.setSize(750,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		id = new JLabel("Enter Id: ");
		id.setBounds(100,130,100,30);
		panel.add(id);
		
		idtf = new JTextField();
		idtf.setBounds(200, 130, 200, 30);
		idtf.setBackground(Color.YELLOW);
		panel.add(idtf);
		
		pass = new JLabel("Password: ");
		pass.setBounds(100,200,100,30);
		panel.add(pass);
		
		passtf= new JPasswordField();
		passtf.setBounds(200, 200, 200, 30);
		passtf.setBackground(Color.CYAN);
		passtf.setEchoChar('o');
		panel.add(passtf);
		
		
		login = new JButton("Login");
		login.setBounds(200, 270, 100, 40);
		login.setBackground(Color.GREEN);
		login.addActionListener(this);
		panel.add(login);
		
		back = new JButton("Back");
		back.setBounds(350, 270, 100, 40);
		back.setBackground(Color.RED);
		back.addActionListener(this);
		panel.add(back);
		
		

		
		exit = new JButton("Exit");
		exit.setBounds(350, 300, 100, 40);
		exit.setBackground(Color.RED);
		exit.addActionListener(this);
		panel.add(exit);
		
		
		this.add(panel);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		
		if(s=="Login")
		{
			
			flag=true;
			check();
		}
		else if(s=="Back")
		{
			Login l = new Login();
			l.setVisible(true);
			this.setVisible(false);
		}
		else if(s=="Exit")
		{
			
			System.exit(0);
			
		}
	}
	
	public void check()
	{
		String query = "SELECT `name`, `id`, `password`, `email` FROM `user`;"; 
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
					
			while(rs.next())
			{
                String name= rs.getString("name");
				String id= rs.getString("id");
                String password= rs.getString("password");
				String email = rs.getString("email");
				
				
				if(id.equals(idtf.getText()))
				{
					flag=false;
					if(password.equals(passtf.getText()))
					{
						UserPanel aw=new UserPanel();
						this.setVisible(false);
						aw.setVisible(true);
						
						
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Invalid pass"); 
					}
				}			
			}
			if(flag){JOptionPane.showMessageDialog(this,"Invalid name"); }
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
        finally
		{
            try
			{
                if(rs!=null)
					rs.close();

                if(st!=null)
					st.close();

                if(con!=null)
					con.close();
            }
            catch(Exception ex){}
        }
		
			
	}
}