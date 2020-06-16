package com.scanner;

import java.util.Scanner;

public class PrintChar {
	static char input1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char input1 = sc.next().charAt(0);
		int object = checkMethod(input1);
		if (object == 1) {
			System.out.println(" First 5 letters of the alphabet");
		} else {
			System.out.println("the array does not contain this charecter");
		}

	}

	public static int checkMethod(char input1) {
		// char[] arr=new char["a","b","c","d","e"]
		int z = 0;
		char arr[] = new String("abcde").toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (input1 == arr[i]) {
				z = 1;// indicator variable changes the status
				break;
			}
		}
		return z;
	}
}
