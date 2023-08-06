package com.jsp.CSIR;
public class Armstrong {
	
	
	
  static  int length(int len) {
    	int count=0;
    	while(len>0) {
    		len=len/10;
    		count++;
    		
    	}
    	return count;
    }
    
 static   int power(int x ,int y) {
	  int pro=1;
    	for(int i=1;i<=y;i++) {
    		pro=pro*x;
    	}
    	return pro;
    }
    
   static boolean isArmstrong(int n) {
    	int len = length(n);
    	int temp = n;
    	
    	int sum = 0;
    	
    	while(n>0) {
    		int ld=n%10;
    		n=n/10;
    		sum =sum+power(ld,len);
    	}
    	
    	return temp==sum;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(isArmstrong(153));
	}

}
