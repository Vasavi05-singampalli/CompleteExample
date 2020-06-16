package com.scanner;

//Java program to read some values using Scanner 
//class and print their mean. 
import java.util.Scanner; 

public class ScannerDemo 
{ 
 public static void main(String[] args) 
 { 
     // Declare an object and initialize with 
     // predefined standard input object 
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter the numbers ");

     // Initialize sum and count of input elements 
     int sum = 0, count = 0; 

     // Check if an int value is available 
     while (sc.hasNextInt()) 
     { 
         // Read an int value 
         int num = sc.nextInt();         
         sum += num; 
         count++; 
         System.out.println("Sum: " + sum);
         System.out.println("count: "+ count);
         if(num==5){        	 
             break;
         }
         
        
     } 
     
     
     int mean = sum / count; 
     System.out.println("Mean: " + mean); 
 } 
} 

