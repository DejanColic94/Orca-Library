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
public class Knjiga implements Serializable{
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
    
    
    
}
