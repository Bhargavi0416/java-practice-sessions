package com.java.practice.Threads;

public class ThreadTh extends Thread{
	@Override
	public void run () {
		System.out.println("creating the thread by using extending thread class ");
		
	}

	public static void main(String[] args) {
		
		ThreadTh t1 = new ThreadTh();
		ThreadTh t2 = new ThreadTh();
		t1.run();
		
		System.out.println("thread-1"+" "+t1.getName()+" "+t1.getId());
		System.out.println("thread-2 "+" "+t2.getName()+" "+t2.getId());
		
		t1.start();
		t2.start();
		
		//now changing the name of the thread
		t1.setName("run method");
		t2.setName("start method");
		
		System.out.println("After changing the thread name ");
		System.out.println("new thread name1: "+" "+t1.getName()+" "+t1.getId());
		System.out.println("new thread name2: "+" "+t2.getName()+" "+t2.getId());
		// TODO Auto-generated method stub

	}

}

