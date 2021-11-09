package com.khauminhduy;

import org.springframework.kafka.annotation.KafkaListener;

public class MessageListener {

    @KafkaListener(topics = "mytopic", groupId = "group_id")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group : " + message);
    }
	
}
