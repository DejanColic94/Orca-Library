/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.communication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author DCX
 */
public class StartServer extends Thread{
    
    private ServerSocket serverSocket;
    private static List<HandleClient> clients = new ArrayList<>();
    private boolean flag = true;

    public StartServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server is up and running...");
        } catch (Exception e) {
            System.out.println("Server cannot be started!");
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(flag) {
            try {
                
                Socket clientSocket = serverSocket.accept();
                HandleClient clientThread = new HandleClient(clientSocket);
                clientThread.start();
                clients.add(clientThread);
                int counter = clients.size();
                System.out.println("Client #"+counter+" has connected!");
                
            } catch (SocketException se) {
                System.out.println("Server is not up");
                break;
                
            } catch (IOException ex) {
                
                System.out.println("Client is not connected!");
            }
        }
    }
    
    public void stopServer() {
        for(HandleClient c : clients) {
            try {
                c.getSocket().close();
                System.out.println("Client disconnected");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        try {
            serverSocket.close();
            flag = false;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void disconnectClient(HandleClient hc) {
        try {
             hc.getSocket().close();
             System.out.println("Client disconnected");
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    
    
    
    
}