package com.java.practice.functions;

// class is a set of obj or group of obj that Share common properties.class is a blueprint of obj,it has set of properties.class
// contain data members method,constructor,nested classes,interfaces
public class Bags {         //class name
	int size;          //variable declaration
	String brand;          //data members//
	String colour;  //datatype is nothing but that it sepecifies the diff values and size that can be stored in  a variable.
//constructor// constructor is a block code similar to the method.it is called when a instance of obj is created.it is aspecial type of method whic is used to initilise the obj.
	public Bags() {          //default constructor//the constructor which does not have any parameters is known as def const.it
		size = 6;            //provide the default value of obj depending upon type.
		brand = "American tourist";
		colour = "black";
	}
	public Bags (int size,String brand,String colour) { //parameterised const is nothing but it has specific no of parameters.
		this.size = size;                               //it it provides diff type of distint values.
		this.brand = brand;
		this.colour = colour;
	}
	public Bags (int size,String Colour) {
		//this.colour = "colour";
		this.size = size ;
		this.colour = Colour;
		
	}
	public static void main(String[] args) {
		Bags handbag = new Bags();  //obj is a real world entity or physical entity that has state and behaviour. obj is  an instance of class.
		Bags collegebag= new Bags(5,"levis","red");
		Bags jutbag= new Bags( 6,"purple");
		System.out.println(jutbag.colour+""+jutbag.size);
		System.out.println(handbag.size+""+handbag.brand+""+handbag.colour);
		System.out.println(collegebag.size+""+collegebag.brand+""+collegebag.colour);
		// TODO Auto-generated method stub

	}

}
