package com.java.practice.SortedSet;

import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(7);
		ts1.add(17);
		ts1.add(14);
		ts1.add(10);
		ts1.add(8);
		ts1.add(11);
		ts1.add(10);
		System.out.println(ts1);
		
		System.out.println(ts1.remove(8));
		
		System.out.println(ts1.first());
		
		System.out.println(ts1.last());
		
		System.out.println(ts1.pollFirst());
		
		System.out.println(ts1.pollLast());
		
		System.out.println(ts1.size());
		
		System.out.println(ts1.descendingSet());
		
		ts1.clear();
		System.out.print(ts1);
		
		System.out.println(ts1.isEmpty());
		
		
		
		
		// TODO Auto-generated method stub

	}

}
