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
public class Zanr extends GeneralizedDomainObject{
    private int zanrID;
    private String nazivZanra;

    public Zanr() {
    }

    public Zanr(int zanrID, String nazivZanra) {
        this.zanrID = zanrID;
        this.nazivZanra = nazivZanra;
    }

    Zanr(Integer zanrID) {
        this.zanrID = zanrID;
    }

    public String getNazivZanra() {
        return nazivZanra;
    }

    public void setNazivZanra(String nazivZanra) {
        this.nazivZanra = nazivZanra;
    }

    public int getZanrID() {
        return zanrID;
    }

    public void setZanrID(int zanrID) {
        this.zanrID = zanrID;
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
        final Zanr other = (Zanr) obj;
        if (this.zanrID != other.zanrID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nazivZanra;
    }

    @Override
    public String getTableName() {
       return "zanr";
    }

    @Override
    public String getParams() {
       return String.format("%s, '%s'", zanrID, nazivZanra);
    }

    @Override
    public String getParamNames() {
        return " zanrID, nazivZanra";
    }

    @Override
    public String getPKName() {
        return "zanrID";
    }

    @Override
    public Integer getPKValue() {
        return zanrID;
    }

    @Override
    public List<GeneralizedDomainObject> convertToList(ResultSet rs) {
        List<GeneralizedDomainObject> zanrovi = new ArrayList<>();
        try {
            while(rs.next()) {
                Integer id = rs.getInt("zanrID");
                String ime = rs.getString("nazivZanra");
                
                Zanr z = new Zanr(id, ime);
                
                zanrovi.add(z);
            }
        } catch (Exception e) {
            System.out.println("Error in zanr: convertToList");
            e.printStackTrace();
        }
        
        return zanrovi;
    }

    @Override
    public String getUpdateQuery() {
        return "zanrID = " + zanrID + "nazivZanra = " + nazivZanra;
    }

    @Override
    public String getAggPK() {
        return null;
    }
    
    
}
