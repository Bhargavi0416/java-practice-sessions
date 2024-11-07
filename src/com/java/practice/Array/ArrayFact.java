package com.java.practice.Array;

public class ArrayFact {

	public static void main(String[] args) {
		float f []= new float[]{3.0f,4.0f,5.0f,2.0f,1.0f};
		float fact =1;
		//for(int i=f.length-1;i>=0;i--)
	//	{
		//	fact = fact*f[i];
		//	System.out.println(fact);
	//	}
		for(int i =0;i<f.length;i++)
		{
			fact = fact*f[i];
			System.out.println(fact);
		}
		// TODO Auto-generated method stub

	}

}
