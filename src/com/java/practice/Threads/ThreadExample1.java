package com.java.practice.Threads;

import java.util.HashMap;

public class ThreadExample1 extends Thread {
	
	public void run() {
		 int a=10; int  b=20;
		int c = a+b;
		System.out.println(Thread.currentThread()
				.getName());
		System.out.println(Thread.currentThread().getId());
		
		System.out.println("sum of two numbers :"+c);
	}

	public static void main(String[] args) {
		ThreadExample1 t1 = new ThreadExample1();
		t1.run();
		
		
		ThreadExample1 t2 = new ThreadExample1();
		t2.start();
//		System.out.println(t2.currentThread()
//				.getName());
		
	//	System.out.println(t2.getName());
//		Thread t = new Thread();
//		t.start();
//		System.out.println(t.getName());
//		// TODO Auto-generated method stub

	}

	
}
