package com.java.practice.Threads;

public class Threadexample extends Thread {
	// initiated run method for thread
	public void run() {
		
		System.out.println("thread is running...........");
	}

	public static void main(String[] args) {
		//
		Threadexample t = new Threadexample();
		t.start();
		
		Threadexample t1 = new Threadexample();
		t1.start();
		
		Threadexample t2 = new Threadexample();
		// invoking thread using Start method
		t2.start();
		
		Threads ts = new Threads();
		Thread th = new Thread(ts,"my thread");
		th.start();
		//System.out.println("");
		String s = th.getName();
		System.out.println(s);
		System.out.println(Thread.activeCount());
		
	}
}
class Threads implements Runnable {
	
	
	public void run() {
		System.out.println("threads implements runnable interface ");
		
		// TODO Auto-generated method stub
		
	} 
		
		// TODO Auto-generated method stub

	}


