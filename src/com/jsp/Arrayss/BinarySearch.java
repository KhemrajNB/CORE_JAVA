package com.jsp.Arrayss;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {2,16,17,18,19,20,27};
		int key = 27;
		int low = 0;
		int high = a.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(a[mid]==key) {
				System.out.println("Value present at" + mid);
				break;
			}else if(a[mid]>key) {
				high = mid-1;
			}
			else if(a[mid]<key){
				low = mid+1;
			}
		}

	}

}
