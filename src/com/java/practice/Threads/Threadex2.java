package com.java.practice.Threads;

public class Threadex2 {

	public static void main(String[] args) {
		System.out.println(Thread.activeCount());
		Employee e1 = new Employee();
		e1.start();
		Employee e2 = new Employee();
		e2.start();
		Manager m1 = new Manager();
		Thread t1 = new Thread(m1,"t1");
		t1.start();
		System.out.println(Thread.activeCount());
		//System.out.println(Thread.currentThread());
	}
}
class Employee extends Thread {
	
	@Override
	public void run() {
		System.out.println("extending the thread class "+Thread.currentThread().getName()+ " >> " +Thread.currentThread().getId());
	}
}
class Manager implements Runnable {
	
	@Override
	public void run() {
		System.out.println("implementing the runnable  interface " +Thread.currentThread().getName()+ " >> " +Thread.currentThread().getId());
	
		
		
	
		// TODO Auto-generated method stub

	}

}
		


