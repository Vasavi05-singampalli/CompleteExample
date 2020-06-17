package com.regex;

import java.util.regex.Pattern;

public class RegexDemo {
  
		   public static void main(String args[]){  
		      String content = "This is Chaitanya from Beginnersbook.com.";

		      String pattern = ".*book.*";

		      boolean isMatch = Pattern.matches(pattern, content);
		      System.out.println("The text contains 'book'? " + isMatch);
		   }
		}  

