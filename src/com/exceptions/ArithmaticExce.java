package com.exceptions;

public class ArithmaticExce {

	public static void main(String[] args) {
		try{
			int a=98,b=0;
			int c=a/b;
			System.out.println("result="+c);			
		}
		catch(ArithmeticException e){
			System.out.println("We should not divide a number by Zero");
		}

	}

}
