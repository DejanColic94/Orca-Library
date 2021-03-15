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
public class Izdavac implements Serializable{
    private int izdavacID;
    private String nazivIzdavaca;

    public Izdavac() {
    }

    public Izdavac(int izdavacID, String nazivIzdavaca) {
        this.izdavacID = izdavacID;
        this.nazivIzdavaca = nazivIzdavaca;
    }

    public String getNazivIzdavaca() {
        return nazivIzdavaca;
    }

    public void setNazivIzdavaca(String nazivIzdavaca) {
        this.nazivIzdavaca = nazivIzdavaca;
    }

    public int getIzdavacID() {
        return izdavacID;
    }

    public void setIzdavacID(int izdavacID) {
        this.izdavacID = izdavacID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.izdavacID;
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
        final Izdavac other = (Izdavac) obj;
        if (this.izdavacID != other.izdavacID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nazivIzdavaca;
    }
    
    
}
