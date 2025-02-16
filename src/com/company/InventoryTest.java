package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test

    public void fourthTest() {
        Inventory inventory = new Inventory("Shampoo", "150");
        assertEquals("150", inventory.getQuantity());
    }
}