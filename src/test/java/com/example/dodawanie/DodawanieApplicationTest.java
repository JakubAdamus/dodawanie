package com.example.dodawanie;

import org.junit.Test;

import static org.junit.Assert.*;

public class DodawanieApplicationTest {

    @Test
    public void added() {
        DodawanieApplication app = new DodawanieApplication();
        assertEquals(10, app.added(5, 5));
    }
}