package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class KategorijaTest {

    @Test
    public void fifthTest() {
        Kategorija kat = new Kategorija("Clothing", "100");
        assertNotEquals("Office supplies", kat.getIme());
    }
}