package interfaces;

import entidades.Baleia.Alimentação;

public class PainelFiltrosBaleia extends javax.swing.JPanel {
    
    public PainelFiltrosBaleia() {
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
    
   
     public void limparFiltros(){
        idadeTextField.setText("");
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alimentaçãoButtonGroup = new javax.swing.ButtonGroup();
        idadeLabel = new javax.swing.JLabel();
        idadeTextField = new javax.swing.JTextField();

        idadeLabel.setText("Idade Minima");

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
                    .addGap(19, 147, Short.MAX_VALUE)
                    .addComponent(idadeLabel)
                    .addGap(74, 74, 74)
                    .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 60, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(idadeLabel))
                        .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 200, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup alimentaçãoButtonGroup;
    private javax.swing.JLabel idadeLabel;
    private javax.swing.JTextField idadeTextField;
    // End of variables declaration//GEN-END:variables
}
