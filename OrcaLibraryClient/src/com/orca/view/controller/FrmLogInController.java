/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.view.FrmLogIn;
import com.orca.view.FrmMain;
import com.orca.view.coordinator.Coordinator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author DCX
 */
public class FrmLogInController {
    private FrmLogIn form;

    public FrmLogInController(FrmLogIn form) {
        this.form = form;
        addListeners();
    }

    private void addListeners() {
       // button uloguj se
       form.btnUlogujSeAddListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               Coordinator.getInstance().logIn();
           }
       });
    }

    public FrmLogIn getForm() {
        return form;
    }
    
    

    public void openForm() {
       form.setLocationRelativeTo(null);
       form.setVisible(true);
    }

    public void logIn() {
      JFrame main = new FrmMain();
      main.setVisible(true);
    }
    
    
    
}
