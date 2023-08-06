package com.jsp.CSIR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Demo               extends Demo1{
	
	public static void main(String[] args) {
		
		Demo1 d1 = new Demo();
		Demo d2 = (Demo)d1;
		System.out.println(d1.equals(d2));
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(6);
		al.add(2);
		
		Collections.sort(al);
		System.out.println(al);
		
		int arr[]= {5,2,7,3,7,2};
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();Objects.hash(10);
		
	}

}
