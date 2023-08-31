package com.jsp.Strings;

public class CountWord {
	
	public static void main(String[] args) {
		String s = "Hi    Good  Morning";
		int count = 1;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
