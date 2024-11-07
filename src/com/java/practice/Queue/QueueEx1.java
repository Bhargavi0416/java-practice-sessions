package com.java.practice.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
	
 	static void Queue_offer(Queue<Integer> a,Queue<Float> b)
	{
//		Integer x = (Integer)a.Queue_offer();
//		System.out.println(a);
	 
		System.out.println(a);
		System.out.println(b);
	
	}
 public static void Queue_poll(Queue<Integer> x)
 {
	 
	 System.out.println(x.poll());
	 
 }
 public static void Queue_peek(Queue<Integer> y)
 {
	 System.out.println(y.peek());
 }
	public static void main(String[] args) {
		Queue<Integer> number = new LinkedList<>();
		number.offer(2);
		number.offer(3);
		number.offer(4);
		number.offer(5);
		//Queue_offer(number,num);
		Queue<Float> num = new LinkedList<>();
		num.offer(1.0f);
		num.offer(2.3f);
		Queue_offer(number,num);
		Queue_poll(number);
		Queue_peek(number);
		Queue_offer(number,num);
		
		// TODO Auto-generated method stub

	}

}
