/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orca.view;

import com.orca.domain.Radnik;
import com.orca.session.Session;
import com.orca.view.controller.FrmMainController;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author DCX
 */
public class FrmMain extends javax.swing.JFrame implements WindowListener{

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Pocetna Stranica");
        
       
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblCitat = new javax.swing.JLabel();
        btnNoviCitat = new javax.swing.JButton();
        lblIMG = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUlogovaniRadnik = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuKnjige = new javax.swing.JMenu();
        miKnjigePregled = new javax.swing.JMenuItem();
        miKnjigeNovo = new javax.swing.JMenuItem();
        menuClanovi = new javax.swing.JMenu();
        miClanoviPregled = new javax.swing.JMenuItem();
        miClanoviNovo = new javax.swing.JMenuItem();
        menuZaduzenje = new javax.swing.JMenu();
        miZaduzenjaPregled = new javax.swing.JMenuItem();
        miZaduzenjaNovo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Citat dana:");

        lblCitat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCitat.setForeground(new java.awt.Color(102, 102, 102));

        btnNoviCitat.setText("Novi citat");

        lblIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\DCX\\Desktop\\Projekat Orca\\orcaLogo.PNG")); // NOI18N

        btnLogOut.setText("Izloguj se");

        jLabel2.setText("Radnik:");

        lblUlogovaniRadnik.setForeground(new java.awt.Color(255, 0, 51));

        menuKnjige.setText("Knjige");

        miKnjigePregled.setText("Pregled");
        menuKnjige.add(miKnjigePregled);

        miKnjigeNovo.setText("Novo");
        menuKnjige.add(miKnjigeNovo);

        jMenuBar1.add(menuKnjige);

        menuClanovi.setText("Clanovi");

        miClanoviPregled.setText("Pregled");
        menuClanovi.add(miClanoviPregled);

        miClanoviNovo.setText("Novo");
        menuClanovi.add(miClanoviNovo);

        jMenuBar1.add(menuClanovi);

        menuZaduzenje.setText("Zaduzenja");

        miZaduzenjaPregled.setText("Pregled");
        menuZaduzenje.add(miZaduzenjaPregled);

        miZaduzenjaNovo.setText("Novo");
        menuZaduzenje.add(miZaduzenjaNovo);

        jMenuBar1.add(menuZaduzenje);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnNoviCitat))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCitat, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnLogOut)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblUlogovaniRadnik, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lblUlogovaniRadnik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnNoviCitat)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCitat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnNoviCitat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCitat;
    private javax.swing.JLabel lblIMG;
    private javax.swing.JLabel lblUlogovaniRadnik;
    private javax.swing.JMenu menuClanovi;
    private javax.swing.JMenu menuKnjige;
    private javax.swing.JMenu menuZaduzenje;
    private javax.swing.JMenuItem miClanoviNovo;
    private javax.swing.JMenuItem miClanoviPregled;
    private javax.swing.JMenuItem miKnjigeNovo;
    private javax.swing.JMenuItem miKnjigePregled;
    private javax.swing.JMenuItem miZaduzenjaNovo;
    private javax.swing.JMenuItem miZaduzenjaPregled;
    // End of variables declaration//GEN-END:variables

    public void btnNoviCitatAddActionListener(ActionListener actionListener) {
        btnNoviCitat.addActionListener(actionListener);
    }

    public void btnLogOutAddActionListener(ActionListener actionListener) {
        btnLogOut.addActionListener(actionListener);
    }

    public void miKnjigePregledAddActionListener(ActionListener actionListener) {
        miKnjigePregled.addActionListener(actionListener);
    }

    public void miKnjigeNovoAddActionListener(ActionListener actionListener) {
        miKnjigeNovo.addActionListener(actionListener);
    }

    public void miClanoviPregledAddActionListener(ActionListener actionListener) {
        miClanoviPregled.addActionListener(actionListener);
    }

    public void miClanoviNovoAddActionListener(ActionListener actionListener) {
        miClanoviNovo.addActionListener(actionListener);
    }

    public void miZaduzenjePregledAddActionListener(ActionListener actionListener) {
        miZaduzenjaPregled.addActionListener(actionListener);
    }

    public void miZaduzenjeNovoAddActionListener(ActionListener actionListener) {
        miZaduzenjaNovo.addActionListener(actionListener);
    }

    @Override
    public void windowOpened(WindowEvent we) {
        Radnik radnik = (Radnik) Session.getInstance().getParams().get("radnik");
        lblUlogovaniRadnik.setText(radnik.getImePrezime());
    }

    @Override
    public void windowClosing(WindowEvent we) {
       
    }

    @Override
    public void windowClosed(WindowEvent we) {
        
    }

    @Override
    public void windowIconified(WindowEvent we) {
       
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        
    }

    @Override
    public void windowActivated(WindowEvent we) {
       
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        
    }

    public JLabel getLblUlogovaniRadnik() {
        return lblUlogovaniRadnik;
    }

    public JLabel getLblCitat() {
        return lblCitat;
    }

    

    
}
