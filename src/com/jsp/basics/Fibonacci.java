package com.jsp.basics;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, temp = 0,n=20;
		System.out.print(a + " ");
		for(int i = 1; i<=n-1; i++) {
			System.out.print(b + " ");
			temp = a;
			a = b;
			b = temp+b;
		
		}

	}

}
