package com.java.practice.Array;

public class Arrays {

	public static void main(String[] args) {
		int a[]= new int[4];
		
		for(int i =0; i<=3;i++)
		{
			System.out.print(a[i]);
		}
		int a1[]=new int[5];
		a1[0]=1;
		a1[1]=2;
		a1[2]=3;
		a1[3]=4;
		for(int j=0;j<=4;j++) {
			System.out.println(a1[j]);
		}
		float f[]= new float[6];
		for(int x =0;x<=5;x++) {
			System.out.print(f[x]);
		}
		for(int y =0;y<=5;y++) {
			f[1]=5.5f;
			f[4]=2.2f;
			System.out.println(f[y]);
		}
		char ch[]=new char[4];
		for(int c=0;c<=3;c++) {
			System.out.print(ch[c]);
	}
		char ar[]=new char[3];
		ar[2]='A';
		ar[3]='B';
		for(int n = 0;n<=ar.length;n++) {
			System.out.println(ar[n]);
		}
		

	}


	}


