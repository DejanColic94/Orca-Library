/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.communication;

import com.orca.collections.UlogovaniRadnici;
import com.orca.constants.Constants;
import com.orca.constants.Operations;
import com.orca.controller.Controller;
import com.orca.domain.GeneralizedDomainObject;
import com.orca.domain.Radnik;
import com.orca.persistence.Utility;
import com.orca.view.controller.FrmServerController;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DCX
 */
public class HandleClient extends Thread{
    
    private Socket socket;
    private boolean end = false;

    public HandleClient(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    
    
    @Override
    public void run() {
        while (!end && !isInterrupted()) {
            try {
                Request request = receiveRequest();
                Response response = new Response();
                
                switch (request.getOperation()) {
//                case Operations.GET_PORT:
//                    int port = Integer.parseInt(Utility.getInstance().getPort());
//                    response.setResponse(port);
//                    response.setFeedback(Constants.SUCCESS);
//                    break;
                    case Operations.LOG_IN:
                        
                        GeneralizedDomainObject ulogovani = Controller.getInstance().logInRadnik((Radnik) request.getParam());
                        if(ulogovani != null) {
                            if(!UlogovaniRadnici.getInstance().getListaUlogovanih().contains(ulogovani)) {
                                UlogovaniRadnici.getInstance().dodaj((Radnik) ulogovani);
                                response.setResponse(ulogovani);
                                response.setFeedback(Constants.SUCCESS);
                            
                        }else {
                                response.setResponse(ulogovani);
                                response.setFeedback(Constants.FAIL);
                            }
                        } else {
                            response.setFeedback(Constants.FAIL);
                        }
                        break;
                        case Operations.LOG_OUT:
                            
                            GeneralizedDomainObject ulogovan = (GeneralizedDomainObject) request.getParam();
                            if(ulogovan != null) {
                                UlogovaniRadnici.getInstance().obrisi((Radnik) ulogovan);
                                response.setFeedback(Constants.SUCCESS);
                            } else{
                                response.setFeedback(Constants.FAIL);
                            }
                            
                            break;
                        
                }
                sendResponse(response);
            } catch (Exception ex) {
                Logger.getLogger(HandleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private Request receiveRequest() {
        Request request = new Request();
        try {
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            request = (Request) in.readObject();
        } catch (Exception ex) {
            Logger.getLogger(HandleClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return request;
    }

    private void sendResponse(Response response) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(response);
        } catch (IOException ex) {
            Logger.getLogger(HandleClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
