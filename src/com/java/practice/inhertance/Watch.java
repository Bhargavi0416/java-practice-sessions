package com.java.practice.inhertance;

public class Watch {

	public static void main(String[] args) {
		SmartWatch s1 = new SmartWatch(10, 3, "monday", "charging", "smartwatch", "blutooth", "cable");
		s1.SmartWatchDetails(10, 3, "monday", "charging", "smartwatch", "blutooth", "cable");
		s1.DisplayDetails(11,4,"monday","cell","digitalwatch");
		DigitalWatch d1 = new DigitalWatch(1,04,"thusday","cell","DigitalWatch",5,"numbered system");
		d1.DetailsofDigitalWatch();	
		WallClock W = new WallClock(5,0,"null","cell","wallclock","it is announce the time","large","it will not displays the time in numbered system");
		W.printDetailsofWallclock();
			}
		// TODO Auto-generated method stub

	}


