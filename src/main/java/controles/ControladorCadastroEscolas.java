package controles;

import entidades.Escola;
import interfaces.JanelaCadastroEscolas;

public class ControladorCadastroEscolas {
    public ControladorCadastroEscolas() {
        new JanelaCadastroEscolas(this).setVisible(true);
    }
    
    public String inserirEscola (Escola escola) {
        Escola escola1 = Escola.buscarEscola(escola.getCnpj());
        if (escola1 == null) return Escola.inserirEscola(escola);
        else return "escola já cadastrada";
    }

    public String alterarEscola(Escola escola) {
        Escola escola1 = Escola.buscarEscola(escola.getCnpj());
        if (escola1 != null) return Escola.alterarEscola(escola);
        else return "escola não encontrada";
    }
    
    public String removerEscola(String cnpj) {
        Escola escola1 = Escola.buscarEscola(cnpj);
        if (escola1 != null) return Escola.removerEscola(cnpj);
        else return "escola não encontrada";
    }
}
