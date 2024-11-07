package com.java.practice.functions;

public class Village {
	static String busstop;
	String gender;
	String bus;
	int count;
	static {
		System.out.println("inside the static block");
	}
public Village() {
}
//public Village (String gender,String bus,int c) {//Syntax error on token "public", record expected after this token//
public Village (String gender,String bus,int c) {
	this.gender = gender;
	this.bus = bus;
	count = c;
}
public static void busstop(String stop) {
	//String busstop = busstop;The assignment to variable busstop has no effect
	//- Duplicate local variable busstop/
//this.busstop =  busstop ;//cannot use this in th static context
	busstop = stop; 
	
//	String busstop;
	//v1 = int count;//
}
public static void main(String[] args) {
	Village v1 = new Village("Female","RTC",30);
	Village v2 = new Village ("Male","RTC",50);
	Village.busstop("JBS");
	System.out.println(v1.gender+" "+v1.bus+" "+v1.count+" "+v1.busstop);
  	System.out.println(v2.gender+" "+v2.bus+" "+v2.count+" "+v2.busstop);//The static field Village.busstop should be accessed in a static way
	
	
		// TODO Auto-generated method stub

	}

}
