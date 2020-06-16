package com.polymorphism;

class ABC{
	   public void myMethod(){
		System.out.println("Overridden Method");
	   }
	}
	public class DynamicPoly extends ABC{

	   public void myMethod(){
		System.out.println("Overriding Method");
	   }
	   public static void main(String args[]){
		ABC obj = new DynamicPoly();
		obj.myMethod();
	   }
	}
