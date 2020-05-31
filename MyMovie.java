import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;



public class MyMovie extends JFrame implements ActionListener
{
	
	
	
	private JLabel name1,name2,name3,name4,price1,price2,price3,price4,img1,img2,img3,img4;
	
	private JButton back, exit,book;
	private JPanel panel;
	private ImageIcon img11,img22,img33,img44;
	
	
	public MyMovie()
	{
		super("- My Movie");
		this.setSize(900, 650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		img11= new ImageIcon("monpura.jpg");
		img1 = new JLabel(img11);
		img1.setBounds(0,0,100,100);
		panel.add(img1); 
		
		name1=new JLabel("Movie Name : Monpura");
		name1.setBounds(150,10,300,100);
		panel.add(name1);
		
		price1=new JLabel("Price : 250");
		price1.setBounds(150,40,300,100);
		panel.add(price1);
		
		
		book = new JButton("Book Ticket");
		book.setBounds(350,50,100,50);
		book.setBackground(Color.ORANGE);
		panel.add(book);
		book.addActionListener(this);
		
		img22= new ImageIcon("jumanji.jpg");
		img2 = new JLabel(img22);
		img2.setBounds(0,250,100,50);
		panel.add(img2);
		
		name2=new JLabel("Movie Name : Jumanji");
		name2.setBounds(150,230,300,100);
		panel.add(name2);
		
		price2=new JLabel("Price : 400");
		price2.setBounds(150,240,300,100);
		panel.add(price2);
		
		
		book = new JButton("Book Ticket");
		book.setBounds(350,235,100,50);
		book.setBackground(Color.ORANGE);
		panel.add(book);
		book.addActionListener(this);
		
		
		img33= new ImageIcon("student.jpg");
		img3 = new JLabel(img33);
		img3.setBounds(0,450,100,100);
		panel.add(img3);
		
		name3=new JLabel("Movie Name : Student Of the year");
		name3.setBounds(150,450,300,100);
		panel.add(name3);
		
		price3=new JLabel("Price : 400");
		price3.setBounds(150,470,300,100);
		panel.add(price3);
		
		
		book = new JButton("Book Ticket");
		book.setBounds(350,460,100,50);
		book.setBackground(Color.ORANGE);
		panel.add(book);
		book.addActionListener(this);
		
		back = new JButton("Logout");
		back.setBounds(550,250,100,30);
		back.setBackground(Color.ORANGE);
		panel.add(back);
		back.addActionListener(this);
		
		
		exit = new JButton("Exit");
		exit.setBounds(350,150,100,30);
		exit.setBackground(Color.ORANGE);
		panel.add(exit);
		exit.addActionListener(this);
		
		
		
		
		this.add(panel);
		
		
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		
		if(s=="Logout")
		{
		UserPanel al = new UserPanel();	
        al.setVisible(true);	
		this.setVisible(false);
			
		}
		else if(s=="Book Ticket")
		{
			JOptionPane.showMessageDialog(this,"Movie is Booked ");
			
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
		else{}
	}
	
}
	