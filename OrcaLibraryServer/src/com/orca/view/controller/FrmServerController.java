/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.communication.StartServer;
import com.orca.view.FrmServer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DCX
 */
public class FrmServerController {
    private FrmServer formServer;

    public FrmServerController(FrmServer formServer) {
        this.formServer = formServer;
        
        addListeners();
    }

    private void addListeners() {
       // pokreni
       formServer.pokreniAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
       //zaustavi
       formServer.zaustaviAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
       
       // config
       
       formServer.configAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
    }

    public void openForm() {
        formServer.setLocationRelativeTo(null);
        formServer.setVisible(true);
        
        StartServer ss = new StartServer();
        ss.start();
    }

    public FrmServer getFormServer() {
        return formServer;
    }
    
    
}
