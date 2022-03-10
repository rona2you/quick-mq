package com.bop.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import java.util.Random;

public class MessagePublishComponentImpl implements MessagePublishComponent{

    @Autowired
    private MessageInstance messageInstance;

    @Override
    public void send() {
        MessageModel message = MessageModel.builder()
                .id(new Random().nextInt())
                .build();
        // <3>创建 Spring Message 对象
        Message<MessageModel> springMessage = MessageBuilder.withPayload(message)
                .build();
        // <4>发送消息
        messageInstance.erbadagangOutput().send(springMessage);
    }
}
