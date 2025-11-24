package interfaces;

import controles.ControladorCadastroAtrações;
import javax.swing.JOptionPane;
import controles.ControladorCadastroAquarios;
import entidades.Aquario;
import entidades.Aquario.Cidade;
import entidades.Atração;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;


public class JanelaCadastroAquarios extends javax.swing.JFrame {
    
    ControladorCadastroAquarios controlador;
    Aquario[] aquarios_cadastrados;
    DefaultListModel modelo_atrações;
    
    public JanelaCadastroAquarios(ControladorCadastroAquarios controlador) {
        this.controlador = controlador;
        aquarios_cadastrados = Aquario.getVisões();
        initComponents();
        modelo_atrações = (DefaultListModel)atraçõesList.getModel();
        limparcampos(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        tipoButtonGroup = new javax.swing.ButtonGroup();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        AtraçõesLabel = new javax.swing.JLabel();
        cidadeLabel = new javax.swing.JLabel();
        aquarioscadastradosLabel = new javax.swing.JLabel();
        aquarioscadastradosComboBox = new javax.swing.JComboBox<>();
        comandosPanel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        atraçõesButton = new javax.swing.JButton();
        sequencialLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atraçõesList = new javax.swing.JList<>();
        sequencialTextField = new javax.swing.JTextField();
        cidadeComboBox = new javax.swing.JComboBox<>();
        cadeiranteCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Aquarios");
        setMaximumSize(new java.awt.Dimension(650, 500));
        setMinimumSize(new java.awt.Dimension(650, 500));
        setPreferredSize(new java.awt.Dimension(650, 500));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        nomeLabel.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 92, 7, 0);
        getContentPane().add(nomeLabel, gridBagConstraints);

        nomeTextField.setColumns(50);
        nomeTextField.setMaximumSize(new java.awt.Dimension(300, 40));
        nomeTextField.setMinimumSize(new java.awt.Dimension(300, 40));
        nomeTextField.setPreferredSize(new java.awt.Dimension(300, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 237;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 7, 0);
        getContentPane().add(nomeTextField, gridBagConstraints);

        AtraçõesLabel.setText("Atrações do Aquario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 97, 7, 0);
        getContentPane().add(AtraçõesLabel, gridBagConstraints);

        cidadeLabel.setText("Cidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(14, 25, 7, 0);
        getContentPane().add(cidadeLabel, gridBagConstraints);

        aquarioscadastradosLabel.setText("Aquarios Cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(29, 20, 7, 0);
        getContentPane().add(aquarioscadastradosLabel, gridBagConstraints);

        aquarioscadastradosComboBox.setMaximumRowCount(8);
        aquarioscadastradosComboBox.setModel(new DefaultComboBoxModel (aquarios_cadastrados));
        aquarioscadastradosComboBox.setMaximumSize(new java.awt.Dimension(200, 50));
        aquarioscadastradosComboBox.setMinimumSize(new java.awt.Dimension(200, 50));
        aquarioscadastradosComboBox.setPreferredSize(new java.awt.Dimension(200, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 12, 7, 0);
        getContentPane().add(aquarioscadastradosComboBox, gridBagConstraints);

        comandosPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirAquario(evt);
            }
        });
        comandosPanel.add(inserirButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAquario(evt);
            }
        });
        comandosPanel.add(consultarButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarAquario(evt);
            }
        });
        comandosPanel.add(alterarButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAquario(evt);
            }
        });
        comandosPanel.add(removerButton);

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparcampos(evt);
            }
        });
        comandosPanel.add(limparButton);

        atraçõesButton.setText("Atrações");
        atraçõesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAtrações(evt);
            }
        });
        comandosPanel.add(atraçõesButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 7, 6);
        getContentPane().add(comandosPanel, gridBagConstraints);

        sequencialLabel.setText("Identificador Sequencial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 3, 7, 0);
        getContentPane().add(sequencialLabel, gridBagConstraints);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(200, 100));

        atraçõesList.setModel(new DefaultListModel());
        atraçõesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        atraçõesList.setMinimumSize(new java.awt.Dimension(46, 20));
        atraçõesList.setVisibleRowCount(4);
        jScrollPane1.setViewportView(atraçõesList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 7, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        sequencialTextField.setEditable(false);
        sequencialTextField.setMinimumSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 7, 0);
        getContentPane().add(sequencialTextField, gridBagConstraints);

        cidadeComboBox.setModel(new DefaultComboBoxModel (Cidade.values()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 7, 0);
        getContentPane().add(cidadeComboBox, gridBagConstraints);

        cadeiranteCheckBox.setText("acessível a cadeirantes");
        cadeiranteCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(14, 25, 7, 0);
        getContentPane().add(cadeiranteCheckBox, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirAquario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirAquario
        Aquario aquario = obterAquarioInformada();
        String mensagem_erro = null;
        if(aquario != null) mensagem_erro = controlador.inserirAquario(aquario);
        else mensagem_erro = "Algum atributo da aquario nao foi encontrada";
        if (mensagem_erro == null){
            int sequencial = Aquario.últimoSequencial();
            aquario.setSequencial(sequencial);
            Aquario visão = aquario.getVisão();
            aquarioscadastradosComboBox.setSelectedItem(visão);
            aquarioscadastradosComboBox.addItem(visão);
            sequencialTextField.setText ("" + sequencial);
        }else informarErro (mensagem_erro);
    }//GEN-LAST:event_inserirAquario

    private void consultarAquario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAquario
        Aquario visão = (Aquario) aquarioscadastradosComboBox.getSelectedItem ();
        Aquario aquario = null;
        String mensagem_erro = null;
        int sequencial = -1;
        if (visão != null) {
            sequencial = visão.getSequencial();
            aquario = Aquario.buscarAquario(visão.getSequencial());
            if (aquario == null) mensagem_erro = "Aquario não cadastrado";
        } else mensagem_erro = "Nenhuma aquario selecionada";
        if (mensagem_erro == null) {
            sequencialTextField.setText(sequencial + "");
            nomeTextField.setText(aquario.getNome());
            cidadeComboBox.setSelectedItem(aquario.getCidade());
            atualizarListaAtrações(sequencial);
        } else informarErro (mensagem_erro);
    }//GEN-LAST:event_consultarAquario

    private void removerAquario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAquario

        Aquario visão = (Aquario) aquarioscadastradosComboBox.getSelectedItem();
        String mensagem_erro = null;
        if (visão != null) mensagem_erro = controlador.removerAquario(visão.getSequencial());
        else mensagem_erro = "Nenhum aquario selecionado";
        if (mensagem_erro == null) {
            aquarioscadastradosComboBox.removeItem(visão);
            limparcampos(evt);
        } else informarErro (mensagem_erro);

    }//GEN-LAST:event_removerAquario

    private void limparcampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparcampos
        sequencialTextField.setText("");
        nomeTextField.setText("");
        cidadeComboBox.setSelectedIndex(-1);
        modelo_atrações.clear();
        cadeiranteCheckBox.setSelected(false);
    }//GEN-LAST:event_limparcampos

    private void alterarAquario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarAquario
        Aquario aquario = obterAquarioInformada();
        String mensagem_erro = null;
        if (aquario != null) mensagem_erro = controlador.alterarAquario(aquario);
        else mensagem_erro = "Algum atributo da aquario não foi informado";
        if (mensagem_erro == null) {
        Aquario visão = getVisãoAlterada(aquario.getSequencial());
        if (visão != null) {
            visão.setNome(aquario.getNome());
            aquarioscadastradosComboBox.setSelectedItem(visão);
            aquarioscadastradosComboBox.updateUI();
        }
        } else informarErro (mensagem_erro);
    }//GEN-LAST:event_alterarAquario

    private void cadastrarAtrações(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAtrações
        String sequencial_str = sequencialTextField.getText();
        int sequencial = 0;
        if (!sequencial_str.isEmpty()) sequencial = Integer.parseInt(sequencial_str);
        if (sequencial > 0) new ControladorCadastroAtrações(this, sequencial);
        else informarErro ("Nenhuma atração selecionada");
    }//GEN-LAST:event_cadastrarAtrações
    
    private Aquario getVisãoAlterada(int sequencial) {
        for (Aquario visão : aquarios_cadastrados) {
            if (visão.getSequencial()==(sequencial)) return visão;
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtraçõesLabel;
    private javax.swing.JButton alterarButton;
    private javax.swing.JComboBox<Aquario> aquarioscadastradosComboBox;
    private javax.swing.JLabel aquarioscadastradosLabel;
    private javax.swing.JButton atraçõesButton;
    private javax.swing.JList<String> atraçõesList;
    private javax.swing.JCheckBox cadeiranteCheckBox;
    private javax.swing.JComboBox<Cidade> cidadeComboBox;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JButton inserirButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparButton;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton removerButton;
    private javax.swing.JLabel sequencialLabel;
    private javax.swing.JTextField sequencialTextField;
    private javax.swing.ButtonGroup tipoButtonGroup;
    // End of variables declaration//GEN-END:variables

    private Aquario obterAquarioInformada() {
        String sequencial_str = sequencialTextField.getText();
        int sequencial = 0;
        if (!sequencial_str.isEmpty()) sequencial = Integer.parseInt(sequencial_str);
        String nome = nomeTextField.getText();
        if (nome.isEmpty()) return null;
        Cidade cidade = null;
        if (cidadeComboBox.getSelectedItem() != null)
            cidade = (Cidade)cidadeComboBox.getSelectedItem();
        else return null;
        boolean cadeirante = cadeiranteCheckBox.isSelected();
        return new Aquario(sequencial, nome, cidade, cadeirante);
    }
    
    private void informarErro (String mensagem) {
        JOptionPane.showMessageDialog (this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    void atualizarListaAtrações(int sequencial) {
        modelo_atrações.clear();
        Atração[] atrações = Atração.buscarAtrações(sequencial);
        for (Atração atração : atrações) modelo_atrações.addElement(atração);
    }
}
