package com.jsp.basics;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i=1, n=100, sum=0;
       
       for(i=1;i<=n;i++)
       {
    	   if(i%4==0)
    	   {
    		   sum=sum+i;
    	   }
       }
       System.out.println("Sum of Number is "+ sum);
       
}
}


