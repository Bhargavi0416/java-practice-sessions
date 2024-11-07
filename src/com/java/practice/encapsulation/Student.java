package com.java.practice.encapsulation;
//encapsulation is a process of binding or wrapping the data and corresponding methods together into a single unit is known as 
//encapsulation.In these encapsulation there are two methods setter and getter which is used to access the method from the another class
//encapsulation is used for secure the data member and methods privately//it is used for increasing 	security of data//
public class Student {
	private String name;
	private String school;
	private int rollno;

	public  Student(String name,String school,int rollno)
	{
		this.name = name;
		this.school = school;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
	 	this.school = school;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	

}

	
