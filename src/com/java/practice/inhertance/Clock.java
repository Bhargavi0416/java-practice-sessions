package com.java.practice.inhertance;

public class Clock
{
	int time;
	int date;
	String day;
	String works;
	String type;
	public Clock(int time,int date,String day,String works,String type)
	{
		this.time=time;
		this.date=date;
		this.day=day;
		this.works=works;
		this.type=type;
	}
	
	public static void DisplayDetails(int time,int date,String day, String works,String type)
	{   
		System.out.println("diplaying the time:"+time);
		System.out.println("display date:"+date);
		System.out.println("it displays the present day is:"+day);
		System.out.println("it works with:"+works);
		System.out.println("the type of watch is:"+type);
	}
	public static void main(String[] args) {
		//float f = DisplayDetailsofwatch(time);
		// TODO Auto-generated method stub

	}

}
