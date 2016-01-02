package com.willcode4coffee.command;

public class CreateReservationCommand implements Command {

	Reservation reservation;
	
	public CreateReservationCommand(Reservation reservation) {
		
		this.reservation = reservation;
	}


	public void handleReservation() {
		
		System.out.println("The Reservation for " + reservation.getName() +
				" with recordLocator " + reservation.getRecordLocator() + " Was created");
	
		
	}

}
