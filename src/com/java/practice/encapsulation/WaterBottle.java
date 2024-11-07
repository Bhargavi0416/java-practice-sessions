package com.java.practice.encapsulation;

public class WaterBottle {
	private String type;
	private String colour;
	private String size;
public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
public WaterBottle(String type,String colour,String size)
{
	this.type=type;
	this.colour=colour;
	this.size=size;
	
}

}
