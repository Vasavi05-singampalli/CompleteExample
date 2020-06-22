package com.swing;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingExercise {

	public static void main(String[] args) {
		JFrame frame=new JFrame("My1st GUI");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		frame.add(panel);
		
		components(panel);
		
		JMenuBar menubar=new JMenuBar();
		
		JMenu home=new JMenu("HOME");
		menubar.add(home);
		JMenuItem mp = new JMenuItem("My Profile");
		JMenuItem sec = new JMenuItem("Security");
		JMenuItem pri = new JMenuItem("Privacy");
		JMenuItem downl = new JMenuItem("Downloads");
		JMenuItem setti = new JMenuItem("Settings");
		home.add(mp);
		home.add(sec);
		home.add(pri);
		home.add(downl);
		home.add(setti);
		
		JMenu details=new JMenu("DETAILS");
		menubar.add(details);
		JMenuItem about = new JMenuItem("About");
		JMenuItem empdet = new JMenuItem("Employee Details");
		details.add(about);
		details.add(empdet);
		
		JMenu signin=new JMenu("SIGNIN");
		menubar.add(signin);
		JLabel user=new JLabel("User ID");
		user.setBounds(10,20,80,25);
		signin.add(user);
		JTextField userid=new JTextField(10);
		signin.add(userid);		
		JLabel passwrd=new JLabel("Password");
		passwrd.setBounds(10,20,80,25);
		signin.add(passwrd);
		JTextField password=new JTextField(10);
		signin.add(password);
		
		JButton login=new JButton("Login");
		signin.add(login);
		
		JMenu signup=new JMenu("SIGNUP");
		menubar.add(signup);
		JLabel euser=new JLabel("Enter User ID");
		euser.setBounds(10,20,80,25);
		signup.add(euser);
		JTextField euserid=new JTextField(10);
		signup.add(euserid);		
		JLabel epasswrd=new JLabel("Password");
		epasswrd.setBounds(10,20,80,25);
		signup.add(epasswrd);
		JTextField epassword=new JTextField(10);
		signup.add(epassword);
		
		JButton createacc=new JButton("Create Account");
		signup.add(createacc);
				
		JMenu settings=new JMenu("SETTINGS");
		menubar.add(settings);
		JMenuItem profile = new JMenuItem("Profile Settings");
		JMenuItem displ = new JMenuItem("Display Settings");
		JMenuItem privacy = new JMenuItem("Privacy Settings");
		settings.add(profile);
		settings.add(displ);
		settings.add(privacy);
		
		frame.getContentPane().add(BorderLayout.NORTH,menubar);
		//frame.getContentPane().add(new JFrameGraphics());
		frame.setVisible(true);
		}
	private static void components(JPanel panel){
		
		panel.setLayout(null);	
		
		JButton exitButton = new JButton("EXIT");
		exitButton.setBounds(550, 400, 80, 25);
        panel.add(exitButton);
      	
//		JLabel homelable=new JLabel("HOME");
//		homelable.setBounds(10,20,80,25);
//		panel.add(homelable);
//		
//		JLabel detailslable=new JLabel("DETAILS");
//		detailslable.setBounds(160,20,80,25);
//		panel.add(detailslable);
//		
//		JLabel signinlable=new JLabel("SIGNIN");
//		signinlable.setBounds(310,20,80,25);
//		panel.add(signinlable);
//		
//		JLabel signuplable=new JLabel("SIGNUP");
//		signuplable.setBounds(460,20,80,25);
//		panel.add(signuplable);
//		
//		JLabel settingslable=new JLabel("SETTINGS");
//		settingslable.setBounds(10,400,80,25);
//		panel.add(settingslable);			
	}
//	public class JFrameGraphics extends JPanel{
//		public void paint(Graphics g){
//			g.drawString("Hello to JavaTutorial.net", 10, 10);
//		}
//	}
}
