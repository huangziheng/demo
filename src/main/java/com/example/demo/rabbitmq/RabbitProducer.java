package com.example.demo.rabbitmq;

import com.example.demo.core.util.DateTimeUtil;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * rabbit 消息的生产者
 */
@Component
public class RabbitProducer{
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void stringSend(){
        String formatString = DateTimeUtil.dateFormat(new Date());
        System.out.println("send msg"+formatString);
        //第一个参数为刚刚定义的队列名称
        this.amqpTemplate.convertAndSend("string",formatString);
    }
}
