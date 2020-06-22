package com.lambdaexpressions;

interface MyInterface{  
    Hello display(String say);  
}  
class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}  
public class LambdaExample3 {  
    public static void main(String[] args) { 
    	//Method reference to a constructor
        MyInterface ref = Hello::new; 
        //Hello obj=new  Hello("hi");
        ref.display("Hello World!");  
    }  
}

