package com.streams;

interface MyInterface{  
	 
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void existingMethod(String str);  
}  
interface MyInterface2{  
	 
//    default void newMethod(){  
//        System.out.println("Newly added default method");  
//    }  
    void disp(String str);  
} 
public class MultipleInheritanceExample1 implements MyInterface, MyInterface2{ 
	// implementing abstract methods
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public void disp(String str){
    	System.out.println("String is: "+str); 
    }
    
    public static void main(String[] args) {  
    	MultipleInheritanceExample1 obj = new MultipleInheritanceExample1();
    	
    	//calling the default method of interface
        obj.newMethod();     
  
  
    }  
}

