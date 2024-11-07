package com.java.practice.Threads;

public class ThreadMethodsEx implements Runnable {
	
	//public ThreadMethodsEx(String name) {
		//super(name);
		
	//}
	public void run() {
		System.out.println("main Thread :"+Thread.MAX_PRIORITY);
		System.out.println("main Thread :"+Thread.MIN_PRIORITY);
		System.out.println("main thread :"+Thread.NORM_PRIORITY);
		System.out.println("Thread count :"+Thread.activeCount());
		System.out.println("Thread name :"+Thread.currentThread().getName());
		System.out.println("Thread id :"+Thread.currentThread().getId());
		
	}

	public static void main(String[] args) {
		
		ThreadMethodsEx th1 = new ThreadMethodsEx();
		Thread obj = new Thread(th1);
		obj.start(); //start method is used to create a new thread and it will excutes it
	//	obj.join();
		obj.run(); // run method is used to execute the main thread directly without creating another thread 
		//obj.stop();
		Thread t1 = new Thread();
		t1.setName("first thread"); // setname ethod  is used to set a name for every thread 
		t1.setPriority(1); // setpriority will set the priority of a thread
		//t1.getClass();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.equals(obj));
		System.out.println(t1.toString());
		System.out.println(t1.getClass());
		System.out.println(t1.getStackTrace());
		//System.out.println(Thread.currentThread().t1.isAlive());
		System.out.println(t1.isVirtual());
		System.err.println(t1.isInterrupted());
		//System.out.println(t1.countStackFrames());
		//System.out.println(t1.holdsLock(t1));
		//System.out.println(t1.threadId());
		//System.out.println(t1.sleep())
		//System.out.println(t1.suspend());
		//System.out.println(t1.wait());
		//System.out.println(t1.notify());
		// TODO Auto-generated method stub

	}

}
