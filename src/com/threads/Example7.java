package com.threads;


	class Example7 implements Runnable 
	{ 
	    int x = 0, y = 0; 
	    int addX() {x++; return x;} 
	    int addY() {y++; return y;} 

	    public void run() { 
			for(int i = 0; i < 10; i++) 
				System.out.println( Thread.currentThread().getName() + ": " +addX() + " " + addY()); 
		} 

	    public static void main(String args[]) 
	    { 
	    	Example7 obj1 = new Example7(); 
	    	Example7 obj2 = new Example7(); 
	        Thread t1 = new Thread(obj1); 
	        Thread t2 = new Thread(obj2); 
	        t1.start(); 
	        t2.start(); 
	    } 
	


}
