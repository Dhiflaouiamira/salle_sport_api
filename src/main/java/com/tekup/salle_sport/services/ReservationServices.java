package com.tekup.salle_sport.services;

import java.util.List;

import com.tekup.salle_sport.model.Reservation;

public interface ReservationServices {

	Reservation saveReservation(Reservation C);
	void deleteReservation(Reservation C);
	Reservation getReservation(Long id);
	List<Reservation> getAllReservation();
	
}
