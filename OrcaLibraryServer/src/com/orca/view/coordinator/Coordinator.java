/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.coordinator;

import com.orca.communication.StartServer;
import com.orca.controller.Controller;
import com.orca.persistence.Utility;
import com.orca.view.FrmConfig;
import com.orca.view.FrmServer;
import com.orca.view.controller.FrmConfigController;
import com.orca.view.controller.FrmServerController;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DCX
 */
public class Coordinator {
    private static Coordinator instance;
    private final Map<String,Object> params;
  
    
    //references to controllers
    private FrmServerController serverController;
    private FrmConfigController configController;

    private Coordinator() {
        params = new HashMap<>();
        
        serverController = new FrmServerController(new FrmServer());
        configController = new FrmConfigController(new FrmConfig(serverController.getFormServer(), true));
    }

    public static Coordinator getInstance() {
        if(instance == null)
            instance = new Coordinator();
        return instance;
    }

    public void openServer() {
       serverController.openForm();
    }

    public void openConfigForm() {
        configController.getFormConfig().setVisible(true);
        configController.getFormConfig().setLocationRelativeTo(null);
    }

    public void saveConfigParams() {
       
        // port je socket port, ne database port (mySql je 3306)
        String username = configController.getFormConfig().txtUsername.getText();
        String password =  configController.getFormConfig().txtPassword.getText();
        String url = configController.getFormConfig().txtURL.getText();
        String port =configController.getFormConfig().txtPort.getText();
        
        System.out.println("username : " +username);
        System.out.println("password : " +password);
        System.out.println("URL : " +url);
        System.out.println("port : " +port);
        
        Utility.getInstance().setUsername(username);
        Utility.getInstance().setPassword(password);
        Utility.getInstance().setDbUrl(url);
        Utility.getInstance().setPort(port);
        
        System.out.println("Params saved");
        
        configController.getFormConfig().dispose();
    }

    public void stopServer() {
        try {
            
            Controller.getInstance().stopServer();
            System.out.println("Server stoped.");
            
            serverController.getFormServer().btnPokreni.setEnabled(true);
            serverController.getFormServer().btnZaustavi.setEnabled(false);
            
        } catch (Exception ex) {
            Logger.getLogger(Coordinator.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }

    public void startServer() {
        try {
            
             Controller.getInstance().startServer(Integer.parseInt(Utility.getInstance().getPort()));
             System.out.println("Server up and running, waiting for client on port: " + Utility.getInstance().getPort() + "\n");
             
            serverController.getFormServer().btnPokreni.setEnabled(false);
            serverController.getFormServer().btnZaustavi.setEnabled(true);
           
            
        } catch (Exception ex) {
            Logger.getLogger(Coordinator.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
    
}
