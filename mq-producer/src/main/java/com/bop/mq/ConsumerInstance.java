package com.bop.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author: amber
 * Date: 2022/3/4 17:22
 */
public interface ConsumerInstance {

    String ERBADAGANG_INPUT = "erbadagang-input";

    @Input(ERBADAGANG_INPUT)
    SubscribableChannel demo01Input();
}
