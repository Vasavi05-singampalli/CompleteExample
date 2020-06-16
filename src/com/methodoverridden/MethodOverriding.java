package com.methodoverridden;

class MethodOverridingExample {
	
		   //Overridden method
		   public void disp()
		   {
			System.out.println("disp() method of parent class");
		   }	   
		}
public class MethodOverriding extends MethodOverridingExample{
		   //Overriding method
		   public void disp(){
			System.out.println("disp() method of Child class");
		   }
		   public void newMethod(){
			System.out.println("new method of child class");
		   }
		   public static void main( String args[]) {
			/* When Parent class reference refers to the parent class object
			 * then in this case overridden method (the method of parent class)
			 *  is called.
			 */
		   MethodOverridingExample obj = new MethodOverriding();
			obj.disp();

			/* When parent class reference refers to the child class object
			 * then the overriding method (method of child class) is called.
			 * This is called dynamic method dispatch and runtime polymorphism
			 */
			MethodOverridingExample obj2 = new MethodOverridingExample();
			obj2.disp();
		   }
		

}