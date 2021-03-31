/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.main;

import com.orca.view.FrmServer;
import com.orca.view.coordinator.Coordinator;
import javax.swing.JFrame;

/**
 *
 * @author DCX
 */
public class Main {
    public static void main(String[] args) {
        Coordinator.getInstance().openServer();
        
    }
}
