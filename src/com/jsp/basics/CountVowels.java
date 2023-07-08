package com.jsp.basics;

public class CountVowels {

	public static void main(String[] args) {
		String a = "I am Khemraj";
		int len = a.length();
		int count = 0;
		int space = 0;
		for(int i = 0; i<=len-1;i++) {
			
			char b = a.charAt(i);
			if(b==' ') {
				space++;
			}
			if (b=='a' || b == 'e' || b=='i' || b == 'o' || b=='u' || 
					b=='A' || b == 'E' || b=='I' || b == 'O' || b=='U' ) {
				count++;
			}
		}
		System.out.println("Vowel : " + count);
		System.out.println("Space : " + space);
		System.out.println("Consonent : " + (len-count-space));
		System.out.println(len-space);

	}

}
