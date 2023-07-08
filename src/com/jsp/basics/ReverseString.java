package com.jsp.basics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		int len = a.length();
		
		String rev="";
		for(int i = len-1; i>=0;i--) {
			rev = rev  +  a.charAt(i);
		}
		System.out.println(rev);
	}

}
