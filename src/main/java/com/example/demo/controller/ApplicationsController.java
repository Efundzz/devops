package com.example.demo.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ApplicationsController {
    @GetMapping("/sample")
    public ResponseEntity<String> getSampleResponse() {
        String response = "Hello, this sample response from Efundz! Testing";
        return ResponseEntity.ok(response);
    }
}