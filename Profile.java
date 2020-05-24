package RegForm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Profile {
	
	JFrame frame;
	JLabel hlw,name,cow,hen,duck,trees,have,land;
	JButton notice,problem;
	
	public Profile()
	{
	frame=new JFrame("Farmer Profile");   //work of  whole frame 
	frame.setSize(1000,700);
	frame.setVisible(true);
	frame.setForeground(Color.RED);
	frame.setLayout(null);
	
	
	
	hlw=new JLabel("Welcome  ,");
	hlw.setBounds(100,90,300,20);
	frame.add(hlw);
	
	name=new JLabel(RegForm.tfname.getText());
	name.setBounds(170,90,300,20);
	name.setForeground(Color.BLUE);
	frame.add(name);
	
	have=new JLabel("You have   ,");
	have.setBounds(20,170,300,20);
	frame.add(have);
	
	cow=new JLabel("Total Cows ..........."+RegForm.cowbox.getSelectedItem());
	cow.setBounds(40,250,300,20);
	frame.add(cow);
	
	duck=new JLabel("Total Ducks ..........."+RegForm.duckbox.getSelectedItem());
	duck.setBounds(40,300,300,20);
	frame.add(duck);
	
	hen=new JLabel("Total Hen   ..........."+RegForm.henbox.getSelectedItem());
	hen.setBounds(40,325,300,20);
	frame.add(hen);
	
	trees=new JLabel("Total Duck   ..........."+RegForm.duckbox.getSelectedItem());
	trees.setBounds(40,350,300,20);
	frame.add(trees);
	
	land=new JLabel("You have   ,"+RegForm.tland.getText()+ "  acress of land ");
	land.setBounds(100,400,300,20);
	frame.add(land);
	
	
	
	notice=new JButton("Log Out");
	notice.setBounds(560, 200, 85, 25);
	
	
	
	 notice.addActionListener(new ActionListener()  //execution of submit button
			 {
		          public void actionPerformed(ActionEvent e) {
		        	  
		        	 
		        	  Login x = new Login();
	        		  frame.setVisible(true);
		        	 
		        	  
		          }
		       });
	 
	 problem=new JButton("Submit a Problem  ");
	 problem.setBounds(700, 200, 145, 25);
		
		
		
	 problem.addActionListener(new ActionListener()  //execution of submit button
				 {
			          public void actionPerformed(ActionEvent e) {
			        	  
			        	 
			        	  Feedback x = new Feedback();
		        		  frame.setVisible(true);
			        	 
			        	  
			          }
			       });
	 frame.add(problem);	   
	frame.add(notice);
	
}
	public static void main(String args[])
	{
		new Profile();
	}
}