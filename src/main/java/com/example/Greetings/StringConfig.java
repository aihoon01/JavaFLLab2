package com.example.Greetings;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StringConfig {
    @Bean
    public StringFormatter stringFormatter() {
        return new StringFormatter();
    }
}
