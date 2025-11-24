
package interfaces;

import entidades.AnimalAquatico.Habitat;
import entidades.Aquario.Cidade;
import entidades.Escola.Tipo;
import entidades.Passeio;
import entidades.Passeio.Locomoção;
import entidades.Tubarão.TipoDente;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;


public class JanelaPesquisaPasseios extends javax.swing.JFrame {
    PainelFiltrosBaleia animal_baleiaPainel;
    PainelFiltrosTubarão animal_tubarãoPainel;
    
    public JanelaPesquisaPasseios() {
        initComponents();
        animal_baleiaPainel = new PainelFiltrosBaleia();
        animal_tubarãoPainel = new PainelFiltrosTubarão();
        especie_animalaquaticoTabbedPane.addTab("Baleia",
        animal_baleiaPainel);
        especie_animalaquaticoTabbedPane.addTab("Tubarão",
        animal_tubarãoPainel);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        habitatbuttonGroup = new javax.swing.ButtonGroup();
        tipobuttonGroup = new javax.swing.ButtonGroup();
        locomocaobuttonGroup = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        pesoLabel = new javax.swing.JLabel();
        marRadioButton = new javax.swing.JRadioButton();
        oceanoRadioButton = new javax.swing.JRadioButton();
        agua_doceRadioButton = new javax.swing.JRadioButton();
        habitatLabel = new javax.swing.JLabel();
        pesoTextField = new javax.swing.JTextField();
        especie_animalaquaticoTabbedPane = new javax.swing.JTabbedPane();
        todos_animaisCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        cidadeComboBox = new javax.swing.JComboBox<>();
        cidadeLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nalunosTextField = new javax.swing.JTextField();
        nalunosLabel = new javax.swing.JLabel();
        tipoLabel = new javax.swing.JLabel();
        publicaRadioButton = new javax.swing.JRadioButton();
        particularRadioButton = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        limparpesquisaButton = new javax.swing.JButton();
        limparfiltrosButton = new javax.swing.JButton();
        pesquisarButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pesquisasTextArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        LocomoçãoLabel = new javax.swing.JLabel();
        ÔnibusRadioButton = new javax.swing.JRadioButton();
        AviãoRadioButton = new javax.swing.JRadioButton();
        EscolasCadastradasLabel1 = new javax.swing.JLabel();
        data_mínima_avaliaçãoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pesoLabel.setText("Peso");

        habitatbuttonGroup.add(marRadioButton);
        marRadioButton.setText("Mar");

        habitatbuttonGroup.add(oceanoRadioButton);
        oceanoRadioButton.setMnemonic('\u0002');
        oceanoRadioButton.setText("oceano");

        habitatbuttonGroup.add(agua_doceRadioButton);
        agua_doceRadioButton.setMnemonic('\u0001');
        agua_doceRadioButton.setText("agua doce");

        habitatLabel.setText("Habitat");

        pesoTextField.setColumns(50);
        pesoTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pesoTextField.setMaximumSize(new java.awt.Dimension(100, 40));
        pesoTextField.setMinimumSize(new java.awt.Dimension(100, 40));
        pesoTextField.setPreferredSize(new java.awt.Dimension(100, 40));

        todos_animaisCheckBox.setText("todos animais");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pesoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(habitatLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agua_doceRadioButton)
                        .addGap(43, 43, 43)
                        .addComponent(oceanoRadioButton)
                        .addGap(43, 43, 43)
                        .addComponent(marRadioButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(todos_animaisCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(especie_animalaquaticoTabbedPane)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(especie_animalaquaticoTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(pesoLabel)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(pesoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agua_doceRadioButton)
                            .addComponent(oceanoRadioButton)
                            .addComponent(marRadioButton)
                            .addComponent(habitatLabel))
                        .addGap(18, 18, 18)
                        .addComponent(todos_animaisCheckBox)))
                .addGap(15, 15, 15))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cidadeComboBox.setModel(new DefaultComboBoxModel (Cidade.values()));

        cidadeLabel.setText("Cidade");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cidadeLabel)
                .addGap(18, 18, 18)
                .addComponent(cidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLabel))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nalunosTextField.setColumns(50);
        nalunosTextField.setMinimumSize(new java.awt.Dimension(50, 50));
        nalunosTextField.setPreferredSize(new java.awt.Dimension(456, 70));

        nalunosLabel.setText("Numero de Alunos");

        tipoLabel.setText("Tipo");

        tipobuttonGroup.add(publicaRadioButton);
        publicaRadioButton.setText("Publica");

        tipobuttonGroup.add(particularRadioButton);
        particularRadioButton.setMnemonic('\u0001');
        particularRadioButton.setText("Particular");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tipoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(publicaRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(particularRadioButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nalunosLabel)
                        .addGap(18, 18, 18)
                        .addComponent(nalunosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLabel)
                    .addComponent(publicaRadioButton)
                    .addComponent(particularRadioButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nalunosLabel)
                    .addComponent(nalunosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        limparpesquisaButton.setText("Liimpar Pesquisa");
        limparpesquisaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparPesquisa(evt);
            }
        });

        limparfiltrosButton.setText("Limpar Filtros");
        limparfiltrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparFiltros(evt);
            }
        });

        pesquisarButton.setText("Pesquisar");
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pesquisarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limparfiltrosButton)
                .addGap(30, 30, 30)
                .addComponent(limparpesquisaButton)
                .addGap(15, 15, 15))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarButton)
                    .addComponent(limparfiltrosButton)
                    .addComponent(limparpesquisaButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jPanel5, gridBagConstraints);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pesquisasTextArea.setEditable(false);
        pesquisasTextArea.setColumns(20);
        pesquisasTextArea.setRows(5);
        jScrollPane1.setViewportView(pesquisasTextArea);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jPanel6, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LocomoçãoLabel.setText("Locomoção");

        locomocaobuttonGroup.add(ÔnibusRadioButton);
        ÔnibusRadioButton.setText("Ônibus");
        ÔnibusRadioButton.setMaximumSize(new java.awt.Dimension(100, 22));
        ÔnibusRadioButton.setMinimumSize(new java.awt.Dimension(100, 22));
        ÔnibusRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÔnibusRadioButtonActionPerformed(evt);
            }
        });

        locomocaobuttonGroup.add(AviãoRadioButton);
        AviãoRadioButton.setMnemonic('\u0001');
        AviãoRadioButton.setText("Avião");
        AviãoRadioButton.setMaximumSize(new java.awt.Dimension(100, 22));
        AviãoRadioButton.setMinimumSize(new java.awt.Dimension(100, 22));
        AviãoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AviãoRadioButtonActionPerformed(evt);
            }
        });

        EscolasCadastradasLabel1.setText("Data/Hora minima");

        data_mínima_avaliaçãoTextField.setMaximumSize(new java.awt.Dimension(100, 22));
        data_mínima_avaliaçãoTextField.setMinimumSize(new java.awt.Dimension(100, 22));
        data_mínima_avaliaçãoTextField.setPreferredSize(new java.awt.Dimension(100, 22));
        data_mínima_avaliaçãoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_mínima_avaliaçãoTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LocomoçãoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ÔnibusRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AviãoRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(EscolasCadastradasLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(data_mínima_avaliaçãoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EscolasCadastradasLabel1)
                    .addComponent(data_mínima_avaliaçãoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ÔnibusRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocomoçãoLabel)
                    .addComponent(AviãoRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jPanel4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
    Tipo tipo_escola = null;
    if (tipobuttonGroup.getSelection() != null) {
        tipo_escola = Tipo.values()[tipobuttonGroup.getSelection().getMnemonic()];
    }

    int minimo_nalunos = 0;
    if (!nalunosTextField.getText().isEmpty()) {
        minimo_nalunos = Integer.parseInt(nalunosTextField.getText());
    }

    Cidade cidade = null;
    if (cidadeComboBox.getSelectedItem() != null) {
        cidade = (Cidade) cidadeComboBox.getSelectedItem();
    }


    Habitat habitat = null;
    if (habitatbuttonGroup.getSelection() != null) {
        habitat = Habitat.values()[habitatbuttonGroup.getSelection().getMnemonic()];
    }


    int minimo_peso = 0;
    if (!pesoTextField.getText().isEmpty()) {
        minimo_peso = Integer.parseInt(pesoTextField.getText());
    }

    Locomoção locomocao = null;
    if (locomocaobuttonGroup.getSelection() != null) {
        locomocao = Locomoção.values()[locomocaobuttonGroup.getSelection().getMnemonic()];
    }

    Timestamp data_minima = getDataMinima();
    boolean todos_animais = todos_animaisCheckBox.isSelected();
    int idade_minima = 0;
    TipoDente tipo_dente = null;
    int indice_aba_secionada = especie_animalaquaticoTabbedPane.getSelectedIndex();
    if (indice_aba_secionada == 0) {
        idade_minima = animal_baleiaPainel.getIdade();
    } else if (indice_aba_secionada == 1) {
        tipo_dente = animal_tubarãoPainel.getTipoDente();
    }
    
    ArrayList<Passeio> passeios = Passeio.pesquisarPasseios(
        tipo_escola, minimo_nalunos,
        cidade, habitat,todos_animais,
        minimo_peso, locomocao, data_minima,
        idade_minima, tipo_dente);
    
    mostrarPasseiosSelecionadas(passeios);

    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void ÔnibusRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÔnibusRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ÔnibusRadioButtonActionPerformed

    private void AviãoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AviãoRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AviãoRadioButtonActionPerformed

    private void data_mínima_avaliaçãoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_mínima_avaliaçãoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_mínima_avaliaçãoTextFieldActionPerformed

    private void limparPesquisa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparPesquisa
        pesquisasTextArea.setText("");
    }//GEN-LAST:event_limparPesquisa

    private void limparFiltros(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparFiltros
        habitatbuttonGroup.clearSelection();
        tipobuttonGroup.clearSelection();
        cidadeComboBox.setSelectedIndex(-1);
        pesoTextField.setText("");
        nalunosTextField.setText("");
        locomocaobuttonGroup.clearSelection();
        data_mínima_avaliaçãoTextField.setText("");
        animal_tubarãoPainel.limparFiltros();
        animal_baleiaPainel.limparFiltros();
    }//GEN-LAST:event_limparFiltros

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AviãoRadioButton;
    private javax.swing.JLabel EscolasCadastradasLabel1;
    private javax.swing.JLabel LocomoçãoLabel;
    private javax.swing.JRadioButton agua_doceRadioButton;
    private javax.swing.JComboBox<Cidade> cidadeComboBox;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JTextField data_mínima_avaliaçãoTextField;
    private javax.swing.JTabbedPane especie_animalaquaticoTabbedPane;
    private javax.swing.JLabel habitatLabel;
    private javax.swing.ButtonGroup habitatbuttonGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparfiltrosButton;
    private javax.swing.JButton limparpesquisaButton;
    private javax.swing.ButtonGroup locomocaobuttonGroup;
    private javax.swing.JRadioButton marRadioButton;
    private javax.swing.JLabel nalunosLabel;
    private javax.swing.JTextField nalunosTextField;
    private javax.swing.JRadioButton oceanoRadioButton;
    private javax.swing.JRadioButton particularRadioButton;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JTextField pesoTextField;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JTextArea pesquisasTextArea;
    private javax.swing.JRadioButton publicaRadioButton;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.ButtonGroup tipobuttonGroup;
    private javax.swing.JCheckBox todos_animaisCheckBox;
    private javax.swing.JRadioButton ÔnibusRadioButton;
    // End of variables declaration//GEN-END:variables
    private Timestamp getDataMinima() {
        Timestamp data_mínima = null;
        String data_mínima_str = data_mínima_avaliaçãoTextField.getText();
        if (!data_mínima_str.isEmpty()) {
            String[] data_mínima_partes = data_mínima_str.toString().split("/");
            String dia = data_mínima_partes[0];
            String mês = data_mínima_partes[1];
            String ano = data_mínima_partes[2];
            if ((dia.length() == 2) && (mês.length() == 2) && (ano.length() == 4)) {
                data_mínima_str = ano + "-" + mês + "-" + dia + " 00:00:00";
                data_mínima = Timestamp.valueOf(data_mínima_str);
            }
        }
        return data_mínima;
    }

    private void mostrarPasseiosSelecionadas(ArrayList<Passeio> passeios) {
        boolean primeiro_passeio = true;
        for (Passeio passeio : passeios) {
        if (primeiro_passeio) {
        pesquisasTextArea.append(passeio.toStringFull());
        primeiro_passeio = false;
        } else pesquisasTextArea.append("\n   " + passeio.toStringFull());
        }
    }


}
