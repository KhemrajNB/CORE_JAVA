package com.jsp.CSIR;

public class Demo {
	int n;
	
	
	public static void main(String[] args) {
		//up casting 
		B b1 = new B();
		A a1 = b1;
		
		//down casting
		A a2 = new A();
		B b2 = (B)a2;
		
		
		
	}

}

class A{
	int a = 10;
	public void printA() {
		System.out.println("A : " + a);
	}
}

class B extends A{
	int b = 20;
	public void printB() {
		System.out.println("B : " + b);
	}
}