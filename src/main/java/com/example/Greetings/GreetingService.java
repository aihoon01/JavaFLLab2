package com.example.Greetings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Autowired
    StringFormatter stringFormatter;

    public String getGreeting(String greet) {
        if(greet.isEmpty()) return stringFormatter.capitalizeString("Hello World") + 1;
        return stringFormatter.capitalizeString(greet);
    }
}
