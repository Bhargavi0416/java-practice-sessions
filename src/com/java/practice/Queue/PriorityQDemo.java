package com.java.practice.Queue;

import java.util.PriorityQueue;

public class PriorityQDemo {

	public static void main(String[] args) {
		PriorityQueue<Float> f1 = new PriorityQueue<>();
		
		f1.offer(10.0f);
		f1.offer(1.3f);
		f1.offer(15.1f);
		System.out.println(f1);
		
		System.out.println(f1.size());
		
		System.out.println(f1.comparator());
		
		PriorityQueue<Integer> num = new PriorityQueue<>();
		
		for(int i =0;i<4;i++)
		{
			num.add(i);
			num.add(1);
			//num.add(2);
		}
		System.out.println(num);
		
		System.out.println(num.peek());
		
		System.out.println(num.poll());
		
		System.out.println(num.contains(3));
		
		System.out.println(num.size());
		
		System.out.println(num.iterator());
		
		System.out.println(num.stream());
		
		num.clear();
		System.out.println(num);
		
		System.out.println(num.isEmpty());
		
		// TODO Auto-generated method stub

	}

}
