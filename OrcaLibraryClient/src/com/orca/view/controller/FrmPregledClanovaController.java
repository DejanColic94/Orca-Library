/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.view.FrmPregledClanova;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DCX
 */
public class FrmPregledClanovaController {
    private FrmPregledClanova formPregledClanova;

    public FrmPregledClanovaController(FrmPregledClanova formPregledClanova) {
        this.formPregledClanova = formPregledClanova;
        
        addListeners();
    }

    private void addListeners() {
       // izmeni
       formPregledClanova.btnIzmeniAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
       
       // obrisi
       formPregledClanova.btnObrisiAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
    }
    
    
    
}
