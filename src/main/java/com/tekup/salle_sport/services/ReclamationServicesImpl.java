package com.tekup.salle_sport.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.salle_sport.model.Reclamation;
import com.tekup.salle_sport.repository.ReclamationRepository;


@Service
public class ReclamationServicesImpl implements ReclamationServices{

	@Autowired 
	private ReclamationRepository reclamationRepository;
	
	@Override
	public Reclamation saveReclamation(Reclamation R) {
		
		return reclamationRepository.save(R);
	}

	 @Override
	    public void deleteReclamationById(Long id) {
	        reclamationRepository.deleteById(id);
	    }


	@Override
	public Reclamation getReclamation(Long id) {
		
		return reclamationRepository.findById(id).get();
	}

	@Override
	public List<Reclamation> getAllReclamation() {
		
	 return reclamationRepository.findAll();
	}

}
