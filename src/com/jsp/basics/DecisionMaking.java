package com.jsp.basics;

import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//Even ODD
		if(a%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		//Largest of 2 number
		if(a>b){
			System.out.println(a + " is the largest number");
		}
		else {
			System.out.println(b + " is the largest number");
		}
		
		//Largest of 3 Number
		if(a>b && a>c) {
			System.out.println(a + " is the largest");
		}
		else if(b>c) {
			System.out.println(b + " is the largest");
		}
		else {
			System.out.println(c + " is the largest");
		}
		
		
		// Valid Range
		if(a>=10 && a<=20) {
			System.out.println("Valid Input");
		}
		else {
			System.out.println("Invalid Input");
		}
		sc.close();

	}

}
