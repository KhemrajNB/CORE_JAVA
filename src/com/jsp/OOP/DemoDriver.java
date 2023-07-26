package com.jsp.OOP;

public class DemoDriver {

	public static void main(String[] args) {
		Demo d = new Demo(1234555);
//		System.out.println(d.acno);
		d.setBalance(10000);
		d.setDebitNo(98765434533l);
		System.out.println("Balance "+d.getBalance());
		System.out.println("Debit No "+d.getDebitNo());
		d.deposit(50000);
		d.withdraw(70000);

	}

}
