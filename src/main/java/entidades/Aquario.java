package entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Aquario {
    public enum Cidade{dourados, campo_grande, carapó, ponta_porã, coxim, corumba}
    private Cidade cidade;
    private String nome;
    private int sequencial;
    private boolean cadeirante;
    
    public Aquario(int sequencial,String nome, Cidade cidade, boolean cadeirante) {
        this.sequencial = sequencial;
        this.nome = nome;
        this.cidade = cidade;
        this.cadeirante = cadeirante;
    }
    public Aquario(int sequencial, String nome) {
        this.sequencial = sequencial;
        this.nome = nome;
    }
    
    public Aquario getVisão() {
        return new Aquario(sequencial, nome);
    }
    
    public static Aquario[] getVisões() {
        String sql = "Select nome, sequencial from aquarios";
        ResultSet lista_resultados = null;
        ArrayList<Aquario> visões = new ArrayList();
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                String nome = lista_resultados.getString("nome");
                int sequencial = lista_resultados.getInt("sequencial");
                visões.add(new Aquario (sequencial, nome));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {exceção_sql.printStackTrace ();}
        return visões.toArray(new Aquario[visões.size()]);
        
        
    }
    
    public static Aquario buscarAquario(int sequencial) {
        String sql = "SELECT * FROM AQUARIOS WHERE Sequencial = ?";
        ResultSet lista_resultados = null;
        Aquario aquario = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            if (lista_resultados.next()) {
            aquario = new Aquario(
                lista_resultados.getInt("Sequencial"),                   
                lista_resultados.getString("Nome"),
                Aquario.Cidade.values()[lista_resultados.getInt("cidade")],
                lista_resultados.getBoolean("cadeirante"));

            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            aquario = null;
        }
        return aquario;
    }
    
    public static String inserirAquario(Aquario aquario) {
        String sql = "INSERT INTO Aquarios (Sequencial, Nome, Cidade, cadeirante) VALUES (?,?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, aquario.getSequencial());
            comando.setString(2, aquario.getNome());
            comando.setInt(3, aquario.getCidade().ordinal());
            comando.setBoolean(4, aquario.isCadeirante());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro na Inserção do aquario no BD";
        }
    }
    
    public static String alterarAquario(Aquario aquario) {
        String sql = "UPDATE Aquarios SET Nome = ?, cidade = ?, cadeirante = ? WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, aquario.getNome());
            comando.setInt(2, aquario.getCidade().ordinal());
            comando.setInt(3, aquario.getSequencial());
            comando.setBoolean(4, aquario.isCadeirante());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro na Alteração do aquario no BD";
        }
    }
    
    public static String removerAquario(int sequencial) {
        String sql = "DELETE FROM Aquarios WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro na Remoção do aquario no BD";
        }
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
    
    public static boolean existeAquarioMesmosAtributos (Aquario aquario) {
        String sql = "SELECT COUNT(Sequencial) FROM Aquarios"
        + " WHERE Nome = ? AND Cidade = ? AND cadeirante = ?";
        ResultSet lista_resultados = null;
        int n_aquarios_mesmos_atributos = 0;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, aquario.getNome());
            comando.setInt(2, aquario.getCidade().ordinal());
            comando.setBoolean(3, aquario.isCadeirante());
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                n_aquarios_mesmos_atributos = lista_resultados.getInt(1);
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {exceção_sql.printStackTrace ();}
        if (n_aquarios_mesmos_atributos > 0) return true;
        else return false;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    public Cidade getCidade() {
        return cidade;
    }
    
    public Boolean isCadeirante() {
        return cadeirante;
    }
    public int getSequencial() {
        return sequencial;
    }
    
    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toStringFull() {
        String str = nome + " [" + cidade + "]";
        if (cadeirante) str += " - cadeirante";
        return str;
    }
    
    @Override
        public String toString() {
        return sequencial + " [" + nome + "]"; 
     }
}
