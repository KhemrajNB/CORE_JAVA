package com.jsp.basics;

public class PrimeNumber {

	public static void main(String[] args) {
		//Prime or Not Prime
		int a = 9;
		Boolean flag = true;
		for(int i = 2; i<a; i++) {
			if(a%i==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime");
		}
		
		
		
		//Function Call For Prime or Not Prime
		System.out.println(primeOrNot(a) + " Using Function");
		
		
		//Prime Series from 1 to N
		int b = 30;
		System.out.print("Series of Prime : ");
		for(int i = 1; i<=b; i++) {
			if(primeOrNotTF(i)) {
				System.out.print(i + " ");
			}
		}
		
		
		
		
	}
	
	public static String primeOrNot(int a) {
		for(int i = 2; i<a; i++) {
			if(a%i==0) {
				return "Not Prime";
			}
		}
		return "Prime";
		
	}
	
	public static Boolean primeOrNotTF(int a) {
		for(int i = 2; i<a; i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
		
	}
}