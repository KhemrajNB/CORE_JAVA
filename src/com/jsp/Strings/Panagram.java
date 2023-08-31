package com.jsp.Strings;

public class Panagram {
	public static boolean panagram(String str) {
		int count = 0;
		str = str.toUpperCase();
		for(int i = 1;i<=26;i++) {
			if(str.contains((char)(i+64)+"")) {
				count++;
			}
		}
		return count==26;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bcdefghijklmnopqrstuvwxaxyz";
		System.out.println(panagram(str));
	}

}
