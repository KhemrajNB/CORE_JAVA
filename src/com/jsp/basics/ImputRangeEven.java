package com.jsp.basics;

import java.util.Scanner;

public class ImputRangeEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		for(int i =n1;(n1>n2?i>=n2:i<=n2);i++){
			if(i%2==0){
				System.out.print(i+ " ");
			}
			if(n1>n2) {
				i -=2;
			}
		}
		
		
		System.out.println("\n=====================\n=====================");
		if(n1>n2) {
			int temp = n1;
			n1=n2;
			n2=temp;
		}
		
		for(int i =n1;i<=n2;i++){
			if(i%2==0){
				System.out.print(i+ " ");
			}
		}	
		
		sc.close();
	}

}
