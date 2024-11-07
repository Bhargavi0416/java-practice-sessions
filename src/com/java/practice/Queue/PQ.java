package com.java.practice.Queue;

import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(4);
		pq.add(3);
		pq.add(1);
		pq.add(10);
		pq.add(12);
		pq.add(9);
		pq.add(8);
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		pq.offer(0);
		pq.offer(2);
		System.out.println(pq);
		// TODO Auto-generated method stub

	}

}
