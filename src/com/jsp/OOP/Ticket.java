package com.jsp.OOP;

public class Ticket {
	private String moviename;
	private int noofticket;
	
	public Ticket(String moviename, int noofticket) {
		
		this.moviename = moviename;
		this.noofticket = noofticket;
	}

	public String getMoviename() {
		return moviename;
	}

	

	public int getNoofticket() {
		return noofticket;
	}

	public void setNoofticket(int noofticket) {
		this.noofticket = noofticket;
	}
	
	public void printTicket() {
		System.out.println("=====" + moviename + "=====");
		System.out.println("Ticket : " + noofticket);
		
	}
	
	
}
