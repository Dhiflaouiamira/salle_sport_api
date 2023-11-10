package com.tekup.salle_sport.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.salle_sport.model.Course;
import com.tekup.salle_sport.repository.CourseRepository;


@Service
public class CourseServicesImpl implements CourseServices{

	@Autowired 
	private CourseRepository courseRepository;
	
	@Override
	public Course saveCourse(Course C) {
		
		return courseRepository.save(C);
	}

	@Override
	public void deleteCourse(Course C) {
		courseRepository.delete(C);
		
	}

	@Override
	public Course getCourse(Long id) {
		
		return courseRepository.findById(id).get();
	}

	@Override
	public List<Course> getAllCourse() {
		
	 return courseRepository.findAll();
	}

}
