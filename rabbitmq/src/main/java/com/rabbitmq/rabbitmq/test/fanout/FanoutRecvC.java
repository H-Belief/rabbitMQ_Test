package com.rabbitmq.rabbitmq.test.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.C")
public class FanoutRecvC {

    @RabbitHandler
    public void recv1(String msg){
        System.out.println("FanoutRecvC : "+msg);
    }
}
