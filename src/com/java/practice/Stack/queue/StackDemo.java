package com.java.practice.Stack.queue;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.add(10); //add(obj E)
		stack1.add(1,20); //add(index,obj E)
		stack1.insertElementAt(30,2); //insertElementAt(obj E,index)
		//stack1.setElementAt(50,3);// setElementAt(obj E,index)
		stack1.addElement(40);//addElement(obj E)
		stack1.add(4,50);
		System.out.println(stack1);
		
		stack1.setElementAt(50,3);
		System.out.println(stack1);
		
		Stack<Integer> stack2 = new Stack<>();
		stack2.add(100);
		stack2.addElement(200);
		System.out.println(stack2);
		
		stack2.addAll(stack1);
		System.out.println(stack2);
		
		Stack<String> s1 = new Stack<>();
		s1.add("a");
		s1.add("b");
		s1.add(2,"c");
		s1.addElement("d");
		s1.insertElementAt(null, 4);
		System.out.println(s1);
		
		System.out.println(s1.firstElement());//firstElement()
		
		System.out.println(s1.lastElement());//lastElement()
		
		System.out.println(s1.elementAt(3));
		
		System.out.println(s1.get(2));
		// TODO Auto-generated method stub

	}

}
