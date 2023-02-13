package com.cjafet.rabbitmq.service;

import com.cjafet.rabbitmq.domain.request.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitService {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Value("${rabbit.exchange}")
    private String exchange;
    @Value("${rabbit.routingKey}")
    private String routingKey;

    public void send(Message message) {
        this.rabbitTemplate.convertAndSend(exchange, routingKey, message.toString());
    }
}
