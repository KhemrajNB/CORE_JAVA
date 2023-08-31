package com.jsp.pattern;

//import java.util.HashMap;
//import java.util.Iterator;

public class PatternDriver {

	public static void main(String[] args) {
//		SquareHollow.squareHollow(5);
		int n= 5;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				if(j==1 || i==n || i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
		
		int i = 10;
		Integer j = Integer.valueOf(i);
		int s = Integer.parseInt("1");
		System.out.println(s);
		
		

	}

}
