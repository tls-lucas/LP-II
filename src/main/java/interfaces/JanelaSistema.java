package interfaces;

import persistência.BD;
import javax.swing.JOptionPane;
import controles.ControladorCadastroAnimaisAquaticos;
import controles.ControladorCadastroAquarios;
import controles.ControladorCadastroEscolas;
import controles.ControladorCadastroPasseios;

public class JanelaSistema extends javax.swing.JFrame {

    public JanelaSistema() {
        BD.criaConexão();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passeiosMenuBar = new javax.swing.JMenuBar();
        escolaMenu = new javax.swing.JMenu();
        cadastrar_escolaMenuItem = new javax.swing.JMenuItem();
        animalaquaticoMenu = new javax.swing.JMenu();
        cadastrar_animalaquaticoMenuItem = new javax.swing.JMenuItem();
        aquarioMenu = new javax.swing.JMenu();
        cadastrar_aquarioMenuItem = new javax.swing.JMenuItem();
        passeioMenu = new javax.swing.JMenu();
        cadastrar_passeioMenuItem = new javax.swing.JMenuItem();
        pesquisar_passeioMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Passeios Escolares");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                terminarSistema(evt);
            }
        });

        escolaMenu.setText("Escola");

        cadastrar_escolaMenuItem.setText("Cadastrar");
        cadastrar_escolaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_escolaMenuItemActionPerformed(evt);
            }
        });
        escolaMenu.add(cadastrar_escolaMenuItem);

        passeiosMenuBar.add(escolaMenu);

        animalaquaticoMenu.setText("Animal Aquatico");

        cadastrar_animalaquaticoMenuItem.setText("Cadastrar");
        cadastrar_animalaquaticoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_animalaquaticoMenuItem(evt);
            }
        });
        animalaquaticoMenu.add(cadastrar_animalaquaticoMenuItem);

        passeiosMenuBar.add(animalaquaticoMenu);

        aquarioMenu.setText("Aquario");

        cadastrar_aquarioMenuItem.setText("Cadastrar");
        cadastrar_aquarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_aquarioMenuItem(evt);
            }
        });
        aquarioMenu.add(cadastrar_aquarioMenuItem);

        passeiosMenuBar.add(aquarioMenu);

        passeioMenu.setText("Passeio");

        cadastrar_passeioMenuItem.setText("Cadastrar");
        cadastrar_passeioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_passeioMenuItemActionPerformed(evt);
            }
        });
        passeioMenu.add(cadastrar_passeioMenuItem);

        pesquisar_passeioMenuItem.setText("Pesquisar");
        pesquisar_passeioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar_passeioMenuItemActionPerformed(evt);
            }
        });
        passeioMenu.add(pesquisar_passeioMenuItem);

        passeiosMenuBar.add(passeioMenu);

        setJMenuBar(passeiosMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void terminarSistema(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_terminarSistema
        BD.fechaConexão();
        System.exit(0);
    }//GEN-LAST:event_terminarSistema

    private void cadastrar_escolaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_escolaMenuItemActionPerformed
        new ControladorCadastroEscolas();
    }//GEN-LAST:event_cadastrar_escolaMenuItemActionPerformed

    private void cadastrar_animalaquaticoMenuItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_animalaquaticoMenuItem
        new ControladorCadastroAnimaisAquaticos();
    }//GEN-LAST:event_cadastrar_animalaquaticoMenuItem

    private void cadastrar_aquarioMenuItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_aquarioMenuItem
        new ControladorCadastroAquarios();
    }//GEN-LAST:event_cadastrar_aquarioMenuItem

    private void cadastrar_passeioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_passeioMenuItemActionPerformed
        new ControladorCadastroPasseios();
    }//GEN-LAST:event_cadastrar_passeioMenuItemActionPerformed

    private void pesquisar_passeioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_passeioMenuItemActionPerformed
        new JanelaPesquisaPasseios().setVisible(true);
    }//GEN-LAST:event_pesquisar_passeioMenuItemActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu animalaquaticoMenu;
    private javax.swing.JMenu aquarioMenu;
    private javax.swing.JMenuItem cadastrar_animalaquaticoMenuItem;
    private javax.swing.JMenuItem cadastrar_aquarioMenuItem;
    private javax.swing.JMenuItem cadastrar_escolaMenuItem;
    private javax.swing.JMenuItem cadastrar_passeioMenuItem;
    private javax.swing.JMenu escolaMenu;
    private javax.swing.JMenu passeioMenu;
    private javax.swing.JMenuBar passeiosMenuBar;
    private javax.swing.JMenuItem pesquisar_passeioMenuItem;
    // End of variables declaration//GEN-END:variables

  
}
