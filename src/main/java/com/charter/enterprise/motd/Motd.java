package com.charter.enterprise.motd;

import com.charter.enterprise.motd.model.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Motd {

    @Bean
    public Message messageOfTheDay() {
        return new Message("Welcome to Charter. All systems are normal.");
    }

    public static void main(String[] args) {
        SpringApplication.run(Motd.class, args);
    }
}

