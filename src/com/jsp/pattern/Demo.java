package com.jsp.pattern;

public class Demo {

	public static void main(String[] args) {
		int n = 7;
//		for(int i = n; i>=1 ;i--) {
//			for(int j = 1;j<i;j++) {
//				System.out.print("  ");
//			}
//			for(int k = i;k<=n;k++) {
//				System.out.print(k + " ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
//		for(int i = 1;i<=n;i++) {
//			for(int j = n;j>=i;j--) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
//		for(int i = n;i>=1;i--) {
//			for(int j = n;j>=n-i+1;j--) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
//		for(int i =1;i<=n;i++) {
//			int temp = 0;
//			for(int j = 1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for(int k = 1;k<=i;k++) {
//				if(k>1) {
//					System.out.print("+ ");
//				}
//				System.out.print(k + " ");
//				temp += k;
//			}
//			for(int j = 1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			System.out.println(" = " + temp);
//		}
		
		
//		for(int i = 1;i<=n;i++) {
//			for(int j = 1;j<=i-1;j++) {
//				System.out.print("  ");
//			}
//			for(int k = 1;k<=n-i+1;k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		
//		for(int i = 1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(j>=i) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		for(int i = 1;i<=n;i++) {
//			for(int j = 1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<=i*2-1;j++) {
//				System.out.print(i%2==0?(j-1)%2:j%2);	
//			}
//			System.out.println();
//		}
		
		
		
//		for(int i = 1;i<=n;i++) {
//			int k = i;
//			for(int j = 1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<=i*2-1;j++) {
//				System.out.print(k);
//				if(j<i) {
//					k--;
//				}
//				else {
//					k++;
//				}
//			}
//			System.out.println();
//		}

		
//		for(int i = n;i>=1;i--) {
////			int k = i;
//			for(int j = 1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j = i*2-1;j>=1;j--) {
//				System.out.print("*");
////				if(j<i) {
////					k--;
////				}
////				else {
////					k++;
////				}
//			}
//			System.out.println();
//		}
		
//		n=7;
//		int st = 1;
//		int sp = n/2;
//		for(int i = 1;i<=n;i++) {
//			for(int j = 1;j<=sp;j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<=st;j++) {
//				System.out.print(i%2==0?(j-1)%2:j%2);
////				System.out.print(i%2);
//			}
//			if(i<=n/2) {
//				st += 2;
//				sp--;
//			}
//			else {
//				st -= 2;
//				sp++;
//			}
//			System.out.println();
//			
//		}
		
		
		
//		n=7;
//		int st = 1;
//		int sp = n/2;
//		for(int i = 1;i<=n;i++) {
//			int k = sp+1;
//			for(int j = 1;j<=sp;j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1;j<=st;j++) {
////				System.out.print(i%2==0?(j-1)%2:j%2);
//				if(k-1==sp) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				if(j<=st/2) {
//					k++;
//				}
//				else {
//					k--;
//				}
//			}
//			if(i<=n/2) {
//				st += 2;
//				sp--;
//				
//			}
//			else {
//				st -= 2;
//				sp++;
//			}
//			System.out.println();	
//		}
		
		
		n=7;
		int st = 1;
		int sp = n/2;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=st;j++) {
				if(j==st || j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<=n/2) {
				st += 2;
				sp--;
				
			}
			else {
				st -= 2;
				sp++;
			}
			
			
			System.out.println();
			
			
		}
		
		
		
		
		
		
		

	}

}
