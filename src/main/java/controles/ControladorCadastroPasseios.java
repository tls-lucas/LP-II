package controles;

import entidades.Passeio;
import interfaces.JanelaCadastroPasseios;

public class ControladorCadastroPasseios {
    public ControladorCadastroPasseios() {
        new JanelaCadastroPasseios(this).setVisible(true);
    }

    public String inserirPasseio(Passeio passeio) {
        if(!Passeio.existePasseio (passeio.getEscola().getNome(), passeio.getAquario().getSequencial())){
            return Passeio.inserirPasseio(passeio);
        }else return "Passeio ja Cadastrado";
    }

    public String alterarPasseio(Passeio passeio_informado) {
        Passeio passeio_cadastrados = Passeio.buscarPasseio(passeio_informado.getSequencial());
        if ((passeio_informado.getEscola().getNome().equals
            (passeio_cadastrados.getEscola().getNome()))
            && (passeio_informado.getAquario().getSequencial()
            == passeio_cadastrados.getAquario().getSequencial())) {
            return Passeio.alterarPasseio (passeio_informado);
        } else return "Alteração não permitida : chave do amigo e/ou do filme foram alteradas";
    }

    public String removerPasseio(int sequencial) {
        if (Passeio.existePasseio(sequencial)) return Passeio.removerPasseio (sequencial);
        else return "Sequencial não corresponde a nenhuma reserva cadastrada";
    }

}
