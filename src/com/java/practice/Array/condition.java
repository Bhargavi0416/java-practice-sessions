package com.java.practice.Array;


public class condition {
	
	static int c=0;
	static int d=0;
	public static void  printcountvalue(String s1,String s2) {
		
		if(s1.equals(s2)){
			 c++;
		}else {
			d++;
		}
	}

	public static void main(String[] args) {
		String[] St = {"hello","radar","level","String","in","java","Strings","Immutable","radar","Hello"};
//		int c=0; int d=0;
//		if((St[0].equals(St[St.length-1]))){
//			 c++;
//		}else {
//			d++;
//		}
//		if((St[1].equals(St[St.length-2]))) {
//			c++;
//		}else {
//			d++;
//		}
//		if((St[2].equals(St[St.length-3]))) {
//			c++;
//		}else {
//			d++;
//		}
//		if((St[3].equals(St[St.length-4]))) {
//			c++;
//		}else {
//			d++;
//		}
//		if((St[4].equals(St[St.length-5]))) {
//			c++;
//      	}else {
//      		d++;
//      	}	
//	
//		System.out.println("true count: "+ c+"\n"+ "false count: "+d);
		
	//	printcountvalue(St,c,d);
		
		printcountvalue(St[0],St[St.length-1]);
		printcountvalue(St[1],St[St.length-2]);
		printcountvalue(St[2],St[St.length-3]);
		printcountvalue(St[3],St[St.length-4]);
		printcountvalue(St[4],St[St.length-5]);
		System.out.println("TrueCount:"+c+"\n"+"False Count: "+d);
		
	//	printcountvale(St[])
		// TODO Auto-generated method stub

}
}
