package com.exceptions;

public class ArrayIndexExce {

	public static void main(String[] args) {
		try{
			String a[]=new String[4];
			a[0]="vasavi";
			a[1]="vasu";
			a[2]="sai";
			a[3]="vani";
			a[4]="vasvi";
			a[5]="vas";
		}
		catch(ArrayIndexOutOfBoundsException error){
			System.out.println("ArrayIndexOutOfBounds");
			error.printStackTrace();
		}

		catch(Exception error){
			System.out.println("ArrayIndexOutOfBounds");
			error.printStackTrace();
		}
		
	}

}
