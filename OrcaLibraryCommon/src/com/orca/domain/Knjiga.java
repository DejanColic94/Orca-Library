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
public class Knjiga extends GeneralizedDomainObject{
    private int knjigaID;
    private String naziv;
    private ArrayList<Izdanje> listaIzdanja;

    public Knjiga() {
        listaIzdanja = new ArrayList<>();
    }

    public Knjiga(int knjigaID, String naziv) {
        this.knjigaID = knjigaID;
        this.naziv = naziv;
        listaIzdanja = new ArrayList<>();
    }

    Knjiga(Integer knjigaID) {
        this.knjigaID = knjigaID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getKnjigaID() {
        return knjigaID;
    }

    public void setKnjigaID(int knjigaID) {
        this.knjigaID = knjigaID;
    }

    public ArrayList<Izdanje> getListaIzdanja() {
        return listaIzdanja;
    }

    public void setListaIzdanja(ArrayList<Izdanje> listaIzdanja) {
        this.listaIzdanja = listaIzdanja;
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
        final Knjiga other = (Knjiga) obj;
        if (this.knjigaID != other.knjigaID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return naziv;
    }

    @Override
    public String getTableName() {
        return "knjiga";
    }

    @Override
    public String getParams() {
        return String.format("%s, '%s'",knjigaID,naziv);
    }

    @Override
    public String getParamNames() {
        return "knjigaID, naziv";
    }

    @Override
    public String getPKName() {
        return "knjigaID";
    }

    @Override
    public Integer getPKValue() {
        return knjigaID;
    }

    @Override
    public List<GeneralizedDomainObject> convertToList(ResultSet rs) {
        List<GeneralizedDomainObject> knjige = new ArrayList<>();
        try {
            while(rs.next()) {
                Integer id = rs.getInt("knjigaID");
                String naziv = rs.getString("naziv");
                
                Knjiga k = new Knjiga(id, naziv);
                
                knjige.add(k);
            }
        } catch (Exception e) {
            System.out.println("Error in knjiga: convertToList");
            e.printStackTrace();
        }
        
        return knjige;
    }

    @Override
    public String getUpdateQuery() {
        return "knjigaID = " + knjigaID + " naziv = '" + naziv + "'";
    }

    @Override
    public String getAggPK() {
        return null;
    }
    
    
    
}
