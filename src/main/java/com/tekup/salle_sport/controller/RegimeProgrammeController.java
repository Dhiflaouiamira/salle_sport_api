package com.tekup.salle_sport.controller;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.salle_sport.model.RegimeProgramme;
import com.tekup.salle_sport.services.RegimeProgrammeServices;




@RestController
@RequestMapping({"/api/regimeProgrammes"})

public class RegimeProgrammeController {
	@Autowired
	private RegimeProgrammeServices regimeProgrammeServices;
	
	
	@GetMapping
	public List<RegimeProgramme> getALLRegimeProgramme(){
		return regimeProgrammeServices.getAllRegimeProgramme();
}
	
	@PostMapping
	public RegimeProgramme AddRegimeProgramme(@RequestBody RegimeProgramme P) {
		return regimeProgrammeServices.saveRegimeProgramme(P);
}

      
    @DeleteMapping
    public void DeleteRegimeProgramme(@RequestBody RegimeProgramme P) {
    	regimeProgrammeServices.deleteRegimeProgramme(P);
    }
}