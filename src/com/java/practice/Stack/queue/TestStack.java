package com.java.practice.Stack.queue;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("stack"); // push(obj E) method Pushes an element on the top of the stack.
		s.push("methods are");
		s.push("push(obj E)");
		s.push("pop");
		s.push("peek");
		s.push("empty()");
		s.push("Search(obj E)");
		s.push("push(obj E) ");
		System.out.println(s);
		
		System.out.println(s.size());
		
		System.out.println(s.capacity());
		
		System.out.println("popped elements");
		for(int i =0; i<8;i++)
		//for(int i =0;i<s.size();i--)
		//for(int i=0; i<=s.size();i++)
		{
			String a = (String) s.pop();
		//	s.pop();
			System.out.println(a);
		}
		
		//for
		System.out.println(s.size());
		
		Stack<Integer> s1 = new Stack<>();
		
		int a = 5;
		for(int j =0;j<=a;j++)
		{
			s1.push(j);
		}
		System.out.println(s1);
		
		System.out.println(s1.peek());
		
		System.out.println(s1.search(0));
		
		s1.clear();
		System.out.println(s1);
		
		System.out.println(s1.empty());
		
		// TODO Auto-generated method stub

	}

}
