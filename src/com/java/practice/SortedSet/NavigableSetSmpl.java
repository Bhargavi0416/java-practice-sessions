package com.java.practice.SortedSet;

import java.util.NavigableSet;
import java.util.TreeSet;
public class NavigableSetSmpl {

	public static void main(String[] args) {
		NavigableSet<String> nss = new TreeSet<>();
		nss.add("n");
		nss.add("a");
		nss.add("v");
		nss.add("i");
		nss.add("g");
		nss.add("a");
		nss.add("b");
		nss.add("l");
		nss.add("e");
		nss.add("s");
		nss.add("e");
		nss.add("t");
		System.out.println(nss);
		
		System.out.println(nss.ceiling("i"));
		
		System.out.println(nss.first());
		
		System.out.println(nss.headSet("e"));
		
		System.out.println(nss.headSet("s", true));
		
		System.out.println(nss.tailSet("g"));
		
		System.out.println(nss.tailSet("i" ,false));
		
		System.out.println(nss.floor("g"));
		
		System.out.println(nss.higher("t"));
		
		System.out.println(nss.lower("l"));
		
		//System.out.println(nss.parallelStream());
		
		System.out.println(nss.subSet("n","v"));
		
		System.out.println(nss.pollFirst());
		
		System.out.println(nss.pollLast());
		
		System.out.println(nss.size());
		
		System.out.println(nss.descendingSet());
		
		System.out.println(nss.removeAll(nss));
		
		System.out.println(nss.isEmpty());
		
		//System.out.println(nss.)
		
		
		
		
		// TODO Auto-generated method stub

	}

}
