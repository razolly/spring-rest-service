package com.example.springrestservice.controller;

import com.example.springrestservice.entity.Quote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class QuoteController {

    private static final String template = "Quote:, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/quote")
    public Quote getQuote(@RequestParam(value = "quote", defaultValue = "thou art beautiful") String quote) {
        return new Quote(counter.incrementAndGet(), String.format(template, quote));
    }

    @GetMapping("/hi")
    public String getHi() {
        return "Hello world";
    }

}
