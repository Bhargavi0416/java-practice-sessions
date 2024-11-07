package com.java.practice.functions.exampleprograms.quiz;

public class Output {

	public static void main(String[] args) {
		/*int arr[]= {1,2,3,4,5};
		for (int i = 0;i<arr.length-2;i++)
			System.out.println(arr[i]+"");
		// TODO Auto-generated method stub*/
		String s1 = "hello";
		String s2 = s1.replace('l','w');
		System.out.println(s2);

	
	Box obj1 = new Box();
	Box obj2 = new Box();
	obj1.height = 1;
	obj1.length = 5;
	obj1.width = 5;
//obj2 = obj1;
	obj1.volume(5);
	System.out.print(obj1.volume);
	}
	

}
