package com.java.practice.Threads;

public class InterruptedExample implements Runnable {
	
	public void run() {
		Thread t = Thread.currentThread();
		try {
			for(int i = 0;i<4;i++)
			{   
				System.out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(2000);
			}}catch (InterruptedException e) {
				 System.out.println(Thread.currentThread().getName() + " was interrupted.");
		}
		
	}
	public static void main(String[] args) {
		Thread t = new Thread(new InterruptedExample());
		t.setName("thread 1");
		t.start();
		 try {
	            Thread.sleep(3000); // Main thread sleeps for 3 seconds
	            t.interrupt(); // Interrupt t after 3 seconds
	        } catch (InterruptedException e) {
	            System.out.println("Main thread interrupted.");
	        }
		
		
		
		// TODO Auto-generated method stub
		

	}

}
