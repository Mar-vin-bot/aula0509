package com.example2_1.Log.message;


import javax.swing.event.DocumentEvent.ElementChange;

import com.example2_1.Log.entity.Log;
import com.example2_1.Log.service.LogService;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class LogReceiveMessage {


    @Autowired
    private LogService service;

    @RabbitListener(queues = {"${saleStore.rabbitmq.queue}"})
    public void receive(@Payload Log log) {
        service.create(log);

    }
}
