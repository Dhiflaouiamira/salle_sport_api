package com.tekup.salle_sport.services;

import java.util.List;

import com.tekup.salle_sport.model.Course;


public interface CourseServices {



		
		Course saveCourse(Course C);
		void deleteCourse(Course C);
		Course getCourse(Long id);
		List<Course> getAllCourse();
		
	}

