package com.java.practice.Stack.queue;

import java.util.Stack;

public class StackEx {
	
	public static void stack_push( Stack <Integer> a,Stack<Float> b ) 
	{
		int x = 5;
		for(int i =0; i<=x;i++)
		{
			
			a.push(i);
			
		}
		
		System.out.println(a);
		System.out.println(b);
	}
	public static void stack_pop (Stack<Integer> c)
	{
		Integer p = (Integer)c.pop();
		//Integer p1 = (Integer)d.pop();
		System.out.println("pop element :"+p);
		//System.out.println(p1);
		
	}
	public static void stack_peek(Stack<Integer> x)
	{
		Integer I = (Integer)x.peek();
		System.out.println("peeked element is :"+I);
		
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		Stack<Float> f = new Stack<>();
		f.add(2.1f);
		f.add(1.0f);
		stack_push(st,f);
		stack_pop(st);
		stack_peek(st);
		stack_pop(st);
	//	stack_push(st);
		stack_push(st,f);
		//System.out.println(a);
		
		
		Stack<Integer> s = new Stack<>();
		//stack_pop(s);
		//stack_push(st,s);
		// TODO Auto-generated method stub

	}

}
