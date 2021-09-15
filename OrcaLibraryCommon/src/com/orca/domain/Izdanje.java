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
public class Izdanje extends GeneralizedDomainObject{
    private Knjiga knjiga;
    private int brojIzdanja;
    private Izdavac izdavac;

    public Izdanje() {
    }

    public Izdanje(Knjiga knjiga, int brojIzdanja, Izdavac izdavac) {
        this.knjiga = knjiga;
        this.brojIzdanja = brojIzdanja;
        this.izdavac = izdavac;
    }

    public Izdavac getIzdavac() {
        return izdavac;
    }

    public void setIzdavac(Izdavac izdavac) {
        this.izdavac = izdavac;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
    }

    public int getBrojIzdanja() {
        return brojIzdanja;
    }

    public void setBrojIzdanja(int brojIzdanja) {
        this.brojIzdanja = brojIzdanja;
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
        final Izdanje other = (Izdanje) obj;
        if (this.brojIzdanja != other.brojIzdanja) {
            return false;
        }
        if (!Objects.equals(this.knjiga, other.knjiga)) {
            return false;
        }
        return true;
    }

    @Override
    public String getTableName() {
        return "izdanje";
    }

    @Override
    public String getParams() {
       return String.format("%s, %s, %s", knjiga.getKnjigaID(), brojIzdanja, izdavac.getIzdavacID());
    }

    @Override
    public String getParamNames() {
        return "knjigaID, brojIzdanja, izdavac";
    }

    @Override
    public String getPKName() {
        return null;
    }

    @Override
    public Integer getPKValue() {
       return null;
    }

    @Override
    public List<GeneralizedDomainObject> convertToList(ResultSet rs) {
        List<GeneralizedDomainObject> izdanja = new ArrayList<>();
        try {
            while(rs.next()) {
                Integer knjigaID = rs.getInt("knjigaID");
                Integer brojIzdanja = rs.getInt("brojIzdanja");
                Integer izdavacID = rs.getInt("izdavacID");
                
                Izdanje izd = new Izdanje(new Knjiga(knjigaID), brojIzdanja, new Izdavac(izdavacID));
                
                izdanja.add(izd);
            }
        } catch (Exception e) {
            System.out.println("Error in izdanje: convertToList");
            e.printStackTrace();
        }
        
        return izdanja;
    }

    @Override
    public String getUpdateQuery() {
        return "knjigaID = " + knjiga.getKnjigaID() + " brojIzdanja = " + brojIzdanja + " izdavacID = " + izdavac.getIzdavacID();
    }

    @Override
    public String getAggPK() {
       return "WHERE knjigaID = " + knjiga.getKnjigaID() +" AND brojIzdanja = " + brojIzdanja + " AND izdavacID = " + izdavac.getIzdavacID();
    }
    
    
}
