package com.java.practice.Abstraction;

public class S1 {

	public static void main(String[] args) {
	School s = new PlaySchool();
	School S1 = new GamingSchool();
	s.Schooldetails();s.Schoollocation();s.Schoolrules();//these is called methodchaining call multiplemethods ona sameobj in a single line//
	//	s.Schoollocation();
		//s.Schoolrules();
		S1.Schooldetails();
		S1.Schoollocation();
		S1.Schoolrules();
		
		// TODO Auto-generated method stub

	}

}
