package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Moj_Thread2 implements Runnable{
    ArrayList<Kupac>kupci;

    public Moj_Thread2(ArrayList<Kupac> kupci) {
        this.kupci = kupci;
    }

    @Override
    public void run() {
        Collections.sort(kupci);int b;
        if(kupci.size()<10) b= kupci.size();
        else b=10;

        for (int i=0; i<b; i++)
            com.company.Main.Data.listakup.add(kupci.get(i));
    }
}
