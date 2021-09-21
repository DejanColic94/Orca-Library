/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_operations.clan;

import com.orca.domain.Clan;
import com.orca.domain.GeneralizedDomainObject;
import com.orca.domain.Primerak;
import com.orca.persistence.DataBaseBroker;
import java.util.List;
import system_operations.GeneralizedSO;

/**
 *
 * @author DCX
 */
public class SOReadClanove extends GeneralizedSO{
    
    List<GeneralizedDomainObject> clanovi ;

    public List<GeneralizedDomainObject> getClanovi() {
        return clanovi;
    }
    

    @Override
    protected void executeSpecificOperation() throws Exception {
        clanovi = DataBaseBroker.getInstance().getAllGeneralizedObjects(new Clan());
        for(GeneralizedDomainObject object : clanovi) {
            Clan clan = (Clan) object;
            Primerak p = (Primerak) DataBaseBroker.getInstance().getByID(new Primerak(), clan.getPrimerak().getPrimerakID());
            clan.setPrimerak(p);
        }
    }
    
}
