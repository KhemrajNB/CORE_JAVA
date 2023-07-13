package com.jsp.basics;

import java.util.Scanner;

public class NestedSwitch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Current");
		System.out.println("2. Saving");
		System.out.println("Enter ACCOUNT TYPE : ");
		int a = sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Change Pin");
			System.out.println("Enter Option : ");
			int b = sc.nextInt();
			switch(b) {
			case 1:
				System.out.println("current Withdraw");
			break;
			case 2:
				System.out.println("current Deposit");
			break;
			case 3:
				System.out.println("current Change Pin");
			break;
			default:
				System.out.println("current Invalid Output");
			}
		break;
		case 2:
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Change Pin");
			System.out.println("Enter Option : ");
			int c = sc.nextInt();
			switch(c) {
			case 1:
				System.out.println("Saving Withdraw");
			break;
			case 2:
				System.out.println("Saving Deposit");
			break;
			case 3:
				System.out.println("Saving Change Pin");
			break;
			default:
				System.out.println("Saving Invalid Output");
			}
		break;
		default:
			System.out.println("choice Invalid Input");
		}
		
		sc.close();
	}

}
