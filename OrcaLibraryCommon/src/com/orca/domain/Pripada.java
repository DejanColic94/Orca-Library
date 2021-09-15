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
public class Pripada extends GeneralizedDomainObject{
    private Zanr zanr;
    private Knjiga knjiga;

    public Pripada() {
    }

    public Pripada(Zanr zanr, Knjiga knjiga) {
        this.zanr = zanr;
        this.knjiga = knjiga;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }

    @Override
    public String getTableName() {
        return " pripada";
    }

    @Override
    public String getParams() {
        return String.format("%s, %s", zanr.getZanrID(),knjiga.getKnjigaID());
    }

    @Override
    public String getParamNames() {
        return "zanr, knjiga";
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
       List<GeneralizedDomainObject> lista = new ArrayList<>();
        try {
            while(rs.next()) {
                Integer zanrID = rs.getInt("zanrID");
                Integer knjigaID = rs.getInt("knjigaID");
                
                Pripada p = new Pripada(new Zanr(zanrID), new Knjiga(knjigaID));
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error in pripada: convertToList");
            e.printStackTrace();
        }
        
        return lista;
    }

    @Override
    public String getUpdateQuery() {
        return " zanrID = " + zanr.getZanrID() + "knjigaID = " + knjiga.getKnjigaID();
    }

    @Override
    public String getAggPK() {
        return "WHERE zanrID = " + zanr.getZanrID() + " AND knjigaID = " +knjiga.getKnjigaID();
    }
    
    
}
