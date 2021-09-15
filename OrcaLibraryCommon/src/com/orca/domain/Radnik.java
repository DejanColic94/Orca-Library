/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author DCX
 */
public class Radnik extends GeneralizedDomainObject{
    private int radnikID;
    private String imePrezime;
    private String username;
    private String password;

    public Radnik() {
    }

    public Radnik(int radnikID, String imePrezime, String username, String password) {
        this.radnikID = radnikID;
        this.imePrezime = imePrezime;
        this.username = username;
        this.password = password;
    }

    Radnik(Integer radnikID) {
        this.radnikID = radnikID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRadnikID() {
        return radnikID;
    }

    public void setRadnikID(int radnikID) {
        this.radnikID = radnikID;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Radnik other = (Radnik) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return imePrezime;
    }

    @Override
    public String getTableName() {
        return "radnik";
    }

    @Override
    public String getParams() {
        return String.format("%s,'%s','%s','%s',", radnikID, imePrezime, username, password);
    }

    @Override
    public String getParamNames() {
        return "radnikID, imePrezime, username, password";
    }

    @Override
    public String getPKName() {
        return "radnikID";
    }

    @Override
    public Integer getPKValue() {
        return radnikID;
    }

    @Override
    public List<GeneralizedDomainObject> convertToList(ResultSet rs) {
        List<GeneralizedDomainObject> radnici = new ArrayList<>();
        try {
            while(rs.next()) {
                Integer id = rs.getInt("radnikID");
                String ime = rs.getString("imePrezime");
                String user = rs.getString("username");
                String pass = rs.getString("password");
                
                Radnik r = new Radnik(id, ime, user, pass);
                
                radnici.add(r);
            }
        } catch (Exception e) {
            System.out.println("Error in radnik: convertToList");
            e.printStackTrace();
        }
        
        return radnici;
    }

    @Override
    public String getUpdateQuery() {
        return "radnikID = " +radnikID + "imePrezime = " + imePrezime + "username = " + username + "password = " + password;
    }

    @Override
    public String getAggPK() {
        return null;
    }
    
    
    
}
