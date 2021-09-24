/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.collections;

import com.orca.domain.Radnik;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DCX
 */
public class UlogovaniRadnici {
    
    private static UlogovaniRadnici instance;
    List<Radnik> listaUlogovanih;

    private UlogovaniRadnici() {
        listaUlogovanih = new ArrayList<>();
    }

    public static UlogovaniRadnici getInstance() {
        if (instance == null) {
            instance = new UlogovaniRadnici();
        }
        return instance;
    }

    public List<Radnik> getListaUlogovanih() {
        return listaUlogovanih;
    }

    public void dodaj(Radnik r) {
        listaUlogovanih.add(r);
    }

    public void obrisi(Radnik r) {
        for (int i = 0; i < listaUlogovanih.size(); i++) {
            if (listaUlogovanih.get(i).equals(r)) {
                listaUlogovanih.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        String string="";
        for (Radnik r : listaUlogovanih) {
            string+=r.toString();
        }
        return string;
    }
    
}
