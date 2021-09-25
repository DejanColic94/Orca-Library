/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.utility;

import com.orca.domain.Zaduzenje;
import java.io.Serializable;

/**
 *
 * @author DCX
 */
public class UtilityClanovi implements Serializable{
    private String ime;
    private String prezime;
    private String telefon;
    private String email;
    private int zaduzenje;
   

    public UtilityClanovi() {
    }

    public UtilityClanovi(String ime, String prezime, String telefon, String email,int zaduzenje) {
        this.ime = ime;
        this.prezime = prezime;
        this.telefon = telefon;
        this.email = email;
        this.zaduzenje = zaduzenje;
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getZaduzenje() {
        return zaduzenje;
    }

    public void setZaduzenje(int zaduzenje) {
        this.zaduzenje = zaduzenje;
    }

    
    
    
    
    
}
