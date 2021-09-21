/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_operations.radnik;

import com.orca.domain.GeneralizedDomainObject;
import com.orca.domain.Radnik;
import com.orca.persistence.DataBaseBroker;
import java.util.List;
import system_operations.GeneralizedSO;

/**
 *
 * @author DCX
 */
public class SOLogIniRadnika extends GeneralizedSO{
    
    private GeneralizedDomainObject radnik;
    public GeneralizedDomainObject ulogovaniRadnik;

    public SOLogIniRadnika(GeneralizedDomainObject radnik) {
        this.radnik = radnik;
        this.ulogovaniRadnik = null;
    }

    public GeneralizedDomainObject getRadnik() {
        return ulogovaniRadnik;
    }
    
    

    @Override
    protected void executeSpecificOperation() throws Exception {
        try {
            List<GeneralizedDomainObject> listaRadnika = DataBaseBroker.getInstance().getAllGeneralizedObjects(radnik);
        Radnik inputRadnik = (Radnik) radnik;
        for(GeneralizedDomainObject object : listaRadnika) {
            Radnik r = (Radnik) object;
            
            System.out.println("Input user: "+inputRadnik.getUsername()+ " Input password: "+inputRadnik.getPassword());
            System.out.println("Match user: "+r.getUsername()+" Match pass: "+r.getPassword());
            
            if(r.getUsername().trim().equals(inputRadnik.getUsername().trim()) && r.getPassword().equals(inputRadnik.getPassword())) {
                this.ulogovaniRadnik = r;
                return;
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
           
        }
    }
    

