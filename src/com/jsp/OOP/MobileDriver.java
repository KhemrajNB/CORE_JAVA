package com.jsp.OOP;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", "Galaxy", "pink", 1000.0);
		m1.printMobile();
		System.out.println("--------------------------------------------------");
		
		m1.setSim1(new Sim1("Airtel", "5G", 9876543212l));
		m1.printMobile();
		System.out.println("--------------------------------------------------");
		m1.setSim2(new Sim2("Jio", "5G", 8584848332l));
		m1.printMobile();

	}

}
