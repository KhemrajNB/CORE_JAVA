package com.jsp.basics;

public class ArmstrongNumber {
	
	public static int len(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	
	
	public static int power(int x,int y) {
		int res = 1;
		for(int i=1;i<=y;i++) {
			res *= x;
		}
		return res;
	}
	
	

	public static boolean isArmstrong(int n) {
		int temp = n,sum = 0;
		int len = len(n);
		while(n>0) {
			int ld = n%10;
			sum += power(ld,len);
			n = n/10;
		}
		
		return temp==sum;
	}
	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
		
	}

}
