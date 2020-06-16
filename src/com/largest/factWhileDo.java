package com.largest;

public class factWhileDo {

	public static void main(String[] args) {
		int n=7;
		int fact=1;
		do{
			
			fact*=n;
			n--;
			
		}
		while(n>1);
		System.out.println(fact);
	}

}
