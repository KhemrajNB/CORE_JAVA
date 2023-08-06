package com.jsp.OOP;

public class CarDriver {
	public static void main(String[] args) {
		Car c1 = new Car("BMW","X1", 987654,"White");
		Car c2 = new Car("BMW","X1", 987654,"White");
		System.out.println(c1);
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode()); 
	}
}
