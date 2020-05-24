package RegForm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Feedback {
	JFrame frame;
	JTextArea ta;
	JLabel name,password,confirm;
	JButton send;

	public Feedback ()
	{
		frame=new JFrame("Feedback");   //work of  whole frame 
		frame.setSize(1000,400);
		frame.setVisible(true);
		frame.setForeground(Color.RED);
		frame.setLayout(null);
		
		
		
		ta=new JTextArea();
		ta.setBounds(366,106,300,200);
		frame.add(ta);
		
		ta.setText("I am  "+RegForm.tfname.getText()+ " I am recently facing problem about                                           ");
		
		send = new JButton("Send");
		send.setBounds(366,395,300,40);
		send.setBorderPainted(true);
		frame.add(send);
		
		send.addActionListener(new ActionListener()  //execution of submit button
				 {
			          public void actionPerformed(ActionEvent e) {
			        	  confirm.setVisible(true);
			        	 
			        	 
			          }
			       });
		confirm=new JLabel("Your message were sent to concerned individuals");
		confirm.setBounds(690,109,300,20);
		confirm.setForeground(Color.GREEN);
		confirm.setVisible(false);
		frame.add(confirm);
	
	}
	
	

public static void main (String args[])
{
	new Feedback();
}
}