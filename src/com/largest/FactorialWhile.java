package com.largest;

public class FactorialWhile {

	public static void main(String[] args) {
		int n=5;
		int fact=1;
		while(n>1){
			fact*=n;
			n--;			
		}
		System.out.println(fact);
	}

}
