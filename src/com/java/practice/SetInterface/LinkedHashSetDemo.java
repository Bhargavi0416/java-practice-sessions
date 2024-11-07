package com.java.practice.SetInterface;

import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<Character> ele = new LinkedHashSet<>();
		ele.add('A');
		ele.add('B');
		ele.add('c');
		ele.add('D');
		ele.add('E');
		ele.add('F');
		System.out.println(ele);
		for(Character c : ele) {
			System.out.println(c);
			
		}
		
		LinkedHashSet<String> str = new LinkedHashSet<>();
		str.add("S");
		str.add("t");
		str.add("r");
		str.add("e");
		str.add("l");
		str.add("e");
		Iterator itr = str.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next() );
        }
       // for(String s : str) {
        //	System.out.println(s);
        //}
		
		
		// TODO Auto-generated method stub

	}

}
