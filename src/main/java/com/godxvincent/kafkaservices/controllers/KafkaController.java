package com.godxvincent.kafkaservices.controllers;

import com.godxvincent.kafkaservices.consumers.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.io.IOException;

@Controller()
public class KafkaController {

    private final Consumer consumer;

    @Autowired
    public KafkaController(Consumer consumer) {
        this.consumer = consumer;
    }

    public void receiveMessageFromKafkaTopic(String message) throws IOException {
        this.consumer.consume(message);
    }
    
}