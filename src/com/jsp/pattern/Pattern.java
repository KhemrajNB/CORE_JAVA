package com.jsp.pattern;

public class Pattern {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		System.out.println("\nSECOND\n");
		
		for(int i = n;i>=1;i--) {
			for(int j = i;j>=1;j--) {
				System.out.print(i);
			}
			System.out.println();
		}

		
		
		
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("LAST");
		for(int i=1;i<=n;i++) {
			for(int j = n;j>=1;j--) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}

}
