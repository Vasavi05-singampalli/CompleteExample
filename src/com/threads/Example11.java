package com.threads;

class Example11 extends Thread 
{
    public static void main(String [] args) 
    {
    	Example11 t = new Example11();
        t.start();
        System.out.print("one. ");
        t.start();
        System.out.print("two. ");
    }
    public void run() 
    {
        System.out.print("Thread ");
    }
}
