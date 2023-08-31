package com.jsp.Collections;

public class LinkedList<T> {
//	Node head;
	private Node first;
	
	public String toString() {
		String str = "[";
		if(first==null) {
			return "[ ]";
		}
		else {
			Node temp = first;
			while(temp!=null) {
				str += temp.data;
				temp = temp.next;
				if(temp!=null) {
					str +=",";
				}
			}
		}
		return str + "]";
		
	}
	
	public T add(T e) {
		if(first==null) {
			 first = new Node(e);
		}
		else {
			Node temp = first;
			while(temp.next!=null) {
				temp = temp.next;
			}
			Node n = new Node(e);
			temp.next = n;
		}
		
		return e;
	}
}
