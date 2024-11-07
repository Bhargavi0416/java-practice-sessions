package com.java.practice.inhertance;

public class One {
	public One(){
		System.out.print("One,");
	}

}
class Two extends One{
	public Two(){
		System.out.print("Two,");
	}
}
class Three extends Two{
	public Three(){
		System.out.print("Three");
	}
}





/*public class Test {

	public static void main(String[] args){
		Three three = new Three();
	}
}*/
