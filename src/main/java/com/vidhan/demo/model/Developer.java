package com.vidhan.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {

  private Laptop laptop;

  @Autowired
  @Qualifier("laptop")
  public void setLaptop(Laptop laptop) {
    this.laptop = laptop;
  }

  public void Greeting() {
    System.out.println("Hi All");
    laptop.build();
  }
}
