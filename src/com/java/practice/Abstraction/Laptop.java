package com.java.practice.Abstraction;
  // abstract class//
public abstract class Laptop {
	// common properties or fields
	private String model;
	private String brand;
	private double price;
	//creating a constructor
	public Laptop(String model, String brand,double price) {
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	// abstarct method
public abstract void bootup();
//non- abstract method
public void details() {
	System.out.println(model+""+brand+""+price);
}
public void displaydetails()
{
	System.out.println("the colour of the laptop is black");
}

}

 