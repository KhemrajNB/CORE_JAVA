package com.jsp.Strings;

public class CharFrequency {
	public static void charFrequency(String str) {
		str = str.toLowerCase();
		String temp = "";
		for(int i = 0;i<str.length();i++) {
			int count = 0;
			String s = str.charAt(i)+"";
			for(int j = i;j<str.length() &&!temp.contains(s);j++) {
				if(s.equals(str.charAt(j)+"")){
//					System.out.println(temp);
					count++;
				}
				
			}
			if(!temp.contains(s)) {
				System.out.println(s+":"+count);
				temp += str.charAt(i);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Programming";
		charFrequency(str);
	}

}
