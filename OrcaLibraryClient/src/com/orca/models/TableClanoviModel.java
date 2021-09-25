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
        return null;
    }

    @Override
    public String getColumnName(int i) {
        return columns[i];
    }
    
    
    
}
