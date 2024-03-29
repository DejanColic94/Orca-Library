/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.controller;

import com.orca.communication.StartServer;
import com.orca.domain.GeneralizedDomainObject;
import com.orca.domain.Radnik;
import com.orca.persistence.DataBaseBroker;
import com.orca.system_operations.radnik.SOLogIniRadnika;
import com.orca.system_operations.radnik.SOReadRadnike;
import com.orca.utility.UtilityClanovi;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public List<GeneralizedDomainObject> getAllRadnike() throws Exception {
        SOReadRadnike so = new SOReadRadnike();
        so.executeOperation();
        return so.getRadnike();
    }

    public GeneralizedDomainObject logInRadnik(Radnik radnik) throws Exception {
       SOLogIniRadnika so = new SOLogIniRadnika(radnik);
       so.executeOperation();
       return so.getRadnik();
    }

    public List<UtilityClanovi> filterClanovi(String filter) {
        
         try {
             
             DataBaseBroker.getInstance().connect();
             List<UtilityClanovi> lista = DataBaseBroker.getInstance().filterClanovi(filter);
             DataBaseBroker.getInstance().commit();
             DataBaseBroker.getInstance().disconnect();
             
             return lista;
             
         } catch (Exception ex) {
             Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
             ex.printStackTrace();
             return null;
         }
        
    }
    
    
}
