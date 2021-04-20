package com.example.hellofromheroku.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
  @author   george
  @project   hellofromHeroku
  @class  HelloController
  @version  1.0.0 
  @since 20.04.2021 - 13.52
*/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    String getGreeting(){
        return "<h1> My best regards!!!!!</h1> ";
    }
}
