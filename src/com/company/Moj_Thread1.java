package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Moj_Thread1 implements Runnable{
    ArrayList<Coustomer>customers;

    public Moj_Thread1(ArrayList<Coustomer> customers) {
        this.customers = customers;
    }

    @Override
    public void run() {
        Collections.sort(customers);
        for (int i =0; i<3; i++){
            com.company.Main.Data.listacus.add(customers.get(i));
        }
    }
}
