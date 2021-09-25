/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.models;

import com.orca.domain.Knjiga;
import com.orca.utility.UtilityKnjige;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DCX
 */
public class TableKnjigeModel extends AbstractTableModel{
    
    List<UtilityKnjige> knjige;
    String[] columns = {"Naziv", "Autor","Izdavac","Žanr","Izdanje","Broj primeraka"};

    public TableKnjigeModel() {
        knjige = new ArrayList<>();
    }

    public List<UtilityKnjige> getKnjige() {
        return knjige;
    }

    public void setKnjige(List<UtilityKnjige> knjige) {
        this.knjige = knjige;
        fireTableDataChanged();
    }
    
    
    
    

    @Override
    public int getRowCount() {
        return knjige.size();
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
