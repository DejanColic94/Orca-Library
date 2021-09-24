/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.system_operations;

import com.orca.persistence.DataBaseBroker;

/**
 *
 * @author DCX
 */
public abstract class GeneralizedSO {
    
    public final void executeOperation() throws Exception {
        try {
            DataBaseBroker.getInstance().connect();
            executeSpecificOperation();
            DataBaseBroker.getInstance().commit();
            DataBaseBroker.getInstance().disconnect();
        } catch (Exception e) {
            e.printStackTrace();
            DataBaseBroker.getInstance().rollback();
            DataBaseBroker.getInstance().disconnect();
        }
    }

    protected abstract void executeSpecificOperation() throws Exception;
}
