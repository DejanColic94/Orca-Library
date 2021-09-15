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
public class Primerak extends GeneralizedDomainObject{
    private int primerakID;
    private Knjiga knjiga;
    private Izdanje izdanje;

    public Primerak() {
    }

    public Primerak(int primerakID, Knjiga knjiga, Izdanje izdanje) {
        this.primerakID = primerakID;
        this.knjiga = knjiga;
        this.izdanje = izdanje;
    }
    
    public Primerak(Integer primerakID) {
        this.primerakID = primerakID;
    }

    public Izdanje getIzdanje() {
        return izdanje;
    }

    public void setIzdanje(Izdanje izdanje) {
        this.izdanje = izdanje;
    }

    public int getPrimerakID() {
        return primerakID;
    }

    public void setPrimerakID(int primerakID) {
        this.primerakID = primerakID;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
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
        final Primerak other = (Primerak) obj;
        if (this.primerakID != other.primerakID) {
            return false;
        }
        return true;
    }

    @Override
    public String getTableName() {
        return "primerak";
    }

    @Override
    public String getParams() {
        return String.format("%s, %s, %s", primerakID, knjiga.getKnjigaID(), izdanje.getBrojIzdanja());
    }

    @Override
    public String getParamNames() {
        return "primerak, knjiga, brojIzdanja";
    }

    @Override
    public String getPKName() {
        return "primerakID";
    }

    @Override
    public Integer getPKValue() {
        return primerakID;
    }

    @Override
    public List<GeneralizedDomainObject> convertToList(ResultSet rs) {
        List<GeneralizedDomainObject> primerci = new ArrayList<>();
        try {
            while(rs.next()) {
                Integer primerakID = rs.getInt("primerakID");
                Integer knjigaID = rs.getInt("knjigaID");
                Integer brojIzdanja = rs.getInt("brojIzdanja");
                
                Integer izdavacID = rs.getInt("izdavacID");
                
                
                Primerak p = new Primerak(primerakID, new Knjiga(knjigaID),new Izdanje(new Knjiga(knjigaID),brojIzdanja,new Izdavac(izdavacID)));
            }
        } catch (Exception e) {
            System.out.println("Error in primerak: convertToList");
            e.printStackTrace();
        }
        
        return primerci;
    }

    @Override
    public String getUpdateQuery() {
        return "primerakID = " + primerakID + " knjigaID = " + knjiga.getKnjigaID() + " brojIzdanja = " + izdanje.getBrojIzdanja();
    }

    @Override
    public String getAggPK() {
        return null;
    }
    
    
}
