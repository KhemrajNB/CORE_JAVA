package com.jsp.CSIR;

public class Andu {
	public static boolean isSub(String str1,String str2) {
		int len = str2.length();
		int j = 0;
		for(int i =0;i<str1.length();i++) {
			if(str1.charAt(i)==str2.charAt(j) && j<len) {
				j++;
			}else if(str1.charAt(i)!=str2.charAt(j) && j<len) {
				j=0;
			}
			System.out.println(j);
			
			
		}
		return j==len;
	}
	
	public static void main(String[] args) {
		System.out.println(isSub("badadam","adam"));
	}

}
