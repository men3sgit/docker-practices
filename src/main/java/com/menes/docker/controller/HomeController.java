package com.menes.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class HomeController {

    @GetMapping
    public ResponseEntity<?> getAllBooks(){
        System.out.println("Hahahahahaahah");
        return ResponseEntity.ok("Prisoers of the geography");
    }

    @GetMapping(path = "/greet")
    public ResponseEntity<?> hello(){
        return ResponseEntity.ok("Hello world~");
    }

}
