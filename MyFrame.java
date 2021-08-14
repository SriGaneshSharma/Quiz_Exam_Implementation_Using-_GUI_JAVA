import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyFrame implements ActionListener
{	
	Frame f;
	Label l2,l1;
	Button b1,b2;
	TextField t1,t2;
	TextField t=new TextField(10);
	String q1,q2,q3,q4,q5,name,id;
	int score=0,i=1;
	MyFrame()
	{
		f=new Frame("Quiz Exam Conducted By K.L.University");
		l2=new Label("Id Number:");
		l1=new Label("Name:");
		l1.setForeground(Color.black);
		l1.setBounds(100,100,20,30);
		l2.setBounds(100,100,20,30);
		l2.setForeground(Color.black);
		f.setSize(500,500);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setBackground(Color.orange);
		t1=new TextField(15);
		t1.setBounds(30,40,10,100);
		t2=new TextField(9);
		t2.setBounds(30,40,10,150);
		b1=new Button("Enter");
		b1.setBounds(10,20,10,10);
		b1.addActionListener(this);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);	
		//f.setResizable(false);
		b1.setActionCommand("1");
	}
	void q1()
	{
		name=t1.getText();
		id=t2.getText();	
		f.add(t);
		f.remove(t1);
		f.remove(t2);
		l1.setText("We cannot create an object for interface????");
		l2.setText("Type YES or NO");
		b1.setLabel("Next");
		b1.setActionCommand("2");
		b1.addActionListener(this);
	}	
	void q2()
	{	
		if(i==1)
		{
			b2=new Button("Previous");
			f.add(b2);
		}
		l1.setText("Is java platform independent?????????");
		b1.setLabel("Next");
		b1.setActionCommand("3");
		b2.setActionCommand("1");
		b1.addActionListener(this);
		b2.addActionListener(this);
		l2.setText("Type YES or NO");
		i++;
	}
	void q3()
	{
		l1.setText("Every java class extends Object class????????");
		b1.setLabel("Next");
		b1.setActionCommand("4");
		b2.setActionCommand("2");
		b1.addActionListener(this);
		b2.addActionListener(this);
		l2.setText("Type YES or NO");
	}

	void q4()
	{
		l1.setText("We Should declare every method as abstract method in abstract class???????");
		b1.setActionCommand("5");
		b1.setLabel("Next");
		b2.setActionCommand("3");
		b1.addActionListener(this);
		b2.addActionListener(this);
		l2.setText("Type YES or NO");	
	}

	void q5()
	{
		l1.setText("Is string is an collection of characters in java???????");
		b1.setLabel("Submit");
		b1.setActionCommand("0");
		b2.setActionCommand("4");
		b1.addActionListener(this);
		b2.addActionListener(this);
		l2.setText("Type YES or NO");
	}

	public void actionPerformed(ActionEvent e)
	{	
		
		String a=e.getActionCommand();
		if(a.equals("1"))
		q1();
		else if(a.equals("2"))
		{
			q1=t.getText();
			q2();
		}
		else if(a.equals("3"))
		{
			q2=t.getText();
			q3();
		}
		else if(a.equals("4"))
		{
			q3=t.getText();
			q4();
		}
		else if(a.equals("5"))
		{
			q4=t.getText();
			q5();
		}
		else if(a.equals("0"))
		{
		q5=t.getText();
		s();
		}
	
	}

	void s()
	{
		q1=q1.toLowerCase();
		q2=q2.toLowerCase();
		q3=q3.toLowerCase();
		q4=q4.toLowerCase();
		q5=q5.toLowerCase();
		if(q1.equals("yes"))
		score++;
		if(q2.equals("yes"))
		score++;
		if(q3.equals("yes"))
		score++;
		if(q4.equals("no"))
		score++;
		if(q5.equals("no"))
		score++;
		f.remove(b1);
		f.remove(b2);		
		f.remove(l2);
		f.remove(t);
		l1.setText("You Have Scored  "+score+" Out of 5");
		try
		{
		saveDetails();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		for(Long ii=0l;ii<=900000000l;ii++);
		System.exit(0);
	}
	
	void saveDetails() throws FileNotFoundException,IOException
	{
		File dd=new File(name);
		dd.createNewFile();
		FileWriter fw=new FileWriter(dd);   
		BufferedWriter d=new BufferedWriter(fw);
		d.write("name : "+name);
		d.newLine();
		d.write("ID Number : "+id);
		d.newLine();
		d.write("Question no 1 answer : "+q1);
		d.newLine();
		d.write("Question no 2 answer : "+q2);
		d.newLine();
		d.write("Question no 3 answer : "+q3);
		d.newLine();
		d.write("Question no 4 answer : "+q4);
		d.newLine();
		d.write("Question no 5 answer : "+q5);
		d.newLine();
		d.write("Total Score : "+score);	
		d.close();
	}
	

	public static void main(String[] args)
	{
		MyFrame m=new MyFrame();	
	}

}	