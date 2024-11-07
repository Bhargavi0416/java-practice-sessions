package com.java.practice.functions.exampleprograms;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		byte b = 4;
		System.out.println(b);
		byte s = (byte)-32567;
		byte i = (byte)-4321;
		byte ch = (byte)'2';
        byte L = (byte) 123456789;
		byte f = (byte)0.98f;
		byte d = (byte)123456.987654321;
		System.out.println(s);
		System.out.println(i);
		System.out.println(ch);
		System.out.println(L);
		System.out.println(f);
		System.out.println(d);
		short S1 = 32451;
		System.out.println(S1);
		short x = (short)123456789;
		short y = (short) 'c';
		short z = (short)123456.7890123456789;
		short f1 = (short)987.12345678f;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(f1);
		long g1 = (long)34.5f;
		long g2 = (long)12345.987654321;
		long g3 = (long)'L';
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		float num = 987.1234f;
		System.out.println(num);
		float D1 = (float)-87654321.1223567890;
		System.out.println(D1);
		// TODO Auto-generated method stub

	}

}
