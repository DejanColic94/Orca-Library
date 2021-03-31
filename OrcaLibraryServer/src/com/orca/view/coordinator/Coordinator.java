/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.coordinator;

import com.orca.view.FrmConfig;
import com.orca.view.FrmServer;
import com.orca.view.controller.FrmConfigController;
import com.orca.view.controller.FrmServerController;
import java.util.HashMap;
import java.util.Map;

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
    
    
    
}
