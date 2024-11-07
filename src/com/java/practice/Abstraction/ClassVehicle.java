package com.java.practice.Abstraction;

public  class ClassVehicle {

	public static void main(String[] args) {
		//Bike obj = new Bike();//cannot instantiate bike//
		Vehicle v = new Bike ();
		Scooty  V1 = new Scooty();
		//Vehicle.design();
		//Scooty.modelname();
		//Bike.type();
	//	v.modelname();
		//v.type();            
		v.display();
	    v.design();
	    v.show();
	   V1.modelname();

	}

}
