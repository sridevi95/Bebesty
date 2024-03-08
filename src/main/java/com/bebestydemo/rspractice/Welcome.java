package com.bebestydemo.rspractice;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @Value("${spring.message}")
    public String message;
    @GetMapping("/welcome")
    public String getMessage(){
        return this.message;
    }
}