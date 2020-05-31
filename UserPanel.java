import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


public class UserPanel extends JFrame implements ActionListener
{
	
	
	
	private JLabel name,imgLabel;
	private JTextField nametf;
	private JButton back, exit,table,movie,search;
	private JPanel panel;
	private ImageIcon img;
	private boolean flag;
	
	
	public UserPanel()
	{
		super(" User  Panel");
		this.setSize(600, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		img = new ImageIcon("UserPanel.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,300,400);
		panel.add(imgLabel); 
		
		name=new JLabel("Choose one of them");
		name.setBounds(350,80,300,100);
		panel.add(name);
		
		nametf=new JTextField();
		nametf.setBounds(200, 60, 200, 30);
		nametf.setBackground(Color.YELLOW);
		panel.add(nametf);
		
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
		
		search = new JButton("Search");
		search.setBounds(400,60,100,30);
		search.setBackground(Color.ORANGE);
		panel.add(search);
		search.addActionListener(this);
		
		table = new JButton("Table");
		table.setBounds(350,150,100,30);
		table.setBackground(Color.ORANGE);
		panel.add(table);
		table.addActionListener(this);
		
		movie = new JButton("Movie");
		movie.setBounds(350,200,100,30);
		movie.setBackground(Color.ORANGE);
		panel.add(movie);
		movie.addActionListener(this);
		
		
		this.add(panel);
		
		
	}
	
	
	public void actionPerformed(ActionEvent e)
		{ 
		String s = e.getActionCommand();
		if(s=="Exit"){
			System.exit(0);
		}
		else if(s=="Logout")
		{
		UserLogin a = new UserLogin();
         a.setVisible(true);	
		this.setVisible(false);
		}
		else if(s=="Movie")
		{
		MyMovie ul = new MyMovie();
        ul.setVisible(true);	
		this.setVisible(false);
		}
		else if(s=="Table")
		{
		UserWork l = new UserWork();
        l.setVisible(true);	
		this.setVisible(false);
		}
		else if(s=="Search")
		{
			flag=true;
		   search();
		}
		else{}
		
        }
	
	
	public void search()
		{
			String query = "SELECT `name`, `director`, `catagory`, `price`, `Release Date`, `id` FROM `addmovie`;";     
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
                String name = rs.getString("name");
                String director = rs.getString("director");
				String catagory = rs.getString("catagory");
				String price = rs.getString("price");
				String releasedate= rs.getString("Release Date");
				String id = rs.getString("id");
				
			
				flag=false;
				if(name.equals(nametf.getText()))
				{
					
					
					
					JOptionPane.showMessageDialog(this,"Found " +" | Name : " +name +"|  direcctor : "+director+"|  catagory : "+catagory+"|    price : "+price);
					
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