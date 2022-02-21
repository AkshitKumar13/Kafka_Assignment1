package com.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * The type Producer.
 */
@Service
public class Producer {
    /**
     * The constant topic.
     */
    public static final String topic = "mytopic";
//@Autowired
//    private MatchRepo matchRepo;
//MatchModel matchModel=new MatchModel();

    @Autowired
    private KafkaTemplate<String, String> kafkaTemp;

    /**
     * Publish to topic string.
     *
     * @param message the message
     * @return the string
     */
    public String publishToTopic(String message) {

//message = matchModel.getResult();
System.out.println(message);
 this.kafkaTemp.send(topic, message);
        return topic;
    }
}
