/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.models;

import com.orca.domain.Zaduzenje;
import com.orca.utility.UtilityZaduzenja;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DCX
 */
public class TableZaduzenjaModel extends AbstractTableModel{
    
    List<UtilityZaduzenja> zaduzenja;
    String[] columns = {"Clan","Knjiga","Radnik Zadužio","Radnik Razdužio","Datum zaduženja","Datum Razduženja"};

    public TableZaduzenjaModel() {
        zaduzenja = new ArrayList<>();
    }

    public List<UtilityZaduzenja> getZaduzenja() {
        return zaduzenja;
    }

    public void setZaduzenja(List<UtilityZaduzenja> zaduzenja) {
        this.zaduzenja = zaduzenja;
        fireTableDataChanged();
    }
    
    
    
    

    @Override
    public int getRowCount() {
        return zaduzenja.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
      UtilityZaduzenja uz = zaduzenja.get(row);
      
      switch(column) {
          case 0: return uz.getClan();
          case 1: return uz.getKnjiga();
          case 2: return uz.getRadnikZaduzio();
          case 3: return uz.getRadnikRazduzio();
          case 4: return uz.getDatumZaduzenja();
          case 5: return uz.getDatumRazduzenja();
          default: return "/";
      }
    }

    @Override
    public String getColumnName(int i) {
        return columns[i];
    }
    
    
    
}
