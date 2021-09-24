/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.system_operations.clan;

import com.orca.domain.GeneralizedDomainObject;
import com.orca.persistence.DataBaseBroker;
import com.orca.system_operations.GeneralizedSO;

/**
 *
 * @author DCX
 */
public class SOUpdateClana extends GeneralizedSO{
    
    private GeneralizedDomainObject clan;
    private boolean success = false;

    public SOUpdateClana(GeneralizedDomainObject clan) {
        this.clan = clan;
    }

    public boolean isSuccess() {
        return success;
    }
    
    

    @Override
    protected void executeSpecificOperation() throws Exception {
        success = DataBaseBroker.getInstance().updateGeneralizedObject(clan);
    }
    
}
