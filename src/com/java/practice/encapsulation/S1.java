package com.java.practice.encapsulation;

public class S1 {

	public static void main(String[] args) {
		Student obj = new Student(null, null, 0);
		obj.setName("pinky");
		obj.setSchool("high school");
		obj.setRollno(100);
		System.out.println(obj.getName());
		System.out.println(obj.getSchool());
		System.out.println(obj.getRollno());
		// TODO Auto-generated method stub

	}

}
