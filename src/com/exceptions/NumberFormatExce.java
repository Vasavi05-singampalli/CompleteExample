package com.exceptions;

public class NumberFormatExce {

	public static void main(String[] args) {
		try{
			int a=Integer.parseInt("ABC");
			System.out.println(a);
		   }
		catch(NumberFormatException e){
			System.out.println("Number format exception occurs");
		}

	}

}
