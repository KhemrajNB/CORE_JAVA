package com.jsp.CSIR;

public class Prime { 
	public static boolean isPrime(int n) {

		for (int i=2;i<n;i++) {
			if(n%i==0) {
			return false;
				//break;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println(isPrime(7));
	}

}
