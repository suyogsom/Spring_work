package com.sai.springdemo.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	
	// this api gives list of all topics
	@RequestMapping("/topics")
	public List<Topic> getAllTOpic()
	{
		
		return topicService.getAllTopics();
	}

	
	// this api gives only particular topic
	@RequestMapping("/topics/{id}")  // this is variable portion id with {}, you can change name of this id but needs to do extra work
	public Topic getTopic(@PathVariable String id)  //pathvariable gives value of variable portion id to method as a parameter
	{		
		return topicService.getTopic(id);
	}
	
	
	// create topic
	@RequestMapping(method=RequestMethod.POST, value="/topics") // to do post request
	public void addTopic(@RequestBody Topic topic)  // requestbody
	{
		topicService.addTopic(topic);
	}
	
	
	
	// update topic
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}") // to do post request
		public void updateTopic(@RequestBody Topic topic, @PathVariable String id)  // requestbody will pass body of request to method
		{
			topicService.updateTopic(topic, id);
		}
		
		
		
		// delete topic
				@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}") // to do post request
				public void deleteTopic( @PathVariable String id)  // requestbody will pass body of request to method
				{
					topicService.deleteTopic(id);
				}
}
