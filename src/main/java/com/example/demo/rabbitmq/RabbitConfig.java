package com.example.demo.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig{

    //消息队列名称 string
    private final static String STRING = "string";

    @Bean
    public Queue string(){
        return new Queue(STRING);
    }
}
