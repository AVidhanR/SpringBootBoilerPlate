package com.vidhan.demo.controller;

import com.vidhan.demo.model.DemoProduct;
import com.vidhan.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoRestController {

  @RequestMapping("/")
  public String greetRoot() {
    return "Checkout '/hello' and '/products'!";
  }

  // localhost:8080/hello - gives Hello, World!
  @RequestMapping("/hello")
  public String greet() {
    return "Hello, World!";
  }

  @Autowired
  DemoService demoService;

  @RequestMapping("/products")
  public List<DemoProduct> getProducts() {
    return demoService.getProducts();
  }
}
