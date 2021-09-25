/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.models.TableKnjigeModel;
import com.orca.view.FrmPregledKnjiga;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DCX
 */
public class FrmPregledKnjigaController {
    private FrmPregledKnjiga formPregledKnjiga;

    public FrmPregledKnjigaController(FrmPregledKnjiga formPregledKnjiga) {
        this.formPregledKnjiga = formPregledKnjiga;
        
        addListeners();
       
    }
    
    private void addListeners() {
       // izmeni
       formPregledKnjiga.btnIzmeniAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
       
       // obrisi
       formPregledKnjiga.btnObrisiAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
       
       // pronadji
       formPregledKnjiga.btnPronadjiAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
    }

    public FrmPregledKnjiga getFormPregledKnjiga() {
        return formPregledKnjiga;
    }

   
    
}
