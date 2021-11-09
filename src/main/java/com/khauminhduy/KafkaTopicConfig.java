package com.khauminhduy;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaTopicConfig {

	private String bootstrapServer = "localhost:9092";
	
	private String topic = "mytopic";
	
	@Bean
	public KafkaAdmin kafkaAdmin() {
		Map<String, Object> configs = new HashMap<>();
		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
		return new KafkaAdmin(configs);
	}
	
	@Bean
	public NewTopic topic() {
		return new NewTopic(topic, 1, (short) 1);
	}
	
}
