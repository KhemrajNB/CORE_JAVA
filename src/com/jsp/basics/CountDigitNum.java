package com.jsp.basics;

import java.util.Scanner;

public class CountDigitNum {

	public static int countNum(int n) {
		int count = 0;
		while(n>0) {
			n = n/10;
			count++;
		}
		return count;
	}
	
	public static int countNumFor(int n) {
		int count = 0;
		for(;n>0;n=n/10) {
			count++;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ente Number : ");
		int n = sc.nextInt();
		System.out.println(countNum(n));
		System.out.println(countNumFor(n));
		sc.close();
	}

}
