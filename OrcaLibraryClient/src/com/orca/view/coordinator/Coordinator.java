/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.coordinator;

import com.orca.view.FrmLogIn;
import com.orca.view.controller.FrmLogInController;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DCX
 */
public class Coordinator {
    private static Coordinator instance;
    private final Map<String,Object> params;
    
    // references to form controllers
    private FrmLogInController logInController;
    
    private Coordinator() {
        logInController = new FrmLogInController(new FrmLogIn());
        params = new HashMap<>();
        
    }

    public static Coordinator getInstance() {
        if(instance == null)
            instance = new Coordinator();
        return instance;
    }

    public void logIn() {
       logInController.logIn();
    }

    public void openLogIn() {
        logInController.openForm();
    }
    
    
    
}
