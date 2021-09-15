/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.communication;

import java.io.Serializable;

/**
 *
 * @author DCX
 */
public class Response implements Serializable{
    private Object response;
    private String msg;

    public Response() {
    }

    public Response(Object response, String msg) {
        this.response = response;
        this.msg = msg;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
}
