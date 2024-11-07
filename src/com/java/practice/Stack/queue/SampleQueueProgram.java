package com.java.practice.Stack.queue;

import java.util.LinkedList;
import java.util.Queue;

public class SampleQueueProgram {

	public static void main(String[] args) {
		Queue<String> str = new LinkedList<>();
		str.offer("q");
		str.offer("u");
		str.offer("e");
		str.offer("u");
		str.offer("e");
		System.out.println(str);
		
		String head = str.remove();
		System.out.println(head);
		
		boolean equal = str.equals("q");
		System.out.println(equal);
		
		//str.getClass();
		System.out.println(str.getClass());
		
		System.out.println(str.hashCode());
		
		
		// TODO Auto-generated method stub

	}

}
