package com.java.practice.MapInterface;

import java.util.*;

public class NaviagleMapEx1 {

	public static void main(String[] args) {
		Queue<Integer> que = new PriorityQueue<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		NavigableMap<String,Queue<Integer>> nmap = new TreeMap<>();
		nmap.put("que ele", que);
		System.out.println(nmap);
//		for(NavigableMap.Entry<String,Queue<Integer>> nm:nmap.entrySet()) {
//			
//			System.out.print(nm.getKey() + " : ");
//			//System.out.println((nmap).getValue());
//		}
//		// TODO Auto-generated method stub

	}

}
