package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ProducerController {
	
	@Autowired
	KafkaMessageProducer kafkaMessageProducer;


    @GetMapping("/produce/{message}")
    public void produceMessage(@PathVariable("message") final String message) {
    	kafkaMessageProducer.sendMessage(message);
    }
}
