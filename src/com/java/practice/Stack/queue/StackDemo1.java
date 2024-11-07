package com.java.practice.Stack.queue;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.add("q");
		s.add("u");
		s.add("e");
		s.add("u");
		s.add("e");
		System.out.println(s);
		
		System.out.println(s.indexOf("u"));//indexOf(obj E)
		
		System.out.println(s.indexOf("q", 0));//indexOf(obj E,index)
		
		System.out.println(s.lastIndexOf("z"));//lastIndexOf(obj E)
		
		System.out.println(s.lastIndexOf("e", 4));//LastIndexOf(obj e,index)
		
		System.out.println(s.size());
		
		s.setSize(6);
		System.out.println(s.size());
		
		System.out.println(s.capacity());
		
		s.trimToSize();
		System.out.println(s.capacity());
		
		System.out.println(s.remove(0));//remove(index)
		
		System.out.println(s.remove("u"));//remove(obj e)
		
		System.out.println(s.removeElement("x"));//removeElement(obj e)
		
		System.out.println(s);//
		
		s.removeElementAt(0);//removeElementAt(index)
		System.out.println(s);
		
		System.out.println(s.removeAll(s)); //removeAll(collection)
		
		System.out.println(s.empty());
		// TODO Auto-generated method stub

	}

}
