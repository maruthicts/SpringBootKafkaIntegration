package com.demo.kafka.consumer;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.demo.kafka.producer.Producer;

@Service
public class Consumer {

	private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "users", groupId = "gdemo_group")
    public void consume(String message) throws IOException {
    	
    	/* Simply logging message here */
        logger.info(String.format("Consumed message : ", message));
    }
}
