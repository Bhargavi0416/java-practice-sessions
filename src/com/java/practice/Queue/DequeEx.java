package com.java.practice.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
public class DequeEx {

	public static void main(String[] args) {
		Deque<Integer> val = new ArrayDeque<>();
		val.addFirst(10);
		val.offerFirst(20);
		val.push(5);
		System.out.println(val);
		
		val.clear();
		
		val.addFirst(100);
		val.addFirst(20);
		val.addFirst(30);
		System.out.println(val);
		
	   val.addLast(25);
	   val.addLast(15);
	   System.out.println(val);
		// TODO Auto-generated method stub

	}

}
