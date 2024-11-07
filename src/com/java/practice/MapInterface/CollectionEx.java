package com.java.practice.MapInterface;

import java.util.*;
public class CollectionEx {

	public static void main(String[] args) {
		Set<Integer> lhset = new LinkedHashSet<>();
		HashSet<Integer> hs = new HashSet<>();
		int x = 10;
		for(int i=x;i>=0;i--)
		{
			lhset.add(i);
		}
		System.out.println(lhset);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		List<Integer> l1 = new ArrayList<Integer>(lhset);
		
		Collections.reverse(l1);
		
		Set<Integer> set = new LinkedHashSet<Integer>(l1);
		
		System.out.println("Set Elements: "+set);
		
		
		int x1 = 10;
		for(int j = 0;j<=x1;j++)
		{
			hs.add(j);
		}
		//NavigableMap<String,Set<Integer>> hm = new TreeMap<>();
		Map<String,Set<Integer>> hm = new HashMap<>();
		hm.put("reverse ele",lhset);
		hm.put("map ele", hs);
		System.out.println(hm);
		// TODO Auto-generated method stub

	}

}
