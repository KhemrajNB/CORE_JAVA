package com.jsp.OOP;

import java.util.Objects;

public class Car {
	String brand;
	String name;
	double price;
	String color;
	
	public Car(String brand, String name, double price, String color) {
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "{brand :\"" + brand + "\", name :\"" + name  + "\", price :" + price +", color :\"" + color + "\"}";
	}
	
	@Override
	public boolean equals(Object obj) {
		Car c = (Car)obj;
		return this.name == c.name && this.brand == c.brand;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand,name);
	}

}
