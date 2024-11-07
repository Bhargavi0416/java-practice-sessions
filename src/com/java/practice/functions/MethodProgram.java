package com.java.practice.functions;

public class MethodProgram {

	
	public static void main(String[] args) {
		String village  = "Morthad";
		String mandal  = "Morthad";
		String District = "Nizamabad";
		String s1 = Dis(village,mandal,District);
		//System.out.println(village+""+mandal+""+District);
		System.out.println(" the village name is "+village);
		System.out.println(" the mandal name is:"+mandal);
		System.out.println(" the District  is:"+District);
	}
	public static String Dis(String village,String mandal,String District)
	{
		return village+""+mandal+""+District;
		
		// TODO Auto-generated method stub

	}

}
