package interfaces;

import javax.swing.JOptionPane;
import controles.ControladorCadastroAnimaisAquaticos;
import entidades.AnimalAquatico;
import entidades.Baleia;
import entidades.Baleia.Alimentação;
import entidades.Tubarão;
import entidades.Tubarão.TipoDente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import persistência.BD;


public class JanelaCadastroAnimaisAquaticos extends javax.swing.JFrame {

    ControladorCadastroAnimaisAquaticos controlador;
    AnimalAquatico[] animais_cadastrados;
    PainelBaleia animal_baleiaPainel;
    PainelTubarão animal_tubarãoPainel;

    public JanelaCadastroAnimaisAquaticos (ControladorCadastroAnimaisAquaticos controlador) {
        this.controlador = controlador;
        animais_cadastrados = AnimalAquatico.getVisões();
        initComponents();
        animal_baleiaPainel = new PainelBaleia();
        animal_tubarãoPainel = new PainelTubarão();
        especie_animalaquaticoTabbedPane.addTab("Baleia",
        animal_baleiaPainel);
        especie_animalaquaticoTabbedPane.addTab("Tubarão",
        animal_tubarãoPainel);
        limparcampos(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        habitatButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        alimentaçãoButtonGroup = new javax.swing.ButtonGroup();
        TipoDenteButtonGroup = new javax.swing.ButtonGroup();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        habitatLabel = new javax.swing.JLabel();
        pesoTextField = new javax.swing.JTextField();
        pesoLabel = new javax.swing.JLabel();
        comandosPanel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        animaiscadastradosLabel = new javax.swing.JLabel();
        animaiscadastradosComboBox = new javax.swing.JComboBox<>();
        oceanoRadioButton = new javax.swing.JRadioButton();
        marRadioButton = new javax.swing.JRadioButton();
        agua_doceRadioButton = new javax.swing.JRadioButton();
        selvagemCheckBox = new javax.swing.JCheckBox();
        especie_animalaquaticoTabbedPane = new javax.swing.JTabbedPane();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Animais Aquaticos");
        setMaximumSize(new java.awt.Dimension(650, 500));
        setMinimumSize(new java.awt.Dimension(650, 500));
        setPreferredSize(new java.awt.Dimension(650, 500));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        nomeLabel.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 92, 21, 0);
        getContentPane().add(nomeLabel, gridBagConstraints);

        nomeTextField.setColumns(50);
        nomeTextField.setMaximumSize(new java.awt.Dimension(300, 40));
        nomeTextField.setMinimumSize(new java.awt.Dimension(300, 40));
        nomeTextField.setPreferredSize(new java.awt.Dimension(300, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 21, 0);
        getContentPane().add(nomeTextField, gridBagConstraints);

        habitatLabel.setText("Habitat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 97, 21, 0);
        getContentPane().add(habitatLabel, gridBagConstraints);

        pesoTextField.setColumns(50);
        pesoTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pesoTextField.setMaximumSize(new java.awt.Dimension(100, 40));
        pesoTextField.setMinimumSize(new java.awt.Dimension(100, 40));
        pesoTextField.setPreferredSize(new java.awt.Dimension(100, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 14, 21, 2);
        getContentPane().add(pesoTextField, gridBagConstraints);

        pesoLabel.setText("Peso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 101, 21, 0);
        getContentPane().add(pesoLabel, gridBagConstraints);

        comandosPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirAnimalAquatico(evt);
            }
        });
        comandosPanel.add(inserirButton);

        consultarButton.setText("Consultar");
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarAnimalAquatico(evt);
            }
        });
        comandosPanel.add(consultarButton);

        alterarButton.setText("Alterar");
        alterarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarAnimalAquatico(evt);
            }
        });
        comandosPanel.add(alterarButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAnimalAquatico(evt);
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 21, 6);
        getContentPane().add(comandosPanel, gridBagConstraints);

        animaiscadastradosLabel.setText("Animais Cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 20, 21, 0);
        getContentPane().add(animaiscadastradosLabel, gridBagConstraints);

        animaiscadastradosComboBox.setModel(new DefaultComboBoxModel (animais_cadastrados));
        animaiscadastradosComboBox.setMaximumSize(new java.awt.Dimension(300, 40));
        animaiscadastradosComboBox.setMinimumSize(new java.awt.Dimension(300, 40));
        animaiscadastradosComboBox.setPreferredSize(new java.awt.Dimension(300, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 12, 21, 0);
        getContentPane().add(animaiscadastradosComboBox, gridBagConstraints);

        habitatButtonGroup.add(oceanoRadioButton);
        oceanoRadioButton.setMnemonic('\u0002');
        oceanoRadioButton.setText("oceano");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 184, 0, 0);
        getContentPane().add(oceanoRadioButton, gridBagConstraints);

        habitatButtonGroup.add(marRadioButton);
        marRadioButton.setText("Mar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 400, 0, 0);
        getContentPane().add(marRadioButton, gridBagConstraints);

        habitatButtonGroup.add(agua_doceRadioButton);
        agua_doceRadioButton.setMnemonic('\u0001');
        agua_doceRadioButton.setText("agua doce");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 42);
        getContentPane().add(agua_doceRadioButton, gridBagConstraints);

        selvagemCheckBox.setText("Selvagem");
        selvagemCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(12, 14, 21, 2);
        getContentPane().add(selvagemCheckBox, gridBagConstraints);

        especie_animalaquaticoTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(12, 14, 21, 2);
        getContentPane().add(especie_animalaquaticoTabbedPane, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirAnimalAquatico(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirAnimalAquatico
        AnimalAquatico animal_aquatico = obterAnimalAquaticoInformado();
        String mensagem_erro = null;
        if(animal_aquatico != null) mensagem_erro = controlador.inserirAnimalAquatico(animal_aquatico);
        else mensagem_erro = "Algum atributo do anima nao foi encontrado";
                if (mensagem_erro == null){
                    AnimalAquatico visão = animal_aquatico.getVisão();
                    animaiscadastradosComboBox.setSelectedItem(visão);
                    animaiscadastradosComboBox.addItem(visão);
                }else informarErro (mensagem_erro);
    }//GEN-LAST:event_inserirAnimalAquatico

    private void consultarAnimalAquatico(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarAnimalAquatico
        AnimalAquatico visão = (AnimalAquatico) animaiscadastradosComboBox.getSelectedItem();
        AnimalAquatico animal_aquatico = null;
        String mensagem_erro = null;
        if (visão != null) {
            animal_aquatico = AnimalAquatico.buscarAnimalAquatico (visão.getNome());
            if (animal_aquatico == null) mensagem_erro = "Animal não cadastrada";
        } else mensagem_erro = "Nenhum animal selecionada";
        if (mensagem_erro == null) {
            selvagemCheckBox.setSelected(animal_aquatico.isSelvagem());
            nomeTextField.setText(animal_aquatico.getNome());
            Float peso = animal_aquatico.getPeso();
            if (peso == null) peso = null;
            pesoTextField.setText(Float.toString(animal_aquatico.getPeso()));
            selecionarHabitatRadioButton(animal_aquatico.getHabitat().ordinal());
            
            if(animal_aquatico instanceof Baleia){
                especie_animalaquaticoTabbedPane.setSelectedIndex(0);
                Baleia animal_baleia = (Baleia) animal_aquatico;
                animal_baleiaPainel.setIdade(animal_baleia.getIdade());
                animal_baleiaPainel.setAlimentação(animal_baleia.getAlimentação().ordinal());
            }else if(animal_aquatico instanceof Tubarão){
                especie_animalaquaticoTabbedPane.setSelectedIndex(1);
                Tubarão animal_tubarão = (Tubarão) animal_aquatico;
                animal_tubarãoPainel.setDocil(animal_tubarão.isDocil());
                animal_tubarãoPainel.setTipoDente(animal_tubarão.getTipoDente().ordinal());
            }
        } else informarErro (mensagem_erro);
    }//GEN-LAST:event_consultarAnimalAquatico

    private void removerAnimalAquatico(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAnimalAquatico
        AnimalAquatico visão = (AnimalAquatico) animaiscadastradosComboBox.getSelectedItem ();
        String mensagem_erro = null;
        if (visão != null) mensagem_erro = controlador.removerAnimalAquatico(visão);
        else mensagem_erro = "Nenhum animal selecionado";
        if (mensagem_erro == null) {
            animaiscadastradosComboBox.removeItem(visão);
            limparcampos(evt);
        } else informarErro (mensagem_erro);
    }//GEN-LAST:event_removerAnimalAquatico

    private void limparcampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparcampos
        nomeTextField.setText("");
        pesoTextField.setText("");
        habitatButtonGroup.clearSelection();
        selvagemCheckBox.setSelected(false);
        animal_baleiaPainel.limparcampos();
        animal_tubarãoPainel.limparcampos();
    }//GEN-LAST:event_limparcampos

    private void alterarAnimalAquatico(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarAnimalAquatico
        AnimalAquatico animal_aquatico = obterAnimalAquaticoInformado();
        String mensagem_erro = null;
        if (animal_aquatico != null) mensagem_erro = controlador.alterarAnimalAquatico(animal_aquatico);
        else mensagem_erro = "Algum atributo da animal_aquatico não foi informado";
        if (mensagem_erro == null) {
            AnimalAquatico visão = (AnimalAquatico) animaiscadastradosComboBox.getSelectedItem();
            if (visão != null) {
                visão.setPeso(animal_aquatico.getPeso());
                if(animal_aquatico instanceof Baleia){
                    Baleia animal_baleia = (Baleia) animal_aquatico;
                    Baleia visão_baleia = (Baleia) visão;
                    visão_baleia.setAlimentação(animal_baleia.getAlimentação());
                }else if(animal_aquatico instanceof Tubarão){
                    Tubarão animal_tubarão = (Tubarão) animal_aquatico;
                    Tubarão visão_tubarão = (Tubarão) visão;
                    visão_tubarão.setTipoDente(animal_tubarão.getTipoDente());
                }
                animaiscadastradosComboBox.updateUI();
            }
        } else informarErro (mensagem_erro);
    }          
    
    private AnimalAquatico getVisãoAlterada(String nome) {
        for (AnimalAquatico visão : animais_cadastrados) {
            if (visão.getNome().equals(nome)) return visão;
        }
        return null;  
    }//GEN-LAST:event_alterarAnimalAquatico

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup TipoDenteButtonGroup;
    private javax.swing.JRadioButton agua_doceRadioButton;
    private javax.swing.ButtonGroup alimentaçãoButtonGroup;
    private javax.swing.JButton alterarButton;
    private javax.swing.JComboBox<AnimalAquatico> animaiscadastradosComboBox;
    private javax.swing.JLabel animaiscadastradosLabel;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JButton consultarButton;
    private javax.swing.JTabbedPane especie_animalaquaticoTabbedPane;
    private javax.swing.ButtonGroup habitatButtonGroup;
    private javax.swing.JLabel habitatLabel;
    private javax.swing.JButton inserirButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton limparButton;
    private javax.swing.JRadioButton marRadioButton;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JRadioButton oceanoRadioButton;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JTextField pesoTextField;
    private javax.swing.JButton removerButton;
    private javax.swing.JCheckBox selvagemCheckBox;
    // End of variables declaration//GEN-END:variables
    
    
    private AnimalAquatico obterAnimalAquaticoInformado() {
        String nome = nomeTextField.getText();
        if (nome.isEmpty()) return null;
        String peso_str = pesoTextField.getText();
        if (peso_str.isEmpty()) return null;
        Float peso = Float.parseFloat(pesoTextField.getText());
        AnimalAquatico.Habitat habitat = null;
        boolean selvagem = selvagemCheckBox.isSelected();
        if(habitatButtonGroup.getSelection() != null)
            habitat = AnimalAquatico.Habitat.values()[habitatButtonGroup.getSelection().getMnemonic()];
        else return null; 
        AnimalAquatico animal = null;
        int indice_aba_selecionada = especie_animalaquaticoTabbedPane.getSelectedIndex();
        switch (indice_aba_selecionada){
            case 0:
                int idade = animal_baleiaPainel.getIdade();
                Alimentação alimentação = animal_baleiaPainel.getAlimentação();
                animal = new Baleia(nome, peso,habitat,selvagem, idade, alimentação);
                break;
            case 1:
                boolean docil = animal_tubarãoPainel.isDocil();
                TipoDente tipo_dente = animal_tubarãoPainel.getTipoDente();
                animal = new Tubarão(nome, peso,habitat,selvagem, docil,tipo_dente);
                break;
        }   
        return animal;
    }
    
    
    
    private void informarErro (String mensagem) {
        JOptionPane.showMessageDialog (this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    private void selecionarHabitatRadioButton(int índice_tipo) {
        switch(índice_tipo) {
            case 0: marRadioButton.setSelected(true);
            break;
            case 1: agua_doceRadioButton.setSelected(true);
            break;
            case 2: oceanoRadioButton.setSelected(true);
            break;
        }
    }
}
