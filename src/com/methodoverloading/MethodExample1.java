package com.methodoverloading;

class Sample {
	
	    public void disp(char c)
	    {
	         System.out.println(c);
	    }
	    public void disp(char c, int num)  
	    {
	         System.out.println(c + " "+num);
	    }
	}
public class MethodExample1
	{
	   public static void main(String args[])
	   {
		   Sample obj = new Sample();
	       obj.disp('a');
	       obj.disp('a',10);
	   }
	

}
