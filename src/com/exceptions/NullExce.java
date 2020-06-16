package com.exceptions;

public class NullExce {

	public static void main(String[] args) {
		try{
			String vasu=null;
			System.out.println(vasu.length());
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException occurs");
		}
	}

}
