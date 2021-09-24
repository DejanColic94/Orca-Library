/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.controller;

import com.orca.communication.CommunicationWithServer;
import com.orca.communication.Request;
import com.orca.communication.Response;
import com.orca.constants.Constants;
import com.orca.constants.Operations;
import com.orca.domain.Radnik;
import com.orca.exceptions.RequestFailedException;

/**
 *
 * @author DCX
 */
public class Controller {
    
    private static Controller instance;


   private Controller() {
    }

    public static Controller getInstance() {
        if(instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    
    
//     public static int getPort() {
//         Request request = new Request();
//         request.setOperation(Operations.GET_PORT);
//         try {
//             CommunicationWithServer.getInstance().sendRequest(request);
//             Response response = CommunicationWithServer.getInstance().receiveResponse();
//             if(response.getFeedback() == Constants.SUCCESS) {
//                 return (int) response.getResponse();
//             }else {
//                 System.out.println("Request failed");
//                 Exception ex = new RequestFailedException();
//                 throw ex;
//             }
//         } catch (Exception e) {
//            e.printStackTrace();
//            return -1;
//         }
//    }

    public Radnik logIn(Radnik radnik) {
        
        Request request = new Request();
        request.setParam(radnik);
        request.setOperation(Operations.LOG_IN);
        
        try {
            CommunicationWithServer.getInstance().sendRequest(request);
            Response response = CommunicationWithServer.getInstance().receiveResponse();
            if(response.getFeedback() == Constants.SUCCESS) {
                return (Radnik) response.getResponse();
            } else{
                if(response.getResponse() != null) {
                    throw new Exception("Radnik je vec ulogovan");
                }
                Exception ex = new RequestFailedException();
                throw ex;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    
}
