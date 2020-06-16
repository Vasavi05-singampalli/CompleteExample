package com.staticBlock;

public class StaticMethod {

	 static int i = 100;
	  static String s = "Naveensbook";
	  //Static method
	  static void display()
	  {
	     System.out.println("i:"+i);
	     System.out.println("s:"+s);
	  }

	  //non-static method
	  void funcn()
	  {
	      //Static method called in non-static method
	      display();
	  }
	  //static method
	  public static void main(String args[])
	  {
		 StaticMethod obj = new StaticMethod();
		  //You need to have object to call this non-static method
		  obj.funcn();
		  
	      //Static method called in another static method
	      display();
	      int se=i;
	      System.out.println(se);
	   }


}
