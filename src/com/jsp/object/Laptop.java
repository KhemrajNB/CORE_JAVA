package com.jsp.object;

public class Laptop {
	static String Brand = "ASUS";
	double price;
	String RAM;
	String processor;
	
	public Laptop(String RAM,Double price) {
		this.price = price;
		this.RAM = RAM;
	}
	public Laptop(String RAM, String processor, Double price) {
		this(RAM,price);
		this.processor = processor;
	}
}
