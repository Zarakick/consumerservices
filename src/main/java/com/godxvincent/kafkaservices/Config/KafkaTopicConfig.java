package com.godxvincent.kafkaservices.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {
	@Bean
    public NewTopic setNewTopic() {
         return new NewTopic("demo", 100, (short) 1);
    }
}
