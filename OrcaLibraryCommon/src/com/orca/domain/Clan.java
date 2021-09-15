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
public class Clan extends GeneralizedDomainObject{
    private int clanID;
    private String imePrezime;
    private String telefon;
    private String email;
    private Primerak primerak;
    

    public Clan() {
      
    }

    public Clan(int clanID, String imePrezime, String telefon, String email, Primerak primerak) {
        this.clanID = clanID;
        this.imePrezime = imePrezime;
        this.telefon = telefon;
        this.email = email;
        this.primerak = primerak;
        
    }

    Clan(Integer clanID) {
        this.clanID = clanID;
    }

    public Primerak getPrimerak() {
        return primerak;
    }

    public void setPrimerak(Primerak primerak) {
        this.primerak = primerak;
    }

    public int getClanID() {
        return clanID;
    }

    public void setClanID(int clanID) {
        this.clanID = clanID;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        final Clan other = (Clan) obj;
        if (this.clanID != other.clanID) {
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
        return "clan";
    }

    @Override
    public String getParams() {
        return String.format("%s, '%s', '%s', '%s', %s, ", clanID, imePrezime, telefon, email,primerak.getPrimerakID());
    }

    @Override
    public String getParamNames() {
        return "clanID, imePrezime, telefon, email, primerak";
    }

    @Override
    public String getPKName() {
        return "clanID";
    }

    @Override
    public Integer getPKValue() {
        return clanID;
    }

    @Override
    public List<GeneralizedDomainObject> convertToList(ResultSet rs) {
        List<GeneralizedDomainObject> clanovi = new ArrayList<>();
        try {
            while(rs.next()) {
                Integer id = rs.getInt("clanID");
                String ime = rs.getString("imePrezime");
                String telefon = rs.getString("telefon");
                String email = rs.getString("email");
                Integer primerakID = rs.getInt("primerakID");
                
                Clan c = new Clan(id, ime, telefon, email, new Primerak(primerakID));
                
                clanovi.add(c);
            }
            
        } catch (Exception e) {
            System.out.println("Error in clanovi: convertToList");
            e.printStackTrace();
        }
        
        return clanovi;
    }

    @Override
    public String getUpdateQuery() {
         return "clanID = " + clanID + "imePrezime ='" + imePrezime +"' telefon = '" + telefon +"' email = '" + email + "' primerakID = " + primerak.getPrimerakID() ;
    }

    @Override
    public String getAggPK() {
       return null;
    }
    
    
}
