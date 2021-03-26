/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.domain;

import java.io.Serializable;

/**
 *
 * @author DCX
 */
public class Primerak implements Serializable{
    private int primerakID;
    private Knjiga knjiga;
    private Izdanje izdanje;

    public Primerak() {
    }

    public Primerak(int primerakID, Knjiga knjiga, Izdanje izdanje) {
        this.primerakID = primerakID;
        this.knjiga = knjiga;
        this.izdanje = izdanje;
    }

    public Izdanje getIzdanje() {
        return izdanje;
    }

    public void setIzdanje(Izdanje izdanje) {
        this.izdanje = izdanje;
    }

    public int getPrimerakID() {
        return primerakID;
    }

    public void setPrimerakID(int primerakID) {
        this.primerakID = primerakID;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
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
        final Primerak other = (Primerak) obj;
        if (this.primerakID != other.primerakID) {
            return false;
        }
        return true;
    }
    
    
}
