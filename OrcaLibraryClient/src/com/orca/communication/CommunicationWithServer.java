/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.communication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DCX
 */
public class CommunicationWithServer {
    private static CommunicationWithServer instance;
    Socket socket;
    

    

    public static CommunicationWithServer getInstance() {
        if (instance == null) {
            instance = new CommunicationWithServer();
        }
        return instance;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

   
    
    
    
    

    public void sendRequest(Request request) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(request);
        } catch (IOException ex) {
            Logger.getLogger(CommunicationWithServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Response receiveResponse() {
        Response response = new Response();
        try {
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            response = (Response) in.readObject();
        } catch (Exception ex) {
            Logger.getLogger(CommunicationWithServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
}
