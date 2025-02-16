package com.company;

public class Kategorija  implements Comparable<Kategorija>{
    String ime;
    Integer kvantitet;

    public Kategorija(String ime, String kvantitet) {
        this.ime = ime;
        this.kvantitet = Integer.valueOf(kvantitet);
    }

    @Override
    public int compareTo(Kategorija o) {
        return o.kvantitet-this.kvantitet;
    }

    public String getIme() {
        return ime;
    }

    @Override
    public String toString() {
        return
                ime + '\'' +
                kvantitet +  '\n'
              ;
    }
}
