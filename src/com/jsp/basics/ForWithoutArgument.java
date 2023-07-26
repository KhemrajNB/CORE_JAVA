package com.jsp.basics;

public class ForWithoutArgument {

	public static void main(String[] args) {
		int k=1;
		for (;;) {
			if(k<=5) {
				System.out.println("Hiiiii" + k);
				k++;
			}
			else {
				break;
			}
		}

	}

}
