package com.company;

public class Kupac implements Comparable <Kupac>{
   public String ime;
    public Double total;

    public Kupac(String ime, String total) {
        this.ime = ime;
        this.total = Double.valueOf(total);
    }

    public Double getTotal() {
        return total;
    }


    @Override
    public int compareTo(Kupac o) {
        return (int) (this.total-o.total);
        }
    }
