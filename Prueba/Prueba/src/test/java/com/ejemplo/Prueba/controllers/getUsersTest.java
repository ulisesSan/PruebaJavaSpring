package com.ejemplo.Prueba.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getUsersTest {

   @Test
    void pruebaTest(){

       String testPrueba =  getUsers.prueba().toString();

       assertAll(
               () -> testPrueba.contains("name")
       );
   }

}