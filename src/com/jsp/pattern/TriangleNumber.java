package com.jsp.pattern;

public class TriangleNumber {

	public static void triangleNumber(int n) {
		// TODO Auto-generated method stub
		int counter = 1;
		
		for(int i=1;i<=n;i++) {
			if(counter>9) {
				counter = 0;
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			
			for(int k =1;k<=i;k++) {
				System.out.print(counter);
				System.out.print(" ");
			}
			System.out.println();
			counter++;
		}

	}

}
