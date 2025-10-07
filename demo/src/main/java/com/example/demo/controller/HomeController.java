package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController 
public class HomeController {
  @GetMapping("/")
  public String home() {
    return "home"; 
  }
}