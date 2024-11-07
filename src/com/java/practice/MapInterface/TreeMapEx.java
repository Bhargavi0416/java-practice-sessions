package com.java.practice.MapInterface;

import java.util.TreeMap;
public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer,Character> tm = new TreeMap();
		tm.put(1, 'c');
		tm.put(2, 'h');
		tm.put(3, 'a');
		tm.put(4, 'r');
		System.out.println(tm.clone());//{1=c, 2=h, 3=a, 4=r}
		
		System.out.println(tm.containsKey(2));//true
		
		System.out.println(tm.containsValue(0));//false
		
		System.out.println(tm.firstKey());//1

		
		System.out.println(tm.firstEntry());//1=c
		
		System.out.println(tm.pollFirstEntry());//1=c
		
		System.out.println(tm.entrySet());//[2=h, 3=a, 4=r]
		
		System.out.println(tm.get(1));//null
		
		System.out.println(tm.headMap(4));//{2=h, 3=a}
		
		System.out.println(tm.tailMap(3,true));//{3=a, 4=r}
		
		System.out.println(tm.keySet());//[2, 3, 4]
		
		System.out.println(tm.values());//[h, a, r]
		
		System.out.println(tm.subMap(2, 4));//{2=h, 3=a}
		
		System.out.println(tm.lastEntry());//4=r
		
		System.out.println(tm.lastKey());//4
		
		System.out.println(tm.isEmpty());//false
		
		
		System.out.println(tm.remove(3,'a'));//true
		
		System.out.println(tm.ceilingKey(1)); //2
		// TODO Auto-generated method stub

	}

}
