package com.jsp.basics;

import java.util.Scanner;

public class WhileODD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		while(n1<=n2) {
			if(n1%2!=0) {
				System.out.println(n1);
			}
			n1++;
		}
		sc.close();
	}

}
