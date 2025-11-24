package interfaces;

import controles.ControladorCadastroPasseios;
import entidades.Aquario;
import entidades.Atração;
import entidades.Escola;
import entidades.Passeio;
import entidades.Passeio;
import entidades.Passeio.Locomoção;
import java.sql.Timestamp;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class JanelaCadastroPasseios extends javax.swing.JFrame {
    ControladorCadastroPasseios controlador;
    Escola[] escolas_cadastradas;
    Aquario[] aquarios_cadastrados;
    DefaultListModel modelo_lista_passeios;
    public JanelaCadastroPasseios(ControladorCadastroPasseios controlador) {
        this.controlador = controlador;
        escolas_cadastradas = Escola.getVisões();
        aquarios_cadastrados = Aquario.getVisões();
        initComponents();
        modelo_lista_passeios = (DefaultListModel)passeios_cadastradosList.getModel();
        inicializarListPasseios();
        limparcampos(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        LocomoçãobuttonGroup = new javax.swing.ButtonGroup();
        PasseiosCadastradosLabel = new javax.swing.JLabel();
        EscolasCadastradasLabel = new javax.swing.JLabel();
        AquariosCadastradosLabel = new javax.swing.JLabel();
        LocomoçãoLabel = new javax.swing.JLabel();
        comandosPanel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        AquarioCadastradoComboBox = new javax.swing.JComboBox<>();
        ÔnibusRadioButton = new javax.swing.JRadioButton();
        AviãoRadioButton = new javax.swing.JRadioButton();
        EscolaCadastradaComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        passeios_cadastradosList = new javax.swing.JList<>();
        data_horaTextField = new javax.swing.JTextField();
        sequencialTextField = new javax.swing.JTextField();
        EscolasCadastradasLabel1 = new javax.swing.JLabel();
        EscolasCadastradasLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Passeios");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        PasseiosCadastradosLabel.setText("Passeios Cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(58, 51, 0, 0);
        getContentPane().add(PasseiosCadastradosLabel, gridBagConstraints);

        EscolasCadastradasLabel.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 51, 0, 0);
        getContentPane().add(EscolasCadastradasLabel, gridBagConstraints);

        AquariosCadastradosLabel.setText("Aquario Cadastrado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(9, 51, 0, 0);
        getContentPane().add(AquariosCadastradosLabel, gridBagConstraints);

        LocomoçãoLabel.setText("Locomoção");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(31, 51, 0, 0);
        getContentPane().add(LocomoçãoLabel, gridBagConstraints);

        comandosPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirPasseio(evt);
            }
        });
        comandosPanel.add(inserirButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarPasseio(evt);
            }
        });
        comandosPanel.add(consultarButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarPasseio(evt);
            }
        });
        comandosPanel.add(alterarButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerPasseio(evt);
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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(59, 6, 14, 6);
        getContentPane().add(comandosPanel, gridBagConstraints);

        AquarioCadastradoComboBox.setModel(new DefaultComboBoxModel (aquarios_cadastrados));
        AquarioCadastradoComboBox.setMaximumSize(new java.awt.Dimension(100, 22));
        AquarioCadastradoComboBox.setMinimumSize(new java.awt.Dimension(100, 22));
        AquarioCadastradoComboBox.setPreferredSize(new java.awt.Dimension(100, 22));
        AquarioCadastradoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AquarioCadastradoComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(AquarioCadastradoComboBox, gridBagConstraints);

        LocomoçãobuttonGroup.add(ÔnibusRadioButton);
        ÔnibusRadioButton.setText("Ônibus");
        ÔnibusRadioButton.setMaximumSize(new java.awt.Dimension(100, 22));
        ÔnibusRadioButton.setMinimumSize(new java.awt.Dimension(100, 22));
        ÔnibusRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÔnibusRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 18, 0, 0);
        getContentPane().add(ÔnibusRadioButton, gridBagConstraints);

        LocomoçãobuttonGroup.add(AviãoRadioButton);
        AviãoRadioButton.setMnemonic('\u0001');
        AviãoRadioButton.setText("Avião");
        AviãoRadioButton.setMaximumSize(new java.awt.Dimension(100, 22));
        AviãoRadioButton.setMinimumSize(new java.awt.Dimension(100, 22));
        AviãoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AviãoRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -1;
        gridBagConstraints.insets = new java.awt.Insets(29, 12, 0, 0);
        getContentPane().add(AviãoRadioButton, gridBagConstraints);

        EscolaCadastradaComboBox.setModel(new DefaultComboBoxModel (escolas_cadastradas));
        EscolaCadastradaComboBox.setMaximumSize(new java.awt.Dimension(100, 22));
        EscolaCadastradaComboBox.setMinimumSize(new java.awt.Dimension(100, 22));
        EscolaCadastradaComboBox.setPreferredSize(new java.awt.Dimension(100, 22));
        EscolaCadastradaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscolaCadastradaComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        getContentPane().add(EscolaCadastradaComboBox, gridBagConstraints);

        passeios_cadastradosList.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(passeios_cadastradosList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.ipady = 114;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        data_horaTextField.setMaximumSize(new java.awt.Dimension(100, 22));
        data_horaTextField.setMinimumSize(new java.awt.Dimension(100, 22));
        data_horaTextField.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(data_horaTextField, gridBagConstraints);

        sequencialTextField.setEditable(false);
        sequencialTextField.setMaximumSize(new java.awt.Dimension(100, 22));
        sequencialTextField.setMinimumSize(new java.awt.Dimension(100, 22));
        sequencialTextField.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(sequencialTextField, gridBagConstraints);

        EscolasCadastradasLabel1.setText("Data/Hora");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 51, 0, 0);
        getContentPane().add(EscolasCadastradasLabel1, gridBagConstraints);

        EscolasCadastradasLabel2.setText("Escola Cadastrada");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 51, 0, 0);
        getContentPane().add(EscolasCadastradasLabel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirPasseio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirPasseio
        Passeio passeio = obtémPasseioInformada();
        String mensagem_erro = null;
        if(passeio != null) mensagem_erro = controlador.inserirPasseio(passeio);
        else mensagem_erro = "Algum atributo do passeio nao foi encontrada";
        if (mensagem_erro == null){
            int sequencial = Passeio.últimoSequencial();
            passeio.setSequencial(sequencial);
            modelo_lista_passeios.addElement(passeio.getVisão());
            passeios_cadastradosList.setSelectedIndex(modelo_lista_passeios.size() - 1);
            sequencialTextField.setText(""+sequencial);
            data_horaTextField.setText(Passeio.formatarDataHora(passeio.getDataHora().toString()));
        }else informarErro(mensagem_erro);
    }//GEN-LAST:event_inserirPasseio

    private void consultarPasseio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPasseio
        Passeio visão_passeio = (Passeio) passeios_cadastradosList.getSelectedValue();
        Passeio passeio = null;
        String mensagem_erro = null;
        if (visão_passeio != null) {
            passeio = Passeio.buscarPasseio (visão_passeio.getSequencial());
            if (passeio == null) mensagem_erro = "Passeio não cadastrado";
        } else mensagem_erro = "Nenhuma passeios selecionado";
        if (mensagem_erro == null) {
            sequencialTextField.setText(visão_passeio.getSequencial() + "");
            EscolaCadastradaComboBox.setSelectedItem(getVisãoEscolaSelecionada(passeio));
            EscolaCadastradaComboBox.updateUI();
            AquarioCadastradoComboBox.setSelectedItem(getVisãoAquarioSelecionado(passeio));
            AquarioCadastradoComboBox.updateUI();
            selecioneLocomoçãoRadioButton(passeio.getLocomoção().ordinal());
            data_horaTextField.setText(Passeio.formatarDataHora(passeio.getDataHora().toString()));
        } else informarErro (mensagem_erro);
    }//GEN-LAST:event_consultarPasseio

    private void alterarPasseio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarPasseio
        Passeio passeio = obtémPasseioInformada();
        String mensagem_erro = null;
        if (passeio != null) mensagem_erro = controlador.alterarPasseio(passeio);
        else mensagem_erro = "Algum atributo do passeio não foi informado";
        if (mensagem_erro != null) informarErro (mensagem_erro);
    }//GEN-LAST:event_alterarPasseio

    private void removerPasseio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerPasseio

        Passeio visão = (Passeio) passeios_cadastradosList.getSelectedValue();
        String mensagem_erro = null;
        if (visão != null) mensagem_erro = controlador.removerPasseio(visão.getSequencial());
        else mensagem_erro = "Nenhum passeio selecionado";
        if (mensagem_erro == null) {
            modelo_lista_passeios.removeElement(visão);
            limparcampos(evt);
        } else informarErro (mensagem_erro);

    }//GEN-LAST:event_removerPasseio

    private void limparcampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparcampos
        sequencialTextField.setText("");
        AquarioCadastradoComboBox.setSelectedIndex(-1);
        EscolaCadastradaComboBox.setSelectedIndex(-1);
        LocomoçãobuttonGroup.clearSelection();
        data_horaTextField.setText("");
    }//GEN-LAST:event_limparcampos

    private void AviãoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AviãoRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AviãoRadioButtonActionPerformed

    private void ÔnibusRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÔnibusRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ÔnibusRadioButtonActionPerformed

    private void EscolaCadastradaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscolaCadastradaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EscolaCadastradaComboBoxActionPerformed

    private void AquarioCadastradoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AquarioCadastradoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AquarioCadastradoComboBoxActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Aquario> AquarioCadastradoComboBox;
    private javax.swing.JLabel AquariosCadastradosLabel;
    private javax.swing.JRadioButton AviãoRadioButton;
    private javax.swing.JComboBox<Escola> EscolaCadastradaComboBox;
    private javax.swing.JLabel EscolasCadastradasLabel;
    private javax.swing.JLabel EscolasCadastradasLabel1;
    private javax.swing.JLabel EscolasCadastradasLabel2;
    private javax.swing.JLabel LocomoçãoLabel;
    private javax.swing.ButtonGroup LocomoçãobuttonGroup;
    private javax.swing.JLabel PasseiosCadastradosLabel;
    private javax.swing.JButton alterarButton;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JTextField data_horaTextField;
    private javax.swing.JButton inserirButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparButton;
    private javax.swing.JList<Passeio> passeios_cadastradosList;
    private javax.swing.JButton removerButton;
    private javax.swing.JTextField sequencialTextField;
    private javax.swing.JRadioButton ÔnibusRadioButton;
    // End of variables declaration//GEN-END:variables

    private void inicializarListPasseios() {
        modelo_lista_passeios.clear();
        Passeio[] passeios = Passeio.getVisões();
        for (Passeio passeio : passeios) modelo_lista_passeios.addElement(passeio);
    }


    private Passeio obtémPasseioInformada() {
        String sequential_str = sequencialTextField.getText();
        int sequential = 0;
        if (!sequential_str.isEmpty()) sequential = Integer.parseInt(sequential_str);
        Aquario visão_aquario = (Aquario) AquarioCadastradoComboBox.getSelectedItem();
        if (visão_aquario == null) return null;
        Escola visão_escola = (Escola) EscolaCadastradaComboBox.getSelectedItem();
        if (visão_escola == null) return null;

        Locomoção locomoção = null;
        if (LocomoçãobuttonGroup.getSelection() != null)
            locomoção = Locomoção.values()[LocomoçãobuttonGroup.getSelection().getMnemonic()];
        else return null;
        Timestamp data_hora = new Timestamp(Calendar.getInstance().getTimeInMillis());
        return new Passeio(sequential, visão_aquario, visão_escola, locomoção, data_hora);
    }

    private void informarErro (String mensagem) {
        JOptionPane.showMessageDialog (this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    private void selecioneLocomoçãoRadioButton(int índice_tipo) {
        switch(índice_tipo) {
            case 0: ÔnibusRadioButton.setSelected(true);
            break;
            case 1: AviãoRadioButton.setSelected(true);
            break;
        }
    }

    private Escola getVisãoEscolaSelecionada(Passeio passeio) {
        return passeio.escolaid;
    }

    private Aquario getVisãoAquarioSelecionado(Passeio passeio) {
        return passeio.aquarioid;
    }
}
