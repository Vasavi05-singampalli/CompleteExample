package com.scanner;

import java.util.Scanner;

public class CallingMethodSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//using scanner
		//create a method add
		//pass 2 integers
		//get the sum of the integers
		//result integer will be (result -5)
		System.out.println("Enter no. a:");
		int a=sc.nextInt();
		System.out.println("Enter no. b:");
		int b=sc.nextInt();
		int sum=add(a,b);
		int result=add(a, b)-5;
		System.out.println("sum is= "+sum);
		System.out.println("result is= "+result);
	}
		public static int add(int d,int e){
			int f=d+e;
			return f;
		}

}
