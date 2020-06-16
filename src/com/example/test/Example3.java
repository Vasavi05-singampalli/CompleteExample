package com.example.test;

public class Example3 {
public int a;
public long b;
public void test(long  b)
{
System.out.println("long b");
}
public void test(int a)
{
System.out.println("int a");
}
public static void main(String[] args) {
       
	Example3 e=new Example3();
        e.test(9*1000000000);
        System.out.println(9*1000000000);
        
      
 
    }
 
}

