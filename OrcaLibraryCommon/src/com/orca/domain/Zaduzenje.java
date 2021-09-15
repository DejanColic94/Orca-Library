/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DCX
 */
public class Zaduzenje extends GeneralizedDomainObject{
    private int zaduzenjeID;
    private Date datumZaduzenja;
    private Date datumRazduzenja;
    private Clan clan;
    private Primerak primerak;
    private Radnik radnikZaduzio;
    private Radnik radnikRazduzio;

    public Zaduzenje() {
    }

    public Zaduzenje(int zaduzenjeID, Date datumZaduzenja, Date datumRazduzenja, Clan clan, Primerak primerak, Radnik radnikZaduzio, Radnik radnikRazduzio) {
        this.zaduzenjeID = zaduzenjeID;
        this.datumZaduzenja = datumZaduzenja;
        this.datumRazduzenja = datumRazduzenja;
        this.clan = clan;
        this.primerak = primerak;
        this.radnikZaduzio = radnikZaduzio;
        this.radnikRazduzio = radnikRazduzio;
    }

    public Radnik getRadnikRazduzio() {
        return radnikRazduzio;
    }

    public void setRadnikRazduzio(Radnik radnikRazduzio) {
        this.radnikRazduzio = radnikRazduzio;
    }

    public int getZaduzenjeID() {
        return zaduzenjeID;
    }

    public void setZaduzenjeID(int zaduzenjeID) {
        this.zaduzenjeID = zaduzenjeID;
    }

    public Date getDatumZaduzenja() {
        return datumZaduzenja;
    }

    public void setDatumZaduzenja(Date datumZaduzenja) {
        this.datumZaduzenja = datumZaduzenja;
    }

    public Date getDatumRazduzenja() {
        return datumRazduzenja;
    }

    public void setDatumRazduzenja(Date datumRazduzenja) {
        this.datumRazduzenja = datumRazduzenja;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public Primerak getPrimerak() {
        return primerak;
    }

    public void setPrimerak(Primerak primerak) {
        this.primerak = primerak;
    }

    public Radnik getRadnikZaduzio() {
        return radnikZaduzio;
    }

    public void setRadnikZaduzio(Radnik radnikZaduzio) {
        this.radnikZaduzio = radnikZaduzio;
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
        final Zaduzenje other = (Zaduzenje) obj;
        if (this.zaduzenjeID != other.zaduzenjeID) {
            return false;
        }
        return true;
    }

    @Override
    public String getTableName() {
        return "zaduzenje";
    }

    @Override
    public String getParams() {
        return String.format("%s, %s, %s, %s, %s, %s, %s", zaduzenjeID, datumZaduzenja, datumRazduzenja, clan.getClanID(), primerak.getPrimerakID(), radnikZaduzio.getRadnikID(), radnikRazduzio.getRadnikID());
    }

    @Override
    public String getParamNames() {
        return "zaduzenjeID, datumZaduzenja, datumRazduzenja, clan, primerak, radnikZaduzio, radnikRazduzio ";
    }

    @Override
    public String getPKName() {
        return "zaduzenjeID";
    }

    @Override
    public Integer getPKValue() {
        return zaduzenjeID;
    }

    @Override
    public List<GeneralizedDomainObject> convertToList(ResultSet rs) {
        List<GeneralizedDomainObject> zaduzenja = new ArrayList<>();
        try {
            while(rs.next()) {
                Integer zaduzenjeID = rs.getInt("zaduzenjeID");
                Date datumZad = rs.getDate("datumZaduzenja");
                Date datumRaz = rs.getDate("datumRazduzenja");
                Integer clanID = rs.getInt("clanID");
                Integer primerakID = rs.getInt("primerakID");
                Integer radnikZadID = rs.getInt("radnikZaduzioID");
                Integer radnikRazID = rs.getInt("radnikRazduzioID");
                
                Zaduzenje z = new Zaduzenje(zaduzenjeID, datumZad, datumRaz, new Clan(clanID),new Primerak(primerakID),new Radnik(radnikZadID),new Radnik(radnikRazID));
                zaduzenja.add(z);
                
            }
        } catch (Exception e) {
            System.out.println("Error in zaduzenje: onvertToList");
            e.printStackTrace();
        }
        
        return zaduzenja;
    }

    @Override
    public String getUpdateQuery() {
        return "zaduzenjeID = " + zaduzenjeID + " datumZaduzenja = " + datumZaduzenja + " datumRazduzenja = " +datumRazduzenja + " clanID = " +clan.getClanID() + " primerakID = " +primerak.getPrimerakID() + " radnikZaduzio = " + radnikZaduzio.getRadnikID() + " radnikRazduzio = " + radnikRazduzio.getRadnikID();
    }

    @Override
    public String getAggPK() {
        return null;
    }

   
    
    
    
}
