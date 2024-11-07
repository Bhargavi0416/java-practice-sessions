package com.java.practice.question;

public class PrimeNumber {

	
	public static void main(String[] args) {
		int number =7;
		int count =0;
		if(number>0) {
			
			      for(int i =1;i<=number;i++) 
			      {
				    if(number%i==0)
					   count++;
			       }
			if(count==2) {
				System.out.println("it is a prime number");
			} else {
					System.out.println("it is not a prime number");
				}
		      }
			else {
				System.out.println("it is not a prime number");
			}
		}
		// TODO Auto-generated method stub

	}


