package com.java.practice.encapsulation;

public class Bottle {

	public static void main(String[] args) {
		WaterBottle b1 = new WaterBottle("Steel","black","small");
		b1.setType("Steel");
		b1.setColour("black");
		b1.setSize("small");
		System.out.println("type:"+b1.getType() +" "+ "colour:"+b1.getColour() +""+ "size:"+b1.getSize());
		// TODO Auto-generated method stub
		b1.setType("copper");
		b1.setColour("red");
		b1.setSize("large");
		System.out.println(b1.getColour());
		System.out.println(b1.getType());
		System.out.println(b1.getSize());

	}

}
