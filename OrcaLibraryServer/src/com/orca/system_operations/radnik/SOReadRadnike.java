/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.system_operations.radnik;

import com.orca.domain.GeneralizedDomainObject;
import com.orca.domain.Radnik;
import com.orca.persistence.DataBaseBroker;
import com.orca.system_operations.GeneralizedSO;
import java.util.List;

/**
 *
 * @author DCX
 */
public class SOReadRadnike extends GeneralizedSO{
    
     List<GeneralizedDomainObject> radnici;

    public List<GeneralizedDomainObject> getRadnike() {
        return radnici;
    }
     
     

    @Override
    protected void executeSpecificOperation() throws Exception {
        radnici = DataBaseBroker.getInstance().getAllGeneralizedObjects(new Radnik());
    }
    
}
