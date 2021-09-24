/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.system_operations.knjiga;

import com.orca.domain.GeneralizedDomainObject;
import com.orca.domain.Knjiga;
import com.orca.persistence.DataBaseBroker;
import java.util.List;
import com.orca.system_operations.GeneralizedSO;

/**
 *
 * @author DCX
 */
public class SOReadKnjige extends GeneralizedSO{
    
    List<GeneralizedDomainObject> knjige;

    public  List<GeneralizedDomainObject> getKnjige() {
        return knjige;
    }
    
    

    @Override
    protected void executeSpecificOperation() throws Exception {
        knjige = DataBaseBroker.getInstance().getAllGeneralizedObjects(new Knjiga());
    }
    
}
