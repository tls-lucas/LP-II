package entidades;

public class Tubarão extends AnimalAquatico{
    public String getNome() {
        return nome;
    }
    public TipoDente getTipoDente() {
        return tipo_dente;
    }

    public boolean isDocil() {
        return docil;
    }

    public void setTipoDente(TipoDente tipo_dente) {
        this.tipo_dente = tipo_dente;
    }
    
    public enum TipoDente {serrilhado,liso};
    private boolean docil;
    private TipoDente tipo_dente;

    public Tubarão(String nome, float peso, Habitat habitat, boolean selvagem, boolean docil, TipoDente tipo_dente){
        super(nome,peso,habitat,selvagem);
        this.docil = docil;
        this.tipo_dente = tipo_dente;
    }
    public Tubarão getVisão(){
        return new Tubarão(nome, peso, habitat, selvagem, docil, tipo_dente);
    }
    public String toString(){
        String str = "[" + nome + "] " + tipo_dente;
        if (docil) str += " - Docil";
        return str;
    
    }
}

