package com.tekup.salle_sport.controller;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

      
    @DeleteMapping
    public void DeleteReclamation(@RequestBody Reclamation P) {
    	reclamationServices.deleteReclamation(P);
    }
}