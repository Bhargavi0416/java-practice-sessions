package com.java.practice.Threads;

public class JoinMthdEx implements Runnable{
		public void run() {
			Thread t = Thread.currentThread();
			System.out.println("thread-1 :"+t.getName());
			System.out.println("thread Is alive :"+t.isAlive());//it check the thread is alive
		
	}
	public static void main(String[] args)   throws Exception
	{
		Thread t = new Thread(new JoinMthdEx());
		t.setName("one");
		t.start();
		t.join(1000); //// Waits for 1000ms this thread to die.
		
		System.out.println("joining after 1000 milliseconds");
		
		System.out.println("Thread-1 :"+t.getName());
		System.out.println("thread is alive :"+t.isAlive());
		Thread t1 = new Thread();
		System.out.println("thread is alive :"+t1.isAlive());
		t1.start();
		// TODO Auto-generated method stub

	}

}
