package com.java.practice.Threads;

public class Str extends Thread {
	
	public void run () {
		String s = "run method";
		System.out.println(s + " "+Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		Str s = new Str();
		//Thread t2 = new Thread(s,"s1");
		s.run();
		s.start();
		// TODO Auto-generated method stub

	}

}
