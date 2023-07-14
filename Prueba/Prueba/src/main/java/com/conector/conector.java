package com.conector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conector {
    
    public static Connection getConnection(){
        Logger logger = Logger.getLogger(conector.class.getName());
        String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;"+
        "encrypt=true;trustServerCertificate=true;" +
        "databaseName=transporte;"+
        "user=sa;"+
        "password=Solosoyyo12;"+
        "loginTimeout=30";

        try{
            logger.warning("Entra al conector");
            return DriverManager.getConnection(connectionUrl);
        }catch(SQLException sqlException){
            logger.log(Level.WARNING, sqlException.toString());
            return null;
        }
    }
}