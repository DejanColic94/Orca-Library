/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.models;

import com.orca.domain.Radnik;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DCX
 */
public class korisniciTableModel extends AbstractTableModel{
    
    List<Radnik> ulogovaniRadnici;
     String [] columns = new String[]{"Ime"};

    public korisniciTableModel() {
        this.ulogovaniRadnici = new ArrayList<>();
    }

    public List<Radnik> getUlogovaniRadnici() {
        return ulogovaniRadnici;
    }

    public void setUlogovaniRadnici(List<Radnik> ulogovaniRadnici) {
        this.ulogovaniRadnici = ulogovaniRadnici;
        fireTableDataChanged();
    }
     
     

    @Override
    public int getRowCount() {
        return ulogovaniRadnici.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Radnik r = ulogovaniRadnici.get(row);
        switch(column) {
            case 0: return r.getImePrezime();
            default: return "n/a";
        }
    }

    @Override
    public String getColumnName(int i) {
       return columns[i];
    }
    
    public void add(Radnik r) {
        ulogovaniRadnici.add(r);
         fireTableDataChanged();
    }
}
