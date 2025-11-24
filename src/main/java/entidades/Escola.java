package entidades;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;

public class Escola {
    
    public enum Tipo {publica, particular};
    
    private String cnpj, nome;
    private Tipo tipo;
    private int alunos_matriculados;
    boolean biblioteca;
    
    public Escola(String cnpj, String nome, int alunos_matriculados, Tipo tipo, boolean biblioteca) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.alunos_matriculados = alunos_matriculados;
        this.tipo = tipo;
        this.biblioteca = biblioteca;
    }
    public Escola(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }
    public Escola getVisão() {
        return new Escola(cnpj, nome);
    }
    
    public static Escola[] getVisões() {
        String sql = "Select cnpj, nome from escolas";
        ResultSet lista_resultados = null;
        ArrayList<Escola> visões = new ArrayList();
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                String cnpj = lista_resultados.getString("cnpj");
                String nome = lista_resultados.getString("nome");
                visões.add(new Escola (cnpj, nome));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {exceção_sql.printStackTrace ();}
        return visões.toArray(new Escola[visões.size()]);
        
        
    }
    
    public static Escola buscarEscola(String cnpj) {
        String sql = "SELECT * FROM EscolaS WHERE CNPJ = ?";
        ResultSet lista_resultados = null;
        Escola escola = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cnpj);
            lista_resultados = comando.executeQuery();
            if (lista_resultados.next()) {
            escola = new Escola(
                lista_resultados.getString("Cnpj"),
                lista_resultados.getString("Nome"),
                lista_resultados.getInt("alunos_matriculados"),
                Tipo.values()[lista_resultados.getInt("Tipo")],
                lista_resultados.getBoolean("biblioteca"));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            escola = null;
        }
        return escola;
    }
    
    public static String inserirEscola(Escola escola) {
        String sql = "INSERT INTO Escolas (CNPJ, Nome, alunos_matriculados, Tipo, biblioteca) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, escola.getCnpj());
            comando.setString(2, escola.getNome());
            comando.setInt(3, escola.getAlunosMatriculados());
            comando.setInt(4, (escola.getTipo().ordinal()));
            comando.setBoolean(5, (escola.isBiblioteca()));
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro na Inserção da Escola no BD";
        }
    }
    
    public static String alterarEscola(Escola escola) {
        String sql = "UPDATE EscolaS SET Nome = ?, alunos_matriculados = ?, Tipo = ?, biblioteca= ? WHERE Cnpj = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, escola.getNome());
            comando.setInt(2, escola.getAlunosMatriculados());
            comando.setInt(3, escola.getTipo().ordinal());
            comando.setBoolean(4, escola.isBiblioteca());
            comando.setString(5, escola.getCnpj());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro na Alteração da escola no BD";
        }
    }
    
    public static String removerEscola(String cnpj) {
        String sql = "DELETE FROM Escolas WHERE Cnpj = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, cnpj);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro na Remoção da Escola no BD";
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public int getAlunosMatriculados() {
        return alunos_matriculados;
    }
    public Boolean isBiblioteca() {
        return biblioteca;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toStringFull() {
        String str = nome + " [" + tipo + "]";
        if (biblioteca) str += " - tem biblioteca";
        return str;
    }
    @Override
        public String toString() {
        return nome + " [CNPJ: " + cnpj + "]"; 
     }
}
