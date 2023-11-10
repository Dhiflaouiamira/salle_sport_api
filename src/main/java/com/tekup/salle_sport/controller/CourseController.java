package com.tekup.salle_sport.controller;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.salle_sport.model.Course;
import com.tekup.salle_sport.services.CourseServices;




@RestController
@RequestMapping({"/api/courses"})

public class CourseController {
	@Autowired
	private CourseServices courseServices;
	
	
	@GetMapping
	public List<Course> getALLCourse(){
		return courseServices.getAllCourse();
}
	
	@PostMapping
	public Course AddCourse(@RequestBody Course P) {
		return courseServices.saveCourse(P);
}

      
    @DeleteMapping
    public void DeleteCourse(@RequestBody Course P) {
    	courseServices.deleteCourse(P);
    }
}