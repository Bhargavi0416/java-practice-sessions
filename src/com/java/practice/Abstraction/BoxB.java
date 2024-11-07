package com.java.practice.Abstraction;

public class BoxB {

	public static void main(String[] args) {
		Box b = new TiffenBox();
		//TiffenBox t = new Box();
		b.boxcolour();
		
		b.shape();
		b.show();
		
		TiffenBox t  = new TiffenBox();
		t.display();
		// TODO Auto-generated method stub

	}

}
