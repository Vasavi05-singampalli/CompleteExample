package com.scanner;
//Get 2 strings inputs from user, write a method to pass these both strings 

//and perform swap logic in the method and the o/p

import java.util.Scanner;

public class StringSwap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("the input1 is: ");
		String input1 = sc.nextLine();//vasavi
		System.out.println("the input2 is: ");
		String input2 = sc.nextLine();//sai
		stringSwap(input1, input2);
		
		// System.out.println("Strings after swapping: "+input1);

	}

	public static void stringSwap(String a, String b) {//a=input1,b=input2
		
		String temp = a;
		a =b;//sai
		b = temp;//vasavi
		System.out.println("Strings after swapping: " +a+" and "+b );
	}

}
// public class StringSwap {
//
// static String input1;
// static String input2;
//
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("the input1 is: ");
//// input1=sc.nextLine();
// System.out.println("the input2 is: ");
//// input2=sc.nextLine();
// stringSwap();
// System.out.println("Strings after swapping: "+ref.input1+" and "+ref.input2);
// }
// public static void stringSwap(){
//// a=a+b;
//// b=a.substring(0, a.length()-b.length());
//// a=a.substring(b.length());
////
// String temp=input1;
// input1=input2;
// input2=temp;
// }
//
// }
//
