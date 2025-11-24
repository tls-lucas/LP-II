package entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Atração {
    
    private int sequencial;
    private Aquario aquario;
    private AnimalAquatico animal_aquatico;

    public Atração(int sequencial, Aquario aquario, AnimalAquatico animal_aquatico) {
        this.sequencial = sequencial;
        this.aquario = aquario;
        this.animal_aquatico = animal_aquatico;
    }
    
    public Atração(AnimalAquatico animal_aquatico) {
        this.animal_aquatico = animal_aquatico;
    }
    
    public static String removerAtração(int sequencial) {
        String sql = "DELETE FROM ATRAÇÕES WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro na Remoção da atracao no BD";
        }
    }
    
    public static String inserirAtração(Atração atração) {
        String sql = "INSERT INTO ATRAÇÕES (Sequencial, AquarioId, AnimalId) VALUES (?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, atração.getSequencial());
            comando.setInt(2, atração.getAquario().getSequencial());
            comando.setString(3, atração.getAnimal().getNome());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro na Inserção do aquario no BD";
        }
    }
    
    public static boolean existeAtração (int chave_aquario, String chave_animal) {
        String sql = "SELECT Sequencial FROM Atrações WHERE AquarioId = ? AND AnimalId = ?";
        ResultSet lista_resultados = null;
        boolean existe = false;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, chave_aquario);
            comando.setString(2, chave_animal);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) existe = true;
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) { exceção_sql.printStackTrace (); }
        return existe;
    }
    
    public static AnimalAquatico[] buscarAtraçõesAquario (int sequencial_aquario) {
        String sql = "SELECT Sequencial, AnimalId FROM Atrações WHERE aquarioId = ?";
        ResultSet lista_resultados = null;
        ArrayList<AnimalAquatico> visões = new ArrayList();
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial_aquario);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                visões.add(AnimalAquatico.buscarAnimalAquatico(lista_resultados.getString("AnimalId")));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {exceção_sql.printStackTrace ();}
        return visões.toArray(new AnimalAquatico[visões.size()]);
    }
    
    public static int últimoSequencial () {
        String sql = "SELECT MAX(Sequencial) FROM Aquarios";
        ResultSet lista_resultados = null;
        int sequencial = 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                sequencial = lista_resultados.getInt (1);
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {exceção_sql.printStackTrace ();}
        return sequencial;
    }
    
    public static boolean existeAtração (int sequencial) {
        String sql = "SELECT COUNT(Sequencial) FROM Atrações WHERE Sequencial = ?";
        ResultSet lista_resultados = null;
        boolean existe = false;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) existe = true;
            lista_resultados.close();
            comando.close();
        }
        catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace ();
        }
        return existe;
    }
    
    public static Atração[] buscarAtrações(int sequencial_aquario){
        String sql = null;
        ResultSet lista_resultados = null;
        ArrayList<Atração> visões = new ArrayList();
        sql = "SELECT Sequencial, AnimalId FROM Atrações where AquarioId=?";
        try{
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial_aquario);
            lista_resultados = comando.executeQuery();
            while(lista_resultados.next()){
                visões.add(new Atração(lista_resultados.getInt("Sequencial"),
                        Aquario.buscarAquario(sequencial_aquario).getVisão(),
                        AnimalAquatico.buscarAnimalAquatico(lista_resultados.getString("AnimalId")).getVisão()));
            }
            lista_resultados.close();
            comando.close();
        }catch(SQLException exceção_sql){exceção_sql.printStackTrace();}
        return visões.toArray(new Atração[visões.size()]);
        
    }
    
    public int getSequencial() {
        return sequencial;
    }

    public Aquario getAquario() {
        return aquario;
    }

    public AnimalAquatico getAnimal() {
        return animal_aquatico;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
    
    @Override
    public String toString() {
        return animal_aquatico.getNome() + " - " + animal_aquatico.getPeso() + "kg";
    }
}
