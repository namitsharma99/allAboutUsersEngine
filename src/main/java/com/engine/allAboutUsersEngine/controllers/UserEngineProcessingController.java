package com.engine.allAboutUsersEngine.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engine.allAboutUsersEngine.services.KafkaConsumer;

@RestController

public class UserEngineProcessingController {

	@Autowired
	private KafkaConsumer consumer;

	@GetMapping("/processMessages")
	public List<String> processMessages() {
		List<String> allMessages = consumer.messages;
		
		// allMessages.stream().forEach(msg -> processTimings(msg));
		
		return allMessages;
	}

}
