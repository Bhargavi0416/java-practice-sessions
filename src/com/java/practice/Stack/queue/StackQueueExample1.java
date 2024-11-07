package com.java.practice.Stack.queue;

import java.util.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueueExample1 {
	public static void main(String[]args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(2);
		s.push(4);
		s.push(6);
		s.push(8);
		s.push(10);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s);
		
		Queue<Float> q = new LinkedList<>();
		q.add(1.0f);
		q.add(2.0f);
		q.add(3.0f);
		q.add(4.0f);
		q.add(5.0f);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q);
		
	}

}
