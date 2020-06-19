package com.threads;

public class Example4 implements Runnable 
{ 
	private int x=0; 
	private int y=0; 
	public static void main(String [] args)
	{
		Example4 obj = new Example4();
		(new Thread(obj)).start(); /*Line 8*/
		(new Thread(obj)).start(); /*Line 9*/
	}
	public synchronized void run () /*Line 11*/
	{
		for (int i=0;i<10;i++) /*Line 13*/
		{
		  x++;
		  y++;
		 System.out.println("x = " +x+" ; y = "+y);
		}
	}
}
