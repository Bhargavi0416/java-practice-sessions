package com.java.practice.question;
//ArmStrong number is a special kind of number which is equal to sum of cubes of its digits number is known as ArmStrong number//
import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int n = num;
		int sum = 0;
		int rem =0;
		while(num>0) {
			rem = num%10;
			sum = sum+rem*rem*rem;
	//	sum = sum + (num%10)*(num%10)*(num%10);
			num = num/10;
			//System.out.println(sum);
		}
		
		if(sum==n) {
			System.out.println(sum+" is armstrong number");
		}
		else {
			System.out.println(sum+"is not a armstrong number");
		}
		// TODO Auto-generated method stub

	}

}
