package com.jsp.Collections;

public class NArrayList {
	private int data[];
	private int nextelement;
	
	
	public NArrayList() {
		data = new int[10];
		nextelement = 0;
	}
	
	public NArrayList(int size) {
		data = new int[size];
		nextelement = 0;
	}
	
	public NArrayList(int newdata[]) {
		data = newdata;
		nextelement = newdata.length-1;
	}
	
	
	//Override toString 
	@Override
	public String toString() {
		System.out.print("[");
		for(int i = 0;i<data.length;i++) {
			System.out.print(data[i] + ",");
		}
		return "]";
	}
	
	public boolean isEmpty() {
		return nextelement == 0;
	}
	
	public int size() {
		return nextelement;
	}
	
	public void add(int e) {
		if(nextelement==data.length) {
			incrementCapacity();
		}
		data[nextelement] = e;
		nextelement++;
	}


	private void incrementCapacity() {
		// TODO Auto-generated method stub
		int temp[] = data;
		data = new int[temp.length*(3/2)+1];
		for(int i = 0;i<temp.length;i++) {
			data[i] = temp[i];
		}
	}
	
	public int removeLast() {
		int temp = data[--nextelement];
		data[nextelement] = 0;
		return temp;
	}
}
