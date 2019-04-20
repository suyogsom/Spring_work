package com.sai.springdemo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	

	
	// method to give back all topics in list
	public List<Topic> getAllTopics(){
		//return topics;
		
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}
	
	
	// method to give back single topic
	public Topic getTopic(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id).get();   // you have to use get here else error
	}
	
	// adds a topic
	public void addTopic(Topic topic)
	{
		//topics.add(topic);
		
		topicRepository.save( topic);
	}

	// update a topic
	public void updateTopic(Topic topic, String id) {

		topicRepository.save(topic);
	}

	// delete a topic
	public void deleteTopic(String id) {
		
		//topics.removeIf(t->t.getId().equals(id));
		topicRepository.deleteById(id);
	}
	
}
