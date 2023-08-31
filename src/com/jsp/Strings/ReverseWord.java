package com.jsp.Strings;

public class ReverseWord {
//	public 
	public static String reverseWord(String str) {
		String arr[] = str.split(" ");
		String rev = "";
		for(String i : arr) {
//			System.out.println(i);
//			if(i.is) {
				rev = i + " "+  rev;
//			}	
 		}
		return rev;
	}
	public static void main(String[] args) {
		String str = "Hii Good     Morning";
//		System.out.println(reverseWord(str));

	}

}
