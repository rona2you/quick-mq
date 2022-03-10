package com.bop.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 
 * @Author: amber
 * Date: 2022/3/4 10:17
 */
public interface MessageInstance {

    String ERBADAGANG_OUTPUT = "erbadagang-output";

    @Output(ERBADAGANG_OUTPUT)
    MessageChannel erbadagangOutput();

}
