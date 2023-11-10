package com.tekup.salle_sport.services;

import java.util.List;

import com.tekup.salle_sport.model.RegimeProgramme;

public interface RegimeProgrammeServices {


	
	RegimeProgramme saveRegimeProgramme(RegimeProgramme R);
	void deleteRegimeProgramme(RegimeProgramme R);
	RegimeProgramme getRegimeProgramme(Long id);
	List<RegimeProgramme> getAllRegimeProgramme();
	
}