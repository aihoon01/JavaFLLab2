package com.example.Greetings;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class StringFormatter {
    public String capitalizeString(String string) {
        return string.toUpperCase();
    }
}
