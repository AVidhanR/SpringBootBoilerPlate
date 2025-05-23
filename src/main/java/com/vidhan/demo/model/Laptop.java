package com.vidhan.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
  public void build() {
    System.out.println("Vibing with my laptop...");
  }
}
