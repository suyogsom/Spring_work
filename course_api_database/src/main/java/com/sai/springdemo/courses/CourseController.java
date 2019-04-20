package com.sai.springdemo.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sai.springdemo.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	
	// this api gives list of all courses for that topic
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourse(@PathVariable String id)
	{
		
		return courseService.getAllCourse(id);
	}

	
	// this api gives only particular topic
	@RequestMapping("/topics/{topicId}/courses/{id}")  // this is variable portion id with {}, you can change name of this id but needs to do extra work
	public Course getCourse(@PathVariable String id)  //pathvariable gives value of variable portion id to method as a parameter
	{		
		return courseService.getCourse(id);
	}
	
	
	// create topic
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses") // to do post request
	public void addCourse(@RequestBody Course course, @PathVariable String topicId)  // requestbody
	{
		course.setTopic(new Topic (topicId,"",""));
		courseService.addCourse(course);
	}
	
	
	
	// update topic
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}") // to do post request
		public void updateCourse(@RequestBody Course course, @PathVariable String id,@PathVariable String topicId)  // requestbody will pass body of request to method
		{
			course.setTopic(new Topic (topicId,"",""));
			courseService.updateCourse(course, id);
		}
		
		
		
		// delete topic
				@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}") // to do post request
				public void deleteCourse( @PathVariable String id)  // requestbody will pass body of request to method
				{
					courseService.deleteCourse(id);
				}
}
