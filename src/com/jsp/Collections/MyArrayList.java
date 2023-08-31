package com.jsp.Collections;

public class MyArrayList {
	private Object data[];
	private int nextelement;
	
	
	public MyArrayList() {
		data = new Object[10];
		nextelement = -1;
	}
	
	public MyArrayList(int initialCapacity) {
		data = new Object[initialCapacity];
		nextelement = -1;
	}
	
	
	//Override toString 
	@Override
	public String toString() {
		String str = "[";
		for(int i = 0;i<=nextelement;i++) {
			if(i==nextelement) {
				str += data[i];
			}
			else {
				str += data[i] + ", ";
			}
			
		}
		str += "]";
		return str;
	}
	
	public boolean isEmpty() {
		return nextelement == -1;
	}
	
	public int size() {
		return nextelement+1;
	}
	
	
	public void add(int e) {
		if(nextelement+1==data.length) {
			incrementCapacity();
		}
		nextelement++;
		data[nextelement] = e;
		
	}


	private void incrementCapacity() {
		// TODO Auto-generated method stub
		Object temp[] = data;
		data = new Object[temp.length*(3/2)+1];
		for(int i = 0;i<temp.length;i++) {
			data[i] = temp[i];
		}
	}
	
	public void removeLast() {
		data[nextelement--] = 0;
	}
	
}
