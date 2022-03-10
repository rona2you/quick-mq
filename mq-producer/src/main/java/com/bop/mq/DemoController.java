package com.bop.mq;

import org.apache.rocketmq.common.message.MessageConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author: amber
 * Date: 2022/3/4 15:00
 */
@RestController
@RequestMapping("/demo01")
public class DemoController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MessageInstance mySource;

    @GetMapping("/send")
    public boolean send() {
        // <2>创建 Message
        MessageModel message = MessageModel.builder()
                .id(new Random().nextInt())
                .build();
        // <3>创建 Spring Message 对象
        Message<MessageModel> springMessage = MessageBuilder.withPayload(message)
                .build();
        // <4>发送消息
        return mySource.erbadagangOutput().send(springMessage);
    }


}
