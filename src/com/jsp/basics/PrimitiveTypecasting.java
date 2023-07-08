package com.jsp.basics;

public class PrimitiveTypecasting {

	public static void main(String[] args) {
		
		//  Data Widening(Implicit Type casting)
		byte a = 10;
		short b = a;
		int c = a;
		System.out.println(a + " " + b + " " + c);
		
		//  Data Narrowing(Explicit Type Casting)
		short d = (short)c;
		byte e =  (byte)d;
		System.out.println(d + " " + e);
		
		//Data Widening and Narrowing
		short f = (byte)c;
		System.out.println(f);
		
	}

}
