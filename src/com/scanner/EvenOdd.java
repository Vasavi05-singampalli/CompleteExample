package com.scanner;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		Scanner eo=new Scanner(System.in);
		 System.out.println("Enter n: ");
		int n =eo.nextInt();		
		if(n%2==0){
			System.out.println(n+" is an even number");
		}
		else{
			System.out.println(n+" is an Odd number");
		}

	}

}
