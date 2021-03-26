/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author DCX
 */
public class Zaduzenje implements Serializable{
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

   
    
    
    
}
