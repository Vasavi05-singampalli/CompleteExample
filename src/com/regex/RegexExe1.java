package com.regex;

import java.util.regex.Pattern;

import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

class RegexE{
	public boolean compileMatcher(){
		String content="I am VasaVi";
		String patternstring=".*VAsavI*";
		Pattern pat=Pattern.compile(patternstring,Pattern.CASE_INSENSITIVE );
		java.util.regex.Matcher match=pat.matcher(content);
		boolean obj1=match.matches();
		return obj1;
		
	}
}
public class RegexExe1 {

	public static void main(String[] args) {
		RegexE obj2=new RegexE();
		System.out.println("Is it a match? : "+obj2.compileMatcher());

	}

}
