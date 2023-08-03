package com.jiezhou.springboottry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringboottryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringboottryApplication.class, args);
    }

}
