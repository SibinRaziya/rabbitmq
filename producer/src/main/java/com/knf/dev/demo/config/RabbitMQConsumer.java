package com.knf.dev.demo.config;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {


    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void consume(User user) {

        System.out.println("Message arrived! Message: " + user);
    }
}