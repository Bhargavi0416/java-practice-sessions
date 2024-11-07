package com.java.practice.functions;

public class College {
	
	String professor;
	String branch;
	static String CollegeName = "Nishitha";
	public College(String Professor,String branch) {
		this.professor = Professor;
		this.branch = branch;
	}
    public static void main(String[]args) {
    	College c1 = new College("swaraj", "M.C.A");
    	College c2 = new College("Prasad","M.B.A" );
    	System.out.println(c1.CollegeName+""+c1.professor+""+c1.branch);
        System.out.println(c2.CollegeName+""+c2.professor+""+c2.branch);
        
    	
    	
			
		}
	}


