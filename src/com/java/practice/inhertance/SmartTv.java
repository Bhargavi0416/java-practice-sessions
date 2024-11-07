package com.java.practice.inhertance;

public class SmartTv extends Tv {
	String screen;
	String brand;
	public SmartTv(float inches,String model,String sound,String screen,String brand)
	{
		super(inches,model,sound);
		this.screen=screen;
		this.brand=brand;
	}
	void television() {
	}
	public static  void display()
	{
		System.out.println("smartTv has 32 inches");
		System.out.println("the model of these smartTv is LED");
		System.out.println("the sound of these is smartTv is too high");
		System.out.println("it has HD screen");
		System.out.println("it is a Samsung brand");
	}

	
	
	
	public class Television {
		
	}
	public static void main(String[] args) {
		Tv.display();
		SmartTv.display();
		//Tv.television();
		//Tv t = new SmartTv();
		
		// TODO Auto-generated method stub

	}

}
