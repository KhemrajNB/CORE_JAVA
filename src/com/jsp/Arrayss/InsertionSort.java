package com.jsp.Arrayss;

public class InsertionSort {
	public static int[] insertionSort(int arr[]) {
		for(int i = 1;i<arr.length;i++) {
			int current = arr[i];
			int j = i-1;
			while(j>=0 && current<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		
		
		return arr;
	}
	public static void main(String[] args) {
		int a[] = {5,2,70,43,56,23};
		int res[] = insertionSort(a);
		for(int i : res) {
			System.out.print(i + " ");
		}
		
	}

}
