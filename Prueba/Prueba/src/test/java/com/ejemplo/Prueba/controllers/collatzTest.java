package com.ejemplo.Prueba.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class collatzTest {

    @Test
    void conjetura() {

        //collatz col = new collatz();
        String conjetura = collatz.conjetura("17").toString();

        assertAll(
                () -> collatz.conjetura("").toString().contains("1")
        );
    }
}