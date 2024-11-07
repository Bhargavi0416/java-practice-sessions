package com.java.practice.functions.exampleprograms.quiz;

import java.util.ArrayList;

public class ArrListEx {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add('A');
		obj.ensureCapacity(3);
		System.out.println(obj.size());
		// TODO Auto-generated method stub
		obj.add("A");
        obj.add("D");
        obj.ensureCapacity(3);
        obj.trimToSize();
        System.out.println(obj.size());
        
        obj.add("a");
        obj.add("b");
        obj.add("a");
        obj.add(null);
        System.out.println(obj);
        

	}

}
