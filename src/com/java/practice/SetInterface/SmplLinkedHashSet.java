package com.java.practice.SetInterface;

import java.util.LinkedHashSet;
public class SmplLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Character> ch = new LinkedHashSet<>();
		ch.add('H');
		ch.add('a');
		ch.add('s');
		ch.add('h');
		ch.add('S');
		ch.add('e');
		ch.add('t');
		System.out.println(ch);
		ch.add('c');
		LinkedHashSet<Character> ch1 = new LinkedHashSet<>();
		ch1.add('A');
		ch1.addAll(ch);
		System.out.println(ch1);
		
		boolean c = ch1.contains('l');
		System.out.println(c);
		
		System.out.println(ch1.retainAll(ch));
		
		System.out.println(ch1.equals(ch));
		
		System.out.println(ch.equals(ch1));
		
		System.out.println(ch1.isEmpty());
		// TODO Auto-generated method stub

	}

}
