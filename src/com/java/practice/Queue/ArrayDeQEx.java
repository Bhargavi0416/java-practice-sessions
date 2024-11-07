package com.java.practice.Queue;

import java.util.ArrayDeque;
public class ArrayDeQEx {

	public static void main(String[] args) {
		ArrayDeque<String> str = new ArrayDeque<>();
		str.add("one");
		str.add("two");
		str.add("three");
		str.add("four");
		str.addLast("five");
		str.offerLast("six");
		str.addFirst("numbers in words");
		str.push("inserting the ");
		System.out.println(str);
		
		System.out.println(str.removeFirst());
		System.out.println(str.pop());
		System.out.println(str.element());
		System.out.println(str.peek());
		System.out.println(str);
		System.out.println(str.poll());
		System.out.println(str.pollFirst());
		
		System.out.println(str.pollLast());
		System.out.println(str.removeLast());
		
		System.out.println(str.peekLast());
		System.out.println(str.removeFirstOccurrence("three"));
		str.offerLast("eight");
		System.out.println(str);
		System.out.println(str.getFirst());
		System.out.println(str.size());
		str.clear();
		System.out.println(str);
		System.out.println(str.isEmpty());
		
		// TODO Auto-generated method stub

	}

}
