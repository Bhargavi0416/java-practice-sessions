package com.java.practice.inhertance;

public abstract class Tv {
	float inches;
	String model;
	String sound;
	public Tv(float inches,String model,String sound) 
	{
		this.inches=inches;
		this.model=model;
		this.sound=sound;
	}
    abstract  void television();
    static void display()
	{
		System.out.println("the tv is in 12 inches");
		System.out.println("television model is LG");
		System.out.println("the sound of these Television is normal");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
