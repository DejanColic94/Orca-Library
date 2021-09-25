/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.view.FrmUnosKnjige;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DCX
 */
public class FrmUnosKnjigeController {
    private FrmUnosKnjige formUnosKnjige;

    public FrmUnosKnjigeController(FrmUnosKnjige formUnosKnjige) {
        this.formUnosKnjige = formUnosKnjige;
        
        addListeners();
    }

    private void addListeners() {
        //odaberi
        formUnosKnjige.odaberiAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        //dodaj novog autora
        formUnosKnjige.dodajNovogAutoraAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        //dodaj izdanje
        formUnosKnjige.dodajIzdanjeAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        //sacuvaj knjigu
        formUnosKnjige.sacuvajKnjiguAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        //odustani
        formUnosKnjige.odustaniAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public FrmUnosKnjige getFormUnosKnjige() {
        return formUnosKnjige;
    }
    
    
    
}
