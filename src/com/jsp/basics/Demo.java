package com.jsp.basics;

public class Demo {
	
	public static void main(String args[]) {
		int a = 7;
		Boolean flag = true;
		for(int i = 2; i<a; i++) {
			if(a%i==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime");
		}
	}
	
}