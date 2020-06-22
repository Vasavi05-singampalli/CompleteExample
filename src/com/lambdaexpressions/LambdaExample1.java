package com.lambdaexpressions;

import java.awt.Button;
import java.awt.Frame;


public class LambdaExample1 {  
    public static void main(String[] args) {  
       Frame frame=new Frame("ActionListener Before Java8");  
    
       Button b=new Button("Click Here");  
       b.setBounds(50,100,80,50);  
       
       b.addActionListener(e -> System.out.println("Hello World!")); 
       frame.add(b);

  
       
       frame.add(b);
    
       frame.setSize(200,200);  
       frame.setLayout(null);  
       frame.setVisible(true);   
    }  
}
