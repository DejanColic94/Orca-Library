/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.communication;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import javax.swing.JOptionPane;

/**
 *
 * @author DCX
 */
public class StartClient extends Thread{
    
    private int port;

    public StartClient(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        try {
           Socket socket = new Socket("localhost", port);
           CommunicationWithServer.getInstance().setSocket(socket);
        } catch (SocketException ex) {
            ex.printStackTrace();
            System.exit(0);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
}
