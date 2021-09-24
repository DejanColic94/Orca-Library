/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.constants.Constants;
import com.orca.controller.Controller;
import com.orca.domain.Radnik;
import com.orca.session.Session;
import com.orca.view.FrmMain;
import com.orca.view.coordinator.Coordinator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

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
               Radnik ulogovani = (Radnik) Session.getInstance().get(Constants.CURRENT_USER);
               Object[] choice = {"DA","NE"};
               String msg = "Da li ste sigurni?";
                int prompt = JOptionPane.showOptionDialog(formMain, msg, "Log Out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
                if(prompt == 1) {
                    return;
                }
                
                Controller.getInstance().logOut(ulogovani);
                Session.getInstance().getParams().remove(Constants.CURRENT_USER,ulogovani);
                
                formMain.setVisible(false);
                formMain.dispose();
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
    
    public void openForm() {
        Radnik radnik = (Radnik) Session.getInstance().getParams().get(Constants.CURRENT_USER);
        formMain.getLblUlogovaniRadnik().setText(radnik.getImePrezime());
        formMain.setVisible(true);
    }
    
    
    
}
