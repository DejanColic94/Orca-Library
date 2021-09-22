/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.controller;

import com.orca.communication.StartServer;
import java.io.IOException;

/**
 *
 * @author DCX
 */
public class Controller {
     private static Controller instance;
     private static StartServer ss;
    

    private Controller() {
       
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    
     public void startServer(int port) {
                
        ss = new StartServer(port);
        ss.start();
        
        
    }
     
     public void stopServer() throws IOException {
        ss.stopServer();
        
    }
}
