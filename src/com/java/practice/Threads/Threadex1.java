package com.java.practice.Threads;

public class Threadex1 {

	public static void main(String[] args) {
		System.out.println(Thread.activeCount());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println(Thread.NORM_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
//		System.out.println(Thread.MAX_PRIORITY);
		//System.out.println(Thread.holdsLock(args));
		
		Thread t1 = new Thread();
	//	t1.startVirtualThread(t1);
		Thread t2 = new Thread();
		t1.start();
		t2.start();
		System.out.println(Thread.activeCount());
		// TODO Auto-generated method stub

	}

}
