package com.jsp.Arrayss;

public class BubbleSort {
	public static int[] bubbleSort(int arr[]) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
		
		return arr;
	}
	public static void main(String[] args) {
		int a[] = {5,2,70,43,56,23};
		int res[] = bubbleSort(a);
		for(int i : res) {
			System.out.print(i + " ");
		}
	}

}
