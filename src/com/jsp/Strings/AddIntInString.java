package com.jsp.Strings;

public class AddIntInString {
	
	public static int sumFromString(String str) {
		int sum =0;
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
//				String s = str.charAt(i)+"";
//				Integer.parseInt(s);
				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
//				System.out.println(s);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String s= "a1b8c3d4%2";
//		char ch[] = s.toCharArray();
//		int sum = 0;
//		for(int i = 0; i < ch.length ; i++) {
//			if(!(ch[i]>='A'&&ch[i]<'Z' || ch[i]>='a'&&ch[i]<'z')) {
//				System.out.println((int)ch[i]-48);
//				sum += (ch[i]-48);
//			}
////			else {
////				System.out.println((int)ch[i]);
////				sum += ch[i];
////			}
//		}
		
		System.out.println(sumFromString(s));
	}
}
