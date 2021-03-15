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
public class Zanr implements Serializable{
    private int zanrID;
    private String nazivZanra;

    public Zanr() {
    }

    public Zanr(int zanrID, String nazivZanra) {
        this.zanrID = zanrID;
        this.nazivZanra = nazivZanra;
    }

    public String getNazivZanra() {
        return nazivZanra;
    }

    public void setNazivZanra(String nazivZanra) {
        this.nazivZanra = nazivZanra;
    }

    public int getZanrID() {
        return zanrID;
    }

    public void setZanrID(int zanrID) {
        this.zanrID = zanrID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.zanrID;
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
        final Zanr other = (Zanr) obj;
        if (this.zanrID != other.zanrID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nazivZanra;
    }
    
    
}
