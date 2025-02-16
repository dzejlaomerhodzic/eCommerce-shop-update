package com.company;

public class Purchase {
    public String customer_name,item_name;
   public Integer quantity;
   public Double total_price;

    public Purchase(String customer_name, String item_name, String quantity) {
        this.customer_name = customer_name;
        this.item_name = item_name;
        this.quantity = Integer.valueOf(quantity);
    }

    public void uradi (Double a){

        total_price=quantity*a;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return
                customer_name + ' ' +
                + total_price + '\n';
    }
}
