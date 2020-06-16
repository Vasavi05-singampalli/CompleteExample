package com.arraylist;

import java.util.*;

public class Addlist {
	  
		   public static void main(String args[]){  
		      ArrayList<String> alist=new ArrayList<String>();  
		      alist.add("Steve");
		      alist.add("Tim");
		      alist.add("Lucy");
		      alist.add("Pat");
		      alist.add("Angela");
		      alist.add("Tom");
		      System.out.println("alist is: "+alist);
		      //displaying elements
		      
		  
		      //Adding "Steve" at the fourth position
		      alist.add(3, "Steve");
		      ArrayList<String> names=new ArrayList<String>();//alist.subList(1, 4)
		      names.add("vasavi");
		      names.add("sai");
		      names.add("vasu");
		      
		      //displaying elements
		      System.out.println("names are: "+names);
		      System.out.println("After adding steve to list: "+alist);
		      alist.addAll(names);
		      System.out.println("After adding names to alist: "+alist);
		      alist.removeAll(names);
		      alist.addAll(1, names);
		      System.out.println("names string is: "+names);		      
		      System.out.println("Insert all the collection elements to the specified position: "+alist);		      
		      
		      Collections.copy(alist,names);//copying index positions also(repplacing)
		      System.out.println("Copied names: "+alist);		     
		      System.out.println( "name in the 4th position: "+alist.get(3));
		      int position=alist.lastIndexOf("Steve");
		      System.out.println( "Last Index of steve is: "+position);
		      position=alist.lastIndexOf("Tom");
		      System.out.println("Last Index of tom is: "+position);
		      int index=alist.indexOf("vasavi");
		      System.out.println( "Index of vasavi is: "+index);
		      index=alist.indexOf("vasu");
		      System.out.println("Index of vasu is: "+index);
		      System.out.println("Is vasu available in alist?: "+alist.contains("vasu"));
		      System.out.println("Is chakri available in alist?: "+alist.contains("chakri"));
		      System.out.println("Is alist is empty?: "+alist.isEmpty());
		   }  
		

}
