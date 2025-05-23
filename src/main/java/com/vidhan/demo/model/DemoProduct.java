package com.vidhan.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class DemoProduct {

  private int productID;
  private String productName;
  private int productPrice;

  public DemoProduct(int productID, String productName, int productPrice) {
    this.productID = productID;
    this.productName = productName;
    this.productPrice = productPrice;
  }

  public int getProductID() {
    return productID;
  }

  public String getProductName() {
    return productName;
  }

  public int getProductPrice() {
    return productPrice;
  }

  public void setProductID(int productID) {
    this.productID = productID;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public void setProductPrice(int productPrice) {
    this.productPrice = productPrice;
  }
}
