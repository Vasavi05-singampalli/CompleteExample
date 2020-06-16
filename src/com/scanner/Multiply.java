package com.scanner;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the input1: ");
		double input1=st.nextInt();
		System.out.println("Enter the input2: ");
		double input2=st.nextInt();
		System.out.println("Enter the input3: ");
		double input3=st.nextInt();
		double output=multiplyNum(input1, input2, input3);
		System.out.println("The multiplication of the three numbers is: "+output);

	}
	public static double multiplyNum(double a,double b,double c){
		double opermulti=a*b*c;
		return opermulti;
	}

}
