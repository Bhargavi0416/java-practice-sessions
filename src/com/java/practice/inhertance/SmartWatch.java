package com.java.practice.inhertance;

public class SmartWatch extends Clock{
	String connection;
	String Charger;
	public SmartWatch(int time,int date,String day,String works,String type,String connection,String charger)
	{
	 super(time,date,day,works,type);
	 this.connection=connection;
	 this.Charger=charger;
	}
	public void SmartWatchDetails (int time,int date,String day,String works,String type,String connection,String charger)
	{
		System.out.println("diplaying the time:"+time);
		System.out.println("display date:"+date);
		System.out.println("it displays the present day is:"+day);
		System.out.println("it works with:"+works);
		System.out.println("the type of watch is:"+type);
		System.out.println("the smartwatch ic connecting with:"+connection);
		System.out.println("smartwatch as charged by using :"+charger);
		
	}
	
	class Watch {
		public static void main(String[] args) {
		//	SmartWatch.DisplayDetails(0, 0, null, null, null);
			SmartWatch s1 = new SmartWatch(10, 3, "monday", "charging", "smartwatch", "blutooth", "cable");
			s1.SmartWatchDetails(10, 3, "monday", "charging", "smartwatch", "blutooth", "cable");
			s1.DisplayDetails(11,4,"monday","cell","digitalwatch");
			DigitalWatch d1 = new DigitalWatch(1,04,"thusday","cell","DigitalWatch",5,"numbered system");
			d1.DetailsofDigitalWatch();
		
			
		}
		// TODO Auto-generated method stub

	}

}
