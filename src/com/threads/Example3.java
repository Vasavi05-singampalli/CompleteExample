package com.threads;

	class Example3 extends Thread 
	{
	    public static void main(String [] args) 
	    {
	    	Example3 t = new Example3(); /* Line 5 */
	        t.run();  /* Line 6 */
	    }

	    public void run() 
	    {
	        for(int i=1; i < 3; ++i) 
	        {
	            System.out.print(i + "..");
	        }
	    }
	}

