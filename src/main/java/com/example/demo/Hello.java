package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/test")
    public ResponseEntity<String> getTest(){
        return ResponseEntity.ok("Test");
    }
}
