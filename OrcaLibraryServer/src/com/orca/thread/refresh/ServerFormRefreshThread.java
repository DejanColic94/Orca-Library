/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.thread.refresh;

import com.orca.view.controller.FrmServerController;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DCX
 */
public class ServerFormRefreshThread extends Thread{
    
    FrmServerController controller;

    public ServerFormRefreshThread(FrmServerController controller) {
        this.controller = controller;
    }

    @Override
    public void run() {
        while(true) {
            try {
                controller.fillTable();
                System.out.println("refreshed");
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ServerFormRefreshThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
