package com.example.ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connect2Db {

    private static Connect2Db connectInstance;
    private Connection connection;
    private final String URL = "jdbc:postgresql://localhost:3307/asaeldb";
    private final String USER = "postgres";
    private final String PASSWORD = "Hvzrrs04";

    private Connect2Db() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado!");
        } catch (SQLException ex) {
            Logger.getLogger(Connect2Db.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            System.out.println("OK ");
        }
    }
    public static Connect2Db getInstance(){
        if (connectInstance == null ){
            connectInstance = new Connect2Db();
        }
        return connectInstance;
    }

    public Connection getConnection(){
        return connection;
    }

}