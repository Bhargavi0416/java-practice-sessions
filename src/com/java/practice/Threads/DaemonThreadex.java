package com.java.practice.Threads;



public class DaemonThreadex extends Thread{
	
	public  DaemonThreadex(String name){
		super(name);
	}
		
	public void run() {
		// Checking whether the thread is Daemon or not
		if(Thread.currentThread().isDaemon())//daemon thread will provide the service to user thread. it works in background process
		{
			
			System.out.println((Thread.currentThread().getName()+"is Daemon Thread"));
		}
			else {
				System.out.println((Thread.currentThread().getName()+"is not a Daemon Thread"));
			}
		}
	public static void main(String[] args) {
		DaemonThreadex obj1 = new DaemonThreadex("obj1");
		obj1.setDaemon(true);
		obj1.start();
		DaemonThreadex obj2 = new DaemonThreadex("obj2");
		
		DaemonThreadex obj3 = new DaemonThreadex("obj3");
		obj2.start();
		obj3.setDaemon(true);
		obj3.start();
		
		DaemonThreadex obj4 = new DaemonThreadex("obj4");
		obj4.start();
		obj4.setDaemon(true);//java.lang.IllegalThreadStateException
		
		// TODO Auto-generated method stub

	}

	
		

}
