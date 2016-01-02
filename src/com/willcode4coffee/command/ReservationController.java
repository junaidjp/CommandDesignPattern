package com.willcode4coffee.command;

public class ReservationController {
	
	Command reservationHandler;
	
	
	public void setCommand(Command command) { 
		this.reservationHandler = command;
	}

	
	public void invokeOperation()  
	{ 
		reservationHandler.handleReservation();
	}
}
