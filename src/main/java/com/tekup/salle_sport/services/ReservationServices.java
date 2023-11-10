package com.tekup.salle_sport.services;

import java.util.List;

import com.tekup.salle_sport.model.Reservation;

public interface ReservationServices {

	Reservation saveReservation(Reservation C);
	void deleteReservationById(Long id);
	Reservation getReservation(Long id);
	List<Reservation> getAllReservation();
	
}
