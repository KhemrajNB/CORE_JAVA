package com.jsp.basics;

public class Palindrome {

	public static void main(String[] args) {
		String a = "aba";
		int len = a.length();
		String rev="";
		for(int i = len-1; i>=0;i--) {
			rev = rev+a.charAt(i);
		}
		System.out.println(a);
		System.out.println(rev);
		
		if(a.equals(rev)) {
			System.out.println(a + " is Palindrome");
		}
		else {
			System.out.println(a + " is Not Palindrome");
		}
		
		
	}

}
