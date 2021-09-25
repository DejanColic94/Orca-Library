/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.utility;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author DCX
 */
public class UtilityZaduzenja implements Serializable{
    
    private String clan;
    private String Knjiga;
    private String radnikZaduzio;
    private String radnikRazduzio;
    private Date datumZaduzenja;
    private Date datumRazduzenja;

    public UtilityZaduzenja() {
    }

    public UtilityZaduzenja(String clan, String Knjiga, String radnikZaduzio, String radnikRazduzio, Date datumZaduzenja, Date datumRazduzenja) {
        this.clan = clan;
        this.Knjiga = Knjiga;
        this.radnikZaduzio = radnikZaduzio;
        this.radnikRazduzio = radnikRazduzio;
        this.datumZaduzenja = datumZaduzenja;
        this.datumRazduzenja = datumRazduzenja;
    }

    public Date getDatumRazduzenja() {
        return datumRazduzenja;
    }

    public void setDatumRazduzenja(Date datumRazduzenja) {
        this.datumRazduzenja = datumRazduzenja;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getKnjiga() {
        return Knjiga;
    }

    public void setKnjiga(String Knjiga) {
        this.Knjiga = Knjiga;
    }

    public String getRadnikZaduzio() {
        return radnikZaduzio;
    }

    public void setRadnikZaduzio(String radnikZaduzio) {
        this.radnikZaduzio = radnikZaduzio;
    }

    public String getRadnikRazduzio() {
        return radnikRazduzio;
    }

    public void setRadnikRazduzio(String radnikRazduzio) {
        this.radnikRazduzio = radnikRazduzio;
    }

    public Date getDatumZaduzenja() {
        return datumZaduzenja;
    }

    public void setDatumZaduzenja(Date datumZaduzenja) {
        this.datumZaduzenja = datumZaduzenja;
    }
    
    
}
