package com.school.middleware.td;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String url = "jdbc:mysql://localhost:3306/testdb"; 
    private static final String user = "root";
    private static final String password = "1234";

    private static DbConnection instance;
    private Connection conn;

    private DbConnection(){
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion établie !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }

    public Connection getDBConnection(){
        return this.conn;
    }

    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Connexion fermée !");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
