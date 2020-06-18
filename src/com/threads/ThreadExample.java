package com.threads;

public class ThreadExample extends Thread {
	   public void run(){  
	    System.out.println("thread is running...");  
	  } 
	   public static void main(String[] args) {
	     ThreadExample obj = new ThreadExample();
	     obj.start();
	}
}

