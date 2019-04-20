package com.sai.springdemo.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic t)
	// deleteTopic(String id)
	
	// no need to give this methods instead of class make it interface
	
	// common repository
	
	// this is the method to tie course and topic
	// takes topic and return course
	
	// public List<Course> findByName(String name); // use this method to get course by name of course
	
	
	public List<Course> findByTopicId(String topicId); 
}
