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
public class Autor implements Serializable{
    private int autorID;
    private String imeAutora;

    public Autor() {
    }

    public Autor(int autorID, String imeAutora) {
        this.autorID = autorID;
        this.imeAutora = imeAutora;
    }

    public String getImeAutora() {
        return imeAutora;
    }

    public void setImeAutora(String imeAutora) {
        this.imeAutora = imeAutora;
    }

    public int getAutorID() {
        return autorID;
    }

    public void setAutorID(int autorID) {
        this.autorID = autorID;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.autorID;
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
        final Autor other = (Autor) obj;
        if (this.autorID != other.autorID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return imeAutora;
    }
    
    
    
}
