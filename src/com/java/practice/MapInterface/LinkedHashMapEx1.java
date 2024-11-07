package com.java.practice.MapInterface;
import java.util.*;
import java.util.Map.Entry;
public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		int n = 10;
		for(int i =0; i<=n;i++) {
			al.add(i);
		}
		HashMap<String,List<Integer>> hm = new HashMap<>();
		hm.put("ArrayList of elements", al);
		
		System.out.println(hm);//{ArrayList of elements=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]}
		
		System.out.println(hm.containsKey(al));//false
		
		System.out.println(hm.containsValue(al));//true
		
		System.out.println(hm.equals(al));//false
//		for(Map.Entry<String,List<Integer>> hm1: hm.entrySet()) {
//			
//			System.out.print((hm).getKey() + " : ");
//			System.out.println((hm).getValue());
//			
//		}
		
		
		// TODO Auto-generated method stub

	}

}
