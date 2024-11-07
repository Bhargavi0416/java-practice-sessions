package com.java.practice.MapInterface;

import java.util.*;
public class TreeMapExample {

	public static void main(String[] args) {
	//	int x = 10;
	//	Set<Integer> hset = new HashSet<>();
		//for(int i =0;i<=x;i++)
		{
			//hset.add(i);
		}
		//TreeMap<String,Set<Integer>> tmap = new TreeMap<>();
		
		//tmap.put("Set ele", hset);
		//System.out.println(tmap);
		
		
		HashSet<Integer> hs = new HashSet<>();
		int X = 10;
		for(int j=X;j>=0;j--) 
		{
			hs.add(j);
		} 
		System.out.println(hs);
		Map<String,HashSet<Integer>> hm = new HashMap<>();
		hm.put("reverse array", hs);
		System.out.println(hm);
		
		
		//System.out.println(tmap.entrySet());//[Set ele=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]]
        
		
		//System.out.println(tmap.descendingMap());
		
		//System.out.println(tmap.descendingKeySet());//[Set ele]
		
				// TODO Auto-generated method stub

	}

}




