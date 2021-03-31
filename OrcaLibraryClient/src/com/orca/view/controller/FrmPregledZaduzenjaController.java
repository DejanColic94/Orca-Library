/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.view.FrmPregledZaduzenja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DCX
 */
public class FrmPregledZaduzenjaController {
    private FrmPregledZaduzenja formPregledZaduzenja;

    public FrmPregledZaduzenjaController(FrmPregledZaduzenja formPregledZaduzenja) {
        this.formPregledZaduzenja = formPregledZaduzenja;
        
        addListeners();
    }
    
    private void addListeners() {
       // izmeni
       formPregledZaduzenja.btnIzmeniAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
       
       // obrisi
       formPregledZaduzenja.btnObrisiAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
    }
    
}
