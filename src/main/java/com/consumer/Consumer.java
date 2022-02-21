package com.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * The type Consumer.
 */
@Service
public class Consumer {

    /**
     * Consume from topic string.
     *
     * @param message the message
     * @return the string
     */
    @KafkaListener(topics="mytopic", groupId="mygroup")
    public String consumeFromTopic(String message) {
 return message;
    }
}
