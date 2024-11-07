package com.java.practice.SortedSet;

import java.util.NavigableSet;
import java.util.TreeSet;
public class NavigableSetEx1 {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(20);
		ns.add(50);
		ns.add(10);
		ns.add(5);
		ns.add(30);
		ns.add(25);
		System.out.println(ns);
		
		System.out.println(ns.contains(10));
		
		System.out.println("first ele :"+""+ns.first());
		
		System.out.println("last ele :"+""+ns.last());
		
		System.out.println("remove ele :"+""+ns.remove(60));
		
		System.out.println("poll first ele is :"+""+ns.pollFirst());
		
		System.out.println("poll last ele  is:"+""+ns.pollLast());
		
		
		System.out.println("least ele greater than or equal to 30 :"+ns.ceiling(30));
		System.out.println("least ele greater than or equal to 50 :"+ns.ceiling(50));
		
		System.out.println("least ele greater than or equal to 30 :"+ns.ceiling(30));
		
		System.out.println("descending set ele  :"+ns.descendingSet());
		
		System.out.println("floor set ele  print the greatest ele lessthan or equal to 25 :"+ns.floor(25));
		
		System.out.println(ns.headSet(30));
		
		System.out.println(ns.tailSet(10));
		
		System.out.println("higher ele print the highest ele than the given ele (or) null 30 :"+ns.higher(30));
		
		System.out.println("lower  ele print less than ele than the given ele (or) null 20 :"+ns.lower(20));
		
		System.out.println("tailset  ele and boolean  val prnt greater than or equal to 30 :"+ns.tailSet(30,true));
		
	//	System.out.println("least ele greater than or equal to 30 :"+ns.subSet(30, true, 10, true));
		
		
		
		
		
		
		
		
		//System.out.println("first ele :"+""+ns.first());
		
		
//		NavigableSet<Float> nsf = new TreeSet<>();
//		nsf.add(12.2f);
//		nsf.add(10.1f);nsf.add(12.0f);nsf.add(21.0f);
//		
//		System.out.println("float set");
//		for(Float f : nsf) {
//			
//			System.out.println(f); 
	
		}
		//System.out.println(nsf.ceiling(10.1f));
		
		// TODO Auto-generated method stub

	}


