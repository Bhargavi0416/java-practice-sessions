package com.java.practice.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetex {

	public static void main(String[] args) {
		SortedSet<Integer> Ss = new TreeSet<>();
		Ss.add(100);
		Ss.add(50);
		Ss.add(90);
		Ss.add(40);
		Ss.add(80);
		Ss.add(60);
		Ss.add(70);
		System.out.println(Ss);
		
		for(Integer i : Ss) {
			System.out.println(i);
		}
		SortedSet<Character> c = new TreeSet<>();
		c.add('z');
		c.add('y');
		c.add('x');
		c.add('w');
		c.add('v');
		c.add('u');
		c.add('t');
		c.add('s');c.add('r');c.add('q');c.add('p');c.add('o');c.add('n');c.add('m');
		c.add('l');
		c.add('k');c.add('j');c.add('i');c.add('h');c.add('g');c.add('f');c.add('e');c.add('d');c.add('c');c.add('b');c.add('a');
		System.out.println(c);
		
		int i = c.size();
		System.out.println(i);
		
		Character Search = 's';
		System.out.println("contains :"+ Search+ " "+c.contains(Search));
		
		System.out.println("First ele is :" +""+c.first());
		
		System.out.println("Last ele is :" +""+c.last());
		
		c.remove('a');c.remove('b');c.remove('c');c.remove('x');c.remove('y');c.remove('z');
		System.out.println("After removing ele the set is :" +""+c);
		
		
		System.out.println(c.headSet('r'));// headset is uesd to print the ele which are lessthan the ele that are present in the sortedset
		
		System.out.println(c.tailSet('r'));//tailset is used to return the ele which are greaterthan or equal to the elem that are present in the sortedset.
		
		System.out.println(c.subSet('r','v'));
		// TODO Auto-generated method stub

	}

}
