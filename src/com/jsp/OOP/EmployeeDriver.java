package com.jsp.OOP;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1 = new Employee(10, "XYZ", "xyz@mail.com");
		Employee e2 = new Employee(10, "XYZ", "xyz@mail.com");
		System.out.println(e1);
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
