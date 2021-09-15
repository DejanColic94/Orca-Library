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
public class Izdavac extends GeneralizedDomainObject{
    private int izdavacID;
    private String nazivIzdavaca;

    public Izdavac() {
    }

    public Izdavac(int izdavacID, String nazivIzdavaca) {
        this.izdavacID = izdavacID;
        this.nazivIzdavaca = nazivIzdavaca;
    }

    Izdavac(Integer izdavacID) {
        this.izdavacID = izdavacID;
    }

    public String getNazivIzdavaca() {
        return nazivIzdavaca;
    }

    public void setNazivIzdavaca(String nazivIzdavaca) {
        this.nazivIzdavaca = nazivIzdavaca;
    }

    public int getIzdavacID() {
        return izdavacID;
    }

    public void setIzdavacID(int izdavacID) {
        this.izdavacID = izdavacID;
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
        final Izdavac other = (Izdavac) obj;
        if (this.izdavacID != other.izdavacID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nazivIzdavaca;
    }

    @Override
    public String getTableName() {
        return "izdavac";
    }

    @Override
    public String getParams() {
        return String.format("%s, '$s'", izdavacID, nazivIzdavaca);
    }

    @Override
    public String getParamNames() {
        return "izdavacID, nazivIzdavaca";
    }

    @Override
    public String getPKName() {
        return "izdavacID";
    }

    @Override
    public Integer getPKValue() {
        return izdavacID;
    }

    @Override
    public List<GeneralizedDomainObject> convertToList(ResultSet rs) {
        List<GeneralizedDomainObject> izdavaci = new ArrayList<>();
        try {
            while(rs.next()) {
                Integer id = rs.getInt("izdavacID");
                String ime = rs.getString("nazivIzdavaca");
                
                Izdavac izdavac = new Izdavac(id, ime);
                
                izdavaci.add(izdavac);
            }
        } catch (Exception e) {
            System.out.println("Error in izdavac: convertToList");
            e.printStackTrace();
        }
        return izdavaci;
    }

    @Override
    public String getUpdateQuery() {
        return "izdavacID = " +izdavacID + " nazivIzdavaca = " + nazivIzdavaca;
    }

    @Override
    public String getAggPK() {
        return null;
    }
    
    
}
