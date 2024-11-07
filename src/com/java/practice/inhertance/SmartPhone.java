package com.java.practice.inhertance;

public class SmartPhone extends CellPhone {
	String internet;
	String Screen;
	String camera;
	String backgroundsound;
public SmartPhone(int contacts,String simcard,String games,String size,String display,String works,String internet,String Screen,String camera,String backgroundsound)
{

	super(contacts,simcard,games,size,display,works);
	this.internet=internet;
	this.Screen=Screen;
	this.camera=camera;
	this.backgroundsound=backgroundsound;
}
public void smartphoneinformation()
{
	super.AboutCellPhone();
	System.out.println("contact of the smartphone is saved");
	System.out.println("Smartphone has dual simcards");
	System.out.println("In smartphone we can play the games through offine and online");
	System.out.println("the size of these phone is too large then the cell phone");
	System.out.println("the display is too big");
	System.out.println("it totally works by touching scereen");
	System.out.println("it has the internet power connection in GBs");
	System.out.println("Screen card is large for smartphone");
	System.out.println("it has dual cameras");
	System.out.println("the back ground sound is high ");
	
	

	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}





































