package com.java.practice.functions.exampleprograms;

import java.util.Scanner;

public class Box {
	int length;
	float width;
	static String boxshape =  "Round";
	public Box(int length,float width) {
        this.length = length;
         this.width = width;
	}
	public static void main(String[] args) {
		Scanner sc = (new Scanner(System.in));
		Box b1 = new Box(4,3.5f);
			
	System.out.println(b1.boxshape+""+b1.length+""+b1.width);
			// TODO Auto-generated method stub

		}

	}
