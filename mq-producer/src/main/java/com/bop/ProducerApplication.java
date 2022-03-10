package com.bop;

import com.bop.mq.ConsumerInstance;
import com.bop.mq.MessageInstance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author BOP
 */
@SpringBootApplication
@EnableBinding({MessageInstance.class, ConsumerInstance.class})
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
