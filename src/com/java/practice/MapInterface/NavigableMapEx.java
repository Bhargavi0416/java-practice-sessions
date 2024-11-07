package com.java.practice.MapInterface;

import java.util.NavigableMap;
import java.util.TreeMap;
public class NavigableMapEx {

	public static void main(String[] args) {
		
		NavigableMap<Integer,String> nm = new TreeMap();
		nm.put(1, "a");
		nm.put(3, "c");
		nm.put(5, "e");
		nm.put(7, "g");
		nm.put(17, "q");
		nm.put(19, "s");
		nm.put(21, "u");
		nm.put(23, "w");
		nm.put(25, "y");
		nm.put(9, "i");
		nm.put(11, "k");
		nm.put(13, "m");
		nm.put(15, "o");
		System.out.println(nm);
		
	//	System.out.println(nm.)
		System.out.println(nm.ceilingEntry(13));
		
		System.out.println(nm.ceilingKey(9));
		
		System.out.println(nm.descendingKeySet());
		
		System.out.println(nm.descendingMap());
		
		System.out.println(nm.firstEntry());
		
		System.out.println(nm.firstKey());
		
		System.out.println(nm.floorKey(9));
		
		System.out.println(nm.headMap(13));
		
		System.out.println(nm.higherEntry(23));
		
		System.out.println(nm.higherKey(19));
		
		System.out.println(nm.lastEntry());
		
		System.out.println(nm.lowerEntry(7));
		
		System.out.println(nm.lowerKey(1));
		
		System.out.println(nm.navigableKeySet());
		
		System.out.println(nm.pollFirstEntry());
		
		System.out.println(nm.pollLastEntry());
		
		System.out.println(nm.subMap(3, 19));
		
		System.out.println(nm.subMap(5, true, 19, false));
		
		System.out.println(nm.getOrDefault(21,null ));
		
		System.out.println(nm.replace(2, "b"));
		
		System.out.println(nm.tailMap(2));
		
		System.out.println(nm.tailMap(19, false));
		
		System.out.println(nm.size());
		// TODO Auto-generated method stub

	}
}
