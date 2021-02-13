package com.spring.react.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class ReactController {

    @GetMapping("/")
    public Mono<String> home() {

        return Mono.just("Home page");
    }
}