/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_operations.zaduzenje;

import com.orca.domain.Clan;
import com.orca.domain.GeneralizedDomainObject;
import com.orca.domain.Primerak;
import com.orca.domain.Radnik;
import com.orca.domain.Zaduzenje;
import com.orca.persistence.DataBaseBroker;
import java.util.List;
import system_operations.GeneralizedSO;

/**
 *
 * @author DCX
 */
public class SONadjiZaduzenja extends GeneralizedSO{
    
    List<GeneralizedDomainObject> zaduzenja;

    public List<GeneralizedDomainObject> getZaduzenja() {
        return zaduzenja;
    }
    
    

    @Override
    protected void executeSpecificOperation() throws Exception {
        
        zaduzenja = DataBaseBroker.getInstance().getAllGeneralizedObjects(new Zaduzenje());
        
        for(GeneralizedDomainObject object : zaduzenja) {
            Zaduzenje z = (Zaduzenje) object;
            Clan c = (Clan) DataBaseBroker.getInstance().getByID(new Clan(), z.getClan().getClanID());
            Primerak p = (Primerak) DataBaseBroker.getInstance().getByID(new Primerak(), z.getPrimerak().getPrimerakID());
            Radnik rZaduzio = (Radnik) DataBaseBroker.getInstance().getByID(new Radnik(), z.getRadnikZaduzio().getRadnikID());
            Radnik rRazduzio = (Radnik) DataBaseBroker.getInstance().getByID(new Radnik(), z.getRadnikRazduzio().getRadnikID());
            
            z.setClan(c);
            z.setPrimerak(p);
            z.setRadnikZaduzio(rZaduzio);
            z.setRadnikRazduzio(rRazduzio);
        }
    }
    
}
