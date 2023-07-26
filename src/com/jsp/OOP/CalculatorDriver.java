package com.jsp.OOP;

public class CalculatorDriver {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.addTwoNumbers(50, 30);
		c.subTwoNumber(50, 30);
		
		int pro = Calculator.proTwoNumber(12, 4);
		System.out.println(pro + " Product of Two Number");
		
		
		System.out.println(c.divTwoNumber(50, 8) + " DIV ");
	}

}
