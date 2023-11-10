package com.tekup.salle_sport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tekup.salle_sport.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
