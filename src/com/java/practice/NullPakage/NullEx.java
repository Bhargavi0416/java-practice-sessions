package com.java.practice.NullPakage;

import java.util.*;
public class NullEx {

	public static void main(String[] args) {
		List<Integer> Alist = new ArrayList<>();
		Alist.add(null);
		System.out.println(Alist);//[null]
        Alist.clear();
        System.out.println(Alist);//[]
        ArrayList<Float> AL = new ArrayList<>();
        AL.add(null);
        System.out.println(AL);//[null]
        LinkedList<Boolean> bl = new LinkedList<>();
        bl.add(null);
        System.out.println(bl);//[null]
        Vector<String> vs = new Vector<>();
        vs.add(null);
        System.out.println(vs);//[null]
        Stack<Double> sd = new Stack<>();
        sd.add(null);
        System.out.println(sd);//[null]
		// TODO Auto-generated method stub

	}

}
