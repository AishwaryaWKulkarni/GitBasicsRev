package com.csi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class ApplicationController {

    @GetMapping("/welcome")
    public ResponseEntity<String> sayWelcome() {
        return ResponseEntity.ok("Welcome to CSI");
    }
}
