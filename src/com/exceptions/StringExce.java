package com.exceptions;

public class StringExce {

	public static void main(String[] args) {
		try{
		String vasu="vasavi";
		System.out.println(vasu.length());
		char cha=vasu.charAt(0);
		cha=vasu.charAt(10);
		System.out.println(cha);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException occurs");
			e.printStackTrace();
		}
	}

}
