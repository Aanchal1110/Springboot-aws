package com.example.springwithawsfinal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello there mate!";
    }

    @PostMapping("/hello")
    public String hell(@RequestBody String name){
        return "Hello" + name+"!";
    }
}
