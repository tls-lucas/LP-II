package controles;

import entidades.AnimalAquatico;
import interfaces.JanelaCadastroAnimaisAquaticos;

public class ControladorCadastroAnimaisAquaticos {
    public ControladorCadastroAnimaisAquaticos() {
        new JanelaCadastroAnimaisAquaticos(this).setVisible(true);
    }
    
    public String inserirAnimalAquatico (AnimalAquatico animal_aquatico) {
        AnimalAquatico animal_aquatico1 = AnimalAquatico.buscarAnimalAquatico(animal_aquatico.getNome());
        if (animal_aquatico1 == null) return AnimalAquatico.inserirAnimalAquatico(animal_aquatico);
        else return "animal_aquatico já cadastrada";
    }

    public String alterarAnimalAquatico(AnimalAquatico animal_aquatico) {
        AnimalAquatico animal_aquatico1 = AnimalAquatico.buscarAnimalAquatico(animal_aquatico.getNome());
        if (animal_aquatico1 != null) return AnimalAquatico.alterarAnimalAquatico(animal_aquatico);
        else return "animal_aquatico não encontrada";
    }
    
    public String removerAnimalAquatico(AnimalAquatico animal_aquatico) {
        AnimalAquatico animal_aquatico1 = AnimalAquatico.buscarAnimalAquatico(animal_aquatico.getNome());
        if (animal_aquatico1 != null) return AnimalAquatico.removerAnimalAquatico(animal_aquatico);
        else return "animal_aquatico não encontrada";
    }
}
