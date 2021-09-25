/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.controller.Controller;
import com.orca.models.TableClanoviModel;
import com.orca.utility.UtilityClanovi;
import com.orca.view.FrmPregledClanova;
import com.orca.view.coordinator.Coordinator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

    public FrmPregledClanova getFormPregledClanova() {
        return formPregledClanova;
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
       
       // pronadji
       formPregledClanova.btnPronadjiAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
              
               Coordinator.getInstance().filterClanovi();
           }
       });
       
       
    }

    

}

//String filter = formPregledClanova.getTxtFilterClanovi().getText();
//               
//               ArrayList<UtilityClanovi> lista = Controller.getInstance().filterClanovi(filter);
//               
//               TableClanoviModel tmc = (TableClanoviModel) formPregledClanova.getTblClanovi().getModel();
//               tmc.setClanovi(lista);