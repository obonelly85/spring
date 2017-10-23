package com.boot.example1.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingResourceController {
	
    private static final String nameTemplate = "Hello, %s!";
    private static final String languageTemplate = "Language, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name, @RequestParam(value="language", defaultValue="English") String language) {
        return new Greeting(counter.incrementAndGet(), String.format(nameTemplate, name), String.format(languageTemplate, language));
    }	

}
