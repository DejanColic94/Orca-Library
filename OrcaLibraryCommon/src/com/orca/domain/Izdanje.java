/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author DCX
 */
public class Izdanje implements Serializable{
    private Knjiga knjiga;
    private int brojIzdanja;
    private Izdavac izdavac;

    public Izdanje() {
    }

    public Izdanje(Knjiga knjiga, int brojIzdanja, Izdavac izdavac) {
        this.knjiga = knjiga;
        this.brojIzdanja = brojIzdanja;
        this.izdavac = izdavac;
    }

    public Izdavac getIzdavac() {
        return izdavac;
    }

    public void setIzdavac(Izdavac izdavac) {
        this.izdavac = izdavac;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
    }

    public int getBrojIzdanja() {
        return brojIzdanja;
    }

    public void setBrojIzdanja(int brojIzdanja) {
        this.brojIzdanja = brojIzdanja;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.knjiga);
        hash = 79 * hash + this.brojIzdanja;
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
        final Izdanje other = (Izdanje) obj;
        if (this.brojIzdanja != other.brojIzdanja) {
            return false;
        }
        if (!Objects.equals(this.knjiga, other.knjiga)) {
            return false;
        }
        return true;
    }
    
    
}
