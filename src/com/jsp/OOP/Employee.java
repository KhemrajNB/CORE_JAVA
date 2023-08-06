package com.jsp.OOP;

import java.util.Objects;

public class Employee {
	int id;
	String name;
	String email;
	
	public Employee(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "id : " + id + " \nname : " + name + " \nemail : " + email;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		return this.id == e.id && this.name == e.name && this.email == e.email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,name,email);
	}
}
