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
    private static DataBaseBroker instance;
    
    private DataBaseBroker() {
        
    }
    
    public static DataBaseBroker getInstance() {
        if(instance == null) {
            instance = new DataBaseBroker();
        }
        
        return instance;
    }
    
    public Connection connect() throws Exception {
        if(connection == null || connection.isClosed()) {
            
            String url = Utility.getInstance().getDbUrl();
            String username = Utility.getInstance().getUsername();
            String password = Utility.getInstance().getPassword();

            connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);
            System.out.println("Connection to Database successfull!");
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
