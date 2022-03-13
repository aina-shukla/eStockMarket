package com.demo.services;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Value("${devglan.kafka.topic}")
    private String kafkaTopic;

    @KafkaListener(topics = "${kafka.topic.boot}")
    public void receive(ConsumerRecord record) {
        System.out.println(String.format("Topic - %s, Partition - %d, Value: %s", kafkaTopic, record.partition(), record.value()));
    }
}