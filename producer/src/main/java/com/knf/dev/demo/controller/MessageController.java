package com.knf.dev.demo.controller;

import com.knf.dev.demo.config.User;
import com.knf.dev.demo.producer.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @PostMapping("/postMessage")
    public String publishMessage(
            @RequestBody User user) {

        rabbitMQProducer.sendMessage(user);
        return "Message was sent successfully";
    }
}