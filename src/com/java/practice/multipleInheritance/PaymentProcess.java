package com.java.practice.multipleInheritance;

public class PaymentProcess implements PhonePay,Gpay {
	
@Override
	public void scannerpayment() {
		System.out.println("the amount is transfering through scanner");
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void contactpayment() {
		System.out.println("the amount is transfered through contact number");
		// TODO Auto-generated method stub
		
	}
	public void display(float amount) {
		  //float f ;
		System.out.print("float amount:"+""+ amount);
	}

}
class M {
	public static void main(String args[]) {
		PhonePay p = new PaymentProcess();
		Gpay p1 = new PaymentProcess();
		p.scannerpayment();
		p1.contactpayment();
		PaymentProcess Pay = new PaymentProcess();
		Pay.display(100.0f);
	}
}

