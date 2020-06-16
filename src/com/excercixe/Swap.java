package com.excercixe;

public class Swap {

	public static void main(String[] args) {
		int num1=35;
		int num2=67;
		int num3=76;
		System.out.println(num1+" "+num2+" "+num3);

		int temp;
		temp=num1;
		num1=num2;
		num2=num3;
		num3=temp;
		System.out.println(num1+" "+num2+" "+num3);
		
		
		//using bitwise operators
		 int x = 10; 
	        int y = 5; 
	        x = x + y; 
	        y = x - y; 
	        x = x - y; 
	        System.out.println("After swaping:"
	                           + " x = " + x + ", y = " + y);

	}

}

