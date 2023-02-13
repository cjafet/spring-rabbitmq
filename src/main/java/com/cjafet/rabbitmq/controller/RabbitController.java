package com.cjafet.rabbitmq.controller;

import com.cjafet.rabbitmq.domain.request.Message;
import com.cjafet.rabbitmq.service.RabbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class RabbitController {
    @Autowired
    private RabbitService rabbitService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void sendMessage(@RequestBody @Validated Message message) {
        rabbitService.send(message);

    }


}
