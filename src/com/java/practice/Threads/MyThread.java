package com.java.practice.Threads;

public class MyThread extends Thread {
	
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"-"+i);
			Thread.yield();/// Yield the processor to allow other threads to execute
		}
	}
	
	
	public static void main(String[] args) {
		MyThread m1 = new MyThread();
	//m1.run();
		MyThread m2 = new MyThread();
		MyThread m3 = new MyThread();
		m1.setName("thread 1");
		m2.setName("thread 2");
		//m3.setName("thread 3");
		m1.start();
		m2.start();
		//m3.start();
		// TODO Auto-generated method stub

	}

}
