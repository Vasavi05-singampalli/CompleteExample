package com.regex;

import java.util.regex.Pattern;

class Regexcls{
public boolean reg1(){
	String content="I am Vasavi from visakhapatnam.I am learning Java";
	String pattern=".*Java*";
	boolean obj1=Pattern.matches(pattern,content);
	return obj1;
}
}
public class RegexExe{
	public static void main(String[] args) {
		Regexcls obj=new Regexcls();		
		boolean answer=obj.reg1();
		System.out.println("The content contains Java: "+answer);
	}
}