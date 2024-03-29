/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.system_operations.zaduzenje;

import com.orca.domain.GeneralizedDomainObject;
import com.orca.persistence.DataBaseBroker;
import com.orca.system_operations.GeneralizedSO;

/**
 *
 * @author DCX
 */
public class SOCreateZaduzenje extends GeneralizedSO{
    
    private GeneralizedDomainObject zaduzenje;
    private boolean success = false;

    public SOCreateZaduzenje(GeneralizedDomainObject zaduzenje) {
        this.zaduzenje = zaduzenje;
    }

    public boolean isSuccess() {
        return success;
    }
    
    

    @Override
    protected void executeSpecificOperation() throws Exception {
       success = DataBaseBroker.getInstance().saveGeneralizedObject(zaduzenje);
    }
    
}
