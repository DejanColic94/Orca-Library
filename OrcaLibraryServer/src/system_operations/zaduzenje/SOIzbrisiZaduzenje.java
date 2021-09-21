/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_operations.zaduzenje;

import com.orca.domain.GeneralizedDomainObject;
import com.orca.persistence.DataBaseBroker;
import system_operations.GeneralizedSO;

/**
 *
 * @author DCX
 */
public class SOIzbrisiZaduzenje extends GeneralizedSO{
    
    private GeneralizedDomainObject zaduzenje;
    private boolean success = false;

    public SOIzbrisiZaduzenje(GeneralizedDomainObject zaduzenje) {
        this.zaduzenje = zaduzenje;
    }

    public boolean isSuccess() {
        return success;
    }
    
    

    @Override
    protected void executeSpecificOperation() throws Exception {
        success = DataBaseBroker.getInstance().deleteGeneralizedObject(zaduzenje);
    }
    
}
