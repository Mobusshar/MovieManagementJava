import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


public class UserWork extends JFrame implements ActionListener
{
	
	
    private JTable table;
	private JTextField tablelabel;
    private JButton search,back;
    private String s;
	private boolean flag;
          private  String name,dir,cat,price,red,id;
          private  String name1,dir1,cat1,price1,red1,id1;
          private  String name2,dir2,cat2,price2,red2,id2;
	      private  String name3,dir3,cat3,price3,red3,id3;
	      private  String name4,dir4,cat4,price4,red4,id4;
		  private  String name5,dir5,cat5,price5,red5,id5;
		  private  String name6,dir6,cat6,price6,red6,id6;
		  private  String name7,dir7,cat7,price7,red7,id7;
    public UserWork()
    {
        super("User Work");
        
        
        String[] columnNames = {"name","dir","cat","price","red","id"};
        
        try
        {
            String query = "SELECT * FROM `addmovie` LIMIT 1 OFFSET 0";
           Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "");
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(query);
            
            while(r.next())
            {
                name = r.getString("name");
                dir= r.getString("director");
                cat= r.getString("catagory");
                price= r.getString("price");
                red = r.getString("release date");
                id = r.getString("id");
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            System.out.println(" exception e working");
        }
        
        
        try
        {
            String query = "SELECT * FROM `addmovie` LIMIT 1 OFFSET 1";
           Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "");
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(query);
            
            while(r.next())
            {
                name1 = r.getString("name");
                dir1 = r.getString("director");
                cat1 = r.getString("catagory");
                price1= r.getString("price");
                red1 = r.getString("release date");
                id1 = r.getString("id");
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            System.out.println(" exception e working");
        }
		
		
		
 try
        {
            String query = "SELECT * FROM `addmovie` LIMIT 1 OFFSET 2";
           Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "");
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(query);
            
            while(r.next())
            {
                name2= r.getString("name");
                dir2= r.getString("director");
                cat2= r.getString("catagory");
                price2= r.getString("price");
                red2 = r.getString("release date");
                id2 = r.getString("id");
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            System.out.println(" exception e working");
        }
        
		 try
        {
            String query = "SELECT * FROM `addmovie` LIMIT 1 OFFSET 3";
           Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "");
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(query);
            
            while(r.next())
            {
                name3 = r.getString("name");
                dir3= r.getString("director");
                cat3= r.getString("catagory");
                price3= r.getString("price");
                red3= r.getString("release date");
                id3= r.getString("id");
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            System.out.println(" exception e working");
        }
		
		try
        {
            String query = "SELECT * FROM `addmovie` LIMIT 1 OFFSET 4";
           Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "");
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(query);
            
            while(r.next())
            {
                name4 = r.getString("name");
                dir4= r.getString("director");
                cat4= r.getString("catagory");
                price4= r.getString("price");
                red4 = r.getString("release date");
                id4 = r.getString("id");
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            System.out.println(" exception e working");
        }
        
        try
        {
            String query = "SELECT * FROM `addmovie` LIMIT 1 OFFSET 5";
           Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "");
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(query);
            
            while(r.next())
            {
                name5 = r.getString("name");
                dir5= r.getString("director");
                cat5= r.getString("catagory");
                price5= r.getString("price");
                red5 = r.getString("release date");
                id5 = r.getString("id");
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            System.out.println(" exception e working");
        }
		
		try
        {
            String query = "SELECT * FROM `addmovie` LIMIT 1 OFFSET 6";
           Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "");
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(query);
            
            while(r.next())
            {
                name6 = r.getString("name");
                dir6= r.getString("director");
                cat6= r.getString("catagory");
                price6= r.getString("price");
                red6 = r.getString("release date");
                id6 = r.getString("id");
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            System.out.println(" exception e working");
        }
		
		
		try
        {
            String query = "SELECT * FROM `addmovie` LIMIT 1 OFFSET 7";
           Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "");
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(query);
            
            while(r.next())
            {
                name7 = r.getString("name");
                dir7= r.getString("director");
                cat7= r.getString("catagory");
                price7= r.getString("price");
                red7 = r.getString("release date");
                id7 = r.getString("id");
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            System.out.println(" exception e working");
        }
		
        Object[][] data = {
            {name, dir,cat,price,red,id},
            {name1, dir1,cat1,price1,red1,id1},
            {name2, dir2,cat2,price2,red2,id2},
            {name3, dir3,cat3,price3,red3,id3},
			{name4, dir4,cat4,price4,red4,id4},
			{name5, dir5,cat5,price5,red5,id5},
			{name6, dir6,cat6,price6,red6,id6},
			{name7, dir7,cat7,price7,red7,id7}
        };
        
        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(520,225));
        table.setFillsViewportHeight(true);
        
        
        JScrollPane scrollePane = new JScrollPane(table);
        add(scrollePane);
		
        back = new JButton("Logout");
        back.setBounds(250,300,200,40);
		add(back);
		back.addActionListener(this);
		
		search = new JButton("Search");
        search.setBounds(300,290,200,40);
		add(search);
		search.addActionListener(this);
		
		tablelabel = new JTextField();
		tablelabel.setBounds(250,250, 150, 25);
		add(tablelabel);
		
        
        
        
        setLayout(new FlowLayout());
        setVisible(true);
        setResizable(false);
        setSize(800,450);
        setLocation(0,0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String s = ae.getActionCommand();
		
		if(s=="Logout")
		{
			UserLogin m = new UserLogin();	
        m.setVisible(true);	
		this.setVisible(false);
			
		}
		else if(s=="Search")
		{
			
		}
		
    }
	
 
}
