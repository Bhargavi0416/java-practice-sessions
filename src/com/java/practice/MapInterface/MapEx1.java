package com.java.practice.MapInterface;

import java.util.Map;
import java.util.HashMap;
public class MapEx1 {

	public static void main(String[] args) {
		Map<Integer,Character> m = new HashMap<>();
		m.put(null,null);//{null=null}
		System.out.println(m);//{}
		m.put(1,'a');
		m.put(2, 'b');
		m.put(3, 'c');
		m.put(4, 'd');
		System.out.println(m);//{1=a, 2=b, 3=c, 4=d}
		
		m.put(3,'e');
		System.out.println(m);//{1=a, 2=b, 3=e, 4=d}
		
		m.put(null, null);
		System.out.println(m.entrySet());//[null=null, 1=a, 2=b, 3=e, 4=d]
		// TODO Auto-generated method stub

	}

}
