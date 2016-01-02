package com.willcode4coffee.command;

public class CancelReservationCommand implements Command {

	Reservation reservation;
	
	public CancelReservationCommand(Reservation reservation) {

	this.reservation = reservation;	
		
	}

	
	public void handleReservation() {
		System.out.println("The Reservation for " + reservation.getName() +
				" with recordLocator " + reservation.getRecordLocator() + " Was Cancelled");
		
	}

	
	
	
}
