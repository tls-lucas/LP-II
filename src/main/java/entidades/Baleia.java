package entidades;

public class Baleia extends AnimalAquatico{

    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    public Alimentação getAlimentação() {
        return alimentação;
    }

    public void setAlimentação(Alimentação alimentação) {
        this.alimentação = alimentação;
    }
    
    public enum Alimentação {carnivoro, herbivoro};
    private int idade;
    private Alimentação alimentação;

    public Baleia(String nome, float peso,Habitat habitat,boolean selvagem, int idade, Alimentação alimentação){
        super(nome,peso, habitat, selvagem);
        this.idade = idade;
        this.alimentação = alimentação;
    }
    public Baleia getVisão(){
        return new Baleia(nome, peso, habitat, selvagem, idade, alimentação);
    }
    
    
    public String toString(){
        String str = "[" + nome + "] " + idade + " --- " + alimentação; 
        return str;
    
    }
    
}

