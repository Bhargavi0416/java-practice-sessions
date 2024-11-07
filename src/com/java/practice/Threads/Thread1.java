package com.java.practice.Threads;

public class Thread1 extends Thread{
	public void run() {
		for(int i = 0;i<5;i++)
		{
			System.out.println(i+""+"hello java");
			//System.out.println("thread :"+""+t1.getName());
			
		}
	}

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.setPriority(2);
		t1.setName("thread 1");
		System.out.println(t1.getPriority());
		t1.start();
		System.out.println(t1.getName());
		t1.interrupt();
		System.out.println(t1.isAlive());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getState());
		System.out.println(t1.getClass());
		System.out.println(t1.hashCode());
		//System.out.println(t1.wait());
		
		Thread th = Thread1.currentThread();
		System.out.println(th);
		// TODO Auto-generated method stub

	}
}