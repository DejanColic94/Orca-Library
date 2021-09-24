/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.session;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DCX
 */
public class Session {
    
    private static Session instance;
    private final Map<String,Object> params;

    public Session() {
        params = new HashMap<>();
    }

    public static Session getInstance() {
        if(instance == null) {
            instance = new Session();
        }
        return instance;
    }
    
    public Map<String, Object> getParams() {
        return params;
    }
    
    public void put(String key, Object value) {
        params.put(key, value);
    }

    public Object get(String key) {
        return params.get(key);
    }

    public void remove(String key) {
        params.remove(key);
    }
    
    
}
