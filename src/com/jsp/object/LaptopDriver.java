package com.jsp.object;

public class LaptopDriver {

	public static void main(String[] args) {
		Laptop laptop1= new Laptop("8Gb", "i5", 500.0);
		//laptop1.DefineBrand();
		System.out.println(laptop1.RAM);
		System.out.println(laptop1.price);
		System.out.println(laptop1.processor);

	}

}
