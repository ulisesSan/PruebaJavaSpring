package com.conector;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class conectorTest {
    @Test
    void getConnection() {

        conector con = new conector();

        assertNotNull(conector.getConnection());

        /*Logger logger = Logger.getLogger(conector.class.getName());
        String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;"+
                "encrypt=true;trustServerCertificate=true;" +
                "databaseName=transporte;"+
                "user=sa;"+
                "password=Solosoyyo12;"+
                "loginTimeout=30";

        try{
            logger.warning("Entra al conector");
            assertNotNull(DriverManager.getConnection(connectionUrl));
        }catch(SQLException sqlException){
            logger.log(Level.WARNING, sqlException.toString());
            assertNotNull(null);
        }*/
    }
}