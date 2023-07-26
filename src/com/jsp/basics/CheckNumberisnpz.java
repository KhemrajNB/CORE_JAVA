package com.jsp.basics;

import java.util.Scanner;

public class CheckNumberisnpz {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==0) {
			System.out.println("Number is Zero");
		}
		else if(a<0){
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("Number is Positive");
		}
		
		sc.close();
	}
}
