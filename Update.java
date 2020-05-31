import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Update extends JFrame implements ActionListener
{
	private JLabel id ,name,pass;
	private JTextField idtf,nametf,passtf;
	
	private JButton back,exit,update;
	private JPanel panel;
	private boolean flag;
	
	
	public Update()
	{
		super(" Update ");
		
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		name = new JLabel("name : ");
		name.setBounds(80,10,150,30);
		panel.add(name);
		
		
		nametf = new JTextField();
		nametf.setBounds(200, 10,100, 25);
		panel.add(nametf);
		
		id = new JLabel("id: ");
		id.setBounds(80,50,150,30);
		panel.add(id);
		
		
		
		idtf = new JTextField();
		idtf.setBounds(200, 50,100, 25);
		panel.add(idtf);
		
		back = new JButton("Logout");
		back.setBounds(350,250,100,30);
		back.setBackground(Color.ORANGE);
		panel.add(back);
		back.addActionListener(this);
		
		
		exit = new JButton("Exit");
		exit.setBounds(350,300,100,30);
		exit.setBackground(Color.ORANGE);
		panel.add(exit);
		exit.addActionListener(this);
		
		update = new JButton("update");
		update.setBounds(400,60,100,30);
		update.setBackground(Color.ORANGE);
		panel.add(update);
		update.addActionListener(this);
		
		
		
		
		this.add(panel);
		
		
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		
		if(s=="update")
		{
			flag=true;
			check();
		}
		else if(s=="Logout")
		{
			UserWork u = new UserWork();	
            u.setVisible(true);	
		    this.setVisible(false);
		}
		
		
		else if(s=="Exit")
		{
			System.exit(0);
		}
		else{}
	}
	
	public void check()
	{
        String query = "SELECT `name`, `id`, `email` FROM `user`;";     
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
			System.out.println("UPDATE DONE");
					
			while(rs.next())
			{
                String name = rs.getString("name");
                String id = rs.getString("Password");
				String email = rs.getString("email");
				
			
				if(id.equals(idtf.getText()))
				{
					
				
					
					
					String query2 =" UPDATE `user` SET `name` = '"+nametf.getText()+"' ";

		System.out.println(query2);
		
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "");
			Statement stm = c.createStatement();
			stm.execute(query2);
			stm.close();
			con.close();
			JOptionPane.showMessageDialog(this,"name Updated"); 
			
					
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        } 
					
				}	
				else
					{
						JOptionPane.showMessageDialog(this,"Invalid UserID"); 
					}
			
       
         
			}
			
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