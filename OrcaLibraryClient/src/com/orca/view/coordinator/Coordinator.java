/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.coordinator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DCX
 */
public class Coordinator {
    private static Coordinator instance;
    private final Map<String,Object> params;

    private Coordinator() {
        params = new HashMap<>();
    }

    public static Coordinator getInstance() {
        if(instance == null)
            instance = new Coordinator();
        return instance;
    }
    
}
