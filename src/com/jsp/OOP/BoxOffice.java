package com.jsp.OOP;

import java.util.Scanner;

public class BoxOffice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		theatre.showSeatAvailable();
//		theatre.setTicket(new Ticket("XYZ", 50));
//		theatre.bookTicket();
//		theatre.showSeatAvailable();
//		theatre.showTicketDetails();
//		theatre.cancelTicket(20);
//		theatre.showTicketDetails();
//		theatre.showSeatAvailable();
		System.out.println(Math.PI);
		Theatre theatre = new Theatre("PVR");
		boolean flag= true;
		while(flag) {
			System.out.println("Enter \n1. Show Seats Available \n2. Book Ticket \n3. Show Ticket \n4. Cancel Ticket \n5. Exit");
			int n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.println(theatre.showSeatAvailable() + " Tickets Available");
				break;
			case 2:
				System.out.println("Enter Movie Name :");
				String movie_name = sc.next();
				System.out.println("Enter No of Tickets :");
				int o = sc.nextInt();
				theatre.setTicket(new Ticket(movie_name, o));
				
				theatre.bookTicket();
				break;
			case 3:
				theatre.showTicketDetails();
				break;
			case 4:
				System.out.println("Enter No of Tickets to Cancel:");
				o = sc.nextInt();
				theatre.cancelTicket(o);
				System.out.println( theatre.getTicket()!=null);
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Wrong Input");
			}
		}
		sc.close();
	}

}
