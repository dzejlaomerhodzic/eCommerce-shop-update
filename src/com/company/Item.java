package com.company;

public class Item implements Comparable<Item>{
  public String name,category;
  public Integer quantity;
  public Double price;

  public Item(String name, String price,String quantity,String category) {
    this.name = name;
    this.category = category;
    this.quantity = Integer.valueOf(quantity);
    this.price = Double.valueOf(price);
  }

  public String getName() {
    return name;
  }

  @Override
  public int compareTo(Item o) {
    return this.quantity-o.quantity;
  }

  @Override
  public String toString() {
    return
            name + ' ' +
            quantity +'\n';
  }
}
