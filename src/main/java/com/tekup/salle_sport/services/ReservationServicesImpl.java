package com.tekup.salle_sport.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.salle_sport.model.Reservation;
import com.tekup.salle_sport.repository.ReservationRepository;


@Service
public class ReservationServicesImpl implements ReservationServices{

	@Autowired 
	private ReservationRepository reservationRepository;
	
	@Override
	public Reservation saveReservation(Reservation C) {
		
		return reservationRepository.save(C);
	}

	@Override
	public void deleteReservation(Reservation C) {
		reservationRepository.delete(C);
		
	}

	@Override
	public Reservation getReservation(Long id) {
		
		return reservationRepository.findById(id).get();
	}

	@Override
	public List<Reservation> getAllReservation() {
		
	 return reservationRepository.findAll();
	}

}
