package com.java.practice.Queue;

import java.util.PriorityQueue;

public class PriorityQueueEx2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> p1 = new PriorityQueue<>();
		p1.offer(8);
		p1.offer(3);
		p1.offer(10);
		p1.offer(15);
		p1.offer(12);
		System.out.println(p1);
		p1.add(13);
		System.out.println(p1);
		
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(13);
		p.add(15);
		p.add(9);
		p.add(11);
		p.add(10);
		p.add(6);
		System.out.println(p);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(4);
		pq.add(3);
		pq.add(1);
		pq.add(10);
		pq.add(12);
		pq.add(9);
		//p.add(8);
		System.out.println(pq);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
