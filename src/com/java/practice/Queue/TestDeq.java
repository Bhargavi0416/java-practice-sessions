package com.java.practice.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
public class TestDeq {

	public static void main(String[] args) {
		Deque<Integer> num = new ArrayDeque<>();
		num.add(5);
		num.offer(4);
		num.push(6);
		num.addFirst(10);
		num.offerFirst(12);
		num.offerLast(15);
		num.addLast(9);
		
		System.out.println(num);
		
		System.out.println(num.peek());
		System.out.println(num.peekFirst());
		System.out.println(num.peekLast());
		
		System.out.println(num.poll());
		System.out.println(num.pollFirst());
		System.out.println(num.pollLast());
		
		num.add(23);
		num.add(43);
		num.addLast(32);
		System.out.println(num);
		
		System.out.println(num.remove());
		System.out.println(num.removeFirst());
		System.out.println(num.removeLast());
		
		num.push(35);
		num.add(98);
		System.out.println(num.removeFirstOccurrence(3));
		System.out.println(num.removeLastOccurrence(98));
		
		System.out.println(num);
		System.out.println(num.getClass());
		System.out.println(num.getFirst());
		System.out.println(num.getLast()); 
		
		System.out.println(num.pop());
		
		System.out.println(num.size());
		
		System.out.println(num.element());
		System.out.println(num.contains(32));
		
		
		
		// TODO Auto-generated method stub

	}

}
