package com.java.practice.Threads;

public class TestJoinex extends Thread {
	int sleeptime;
	public TestJoinex(String name,int sleeptime)
	{
		super(name);
		this.sleeptime=sleeptime;
	}public void run() {
		try {
         System.out.println(Thread.currentThread().getName()+" starting.");
         Thread.sleep(sleeptime);
         System.out.println(Thread.currentThread().getName()+" finished.");
		}catch(InterruptedException  e) {
         System.out.println(Thread.currentThread().getName()+" interrupted.");
		}	}
	public static void main(String[] args) {
		TestJoinex t1 = new TestJoinex("Thread 1",2000);//// Sleeps for 2 seconds
		TestJoinex t2 = new TestJoinex("Thread 2",4000);//// Sleeps for 4 seconds
		TestJoinex t3 = new TestJoinex("Thread 3",6000);// Sleeps for 6 seconds
		t1.start();
		t2.start();
		t3.start();
		try {
            t1.join();// Main thread waits for t1 to finish
            System.out.println(t1.getName() + " has finished, now starting the next task.");
            t2.join();// Main thread waits for t2 to finish
            System.out.println(t1.getName() + " has finished, now starting the next task.");
            t3.join();// Main thread waits for t3 to finish
            System.out.println(t1.getName() + " has finished, now starting the next task.");
		}catch(InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
		// TODO Auto-generated method stub

	}

}
