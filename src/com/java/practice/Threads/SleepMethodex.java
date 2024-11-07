package com.java.practice.Threads;

public class SleepMethodex implements Runnable {
	Thread t;
	public void run() {
		for(int i = 0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);//thread to sleep for 1000 milliseconds
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}

	public static void main(String[] args) {
		Thread t = new Thread(new SleepMethodex());
		t.start();
		Thread t1 = new Thread(new SleepMethodex());
		t1.start();
		// TODO Auto-generated method stub

	}

}
