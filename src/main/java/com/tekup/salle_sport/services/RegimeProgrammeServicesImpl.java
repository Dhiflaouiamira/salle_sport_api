package com.tekup.salle_sport.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.salle_sport.model.RegimeProgramme;
import com.tekup.salle_sport.repository.RegimeProgrammeRepository;


@Service
public class RegimeProgrammeServicesImpl implements RegimeProgrammeServices{

	@Autowired 
	private RegimeProgrammeRepository regimeProgrammeRepository;
	
	@Override
	public RegimeProgramme saveRegimeProgramme(RegimeProgramme C) {
		
		return regimeProgrammeRepository.save(C);
	}

	@Override
	public void deleteRegimeProgramme(RegimeProgramme C) {
		regimeProgrammeRepository.delete(C);
		
	}

	@Override
	public RegimeProgramme getRegimeProgramme(Long id) {
		
		return regimeProgrammeRepository.findById(id).get();
	}

	@Override
	public List<RegimeProgramme> getAllRegimeProgramme() {
		
	 return regimeProgrammeRepository.findAll();
	}

}
