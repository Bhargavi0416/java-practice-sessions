package com.java.practice.SetInterface;

import java.util.HashSet;
public class HashSetEx1 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		hs.add("set interface");
		hs.add("methods are");
		hs.add("add()");
		hs.add("addAll()");
		hs.add("remove()");
		hs.add("removeAll()");
		hs.add("retains()");
		hs.add("contains()");
		hs.add("containsAll()");
		hs.add("clear()");
		hs.add("size()");
		hs.add("clone()");
		hs.add("iterator");
		hs.add("isEmpty()");
		System.out.println(hs);
		hs.clone();//clone() method can be used to duplicate the structure of the collection but not the elements themselves.
		System.out.println(hs);
		// TODO Auto-generated method stub

	}

}
