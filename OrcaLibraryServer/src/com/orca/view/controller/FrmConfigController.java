/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.controller;

import com.orca.view.FrmConfig;
import com.orca.view.coordinator.Coordinator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DCX
 */
public class FrmConfigController {
    private FrmConfig formConfig;

    public FrmConfigController(FrmConfig formConfig) {
        this.formConfig = formConfig;
        
        addListeners();
    }

    public FrmConfig getFormConfig() {
        return formConfig;
    }

    public void setFormConfig(FrmConfig formConfig) {
        this.formConfig = formConfig;
    }
    
    

    private void addListeners() {
        //sacuvaj
        formConfig.sacuvajAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              
                Coordinator.getInstance().saveConfigParams();
            }
        });
        //odustani
        formConfig.odustaniAddActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                formConfig.dispose();
            }
        });
    }
    
    
    
}
