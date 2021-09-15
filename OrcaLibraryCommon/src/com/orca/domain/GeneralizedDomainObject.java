/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author DCX
 */
public abstract class GeneralizedDomainObject implements Serializable{
    
    public abstract String getTableName();

    public abstract String getParams();

    public abstract String getParamNames();

    public abstract String getPKName();

    public abstract Integer getPKValue();

    public abstract List<GeneralizedDomainObject> convertToList(ResultSet rs);

    public abstract String getUpdateQuery();

    public abstract String getAggPK();
    
}
