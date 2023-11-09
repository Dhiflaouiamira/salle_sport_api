package com.tekup.salle_sport.services;


import com.tekup.salle_sport.model.Session;
import com.tekup.salle_sport.model.User;

public interface SessionServices {

	Session findByToken(String token);

	Session findByUser(User user);

	void save(User user, String token);
	
}