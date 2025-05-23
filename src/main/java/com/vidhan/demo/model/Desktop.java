package com.vidhan.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
  public void build() {
    System.out.println("Vibing with my Desktop...");
  }
}
