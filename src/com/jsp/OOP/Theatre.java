package com.jsp.OOP;

public class Theatre {
	private String tname;
	private int noofseats=500;
	
	private Ticket ticket;
	
	public Theatre(String tname) {
		this.tname = tname;
	}
	
	
	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public int getNoofseats() {
		return noofseats;
	}


	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
	
	
	public Ticket getTicket() {
		return ticket;
	}


	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}


	public int bookTicket() {
		if(ticket.getNoofticket()>0) {
			if(ticket.getNoofticket()<=noofseats) {
				noofseats -= ticket.getNoofticket();
				return ticket.getNoofticket();
			}
			else {
				System.out.println(ticket.getNoofticket() + "Ticket Not Availabel");
				return -1;
			}
		}
		System.out.println("Invalid Input");
		return -1;
	}
	
	public int cancelTicket(int cancelticket) {
		if(ticket != null) {
			if(ticket.getNoofticket()>0) {
				noofseats += cancelticket;
				ticket.setNoofticket(ticket.getNoofticket()-cancelticket);
				System.out.println(cancelticket + " Tickets got Canceled");
				return cancelticket;
			}
			System.out.println("Invalid Input");
			return -1;
		}
		else {
			System.out.println("No tickets booked to cancel");
			return -1;
		}
	}
	
	public void showTicketDetails() {
		if(ticket!=null) {
			ticket.printTicket();
		}
		else {
			System.out.println("No Tickets Booked");
		}
	}
	
	public int showSeatAvailable() {
		return noofseats;
	}
	
	
	
	
}
