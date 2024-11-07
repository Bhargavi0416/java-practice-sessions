package com.java.practice.inhertance;

public class  FloadAblePhone extends SmartPhone {
	String fload;
	String comfort;
	String clarity;
public FloadAblePhone(int contacts,String simcard,String games,String size,String display,String works,String internet,String Screen,String camera,String backgroundsound,String fload,String comfort,String clarity)
{
	super(contacts,simcard,games,size,display,works,internet,Screen,camera,backgroundsound);
	this.fload=fload;
	this.comfort=comfort;
	this.clarity=clarity;
}


	// TODO Auto-generated constructor stub



public void detailsaboutfloadablephone()
{
	super.smartphoneinformation();
	System.out.println("contact of the floadable phone is saved");
	System.out.println("floadable phone has dual simcards");
	System.out.println("In floadable phone we can play the games through offine and online");
	System.out.println("the size of these phone is as our wish to change it short are large");
	System.out.println("the display is also to change as for our convenance");
	System.out.println("it totally works by touching scereen");
	System.out.println("it has the internet power connection in GBs");
	System.out.println("Screen card is also floadable screen card");
	System.out.println("it has 3 to 4  cameras");
	System.out.println("the back ground sound is high ");
	System.out.println("the fload able phone is to fload as short are large are full screen as per our covenance");
	System.out.println("it has too comfort to keep in pocket are to carry by hands");
	System.out.println("the screen is full of clarity then the smartphone");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
