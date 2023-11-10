package com.tekup.salle_sport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tekup.salle_sport.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation ,Long> {

}
