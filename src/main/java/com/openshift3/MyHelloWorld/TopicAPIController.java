package com.openshift3.MyHelloWorld;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openshift3.Models.Topic;

@RestController
public class TopicAPIController {

	@RequestMapping(value="/topics", produces="application/json")
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic("1","Spring os", "First Spring OS"),
				new Topic("2","Rest os","First Rest OS"));
	}
	
}
