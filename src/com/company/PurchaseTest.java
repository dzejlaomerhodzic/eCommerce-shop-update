package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseTest {

    @Test

    public void thirdTest() {
        Purchase purchase = new Purchase("Bob Johnson","Bananas","10");
        assertNotEquals(1, purchase.getQuantity());
    }
}