package com.jsp.OOP;

public class Calculator {
	public static void addTwoNumbers(int a, int b) {
		int res = a+b;
		System.out.println(res + " is sum of Two Numbers");
	}
	public void subTwoNumber(int a, int b) {
		System.out.println(a-b + " is Difference of Two Number");
	}
	
	public static int proTwoNumber(int a, int b) {
		return a*b;
	}
	
	public double divTwoNumber(float a, float b) {
		return a/b;
	}
}
