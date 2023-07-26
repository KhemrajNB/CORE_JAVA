package com.jsp.basics;

public class SwapNumber {

	public static void main(String[] args) {
			int a= 50;
			int b =10;
			System.out.println(a + " " + b);
			int temp = a;
			a=b;
			b=temp;
			System.out.println(a + " " + b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println(a + " " + b);
	}

}
