package com.gmail.demo.microservicedemo.controller;

import com.gmail.demo.microservicedemo.dto.TaskDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @PostMapping("/task")
    public ResponseEntity<Void> processTask(@RequestBody TaskDetails taskDetails){
        System.out.println("Task Details -> " + taskDetails);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    
    
    @GetMapping("/world")
    public String helloWorld() {
        return "Hello World - V2";
    }
    
}
