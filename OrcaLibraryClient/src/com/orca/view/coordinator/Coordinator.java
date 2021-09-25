/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view.coordinator;

import com.orca.communication.StartClient;
import com.orca.constants.Constants;
import com.orca.domain.Radnik;
import com.orca.view.FrmLogIn;
import com.orca.view.controller.FrmLogInController;
import com.orca.controller.Controller;
import com.orca.models.TableClanoviModel;
import com.orca.session.Session;
import com.orca.utility.UtilityClanovi;
import com.orca.view.FrmDodajAutora;
import com.orca.view.FrmMain;
import com.orca.view.FrmPregledClanova;
import com.orca.view.FrmPregledKnjiga;
import com.orca.view.FrmPregledZaduzenja;
import com.orca.view.FrmUnosClana;
import com.orca.view.FrmUnosKnjige;
import com.orca.view.FrmUnosZaduzenja;
import com.orca.view.controller.FrmDodajAutoraController;
import com.orca.view.controller.FrmMainController;
import com.orca.view.controller.FrmPregledClanovaController;
import com.orca.view.controller.FrmPregledKnjigaController;
import com.orca.view.controller.FrmPregledZaduzenjaController;
import com.orca.view.controller.FrmUnosClanaController;
import com.orca.view.controller.FrmUnosKnjigeController;
import com.orca.view.controller.FrmUnosZaduzenjaController;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author DCX
 */
public class Coordinator {
    private static Coordinator instance;
    
    
    // references to form controllers
    private FrmLogInController logInController;
    private FrmMainController mainController;
    private FrmPregledClanovaController pregledClanovaController;
    private FrmPregledKnjigaController pregledKnjigaController;
    private FrmPregledZaduzenjaController pregledZaduzenjaController;
    private FrmUnosClanaController unosClanaController;
    private FrmUnosKnjigeController unosKnjigeController;
    private FrmUnosZaduzenjaController unosZaduzenjaController;
    private FrmDodajAutoraController dodajAutoraController;
    
   

   private Coordinator() {
        logInController = new FrmLogInController(new FrmLogIn());
        mainController = new FrmMainController(new FrmMain());
        pregledClanovaController = new FrmPregledClanovaController(new FrmPregledClanova(mainController.getFormMain(), true));
        pregledKnjigaController = new FrmPregledKnjigaController(new FrmPregledKnjiga(mainController.getFormMain(), true));
        pregledZaduzenjaController = new FrmPregledZaduzenjaController(new FrmPregledZaduzenja(mainController.getFormMain(), true));
        unosClanaController = new FrmUnosClanaController(new FrmUnosClana(mainController.getFormMain(), true));
        unosKnjigeController = new FrmUnosKnjigeController(new FrmUnosKnjige(mainController.getFormMain(), true));
        unosZaduzenjaController = new FrmUnosZaduzenjaController(new FrmUnosZaduzenja(mainController.getFormMain(), true));
        dodajAutoraController = new FrmDodajAutoraController(new FrmDodajAutora(mainController.getFormMain(), true));
    }
    
    

    public static Coordinator getInstance() {
        if(instance == null)
            instance = new Coordinator();
        return instance;
    }

    public void logIn() {
      String username = logInController.getForm().txtUsername.getText();
      String password = String.valueOf(logInController.getForm().txtPassword.getPassword());
      
      Radnik radnik = new Radnik();
      radnik.setUsername(username);
      radnik.setPassword(password);
      
      
      
      radnik = Controller.getInstance().logIn(radnik);
      
      
      
      if(radnik != null) {
          
           Session.getInstance().getParams().put(Constants.CURRENT_USER, radnik);
      
     // System.out.println(Session.getInstance().getParams().get(Constants.CURRENT_USER));
      
      JOptionPane.showMessageDialog(logInController.getForm(), "Dobrodosli," + radnik.getImePrezime()); 
      
      mainController.openForm();
      
     
      
      logInController.getForm().dispose();
      } else {
           JOptionPane.showMessageDialog(logInController.getForm(), "Logovanje nije uspesno. Unesite parametre ponovo");
           return;
                   
           
      }
        
      
    }

    public void openLogIn() {
       // int port = Controller.getPort();
       int port = 9000;
       new StartClient(port).start();
        
        logInController.openForm();
        
       
    }

    public void openPregledKnjiga() {
        FrmPregledKnjiga f = pregledKnjigaController.getFormPregledKnjiga();
        f.setVisible(true);
    }

    public void openKnjigeNovo() {
       FrmUnosKnjige f = unosKnjigeController.getFormUnosKnjige();
        f.setVisible(true);
    }

    public void openPregledClanova() {
        FrmPregledClanova f = pregledClanovaController.getFormPregledClanova();
        f.setVisible(true);
    }

    public void openClanoviNovo() {
        FrmUnosClana f = unosClanaController.getFormUnosClana();
        f.setVisible(true);
    }

    public void openPregledZaduzenja() {
        FrmPregledZaduzenja f = pregledZaduzenjaController.getFormPregledZaduzenja();
        f.setVisible(true);
    }

    public void openZaduzenjeNovo() {
        FrmUnosZaduzenja f = unosZaduzenjaController.getFormUnosZaduzenja();
        f.setVisible(true);
    }

    public void filterClanovi() {
        String filter = pregledClanovaController.getFormPregledClanova().getTxtFilterClanovi().getText();
               
        ArrayList<UtilityClanovi> lista = Controller.getInstance().filterClanovi(filter);
               
        TableClanoviModel tmc = (TableClanoviModel) pregledClanovaController.getFormPregledClanova().getTblClanovi().getModel();
        tmc.setClanovi(lista);
    }

   

   
    
    
    
}
