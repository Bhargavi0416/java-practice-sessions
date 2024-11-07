package com.java.practice.Threads;

public class A {
	
	public static void main(String[] args) {
		ThreadExample1 t = new ThreadExample1();
		t.run();
		System.out.println(Thread.currentThread().getName());
		Test t1 = new Test();
		t1.run();
		Str s = new Str();
		Thread t2 = new Thread(s,"s1");
		s.run();
	}

}
