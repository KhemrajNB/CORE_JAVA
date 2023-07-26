package com.jsp.pattern;

public class Butterfly {

	public static void butterfly(int n) {
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j = 1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i = 1;i<=n-1;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println("");		
		}
	}
}
