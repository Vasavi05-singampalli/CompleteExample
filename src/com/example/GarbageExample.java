package com.example;

public class GarbageExample{   
	   public static void main(String args[]){  
	        /* Here we are intentionally assigning a null 
	         * value to a reference so that the object becomes
	         * non reachable
	         */
		GarbageExample obj=new GarbageExample(); 
		obj=null;
					
	        /* Here we are intentionally assigning reference a 
	         * to the another reference b to make the object referenced
	         * by b unusable.
	         */
		GarbageExample a = new GarbageExample();
		a=null;
		GarbageExample b = new GarbageExample();
		b = a;
		System.gc();
		System.out.println(a);
		System.out.println(b);
		System.out.println(obj);
	   } 
	   protected void finalize() throws Throwable
	   {
	        System.out.println("Garbage collection is performed by JVM");
	   }
	}
