package com.threads;

public class ThreadExample1 extends Thread{
//	i am overriding the run method when i create my own thread which extends Threa
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) throws Exception {
		Thread t1=new ThreadExample1();
		Thread t2=new ThreadExample1();
		t1.setName("Thread0");
		t2.setName("Thread1");
		//t1.sleep(1000);
		t2.setPriority(MAX_PRIORITY);
		t1.setDaemon(true);
		t1.start();		
		System.out.println("This thread is daemon "+t1.isDaemon());
		t2.start();
		System.out.println(t1.getClass());
		
		
		

	}

}
