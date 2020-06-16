package com.scanner;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class StringClass {

	public static void main(String[] args) {
		//StringClass obj=new StringClass();
		Scanner str=new Scanner(System.in);
		System.out.println("Initial name is : ");
		String name=str.nextLine();
		String returnedvalue=replaceCharecter(name);
		//System.out.println("name is: ");
		//String name=str.next();
		System.out.println("After replacing name is: "+returnedvalue);
		
					
		}
	
     public static String replaceCharecter(String inputvalue){
		String replaceString=null;
		//System.out.println(inputvalue.contains("s"));
		if(inputvalue.contains("s")){
			//System.out.println(inputvalue.replace("s", "b"));
			replaceString=inputvalue.replace("s", "b");
		}
		return replaceString;	
		
	}

}
