package com.java.practice.Abstraction;

public class L1 {

	public static void main(String[] args) {
		Laptop g1 = new GamingLaptop("G16","Dell m18",50000.0,"red");
        Laptop b = new BusinessLaptop("Dell", "Latitude 7400", 120000.0,"black",true);
       // GamingLaptop g = new GamingLaptop();
      //  g.GamingLaptop();
        g1.bootup();
        g1.details();
	
        
       // System.out.println();
        b.details();
        b.bootup();
        b.displaydetails();
        
		// TODO Auto-generated method stub

	}

}
