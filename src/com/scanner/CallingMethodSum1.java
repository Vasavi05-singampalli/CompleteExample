package com.scanner;

import java.util.Scanner;



public class CallingMethodSum1 {
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter number a: ");
		double input1 = sr.nextDouble();//user getting value1
		System.out.println("Enter number b: ");//it prints that value
		double input2 = sr.nextDouble();//user getting value2
		double sumValue=addMethod(input1, input2);//calling a method which has 2 parameters inside it and 
		//it goes to that method and call that values and finally get the value
//		Double result = sumValue - 5;
//		//System.out.println("sum is : " + sumValue);
//		System.out.println("sum-5 is : " + result);
		
		// double addition=c+d;
		// return addition;
	}
	public static double addMethod(double a, double b) {//after line 15 it comes 
		//to this method which has 2 parameters

		Double sum = a+b;//and add the parameters
		
		return sum;	//it returns the sum to the method 
	}
	public static String replaceCharecter(String inputvalue){
		String replaceString=null;
		//System.out.println(inputvalue.contains("s"));
		if(inputvalue.contains("s")){
			//System.out.println(inputvalue.replace("s", "b"));
			replaceString=inputvalue.replace("s", "b");
		}
		return replaceString;	
		
	}
		

}
