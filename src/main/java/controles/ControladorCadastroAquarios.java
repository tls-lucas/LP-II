package controles;

import entidades.Aquario;
import interfaces.JanelaCadastroAquarios;

public class ControladorCadastroAquarios {
    
    public ControladorCadastroAquarios() {
        new JanelaCadastroAquarios(this).setVisible(true);
    }
    
    public String alterarAquario(Aquario aquario) {
        Aquario aquario1 = Aquario.buscarAquario(aquario.getSequencial());
        if (aquario1 != null) return Aquario.alterarAquario(aquario);
        else return "Aquario não encontrada";
    }

    public String removerAquario(int sequencial) {
        Aquario aquario1 = Aquario.buscarAquario(sequencial);
        if (aquario1 != null) return Aquario.removerAquario(sequencial);
        else return "aquario não encontrado";
    }

    public String inserirAquario(Aquario aquario) {
        if (!Aquario.existeAquarioMesmosAtributos(aquario)) return Aquario.inserirAquario(aquario);
        else return "ja existe aquario com mesmos atributos";
    }
}
