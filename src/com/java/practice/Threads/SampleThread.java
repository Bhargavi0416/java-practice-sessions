package com.java.practice.Threads;

public class SampleThread extends Thread{
	
	public void run ()
	{
		
		System.out.println("thread");
	}
	

	public static void main(String[] args) {
		
		Thread t = new Thread();
		t.start();
		SampleThread t1 = new SampleThread();
		t1.start();
		
		State str = t.getState();
		System.out.println(str);
		
		String s = t.getName();
		System.out.println(s);
		
	 System.out.println(Thread.currentThread().getId());
		// TODO Auto-generated method stub

	}

}
