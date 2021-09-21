/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_operations.clan;

import com.orca.domain.GeneralizedDomainObject;
import com.orca.persistence.DataBaseBroker;
import system_operations.GeneralizedSO;

/**
 *
 * @author DCX
 */
public class SOIzbrisiClana extends GeneralizedSO{
    
    private GeneralizedDomainObject clan;
    private boolean success = false;

    public SOIzbrisiClana(GeneralizedDomainObject clan) {
        this.clan = clan;
    }

    public boolean isSuccess() {
        return success;
    }
    
    

    @Override
    protected void executeSpecificOperation() throws Exception {
        success = DataBaseBroker.getInstance().deleteGeneralizedObject(clan);
    }
    
}
