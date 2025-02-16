package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class KupacTest {

    @Test

    public void sixthTest() {
        Kupac kupac = new Kupac("Alice Smith", "3");
        assertNotEquals("10", kupac.getTotal());
    }
}