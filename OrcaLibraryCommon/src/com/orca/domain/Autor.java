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

/**
 *
 * @author DCX
 */
public class Autor extends GeneralizedDomainObject{
    private int autorID;
    private String imeAutora;

    public Autor() {
    }

    public Autor(int autorID, String imeAutora) {
        this.autorID = autorID;
        this.imeAutora = imeAutora;
    }

    Autor(Integer autorID) {
        this.autorID = autorID;
    }

    public String getImeAutora() {
        return imeAutora;
    }

    public void setImeAutora(String imeAutora) {
        this.imeAutora = imeAutora;
    }

    public int getAutorID() {
        return autorID;
    }

    public void setAutorID(int autorID) {
        this.autorID = autorID;
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
        final Autor other = (Autor) obj;
        if (this.autorID != other.autorID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return imeAutora;
    }

    @Override
    public String getTableName() {
        return "autor";
    }

    @Override
    public String getParams() {
         return String.format("%s, '%s'", autorID, imeAutora);
    }

    @Override
    public String getParamNames() {
        return "autorID, imeAutora";
    }

    @Override
    public String getPKName() {
       return "autorID";
    }

    @Override
    public Integer getPKValue() {
        return autorID;
    }

    @Override
    public List<GeneralizedDomainObject> convertToList(ResultSet rs) {
        List<GeneralizedDomainObject> autori = new ArrayList<>();
        try {
            while(rs.next()) {
                Integer id = rs.getInt("autorID");
                String ime = rs.getString("imeAutora");
                
                Autor a = new Autor(id, ime);
                autori.add(a);
            }
        } catch (Exception e) {
            System.out.println("Error in Autor: convertToList");
            e.printStackTrace();
        }
        
        return autori;
    }

    @Override
    public String getUpdateQuery() {
        return "autorID = " + autorID + "imeAutora = '" + imeAutora + "'";
    }

    @Override
    public String getAggPK() {
        return null;
    }
    
    
    
}
