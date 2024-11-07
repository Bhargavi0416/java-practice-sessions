package com.java.practice.Threads;

public class MultiThreadex1 extends Thread{
	
//	public void run() {
//		System.out.println("runnable interface");
//	}
	public static void main(String[] args) {
		//MultiThreadex1 m1 = new MultiThreadex1();
		Thread t1 = new Thread("t1");
//		for(int i =1;i<=5;i++)
//		{
		System.out.println("hello "+Thread.currentThread().getName()+" >> " +Thread.currentThread().getId());
//		}
		t1.start();
		
		//Employee e1 = new Employee("t2");
		//Runnable r1 = new Runnable();
	//	MultiThreadex1 t2 = new MultiThreadex1();
		Thread t = new Thread("thread-1");
//		for(int j = 1;j<=5;j++)
//		{
			//System.out.println("hello "+Thread.currentThread());//.getName()+" >> " +Thread.currentThread().getId());
//		}
		t.start();
		
		
		// TODO Auto-generated method stub

	}

}
//class Employee extends Thread{
//	
//	@Override
//	public void run() {
//		
//		
//	}
//}
