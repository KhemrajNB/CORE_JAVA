package com.jsp.basics;

import java.util.Arrays;

//import java.util.Scanner; 

public class Demo {
	
	public static int findElement(int arr[],int ele) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==ele) {
				System.out.println("Element Found");
				return i;
			}
		}
		System.out.println("Element Not Found");
		return -1;
		
	}
	public static void main(String args[]) {      
		int[] arr = {1,3,5,9,6,8};
		
		int ele = 9	;
		System.out.println(findElement(arr,ele));
		
		int n = arr.length;
//		Arrays.sort(arr);
		
		
		for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
		
		
	}
	
}