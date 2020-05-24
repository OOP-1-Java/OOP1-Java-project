package RegForm;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login {
	JFrame frame;
	JLabel name,password;
	String uname,upass;
	
	static JTextField tname;
	static JPasswordField pfpassword;
	JButton login;
	JCheckBox check;
	
	public Login()
	{
		frame=new JFrame("Log in");   //work of  whole frame 
		frame.setSize(1000,400);
		frame.setVisible(true);
		frame.setForeground(Color.RED);
		frame.setLayout(null);
		
		uname=RegForm.tfname.getText();
		upass=RegForm.tpassword.getText();
		name=new JLabel("Name");
		name.setBounds(266,16,300,200);
		frame.add(name);
		
		tname=new JTextField();
		tname.setBounds(366,106,300,20);
		frame.add(tname);
		
		
		
		password=new JLabel("Password");
		password.setBounds(266,152,300,20);
		frame.add(password);
		
		pfpassword=new JPasswordField();  // password field 
		pfpassword.setBounds(366,152,300,20);
		frame.add(pfpassword);
		
		check = new JCheckBox("Check");
		
		check.setSelected(true);
		
		login = new JButton("Log in");
		login.setBounds(366,195,300,40);
		login.setBorderPainted(true);
		
		
		
		 login.addActionListener(new ActionListener()  //execution of submit button
				 {
			          public void actionPerformed(ActionEvent e) {
			        	  
			        	 
			        	 
			        	 
			        	  if(uname.equals(tname.getText()) && upass.equals(pfpassword.getText()))
			        	  {
			        		 JOptionPane.showMessageDialog(null, "This Credentials is correct","success",JOptionPane.PLAIN_MESSAGE);
			        		 Profile s = new Profile();
			        		 frame.setVisible(true);
			        	  }
			        	  else
			        	  {
			        		  
			        	  }
			          }
			       });
		
		frame.add(login);
	}

public static void main (String[] args)
{
new Login();	

}
}