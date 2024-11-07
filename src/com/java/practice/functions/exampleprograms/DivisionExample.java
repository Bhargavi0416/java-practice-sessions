package com.java.practice.functions.exampleprograms;

public class DivisionExample {

	
	public static void main(String[] args) {
	    float totalpersentage = 0.0f;
		float persentage = 2.0f;
		float result = marks(0.0f,2.0f);
		System.out.println(result);  

		// TODO Auto-generated method stub

	}
	public static float marks (float totalpersentage,float persentage) {
		float result = (totalpersentage/persentage);
		return(result);
	}

}
