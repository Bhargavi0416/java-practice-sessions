package com.java.practice.multipleInheritance;

public class Pay {

	public static void main(String[] args) {
		PhonePay p = new PaymentProcess();
		Gpay p1 = new PaymentProcess();
		p.scannerpayment();
		p1.contactpayment();
		PaymentProcess Pay = new PaymentProcess();
		Pay.display(100.0f);
		// TODO Auto-generated method stub

	}

}
