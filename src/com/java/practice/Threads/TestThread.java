package com.java.practice.Threads;

public class TestThread extends Thread {
	
	public void run() {
		System.out.println("thread is running...."+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().MIN_PRIORITY);
		System.out.println(Thread.currentThread().NORM_PRIORITY);
	}


	public static void main(String[] args) {
		TestThread th = new TestThread();
		th.run();
		th.start();
		
		// TODO Auto-generated method stub

	}

}
