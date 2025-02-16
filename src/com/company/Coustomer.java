package com.company;

import java.util.ArrayList;

public class Coustomer  implements Comparable<Coustomer>{

   public String name,email,favorite_category;
    ArrayList<Item>lista;
    public Double credit;
    Item recomended;
    public Coustomer(String name, String email, String credit, String favorite_category) {
        this.name = name;
        this.email = email;
        this.credit = Double.valueOf(credit);
        this.favorite_category = favorite_category;
    }
    public void DodajListu(ArrayList<Item> list){
        lista=list;
    }

    public void Izracunaj(){
        if (credit>0) {
            Double trenutna = 0.;
            for (Item i : lista) {
                if (i.category.equals(favorite_category) && i.price <= credit) {
                    trenutna = i.price;
                    recomended = i;
                }
            }
        }
        else recomended= new Item("none","0","0","none");
    }

    public String getFavorite_Item(){
        return name + "'s recomended item is " + recomended.name + " with a price of: " + recomended.price +'\n';
    }

    public Coustomer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public int compareTo(Coustomer o) {
        return (int) (this.credit-o.credit);
    }
}
