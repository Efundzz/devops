package com.example.demo.controller;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApplicationsController {
    @GetMapping("/sample")
    public ResponseEntity<String> getSampleResponse() {
        String response = "Hello, this sample response from Efundz!demo-test";
        return ResponseEntity.ok(response);
    }
}