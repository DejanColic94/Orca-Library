/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.system_operations.knjiga;

import com.orca.domain.GeneralizedDomainObject;
import com.orca.persistence.DataBaseBroker;
import com.orca.system_operations.GeneralizedSO;

/**
 *
 * @author DCX
 */
public class SOCreateKnjigu extends GeneralizedSO{
    
    private GeneralizedDomainObject knjiga;
    private boolean success = false;

    public SOCreateKnjigu(GeneralizedDomainObject knjiga) {
        this.knjiga = knjiga;
    }

    public boolean isSuccess() {
        return success;
    }
    
    

    @Override
    protected void executeSpecificOperation() throws Exception {
       success = DataBaseBroker.getInstance().saveGeneralizedObject(knjiga);
    }
    
}
