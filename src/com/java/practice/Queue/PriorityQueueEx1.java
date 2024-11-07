package com.java.practice.Queue;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(3);
		pq.add(5);
		pq.add(1);
		pq.add(2);
		pq.add(7);
		pq.offer(0);
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		System.out.println(pq);
		pq.offer(0);
		System.out.println(pq);
		
		
		
		// TODO Auto-generated method stub

	}

}
