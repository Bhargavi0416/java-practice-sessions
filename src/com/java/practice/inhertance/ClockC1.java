package com.java.practice.inhertance;

public class ClockC1 extends Clock {
	String connection;
	String Charger;
	public ClockC1 (float time,int date,String day,String works,String type,String connection,String charger)
	{
	 super(time,date,day,works,type);
	 this.connection=connection;
	 this.Charger=charger;
	}
	public void WatchDetails (float time,int date,String day,String works,String type,String connection,String charger)
	{
		System.out.println("diplaying the time:"+time);
		System.out.println("display date:"+date);
		System.out.println("it displays the present day is:"+day);
		System.out.println("it works with:"+works);
		System.out.println("the type of watch is:"+type);
		System.out.println("the smartwatch ic connecting with:"+connection);
		System.out.println("smartwatch as charged by using :"+charger);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
