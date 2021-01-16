package com.engine.allAboutUsersEngine.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	public static List<String> messages = new ArrayList<>();
    private final static String topic = "allAboutUsersTopic";
    private final static String groupId = "group_1";
    @KafkaListener(topics = topic, groupId = groupId)
    public void listen(String message) {
    	System.out.println("Consumer's listener >> " + message);
        messages.add(message);
    }
}
