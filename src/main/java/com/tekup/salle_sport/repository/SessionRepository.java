package com.tekup.salle_sport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekup.salle_sport.model.Session;
import com.tekup.salle_sport.model.User;
@Repository
public interface SessionRepository extends JpaRepository<Session, Long>{

	Session findByToken(String token);
	Session findByUser(User user);
}