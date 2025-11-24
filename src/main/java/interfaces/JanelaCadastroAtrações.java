package interfaces;

import controles.ControladorCadastroAtrações;
import javax.swing.JOptionPane;
import entidades.AnimalAquatico;
import entidades.Aquario;
import entidades.Atração;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;


public class JanelaCadastroAtrações extends javax.swing.JFrame {

    ControladorCadastroAtrações controlador;
    JanelaCadastroAquarios janela_mãe;
    int sequencial_aquario;
    AnimalAquatico[] animais_cadastrados;
    DefaultListModel modelo_lista_atrações;
    
    public JanelaCadastroAtrações(ControladorCadastroAtrações controlador, JanelaCadastroAquarios janela_mãe, int sequencial_aquario) {
        this.controlador = controlador;
        this.janela_mãe = janela_mãe;
        this.sequencial_aquario = sequencial_aquario;
        animais_cadastrados = AnimalAquatico.getVisões();
        initComponents();
        atralizarNomeAquario();
        atralizarListaAtrações();
    }
    
    private void atralizarNomeAquario () {
        Aquario aquario = Aquario.buscarAquario(sequencial_aquario);
        aquarioLabel.setText(aquario.getNome());
    }
    private void atralizarListaAtrações () {
        modelo_lista_atrações = (DefaultListModel)animaisList.getModel();
        Atração[] atrações = Atração.buscarAtrações(sequencial_aquario);
        for (Atração atração : atrações) modelo_lista_atrações.addElement(atração);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        nomeLabel = new javax.swing.JLabel();
        pesoLabel = new javax.swing.JLabel();
        comandosPanel = new javax.swing.JPanel();
        inserirButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        animaiscadastradosLabel = new javax.swing.JLabel();
        animais_cadastradosComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        animaisList = new javax.swing.JList<>();
        aquarioLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Atrações");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        nomeLabel.setText("Animais Cadastrados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 92, 16, 0);
        getContentPane().add(nomeLabel, gridBagConstraints);

        pesoLabel.setText("Animais do Aquario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(14, 101, 16, 0);
        getContentPane().add(pesoLabel, gridBagConstraints);

        comandosPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inserirButton.setText("Inserir");
        inserirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirAtração(evt);
            }
        });
        comandosPanel.add(inserirButton);

        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAtração(evt);
            }
        });
        comandosPanel.add(removerButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 16, 6);
        getContentPane().add(comandosPanel, gridBagConstraints);

        animaiscadastradosLabel.setText("Aquario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(29, 20, 16, 0);
        getContentPane().add(animaiscadastradosLabel, gridBagConstraints);

        animais_cadastradosComboBox.setModel(new DefaultComboBoxModel (animais_cadastrados));
        animais_cadastradosComboBox.setMinimumSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 12, 16, 0);
        getContentPane().add(animais_cadastradosComboBox, gridBagConstraints);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(200, 100));

        animaisList.setModel(new DefaultListModel());
        animaisList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        animaisList.setVisibleRowCount(4);
        jScrollPane1.setViewportView(animaisList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 17, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(29, 10, 16, 0);
        getContentPane().add(aquarioLabel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirAtração(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirAtração
        AnimalAquatico visão_animal = (AnimalAquatico) animais_cadastradosComboBox.getSelectedItem();
        String mensagem_erro = null;
        Atração atração = null;
        if (visão_animal != null) {
            Aquario visão_aquario = Aquario.buscarAquario(sequencial_aquario);
            atração = new Atração(0, visão_aquario, visão_animal);
            mensagem_erro = controlador.inserirAtração(atração);
        } else mensagem_erro = "Nenhuma atração foi selecionado";
        if (mensagem_erro == null) {
            int sequencial = Atração.últimoSequencial();
            atração.setSequencial(sequencial);
            modelo_lista_atrações.addElement(atração);
        } else informarErro (mensagem_erro);
    }//GEN-LAST:event_inserirAtração

    private void removerAtração(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAtração
        Atração atração = (Atração) animaisList.getSelectedValue();
        String mensagem_erro = null;
        if (atração != null) mensagem_erro = controlador.removerAtração(atração.getSequencial());
        else mensagem_erro = "Nenhuma atração foi selecionado";
        if (mensagem_erro == null) modelo_lista_atrações.removeElement(atração);
        else informarErro (mensagem_erro);
    }//GEN-LAST:event_removerAtração

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Atração> animaisList;
    private javax.swing.JComboBox<Atração> animais_cadastradosComboBox;
    private javax.swing.JLabel animaiscadastradosLabel;
    private javax.swing.JLabel aquarioLabel;
    private javax.swing.JPanel comandosPanel;
    private javax.swing.JButton inserirButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JButton removerButton;
    // End of variables declaration//GEN-END:variables

    private void atualizarJanelaCadastroAquarios(java.awt.event.WindowEvent evt) {
    janela_mãe.atualizarListaAtrações(sequencial_aquario); }   
    
    private void informarErro (String mensagem) {
        JOptionPane.showMessageDialog (this, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
