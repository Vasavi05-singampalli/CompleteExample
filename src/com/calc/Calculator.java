package com.calc;

import com.addi.Addition;

public class Calculator {

	public static void main(String[] args) {		
		Test cl=new Test();
		Addition as=new Addition();
		int sum= cl.addi(8,9)+10;
		int sum1=sum+10;
		if(sum1==37){
			System.out.println("Program is successful");
		}
		else{
			System.out.println("Program is not successful");
		}
		String name= "vasavi";
		String name1="vasavi";
		String name2=new String("VASAVI");
		if(name.equalsIgnoreCase(name2)){
			System.out.println("names are same");
		}
		else{
			System.out.println("names are different");
		}
		
		
		
	}
	
}
