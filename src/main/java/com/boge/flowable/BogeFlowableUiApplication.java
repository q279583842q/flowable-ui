package com.boge.flowable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.flowable.ui.application"})
@SpringBootApplication
public class BogeFlowableUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BogeFlowableUiApplication.class, args);
    }

}
