package com.jsp.basics;

import java.util.Scanner;

public class VowelUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word : ");
		String str = sc.next();
		char n =str.charAt(0);
		switch(n) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel");
		break;
		default:
			System.out.println("Consonent");
		
		}
		
		
		sc.close();
		
	}

}
