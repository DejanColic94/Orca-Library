/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DCX
 */
public class DataBaseBroker {
    private Connection connection;
    
    public Connection connect() throws Exception {
        if(connection == null || connection.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/orca";
            String username = "root";
            String password = "root";
            
            connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);
        }
        return connection;
    }
    
    public void disconnect() throws Exception {
        connection.close();
    }
    
     public void commit() throws Exception {
        connection.commit();
    }
     
      public void rollback() throws Exception {
        connection.rollback();
    }
    
}
