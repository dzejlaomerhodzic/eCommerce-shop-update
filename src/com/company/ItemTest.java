package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test

    public void secondTest() {
        Item item = new Item("Shampoo","8.99","150","beauty products");
        assertNotEquals("Printed Paper", item.getName());
    }
}