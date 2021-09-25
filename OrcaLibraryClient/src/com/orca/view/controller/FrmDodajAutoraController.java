/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.view.FrmDodajAutora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DCX
 */
public class FrmDodajAutoraController {
    private FrmDodajAutora formDodajAutora;

    public FrmDodajAutoraController(FrmDodajAutora formDodajAutora) {
        this.formDodajAutora = formDodajAutora;
        
        addListeners();
    }

    private void addListeners() {
       formDodajAutora.dodajAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
    }

    public FrmDodajAutora getFormDodajAutora() {
        return formDodajAutora;
    }
    
    
    
}
