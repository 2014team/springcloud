package com.abc.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class ConsumerApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication1.class, args);
    }

}
