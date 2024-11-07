package com.java.practice.access.modifiers2;

import com.java.practice.access.modifiers1.C1;

public class C {
	public static void main(String args[]) {
        int a = 30;
		int b = 20;
		int c = C1.sum(a,b);
		System.out.println(c);
		int m1 = C1.mul(a,b);
		System.out.println(m1);
		float f1 = 10.0f;
		float f2 = 5.0f;
		float f = C1.sub(f1,f2);
		System.out.println(f); 
		int num = 2345;
		int count = C1.digits(num);
		System.out.println(count);
		int rev = C1.reverse(num);
		System.out.println(rev);
		String village = "morthad";
		String mandal  = "morthad";
		String s = C1.district(village,mandal);
		System.out.println(s);
	    int  n = C1.display(num);
	    System.out.println(n);
		

}
}

