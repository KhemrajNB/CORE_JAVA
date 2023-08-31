package com.jsp.Strings;

public class Demo {

	public static void main(String[] args) {
		String str = "abcd";
		
		for(int i = 0;i<str.length();i++) {
			for(int j = i;j<str.length();j++) {
				for(int k = i;k<=j;k++) {
					System.out.print(str.charAt(k));
				}
//				System.out.println("j : "+j);
				System.out.println();
//				System.out.println(str.substring(i,j));
			}
		}
		

	}

}
