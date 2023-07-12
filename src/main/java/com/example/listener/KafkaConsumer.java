package com.example.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaConsumer {

	@KafkaListener(topics = "test", groupId = "test-group")
	public void listener(ConsumerRecord<String, String> consumerRecord) {
	    System.out.println("Received Message : "+ consumerRecord.key() + "  value : " + consumerRecord.value());
	}
}
