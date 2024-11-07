package com.java.practice.Abstraction;

public class BusinessLaptop extends Laptop {
	private boolean fingerprintscanner;
public BusinessLaptop(String model, String brand,double price,String colour,boolean fingerprintscanner) {
			super(model,brand,price);
			this.fingerprintscanner=fingerprintscanner;
		}
/*public void detailsofbusinesslaptop(String model, String brand,double price,String colour,boolean fingerprintscanner) {   //method
		System.out.println(model+""+brand+""+""+price+""+colour+""+ fingerprintscanner);
	}*/
	//overriding abstract method
public void bootup() {
	//System.out.println("the clour of businesslaptop is:"+colour);
		System.out.println("booting up with fingerprint scanner:"+ fingerprintscanner);
	}
	
	
	
}
