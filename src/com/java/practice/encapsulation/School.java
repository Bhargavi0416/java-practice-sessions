package com.java.practice.encapsulation;

public class School {
	private  String  SchoolName;
	private  String SchoolUniform;
	private  float SchoolTimings;
	public String getSchoolName() {
	return SchoolName;
	}
	public  void setSchoolName(String SchoolName) {
	this.SchoolName = SchoolName;
	}
	public String getSchoolUniform() {
		return SchoolUniform;
	}
	public void setSchoolUniform(String SchoolUniform) {
		this.SchoolUniform=SchoolUniform;	
	}
	public float getSchoolTimings() {
		return SchoolTimings;
	}
	public void setSchoolTimings(float SchoolTimings) {
		this.SchoolTimings=SchoolTimings;
	}
	public School(String SchoolName,String SchoolUniform,float SchoolTimings) {
		this.SchoolName = SchoolName;
		this.SchoolUniform=SchoolUniform;
		this.SchoolTimings= SchoolTimings;
	}
	public static void main(String args[]) {
	//	School s = new School( "Navodaya high School","Skurt and Shirt type uniform",9.00f );
		System.out.println("SchoolName :"+"model high school");
		System.out.println("SchoolUniform :"+"Skurt and Shirt type uniform");
		System.out.println("SchoolTimings :"+9.00f);
	
	}
}
