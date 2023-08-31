package com.jsp.Arrayss;

public class SelectionSort {
	public static int[] selectionSort(int arr[]) {
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		return arr;
	}
	public static void main(String[] args) {
		int a[] = {5,2,70,43,56,23};
		int res[] = selectionSort(a);
		for(int i : res) {
			System.out.print(i + " ");
		}
	}

}
