package com.jsp.basics;

public class XylemPhloem {
	public static int len(int n) {
		int count = 0;
		while(n>0){
			n=n/10;
			count++;
		}
		return count;
	}
	
	public static String xylemPhloem(int n) {
		int corner = 0, mid = 0;
		int len = len(n);
		for(int i = len;i>=1;i--) {
			int ld = n%10;
			if(i == 1 || i == len) {
				corner += ld;
			}
			else {
				mid += ld;
			}
			n=n/10;
		}
		if(corner == mid) {
			return "Xylem";
		}
		return "Phloem";
		
	}
	public static void main(String[] args) {
		System.out.println(xylemPhloem(13338));

	}

}
