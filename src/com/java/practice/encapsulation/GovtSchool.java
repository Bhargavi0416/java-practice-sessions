package com.java.practice.encapsulation;

public class GovtSchool {

	public static void main(String[] args) {
	School s = new School("ZPHS","Skurt and Shirt type uniform",8.500f);
	s.setSchoolName("ZPHS");
	s.setSchoolUniform("Skurt and Shirt type uniform");
	s.setSchoolTimings(8.50f);
	System.out.println("SchoolName :"+s.getSchoolName() +""+ "\n"+"SchoolUniform :"+s.getSchoolUniform()+""+"\n"+"SchoolTimings :"+s.getSchoolTimings());
		// TODO Auto-generated method stub

	}

}
