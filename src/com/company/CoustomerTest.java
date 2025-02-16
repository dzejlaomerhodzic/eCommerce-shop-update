package com.company;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoustomerTest {

    @Test
    void firstTest() {
        Coustomer customer = new Coustomer("Charlie Williams", "charlie@example.com");
        assertEquals("charlie@example.com", customer.getEmail());
    }
}