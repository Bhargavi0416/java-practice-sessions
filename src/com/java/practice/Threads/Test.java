package com.java.practice.Threads;

public class Test extends Thread{
	
	public void run() {
		for(int i =0;i<=5;i++)
		{
			System.out.println("hi " +Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.activeCount());
		//System.out.println(Thread.NORM_PRIORITY());
	}
	public static void main(String args[]) {
		Test t = new Test();
		t.run();
		//t.join();
		t.start();
		// TODO Auto-generated method stub

	}

}