/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.view.FrmMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DCX
 */
public class FrmMainController {
    private FrmMain formMain;

    public FrmMainController(FrmMain formMain) {
        this.formMain = formMain;
        
        addListeners();
    }

    private void addListeners() {
        // citat btn
        formMain.btnNoviCitatAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        //log out btn
        formMain.btnLogOutAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        // miKnjigePregled menu item
        formMain.miKnjigePregledAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        // miKnjigeNovo
        formMain.miKnjigeNovoAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
         // miClanoviPregled menu item
        formMain.miClanoviPregledAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        // miClanoviNovo
        formMain.miClanoviNovoAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
         // miZaduzenjePregled menu item
        formMain.miZaduzenjePregledAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        // miZaduzenjeNovo
        formMain.miZaduzenjeNovoAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public FrmMain getFormMain() {
        return formMain;
    }
    
    
    
    
}
