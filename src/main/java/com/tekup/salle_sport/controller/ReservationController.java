package com.tekup.salle_sport.controller;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.salle_sport.model.Reservation;
import com.tekup.salle_sport.services.ReservationServices;




@RestController
@RequestMapping({"/api/reservations"})

public class ReservationController {
	@Autowired
	private ReservationServices reservationServices;
	
	
	@GetMapping
	public List<Reservation> getALLReservation(){
		return reservationServices.getAllReservation();
}
	
	@PostMapping
	public Reservation AddReservation(@RequestBody Reservation P) {
		return reservationServices.saveReservation(P);
}

      
    @DeleteMapping
    public void DeleteReservation(@RequestBody Reservation P) {
    	reservationServices.deleteReservation(P);
    }
}