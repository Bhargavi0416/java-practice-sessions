package com.java.practice.inhertance;

public class Vehicles {
	String name ;
	String type ;
	String colour;
	int wheeler;
    String showroom;
   public Vehicles(String name,String type,String colour,String Showroom,int wheeler){
    	this.name=name;
    	this.type=type;
    	this.colour=colour;
    	this.showroom=Showroom;
    	this.wheeler=wheeler;
    }
   //private void printVehicleDetails() {
   public void printVehicleDetails() {
        System.out.println("name of the vehicle is:"+name);
    	System.out.println("type of vehicle is:"+type);
    	System.out.println("vehicle colour is:"+colour);
    	System.out.println(" Showroom:"+showroom);
    	System.out.println("type of wheeler:"+wheeler);
    }
	
//class Car extends vehicles{
	

	public static void main(String[] args) {
		Vehicles v = new Vehicles("i10","red","micro car","tata motors",4);
		v.printVehicleDetails();
	   
		
		 

		// TODO Auto-generated method stub

	}

}
