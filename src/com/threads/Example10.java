package com.threads;



class MThread extends Thread
{
	MThread() 
	{
		System.out.print(" MyThread");
	}
	public void run() 
	{
		System.out.print(" bar");
	}
	public void run(String s) 
	{
		System.out.println(" baz");
	}
}
public class Example10 
{
	public static void main (String [] args) 
	{
		Thread t = new MThread() 
		{
			public void run() 
			{
				System.out.println(" foo");
			}
		};
		t.start();
	}
}
