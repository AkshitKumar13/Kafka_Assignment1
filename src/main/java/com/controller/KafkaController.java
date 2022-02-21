package com.controller;
import com.producer.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * The type Kafka controller.
 */
@RestController
@RequestMapping("/kafkaapp")
public class KafkaController {
    /**
     * The Producer.
     */
    @Autowired
    Producer producer;

    /**
     * Send message string.
     *
     * @param msg the msg
     * @return the string
     */
    @GetMapping(value="/send")
    public String sendMessage(@RequestParam("msg") String msg) {
         producer.publishToTopic(msg);
        return "published successfully";
    }
}

