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
public class Pise implements Serializable{
    private Autor autor;
    private Knjiga knjiga;
   

    public Pise() {
    }

    public Pise(Autor autor, Knjiga knjiga, int godina) {
        this.autor = autor;
        this.knjiga = knjiga;
       
    }

  

   

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Knjiga getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(Knjiga knjiga) {
        this.knjiga = knjiga;
    }
    
    
}
