package interfaces;

import entidades.Baleia.Alimentação;

public class PainelBaleia extends javax.swing.JPanel {
    
    public PainelBaleia() {
        initComponents();
    }

    public int getIdade() {
        String idade = idadeTextField.getText();
        if (idade.isEmpty()) return 0;    
        else return Integer.parseInt(idade);
    }
    public void setIdade(int idade) {
        idadeTextField.setText(idade + "");
    }
    public Alimentação getAlimentação() {
        Alimentação alimentação = null;
        if (alimentaçãoButtonGroup.getSelection() != null)
        alimentação = Alimentação.values()[alimentaçãoButtonGroup.getSelection().getMnemonic()];
        return alimentação;
    }
    
    public void setAlimentação(int índice_alimentação) {
        switch(índice_alimentação) {
            case 0: carnivoroRadioButton.setSelected(true); break;
            case 1: herbivoroRadioButton.setSelected(true);
            
        }
    }
     public void limparcampos(){
        alimentaçãoButtonGroup.clearSelection();
        idadeTextField.setText("");
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alimentaçãoButtonGroup = new javax.swing.ButtonGroup();
        idadeLabel = new javax.swing.JLabel();
        alimentaçãoLabel = new javax.swing.JLabel();
        herbivoroRadioButton = new javax.swing.JRadioButton();
        carnivoroRadioButton = new javax.swing.JRadioButton();
        idadeTextField = new javax.swing.JTextField();

        idadeLabel.setText("Idade");

        alimentaçãoLabel.setText("Alimentação");

        alimentaçãoButtonGroup.add(herbivoroRadioButton);
        herbivoroRadioButton.setMnemonic('\u0001');
        herbivoroRadioButton.setText("Herbivoro");

        alimentaçãoButtonGroup.add(carnivoroRadioButton);
        carnivoroRadioButton.setText("Carnivoro");
        carnivoroRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carnivoroRadioButtonActionPerformed(evt);
            }
        });

        idadeTextField.setMaximumSize(new java.awt.Dimension(100, 40));
        idadeTextField.setMinimumSize(new java.awt.Dimension(100, 40));
        idadeTextField.setPreferredSize(new java.awt.Dimension(100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(idadeLabel)
                            .addGap(74, 74, 74)
                            .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(alimentaçãoLabel)
                            .addGap(55, 55, 55)
                            .addComponent(carnivoroRadioButton)
                            .addGap(72, 72, 72)
                            .addComponent(herbivoroRadioButton)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(idadeLabel))
                        .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(alimentaçãoLabel))
                        .addComponent(carnivoroRadioButton)
                        .addComponent(herbivoroRadioButton))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void carnivoroRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carnivoroRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carnivoroRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup alimentaçãoButtonGroup;
    private javax.swing.JLabel alimentaçãoLabel;
    private javax.swing.JRadioButton carnivoroRadioButton;
    private javax.swing.JRadioButton herbivoroRadioButton;
    private javax.swing.JLabel idadeLabel;
    private javax.swing.JTextField idadeTextField;
    // End of variables declaration//GEN-END:variables
}
