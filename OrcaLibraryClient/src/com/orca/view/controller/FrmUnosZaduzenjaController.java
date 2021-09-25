/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.view.FrmUnosZaduzenja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DCX
 */
public class FrmUnosZaduzenjaController {
    private FrmUnosZaduzenja formUnosZaduzenja;

    public FrmUnosZaduzenjaController(FrmUnosZaduzenja formUnosZaduzenja) {
        this.formUnosZaduzenja = formUnosZaduzenja;
        
        addListeners();
    }

    private void addListeners() {
        //odaberi clana
        formUnosZaduzenja.odaberiClanaAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        //zaduzi
        formUnosZaduzenja.zaduziAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        //razduzi
        formUnosZaduzenja.razduziAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public FrmUnosZaduzenja getFormUnosZaduzenja() {
        return formUnosZaduzenja;
    }
    
    
    
}
