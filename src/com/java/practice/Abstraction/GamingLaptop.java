package com.java.practice.Abstraction;
//extends the child class to parent
public class GamingLaptop extends Laptop {
	private  String colour; //properties
    public GamingLaptop(String model, String brand,double price,String colour) { //creating constructor
   	 super(model,brand,price);
   	 this.colour= colour;
    }
    
/*public void gaminglaptopdetails(String model, String brand,double price,String colour) {  //method 
	//System.out.println("the model of the gaminglaptop is:"+model);
	System.out.println(model+""+brand+""+price+""+colour);
}*/
//overriding method
public void bootup() {
	System.out.println("the colour of the gaminglaptop is:" +colour);
	 System.out.println("Booting up with high performence gpu");
}
}


