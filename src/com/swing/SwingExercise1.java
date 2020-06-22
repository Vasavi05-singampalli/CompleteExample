package com.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

class detailsOfGUI {
	static JFrame frame;
	static JPanel panel;
	static JMenuBar menubar;
	static JMenu home,details,signin,signup,settings;
	static JMenuItem mp,sec,pri,downl,setti,about,empdet,profile,displ,privacy;
	static JButton login,createacc,exitButton;
	static JLabel user,passwrd,euser,epasswrd;
	static JTextField userid,password,euserid,epassword;
	detailsOfGUI(){
		frame=new JFrame("My1st GUI");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		frame.add(panel);	
			
		menubar=new JMenuBar();
		
		home=new JMenu("HOME");
		menubar.add(home);
		mp = new JMenuItem("My Profile");
		sec = new JMenuItem("Security");
		pri = new JMenuItem("Privacy");
		downl = new JMenuItem("Downloads");
		setti = new JMenuItem("Settings");
		home.add(mp);
		home.add(sec);
		home.add(pri);
		home.add(downl);
		home.add(setti);
		
		details=new JMenu("DETAILS");
		menubar.add(details);
		about = new JMenuItem("About");
		empdet = new JMenuItem("Employee Details");
		details.add(about);
		details.add(empdet);
		
		signin=new JMenu("SIGNIN");
		menubar.add(signin);
		user=new JLabel("User ID");
		user.setBounds(10,20,80,25);
		signin.add(user);
		userid=new JTextField(10);
		signin.add(userid);		
		passwrd=new JLabel("Password");
		passwrd.setBounds(10,20,80,25);
		signin.add(passwrd);
		password=new JTextField(10);
		signin.add(password);
		
		login=new JButton("Login");
		signin.add(login);
		
		signup=new JMenu("SIGNUP");
		menubar.add(signup);
		euser=new JLabel("Enter User ID");
		euser.setBounds(10,20,80,25);
		signup.add(euser);
		euserid=new JTextField(10);
		signup.add(euserid);		
		epasswrd=new JLabel("Password");
		epasswrd.setBounds(10,20,80,25);
		signup.add(epasswrd);
		epassword=new JTextField(10);
		signup.add(epassword);
		
		createacc=new JButton("Create Account");
		signup.add(createacc);
				
		settings=new JMenu("SETTINGS");
		menubar.add(settings);
		profile = new JMenuItem("Profile Settings");
		displ = new JMenuItem("Display Settings");
		privacy = new JMenuItem("Privacy Settings");
		settings.add(profile);
		settings.add(displ);
		settings.add(privacy);
		
		frame.getContentPane().add(BorderLayout.NORTH,menubar);
		frame.setVisible(true);
		
		panel.setLayout(null);	
		
		exitButton = new JButton("EXIT");
		exitButton.setBounds(550, 400, 80, 25);
        panel.add(exitButton);

	}
}
public class SwingExercise1 {
	

	public static void main(String[] args) {
		detailsOfGUI o = new detailsOfGUI();
			}	
}


