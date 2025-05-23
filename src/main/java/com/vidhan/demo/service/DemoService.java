package com.vidhan.demo.service;

import com.vidhan.demo.model.DemoProduct;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DemoService {

  List<DemoProduct> products = Arrays.asList(
      new DemoProduct(101, "IPhone", 50000),
      new DemoProduct(102, "Pixel Camera", 40000),
      new DemoProduct(103, "Nothing Phone", 24000)
  );

  public List<DemoProduct> getProducts() {
    return products;
  }
}
