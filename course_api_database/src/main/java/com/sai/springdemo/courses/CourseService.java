package com.sai.springdemo.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	

	
	// method to give back all topics in list
	public List<Course> getAllCourse(String topicdId){
		//return topics;
		
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicdId)
		.forEach(courses::add);
		
		return courses;
	}
	
	
	// method to give back single Course
	public Course getCourse(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id).get();   // you have to use get here else error
	}
	
	// adds a Course
	public void addCourse(Course Course)
	{
		//topics.add(topic);
		
		courseRepository.save( Course);
	}

	// update a Course
	public void updateCourse(Course Course, String id) {

		courseRepository.save(Course);
	}

	// delete a Course
	public void deleteCourse(String id) {
		
		//topics.removeIf(t->t.getId().equals(id));
		courseRepository.deleteById(id);
	}
	
}
