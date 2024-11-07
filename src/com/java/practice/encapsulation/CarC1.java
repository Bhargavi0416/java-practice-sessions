package com.java.practice.encapsulation;

public class CarC1 {
	//data members(fields)
	private String model;
	private String colour;	
	//constructor
	public CarC1(String model,String colour)
	{
		this.model = model;
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
