package org.bank;

public class Bankinfo extends AxisBank {
	public void saving() {
		System.out.println("23");
	}
	public void fixed() {
		System.out.println("33");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bankinfo bank=new Bankinfo();
bank.deposit();
bank.saving();
bank.fixed();

	}

}
