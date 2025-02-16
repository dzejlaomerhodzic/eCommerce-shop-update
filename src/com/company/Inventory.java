package com.company;

public class Inventory {
    public String name;
    Integer quantity;

    public Inventory(String name, String quantity) {
        this.name = name;
        this.quantity = Integer.valueOf(quantity);
    }

    @Override
    public String toString() {
        return
                name + ' ' + " " +
                quantity +'\n';
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void Normalizuj (Integer a){
        quantity-=a;

    }

}
