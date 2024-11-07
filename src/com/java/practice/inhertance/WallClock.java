package com.java.practice.inhertance;

public class WallClock extends Clock {
String sound;
String size;
String displaytime;
public WallClock(int time,int date,String day,String works,String type,String sound,String size,String displaytime)
	{
		super(time,date,day,works,type);
	    this.sound=sound;
		this.size=size;
		this.displaytime=displaytime;
}
/*public WallClock1(String sound,String size,String displaytime) 
{
	this.sound=sound;
	this.size=size;
	this.displaytime=displaytime;*/

private void PrivateDetailsofWallClock ()
{
	System.out.println("wallclock gives the bell sound per one hour:"+sound);
	System.out.println("the size of the wallclock is:"+size);
	System.out.println("it displaytime not same as all clocks:"+displaytime);
	
}
protected void printDetailsofWallclock ()
{
	System.out.println("it display the time same as all clocks:"+time);
	System.out.println("it works with:"+works);
	System.out.println("the type of clock is:"+type);
	System.out.println("wallclock gives the bell sound per one hour:"+sound);
	System.out.println("the size of the wallclock is:"+size);
	System.out.println("it displaytime not same as all clocks:"+displaytime);
	System.out.println("it will not diplay date:"+date);
	System.out.println("it will not shows the day:"+day);
	
	
}
	

	public static void main(String[] args) {
		//Wallclock W = new WallClock("bell sound","large","not in numbered system","it does not display date","it does not display day");
		//W.PrivateDetailsofWallClock();
		// TODO Auto-generated method stub

	}

}
