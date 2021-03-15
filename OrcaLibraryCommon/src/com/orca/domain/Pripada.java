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
public class Pripada implements Serializable{
    private Zanr zanr;
    private Knjiga knjiga;

    public Pripada() {
    }

    public Pripada(Zanr zanr, Knjiga knjiga) {
        this.zanr = zanr;
        this.knjiga = knjiga;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }
    
    
}
