package com.tekup.salle_sport.services;

import java.util.List;

import com.tekup.salle_sport.model.Reclamation;

public interface ReclamationServices {

	
	
	Reclamation saveReclamation(Reclamation R);
    void deleteReclamationById(Long id);
	Reclamation getReclamation(Long id);
	List<Reclamation> getAllReclamation();
}
