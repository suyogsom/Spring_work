package com.sai.springdemo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	// list of all topics
	List<Topic> topics =  new ArrayList<> (Arrays.asList(
			new Topic("spring","spring framework","spring framework description"),
			new Topic("java","core java", "core java framework"),
			new Topic("javascript", "new javascript","java script framework"),
			new Topic("python","sctipting python","python description")

));
	
	
	// method to give back all topics in list
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	
	// method to give back single topic
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	// adds a topic
	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}

	// update a topic
	public void updateTopic(Topic topic, String id) {

		for(int i=0;i<topics.size();i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic); return;
			}
		}
		
	}

	// delete a topic
	public void deleteTopic(String id) {
		
		topics.removeIf(t->t.getId().equals(id));
		
	}
	
}
