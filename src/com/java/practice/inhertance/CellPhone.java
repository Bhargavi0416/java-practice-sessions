package com.java.practice.inhertance;

public class CellPhone {
	int contacts;
	String simcard;
	String games;
	String size;
	String display;
	String works;
public CellPhone(int contacts,String simcard,String games,String size,String display,String works )
{
	this.contacts=contacts;
	this.simcard=simcard;
	this.games=games;
	this.size=size;
	this.display=display;
	this.works=works;
}
public void AboutCellPhone()
{
	System.out.println("saved contacts is:"+contacts);
	System.out.println("simcard in cellphone:"+simcard);
	System.out.println("it is possible to play games:"+games);
	System.out.println("the size of these cellphone is:"+size);
	System.out.println("display of cellphone is:"+display);
	System.out.println("it works by pressing keypad buttons ");
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
