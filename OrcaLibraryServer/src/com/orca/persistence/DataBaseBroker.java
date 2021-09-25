/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.persistence;

import com.orca.domain.GeneralizedDomainObject;
import com.orca.utility.UtilityClanovi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
      
    
    // CREATE
    public synchronized boolean saveGeneralizedObject(GeneralizedDomainObject object) throws SQLException {
        try {
            String query = "INSERT INTO " + object.getTableName() + "(" + object.getParamNames() + ")" + " VALUES (" + object.getParams() + ")"; 
            System.out.println(query);
            Statement s = connection.createStatement();
            s.executeUpdate(query);
           // connection.commit();
            s.close();
            return true;
        } catch (SQLException e) {
            //connection.rollback();
            System.out.println("Error in databasebroker, in a save method for " + object.getTableName() + " table");
            e.printStackTrace();
            throw e;
        }
    }
    
    
    
    
    
    // READ
    public synchronized List<GeneralizedDomainObject> getAllGeneralizedObjects(GeneralizedDomainObject object) throws SQLException {
        try {
            String query = "SELECT * FROM " + object.getTableName();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(query);
            
            List<GeneralizedDomainObject> list = object.convertToList(rs);
            
            s.close();
            
            return list;
        } catch (SQLException e) {
            System.out.println("Error in databasebroker, in a getALL method for " + object.getTableName() + " table");
            e.printStackTrace();
            throw e;
        }
    }
    
    
    // UPDATE
    public synchronized boolean updateGeneralizedObject(GeneralizedDomainObject object) throws SQLException {
        try {
            String query = "";
            if(object.getAggPK() == null) {
                query = "UPDATE " + object.getTableName() + " SET " + object.getUpdateQuery() + " WHERE " +object.getPKName() + "=" + object.getPKValue();
            } else{
                 query = "UPDATE " + object.getTableName() + " SET " + object.getUpdateQuery() + " " + object.getAggPK();
            }
            System.out.println(query);
            Statement s = connection.createStatement();
            s.executeUpdate(query);
            //connection.commit();
            s.close();
            return true;
            
        } catch (SQLException e) {
            //connection.rollback();
            System.out.println("Error in databasebroker, in a update method for " + object.getTableName() + " table");
            e.printStackTrace();
            throw e;
        }
    }
    
      
    
    
    // DELETE
    public synchronized boolean deleteGeneralizedObject(GeneralizedDomainObject object) throws SQLException {
        try {
            String query = "";
            
            if (object.getAggPK() == null) {
                query = "DELETE FROM " + object.getTableName() + " WHERE " +object.getPKName() + "=" + object.getPKValue();
            } else {
                query = "DELETE FROM " + object.getTableName() + " " + object.getAggPK();
            }
            System.out.println(query);
            Statement s = connection.createStatement();
            s.executeUpdate(query);
            //connection.commit();
            s.close();
            return true;
        } catch (SQLException e) {
            //connection.rollback();
            System.out.println("Error in databasebroker, in a delete method for " + object.getTableName() + " table");
            e.printStackTrace();
            throw e;
        }
    }
    
    // get by object id
    public synchronized GeneralizedDomainObject getByID(GeneralizedDomainObject object, int id) throws SQLException {
        try {
            String query = "";

        if (object.getAggPK() == null) {
            query = "SELECT * FROM " + object.getTableName() + " WHERE " + object.getPKName() + "=" + id;
        } else {
            query = "SELECT * FROM " + object.getTableName() + " WHERE " + object.getAggPK();
        }
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);
        List<GeneralizedDomainObject> list = object.convertToList(rs);
        s.close();
        return list.get(0);
        } catch (Exception e) {
            System.out.println("Error in databasebroker, in a getByID method for " + object.getTableName() + " table");
            e.printStackTrace();
            throw e;
        }
        
    }
    
    // save all objects in a collection
    public synchronized boolean saveAll (List<GeneralizedDomainObject> list) {
        try {
            for(GeneralizedDomainObject object : list) {
                saveGeneralizedObject(object);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error in databasebroker, in a saveALL method");
            e.printStackTrace();
            
        }
        
        return false;
    }
    
    // delete all objects in a collection
    public synchronized boolean deleteAll(List<GeneralizedDomainObject> list) {
        try {
            for(GeneralizedDomainObject object : list) {
                deleteGeneralizedObject(object);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error in databasebroker, in a deleteALL method");
            e.printStackTrace();
        }
        
        return false;
    }

    public List<UtilityClanovi> filterClanovi(String filter) {
       
        List<UtilityClanovi> lista = new ArrayList<>();
        String sql = "SELECT c.ime, c.prezime, c.telefon, c.email, CASE WHEN z.zaduzenjeID IS NOT NULL THEN 1 ELSE 0 END AS zaduzenje FROM clan c JOIN zaduzenje z ON c.clanID = z.clanID WHERE c.ime LIKE '%"+filter+"%' OR c.prezime LIKE '%"+filter+"%' ";
        try {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()) {
                
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                String telefon = rs.getString("telefon");
                String email = rs.getString("email");
                int zaduzenje = rs.getInt("zaduzenje");
                
                UtilityClanovi uc = new UtilityClanovi(ime, prezime, telefon, email, zaduzenje);
                lista.add(uc);
                
            }
        } catch (Exception e) {
        }
        
        return lista;
    }
    
}
