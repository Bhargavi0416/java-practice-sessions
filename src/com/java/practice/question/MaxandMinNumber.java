package com.java.practice.question;

public class MaxandMinNumber {

	public static void main(String[] args) {
		int n[] = {30,40,50,80,90};int i;
		int max = n[0];
		for(i=1;i<n.length;i++) 
		{
			if(n[i]>max) 
			{
				max=n[i];
			}
		}
		System.out.println("Maxmimun number in the array:"+max);
	
	int min = n[0];
	for(i=0;i>n.length;i++)
	{
		if(n[i]<min)
		{
			min = n[i];
		}
	}
	System.out.println("Minimum number in the array:"+min);

}
}