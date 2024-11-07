package com.java.practice.Queue;

import java.util.PriorityQueue;

public class SamplePq {

	public static void main(String[] args) {
		PriorityQueue<String> word = new PriorityQueue<>();
		word.offer("slate");
		word.offer("book");
		word.offer("pen");
		word.offer("pencil");
		word.offer("sharpner");
	    word.offer("marker");
	    word.offer("Eraser");
	    System.out.println(word);
		// TODO Auto-generated method stub

	}

}
