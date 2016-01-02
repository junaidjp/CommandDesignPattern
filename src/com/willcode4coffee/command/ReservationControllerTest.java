package com.willcode4coffee.command;

public class ReservationControllerTest {
	
	public static void main(String args[]) { 
		
		ReservationController reservationController = new ReservationController();
		Reservation reservation = new Reservation();
		 reservation.setName("XYZ");
		 reservation.setRecordLocator("ABCDEF");
		 
		 CreateReservationCommand  createreservation = new CreateReservationCommand(reservation);
		
		 
		 
		 CancelReservationCommand cancelreservation = new CancelReservationCommand(reservation);
		
		 
		 
		 reservationController.setCommand(createreservation);
		 reservationController.invokeOperation();
		 
		 
		 reservationController.setCommand(cancelreservation);
		 reservationController.invokeOperation();
		 
		 
		 
		
		
		
		
		
	}

}
