package com.java.practice.Threads;


public class ThreadName implements Runnable  {
	
	public void run() {
		System.out.println("creating thread by using runnable interface");
		
	}

	public static void main(String[] args) {
		ThreadName obj = new ThreadName();
		Thread th = new Thread(obj);
		th.run();
		Thread th1 = new Thread();
		th1.start();
		System.out.println(th1.getPriority());
		
		th1.setName("set mthod");
		System.out.println(th1.getName());
		System.out.println(Thread.activeCount());
		
		

	}

}
