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
public class Pise extends GeneralizedDomainObject{
    private Autor autor;
    private Knjiga knjiga;
   

    public Pise() {
    }

    public Pise(Autor autor, Knjiga knjiga) {
        this.autor = autor;
        this.knjiga = knjiga;
       
    }

  

   

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
    }

    @Override
    public String getTableName() {
       return "pise";
    }

    @Override
    public String getParams() {
        return String.format("%s,%s", autor.getAutorID(),knjiga.getKnjigaID());
    }

    @Override
    public String getParamNames() {
        return "autor, knjiga";
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
                Integer knjigaID = rs.getInt("knjigaID");
                Integer autorID = rs.getInt("autorID");
                
                Pise p = new Pise(new Autor(autorID), new Knjiga(knjigaID));
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error in pise: convertToList");
            e.printStackTrace();
        }
        
        return lista;
    }

    @Override
    public String getUpdateQuery() {
        return "knjigaID = " + knjiga.getKnjigaID() + " autorID = " + autor.getAutorID();
    }

    @Override
    public String getAggPK() {
       return "WHERE knjigaID = " + knjiga.getKnjigaID() + " AND autorID = " +autor.getAutorID();
    }
    
    
}
