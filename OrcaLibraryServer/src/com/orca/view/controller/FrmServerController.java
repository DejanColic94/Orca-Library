/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.communication.StartServer;
import com.orca.view.FrmConfig;
import com.orca.view.FrmServer;
import com.orca.view.coordinator.Coordinator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;

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
              Coordinator.getInstance().startServer();
           }
       });
       //zaustavi
       formServer.zaustaviAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               Coordinator.getInstance().stopServer();
           }
       });
       
       // config
       formServer.configAddActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               Coordinator.getInstance().openConfigForm();
           }
       });
       
    }

    public void openForm() {
        formServer.setLocationRelativeTo(null);
        formServer.setVisible(true);
    }

    public FrmServer getFormServer() {
        return formServer;
    }
    
    
}
