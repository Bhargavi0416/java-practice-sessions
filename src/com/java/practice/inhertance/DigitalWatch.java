package com.java.practice.inhertance;

public class DigitalWatch extends Clock {
	int alaram;
	String displaytime;
	public DigitalWatch(int time,int date,String day,String works,String type,int alaram,String displaytime)
	{
		super(time,date,day,works,type);
		this.alaram=alaram;
		this.displaytime=displaytime;
				
	}
    //protected void DetailsofDigitalWatch()
	protected void DetailsofDigitalWatch(){
		System.out.println("diplaying the time is:"+time);
		System.out.println("it display the date:"+date);
		System.out.println("the present day is:"+day);
		System.out.println("the digitalwatch is works with:"+works);
		System.out.println("the type of watch is:"+type);
		System.out.println("there is possiblity to set alaram at:"+alaram);
		System.out.println("it display the time by:"+displaytime);
	}
	

	public static void main(String[] args) {
		DigitalWatch d1 = new DigitalWatch(1,04,"thusday","cell","DigitalWatch",5,"numbered system");
		d1.DetailsofDigitalWatch();	
		// TODO Auto-generated method stub

	}

}
