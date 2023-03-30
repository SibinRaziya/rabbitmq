package com.knf.dev.demo.config;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.stereotype.Component;

@Component
public class Intercept implements MessagePostProcessor {
    @Override
    public Message postProcessMessage(Message message) throws AmqpException {

        System.out.println(message);
        return null;
    }
}
