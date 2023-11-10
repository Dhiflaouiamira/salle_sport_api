package com.tekup.salle_sport.controller;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	 @PutMapping("/{reservationId}")
	    public ResponseEntity<Reservation> updateReservation(
	            @PathVariable Long reservationId,
	            @RequestBody Reservation updatedReservation
	    ) {
	        // Check if the provided reservationId matches the one in the path
	        if (!reservationId.equals(updatedReservation.getId())) {
	            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	        }

	        Reservation savedReservation = reservationServices.saveReservation(updatedReservation);

	        if (savedReservation != null) {
	            return new ResponseEntity<>(savedReservation, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	@DeleteMapping("/{reservationId}")
	public void DeleteReservation(@PathVariable Long reservationId) {
		reservationServices.deleteReservationById(reservationId);
	}
  
  
}