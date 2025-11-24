package interfaces;

import entidades.Tubarão.TipoDente;

public class PainelFiltrosTubarão extends javax.swing.JPanel {
    
    public PainelFiltrosTubarão() {
        initComponents();
    }

    public TipoDente getTipoDente() {
        TipoDente tipo_dente = null;
        if (tipodenteButtonGroup.getSelection() != null)
        tipo_dente = TipoDente.values()[tipodenteButtonGroup.getSelection().getMnemonic()];
        return tipo_dente;
    }
    
    public void setTipoDente(int índice_tipo_dente) {
        switch(índice_tipo_dente) {
            case 0: serrilhadoRadioButton.setSelected(true); break;
            case 1: lisoRadioButton.setSelected(true);
            
        }
    }
     public void limparFiltros(){
        tipodenteButtonGroup.clearSelection();
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipodenteButtonGroup = new javax.swing.ButtonGroup();
        serrilhadoRadioButton = new javax.swing.JRadioButton();
        tipodenteLabel = new javax.swing.JLabel();
        lisoRadioButton = new javax.swing.JRadioButton();

        tipodenteButtonGroup.add(serrilhadoRadioButton);
        serrilhadoRadioButton.setText("Serrilhado");
        serrilhadoRadioButton.setActionCommand("");

        tipodenteLabel.setText("Tipo de Dente");

        tipodenteButtonGroup.add(lisoRadioButton);
        lisoRadioButton.setMnemonic('\u0001');
        lisoRadioButton.setText("Liso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(tipodenteLabel)
                .addGap(18, 18, 18)
                .addComponent(serrilhadoRadioButton)
                .addGap(29, 29, 29)
                .addComponent(lisoRadioButton)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serrilhadoRadioButton)
                    .addComponent(tipodenteLabel)
                    .addComponent(lisoRadioButton))
                .addGap(159, 159, 159))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton lisoRadioButton;
    private javax.swing.JRadioButton serrilhadoRadioButton;
    private javax.swing.ButtonGroup tipodenteButtonGroup;
    private javax.swing.JLabel tipodenteLabel;
    // End of variables declaration//GEN-END:variables
}
