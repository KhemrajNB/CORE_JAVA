package com.jsp.basics;

public class DecisionMakingControl {

	public static void main(String[] args) {
		// Even Addition Odd Multiplication
		int n = 20, sum = 0, pro = 1;
		for(int i = 1; i <= n; i++) {
			if(i%2 == 0) {
				sum += i;
			}
			else {
				pro *= i;
			}
		}
		System.out.println("Even Addition : " + sum);
		System.out.println("Odd Multiplication : " + pro);
		
		
	}

}
