/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.coordinator;

import com.orca.communication.CommunicationWithServer;
import com.orca.communication.StartClient;
import com.orca.domain.Radnik;
import com.orca.view.FrmLogIn;
import com.orca.view.controller.FrmLogInController;
import com.orca.controller.Controller;
import com.orca.session.Session;
import com.orca.view.FrmMain;
import com.orca.view.controller.FrmMainController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DCX
 */
public class Coordinator {
    private static Coordinator instance;
    
    
    // references to form controllers
    private FrmLogInController logInController;
    private FrmMainController mainController;
    
    private Coordinator() {
        logInController = new FrmLogInController(new FrmLogIn());
        mainController = new FrmMainController(new FrmMain());
        
    }

    public static Coordinator getInstance() {
        if(instance == null)
            instance = new Coordinator();
        return instance;
    }

    public void logIn() {
      String username = logInController.getForm().txtUsername.getText();
      String password = String.valueOf(logInController.getForm().txtPassword.getPassword());
      
      Radnik radnik = new Radnik();
      radnik.setUsername(username);
      radnik.setPassword(password);
      
      
      
      radnik = Controller.getInstance().logIn(radnik);
      
      Session.getInstance().getParams().put("radnik", radnik);
      
      System.out.println(Session.getInstance().getParams().get("radnik"));
      
      
      mainController.getFormMain().setVisible(true);
      logInController.getForm().dispose();
        
      
    }

    public void openLogIn() {
       // int port = Controller.getPort();
       int port = 9000;
       new StartClient(port).start();
        
        logInController.openForm();
       
    }
    
    
    
}
