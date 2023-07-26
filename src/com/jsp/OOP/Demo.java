package com.jsp.OOP;

public class Demo {
	long acno;
	private float balance;
	private long debitno;
	
//	public void setAcno(long acno) {
//		this.acno = acno;
//	}
//	public long getAcno() {
//		return acno;
//	}
	public Demo(long acno) {
		this.acno=acno;
	}
	
	public void setBalance(float balance) {
		this.balance=balance;
	}
	public float getBalance() {
		return balance;
	}
	
	
	public void setDebitNo(long debitno) {
		this.debitno=debitno;
	}
	public long getDebitNo() {
		return debitno;
	}
	
	public void deposit(int amount) {
		System.out.println(amount>0?"balance :" + (balance+=amount):"Invalid amount");
	}
	
	public void withdraw(int amount) {
		System.out.println(amount>0 && balance>=amount?"balance :" + (balance-=amount):"Invalid amount");
	}
	
}
