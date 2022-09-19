package com.exercicio2.exercicio_2.message;



import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.exercicio2.exercicio_2.entity.Order;

public class OrderMessage {

    @Value("${genericStore.rabbitmq.exchange}")
    String exchange;

    @Value("${genericStore.rabbitmq.routingkey}")
    String routingKey;

    @Autowired
    public RabbitTemplate rabbitTemplate;

    public void sendMessage(Order order) {
        rabbitTemplate.convertAndSend(exchange, routingKey, order);
    }
}
