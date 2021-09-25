/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.models;

import com.orca.domain.Clan;
import com.orca.utility.UtilityClanovi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DCX
 */
public class TableClanoviModel extends AbstractTableModel{
    
    List<UtilityClanovi> clanovi;
    String[] columns = {"Ime", "Prezime", "Telefon", "Email","Zaduženje"};

    public TableClanoviModel() {
        clanovi = new ArrayList<>();
    }

    public List<UtilityClanovi> getClanovi() {
        return clanovi;
    }

    public void setClanovi(List<UtilityClanovi> clanovi) {
        this.clanovi = clanovi;
        fireTableDataChanged();
    }
    
    
    
    

    @Override
    public int getRowCount() {
        return clanovi.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        UtilityClanovi uc = clanovi.get(row);
        
        switch(column) {
            case 0: return uc.getIme();
            case 1: return uc.getPrezime();
            case 2: return uc.getTelefon();
            case 3: return uc.getEmail();
            case 4: return uc.getZaduzenje();
            default: return "/";
        }
    }

    @Override
    public String getColumnName(int i) {
        return columns[i];
    }
    
    
    
}
