package com.ejemplo.Prueba.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class user {
    
    @GetMapping
    public ResponseEntity<String> addUser(@RequestBody String name){
        return ResponseEntity
        .status(HttpStatus.OK)
        .header("content-type", "Application/json")
        .body("Nombre "+ name);
    }
    
}
