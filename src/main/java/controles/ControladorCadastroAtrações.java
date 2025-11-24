package controles;

import entidades.Atração;
import interfaces.JanelaCadastroAquarios;
import interfaces.JanelaCadastroAtrações;

public class ControladorCadastroAtrações {

    public ControladorCadastroAtrações(JanelaCadastroAquarios janela_cadastro_aquarios, int sequencial_aquario) {
        new JanelaCadastroAtrações (this, janela_cadastro_aquarios, sequencial_aquario).setVisible(true);
    }
    
    public String inserirAtração(Atração atração) {
        boolean existe_atração = Atração.existeAtração
            (atração.getAquario().getSequencial(), atração.getAnimal().getNome());
        if (!existe_atração) return Atração.inserirAtração (atração);
        else return "Sequencial de atração já cadastrado";
    }
    
    public String removerAtração(int sequencial) {
        boolean existe_atração = Atração.existeAtração (sequencial);
        if (existe_atração) return Atração.removerAtração(sequencial);
        else return "Não existe atração com este sequencial";
    }
}
