package com.cjafet.rabbitmq.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Message implements Serializable {
    @JsonProperty("message-content")
    private String messageContent;
    @JsonProperty("message-date")
    private String messageDate;
    @JsonProperty("message-source")
    private String messageSource;

    @Override
    public String toString() {
        return "Message{" +
                "messageContent='" + messageContent + '\'' +
                ", messageDate='" + messageDate + '\'' +
                ", messageSource='" + messageSource + '\'' +
                '}';
    }
}
