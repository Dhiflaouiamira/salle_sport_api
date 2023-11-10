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

import com.tekup.salle_sport.model.Reclamation;
import com.tekup.salle_sport.services.ReclamationServices;




@RestController
@RequestMapping({"/api/reclamations"})

public class ReclamationController {
	@Autowired
	private ReclamationServices reclamationServices;
	
	
	@GetMapping
	public List<Reclamation> getALLReclamation(){
		return reclamationServices.getAllReclamation();
}
	
	@PostMapping
	public Reclamation AddReclamation(@RequestBody Reclamation P) {
		return reclamationServices.saveReclamation(P);
}
	 @PutMapping("/{reclamationId}")
	    public ResponseEntity<Reclamation> updateReclamation(
	            @PathVariable Long reclamationId,
	            @RequestBody Reclamation updatedReclamation
	    ) {
	        // Check if the provided reclamationId matches the one in the path
	        if (!reclamationId.equals(updatedReclamation.getId())) {
	            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	        }

	        Reclamation savedReclamation = reclamationServices.saveReclamation(updatedReclamation);

	        if (savedReclamation != null) {
	            return new ResponseEntity<>(savedReclamation, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	@DeleteMapping("/{reclamationId}")
	public void DeleteReservation(@PathVariable Long reservationId) {
		reclamationServices.deleteReclamationById(reservationId);
	}

	

}