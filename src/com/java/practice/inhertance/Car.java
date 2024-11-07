package com.java.practice.inhertance;

public class Car extends Vehicles {
	String safety;
	String music;

	public Car(String name,String type,String colour,String Showroom,int wheeler,String safety,String music)
    {
		super(name,type,colour,Showroom,wheeler);
		this.safety = safety;
		this.music = music;
    }
	
public void CarDetails()
{
	System.out.println("name of the car is:"+name);
	System.out.println("type of the car"+type);
	System.out.println("car colour is:"+colour);
	System.out.println("showroom of the car is:"+showroom);
	System.out.println("type of wheeler is:"+wheeler);
	System.out.println("car safety:"+safety);
	System.out.println("music:"+music);
	
	
}

	

class Main{
	public static void main(String[] args) {
		Car c1 = new Car("i10","red","micro car","tata motors",4,"Ac","song is playing");
		c1.printVehicleDetails();
		c1.CarDetails();

		// TODO Auto-generated method stub

	}

}
}
