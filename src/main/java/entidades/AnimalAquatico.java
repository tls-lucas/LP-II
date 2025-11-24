package entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class AnimalAquatico {
    
    public enum Habitat {mar, agua_doce, oceano};
    
    String nome;
    float peso;
    Habitat habitat;
    boolean selvagem;
    
    public AnimalAquatico(String nome, float peso, Habitat habitat, boolean selvagem) {
        this.nome = nome;
        this.peso = peso;
        this.habitat = habitat;
        this.selvagem = selvagem;
    }
    
    public AnimalAquatico(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }
    
    public AnimalAquatico getVisão() {
        return new AnimalAquatico(nome, peso);
    }
    
    public static AnimalAquatico[] getVisões() {
        String sql = "SELECT nome, peso FROM animaisaquaticos";
        ResultSet lista_resultados = null;
        ArrayList<AnimalAquatico> visões = new ArrayList<>();
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
               visões.add(buscarAnimalAquatico(lista_resultados.getString("nome")).getVisão());
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
        }
        return visões.toArray(new AnimalAquatico[visões.size()]);
    }
    
    public static AnimalAquatico buscarAnimalAquatico(String nome) {
        String sql = "SELECT nome, peso, habitat, selvagem FROM animaisaquaticos WHERE nome = ?";
        ResultSet lista_resultados = null;
        float peso = 0;
        boolean selvagem = false;
        Habitat habitat = null;
        
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, nome);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                nome = lista_resultados.getString("nome");
                peso = lista_resultados.getFloat("peso");
                habitat = AnimalAquatico.Habitat.values()[lista_resultados.getInt("habitat")];    
                selvagem = lista_resultados.getBoolean("selvagem");
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {exceção_sql.printStackTrace();}
        if(nome == null) return null;
        sql = "Select idade, alimentação From animaisaquaticosbaleias where AnimalId= ?";
        lista_resultados = null;
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, nome);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                return new Baleia (nome, peso, habitat, selvagem,
                lista_resultados.getInt("idade"),
                Baleia.Alimentação.values()[lista_resultados.getInt("alimentação")]);
            }
            lista_resultados.close();
            comando.close();
        }catch(SQLException exceção_sql){exceção_sql.printStackTrace();}
        sql = "Select tipo_dente, docil From animaisaquaticostubarões where AnimalId= ?";
        lista_resultados = null;
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, nome);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                return new Tubarão (nome, peso, habitat, selvagem,
                lista_resultados.getBoolean("docil"),
                Tubarão.TipoDente.values()[lista_resultados.getInt("tipo_dente")]);
            }
            lista_resultados.close();
            comando.close();
        }catch (SQLException exceção_sql) {exceção_sql.printStackTrace();}
        
        return null;
    }
    
    public static String inserirAnimalAquatico(AnimalAquatico animal_aquatico) {
        String sql = "INSERT INTO animaisaquaticos (nome, peso, habitat, selvagem) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, animal_aquatico.getNome());
            comando.setFloat(2, animal_aquatico.getPeso());
            comando.setInt(3, animal_aquatico.getHabitat().ordinal());
            comando.setBoolean(4, animal_aquatico.isSelvagem());
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na inserção do animal no BD";
        }
        String nome = animal_aquatico.getNome();
        if(animal_aquatico instanceof Baleia){
            Baleia animal_baleia = (Baleia) animal_aquatico;
            sql = "Insert Into animaisaquaticosbaleias (idade, alimentação, AnimalId) Values (?,?,?)";
            try{
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1,animal_baleia.getIdade());
                comando.setInt(2, animal_baleia.getAlimentação().ordinal());
                comando.setString(3, nome);
                comando.executeUpdate();
                comando.close();
            }catch(SQLException exceção_sql){
                exceção_sql.printStackTrace();
                return "Erro na inserção da baleia no BD";
            }
        }else if(animal_aquatico instanceof Tubarão){
            Tubarão animal_tubarão = (Tubarão) animal_aquatico;
            sql = "Insert Into animaisaquaticostubarões (tipo_dente, docil, AnimalId) Values (?,?,?)";
            try{
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1,animal_tubarão.getTipoDente().ordinal());
                comando.setBoolean(2, animal_tubarão.isDocil());
                comando.setString(3, nome);
                comando.executeUpdate();
                comando.close();
            }catch(SQLException exceção_sql){
                exceção_sql.printStackTrace();
                return "Erro na inserção do tubarao no BD";
            }
        }
        return null;
    }
    
    
    
    
    public static String alterarAnimalAquatico(AnimalAquatico animal_aquatico) {
        String sql = "UPDATE animaisaquaticos SET peso = ?, habitat = ?, selvagem = ? WHERE nome = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setFloat(1, animal_aquatico.getPeso());
            comando.setInt(2, animal_aquatico.getHabitat().ordinal());
            comando.setBoolean(3, animal_aquatico.isSelvagem());
            comando.setString(4, animal_aquatico.getNome());
            comando.executeUpdate();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na alteracao do animal no BD";
        }
        if(animal_aquatico instanceof Baleia){
            Baleia animal_baleia = (Baleia) animal_aquatico;
            sql = "update animaisaquaticosbaleias SET idade=? , alimentação=? where animalID= ?";
            try{
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1,animal_baleia.getIdade());
                comando.setInt(2, animal_baleia.getAlimentação().ordinal());
                comando.setString(3,animal_baleia.getNome());
                comando.executeUpdate();
                comando.close();
            }catch(SQLException exceção_sql){
                exceção_sql.printStackTrace();
                return "Erro na alteracao da baleia no BD";
            }
        }else if(animal_aquatico instanceof Tubarão){
            Tubarão animal_tubarão = (Tubarão) animal_aquatico;
            sql = "update animaisaquaticostubarões SET tipo_dente=?, docil=? where animalID=?";
            try{
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setInt(1,animal_tubarão.getTipoDente().ordinal());
                comando.setBoolean(2, animal_tubarão.isDocil());
                comando.setString(3,animal_tubarão.getNome());
                comando.executeUpdate();
                comando.close();
            }catch(SQLException exceção_sql){
                exceção_sql.printStackTrace();
                return "Erro na alteracao do tubarao no BD";
            }
        }
        return null;
    }
    
    public static String removerAnimalAquatico(AnimalAquatico animal_aquatico) {
        String nome = animal_aquatico.getNome();
        if(animal_aquatico instanceof Baleia){
            Baleia animal_baleia = (Baleia) animal_aquatico;
            String sql = "DELETE FROM animaisaquaticosbaleias WHERE AnimalID = ?";
            try{
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setString(1,animal_baleia.getNome());
                comando.executeUpdate();
                comando.close();
            }catch(SQLException exceção_sql){
                exceção_sql.printStackTrace();
                return "Erro na remocao da baleia no BD";
            }
        }else if(animal_aquatico instanceof Tubarão){
            Tubarão animal_tubarão = (Tubarão) animal_aquatico;
            String sql = "DELETE FROM animaisaquaticostubarões WHERE AnimalID = ?";
            try{
                PreparedStatement comando = BD.conexão.prepareStatement(sql);
                comando.setString(1,animal_tubarão.getNome());
                comando.executeUpdate();
                comando.close();
            }catch(SQLException exceção_sql){
                exceção_sql.printStackTrace();
                return "Erro na remocao do tubarao no BD";
            }
        }
        
        String sql = "DELETE FROM animaisaquaticos WHERE nome = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, nome);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace();
            return "Erro na remocao do animal no BD";
        }   
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getPeso() {
        return peso;
    }
    public Boolean isSelvagem() {
        return selvagem;
    }
    
    public Habitat getHabitat() {
        return habitat;
    }
    
    public String toStringFull() {
        String str = nome + " [" + habitat + "] - peso: " + peso;
        return str;
    }
    
    @Override
        public String toString() {
        return nome + " [Peso: " + peso + "]"; 
     }
}
