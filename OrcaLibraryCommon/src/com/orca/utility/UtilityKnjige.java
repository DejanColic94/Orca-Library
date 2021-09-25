/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.utility;

import java.io.Serializable;

/**
 *
 * @author DCX
 */
public class UtilityKnjige implements Serializable{
    
    private String naziv;
    private String autor;
    private String izdavac;
    private String zanr;
    private int izdanje;
    private int brojPrimeraka;

    public UtilityKnjige() {
    }

    public UtilityKnjige(String naziv, String autor, String izdavac, String zanr, int izdanje, int brojPrimeraka) {
        this.naziv = naziv;
        this.autor = autor;
        this.izdavac = izdavac;
        this.zanr = zanr;
        this.izdanje = izdanje;
        this.brojPrimeraka = brojPrimeraka;
    }

    public int getBrojPrimeraka() {
        return brojPrimeraka;
    }

    public void setBrojPrimeraka(int brojPrimeraka) {
        this.brojPrimeraka = brojPrimeraka;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIzdavac() {
        return izdavac;
    }

    public void setIzdavac(String izdavac) {
        this.izdavac = izdavac;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public int getIzdanje() {
        return izdanje;
    }

    public void setIzdanje(int izdanje) {
        this.izdanje = izdanje;
    }
    
    
    
}
