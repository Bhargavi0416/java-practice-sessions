package com.java.practice.Threads;

public class ThreadT1 extends Thread{
	
	public ThreadT1(String name) {
		super(name);
		
	}
	public ThreadT1() {
		//super();
		
	}
	
	public void run () {
		System.out.println("Thread is running............");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		
	}


	
	
	//class t1{
		
	
	
	public static void main(String[] args) {
		ThreadT1 t = new ThreadT1();
		t.run();
		t.start();
		
		ThreadT1 t1 = new ThreadT1("bhargavi");
		System.out.println("Thread -1 " +t1.getName()+" "+t1.getId());
		t1.start();
		// TODO Auto-generated method stub

	}

}
