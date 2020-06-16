package com.example;

import com.example.test.Example3;

public class FinalExample   {
	 

		   final int MAX_VALUE=99;
		   void myMethod(){  
		     // MAX_VALUE=101;
		   } 
		   void getFinal(){
				System.out.println("hello");
			}
		   public static void main(String args[]){  
			   FinalExample obj=new  FinalExample();  
		      obj.myMethod(); 
		    FinalParent obj1=new FinalParent() {
			};
		     Example3 obj3=new Example3() {
			};
		   } 
		

}
