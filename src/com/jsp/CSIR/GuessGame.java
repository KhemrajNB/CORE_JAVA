package com.jsp.CSIR;

public class GuessGame {
	
	public static int guessNumber(int min, int max,int n, int count) {
		int c = (min+max)/2;
		count++;
		if(count==8) {
			System.out.println("Game Over");
			return -1;
		}
		if(c>n) {
			System.out.println("Too Low" + count);
			return guessNumber(min, c,n,count);
		}
		else if(c<n) {
			System.out.println("Too High" +count);
			return guessNumber(c, max,n,count);
		}
		
		System.out.println("Caught" + count);
		return c;
		
	}
	
	public static void main(String[] args) {
		int n = 1;
		System.out.println(guessNumber(1,100,n,0));
		

	}

}
