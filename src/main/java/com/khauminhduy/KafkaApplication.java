package com.khauminhduy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KafkaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, KafkaConsumerConfig.class, KafkaProducerConfig.class);
		MessageProducer producer = context.getBean(MessageProducer.class);

		producer.senMessage("Khau Minh Duy");
		producer.senMessage("Huynh Viet Anh Phi");
		
		context.close();
	}

}
