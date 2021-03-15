/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.domain;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author DCX
 */
public class Clan implements Serializable{
    private int clanID;
    private String imePrezime;
    private String telefon;
    private String email;
    private Primerak primerak;
    private ArrayList<Zaduzenje> listaZaduzenja;

    public Clan() {
        listaZaduzenja = new ArrayList<>();
    }

    public Clan(int clanID, String imePrezime, String telefon, String email, Primerak primerak) {
        this.clanID = clanID;
        this.imePrezime = imePrezime;
        this.telefon = telefon;
        this.email = email;
        this.primerak = primerak;
        listaZaduzenja = new ArrayList<>();
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

    public ArrayList<Zaduzenje> getListaZaduzenja() {
        return listaZaduzenja;
    }

    public void setListaZaduzenja(ArrayList<Zaduzenje> listaZaduzenja) {
        this.listaZaduzenja = listaZaduzenja;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.clanID;
        return hash;
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
    
    
}
