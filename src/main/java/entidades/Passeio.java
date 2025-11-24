package entidades;

import entidades.AnimalAquatico;
import entidades.Tubarão.TipoDente;
import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import persistência.BD;


public class Passeio {  

    public enum Locomoção{ônibus, avião};
    public Aquario aquarioid;
    public Escola escolaid;
    private int sequencial;
    private Timestamp datahora;
    private Locomoção locomoção;
    
    public Passeio(int sequencial, Aquario aquarioid,Escola escolaid, Locomoção locomoção, Timestamp datahora){
        this.locomoção = locomoção;
        this.aquarioid= aquarioid;
        this.escolaid = escolaid;
        this.sequencial = sequencial;
        this.datahora = datahora;
    }
    public Passeio(int sequencial, Aquario aquarioid,Escola escolaid){
        this.aquarioid= aquarioid;
        this.escolaid = escolaid;
        this.sequencial = sequencial;
    }
    public static Passeio[] getVisões(){
    String sql = "Select Sequencial, AquarioID, EscolaID from Passeios";
    ResultSet lista_resultados = null;
    ArrayList<Passeio> visões = new ArrayList();
    try {
        PreparedStatement comando = BD.conexão.prepareStatement(sql);
        lista_resultados = comando.executeQuery();
        while(lista_resultados.next()){
             visões.add(new Passeio (lista_resultados.getInt("Sequencial"),
                     Aquario.buscarAquario(lista_resultados.getInt("AquarioID")).getVisão(),
                     Escola.buscarEscola(lista_resultados.getString("EscolaID")).getVisão()));
       }
        lista_resultados.close();
        comando.close();
    }catch(SQLException exceção_sql){exceção_sql.printStackTrace ();}
    return visões.toArray (new Passeio[visões.size()]);
    }
    
    public Passeio getVisão() {
        return new Passeio(sequencial, aquarioid, escolaid);
    }
    
    public static String removerPasseio(int sequencial) {
        String sql = "DELETE FROM Passeios WHERE Sequencial = ?";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException excecao_sql) {
            excecao_sql.printStackTrace();
            return "Erro na Remoção do passeio no BD";
        }
    }
    
    public static Passeio buscarPasseio(int sequencial) {
        String sql = "SELECT * FROM Passeios WHERE Sequencial = ?";
        ResultSet lista_resultados = null;
        Passeio passeio = null;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
            Locomoção locomoção = null;
            if (lista_resultados.getInt("Locomoção") > -1)
                locomoção = Locomoção.values()[lista_resultados.getInt("Locomoção")];
                passeio = new Passeio (sequencial,
                Aquario.buscarAquario(lista_resultados.getInt("AquarioId")),
                Escola.buscarEscola(lista_resultados.getString("EscolaId")),
                locomoção,
                lista_resultados.getTimestamp("DataHora"));
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace ();
            passeio = null;
        }
        return passeio;
    }
    
    public static int últimoSequencial () {
        String sql = "SELECT MAX(Sequencial) FROM Passeios";
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
    
    
    public static boolean existePasseio (int sequencial) {
        String sql = "SELECT COUNT(Sequencial) FROM Passeios WHERE Sequencial = ?";
        ResultSet lista_resultados = null;
        boolean existe = false;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setInt(1, sequencial);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
            existe = true;
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace ();
        }
        return existe;
    }
    
    public static boolean existePasseio (String chave_escola, int chave_aquario) {
        String sql = "SELECT Sequencial FROM Passeios WHERE EscolaId = ? AND AquarioId = ?";
        ResultSet lista_resultados = null;
        boolean existe = false;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, chave_escola);
            comando.setInt(2, chave_aquario);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) {
                existe = true;
            }
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace ();
        }
        return existe;
    }
    
    public static String inserirPasseio (Passeio passeio) {
        String sql = "INSERT INTO Passeios (EscolaId, AquarioId, Locomoção,DataHora)"
        + " VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, passeio.getEscola().getCnpj());
            comando.setInt(2, passeio.getAquario().getSequencial());
            comando.setInt(3, passeio.getLocomoção().ordinal());
            comando.setTimestamp(4, passeio.getDataHora());
            comando.executeUpdate();
            comando.close();
            return null;
        } catch (SQLException exceção_sql) {
            exceção_sql.printStackTrace ();
            return "Erro na Inserção do Passeio no BD";
        }
    }
    public static String alterarPasseio (Passeio passeio) {
        String sql = "UPDATE Passeios SET Locomoção = ?, DataHora= ?"
        + " WHERE Sequencial = ?";
        try {
        PreparedStatement comando = BD.conexão.prepareStatement(sql);
        comando.setInt(1, passeio.getLocomoção().ordinal());
        comando.setTimestamp(2, passeio.getDataHora());
        comando.setInt(3, passeio.getSequencial());
        comando.executeUpdate();
        comando.close();
        return null;
        } catch (SQLException exceção_sql) {
        exceção_sql.printStackTrace ();
        return "Erro na Alteração da Passeio no BD";
        }
    }
    public static String formatarDataHora(String data_hora_bd) {
        String[] data_hora = data_hora_bd.split(" ");
        String[] ano_mês_dia = data_hora[0].split("-");
        String[] hora_minuto_resto = data_hora[1].split(":");
        String data_hora_formatada = ano_mês_dia[2] + "/" + ano_mês_dia[1] + "/" + ano_mês_dia[0]
        + " " + hora_minuto_resto[0]+ ":" + hora_minuto_resto[1] + "hs";
        return data_hora_formatada;
    }
    
    
    
    public static ArrayList<Passeio> pesquisarPasseios(
        Escola.Tipo tipo_escola,
        int minimo_alunos,
        Aquario.Cidade cidade,
        AnimalAquatico.Habitat habitat,
        boolean todos_animais,
        int minimo_peso,
        Locomoção locomoção,
        Timestamp data_minima,
        int idade_minima,
        TipoDente tipo_dente) {

    String sql = "SELECT E.cnpj, E.Nome, E.alunos_matriculados,Aq.Sequencial, Aq.nome, Aq.cidade, "
            + "Pa.Sequencial, Pa.locomoção, Pa.DataHora "
            + "from escolas E, aquarios Aq, Passeios Pa "
            + "where Pa.Aquarioid = Aq.sequencial and Pa.Escolaid = E.cnpj";

    if (tipo_escola != null) sql += " AND E.Tipo = ?";
    if (minimo_alunos > 0) sql += " AND E.alunos_matriculados >= ?";
    if (cidade != null) sql += " AND Aq.Cidade = ?";
    if (locomoção != null) sql += " AND Pa.locomoção = ?";
    if (data_minima != null) sql += " AND Pa.DataHora >= ?";

    sql += " ORDER BY Pa.Sequencial";
    ResultSet lista_resultados = null;
    
    ArrayList<Passeio> passeios_selecionados = new ArrayList<>();
    int index = 1;
    int sequencial_aquario = -1;
    try {
        PreparedStatement comando = BD.conexão.prepareStatement(sql);

        if (tipo_escola != null) comando.setInt(index++, tipo_escola.ordinal());
        if (minimo_alunos > 0) comando.setInt(index++, minimo_alunos);
        if (cidade != null) comando.setInt(index++, cidade.ordinal());
        if (locomoção != null) comando.setInt(index++, locomoção.ordinal());
        if (data_minima != null) comando.setTimestamp(index++, data_minima);
        
        lista_resultados = comando.executeQuery();
        while (lista_resultados.next()) {
            Passeio passeio_pesquisado = Passeio.buscarPasseio(lista_resultados.getInt(7));
            sequencial_aquario = lista_resultados.getInt(4);
            ArrayList<String> animais = buscarAnimaisDoAquario(sequencial_aquario);

            if(animaisAquarioAtendemFiltro (sequencial_aquario, habitat, minimo_peso,todos_animais))continue;
            for (String animalId : animais) {

                if (tipo_dente != null) {
                    if (isOkPesquisaEmTubarões(animalId, tipo_dente)) {
                        passeios_selecionados.add(passeio_pesquisado);
                    
                    }
                }else if (idade_minima > 0) {
                    if (isOkPesquisaEmBaleias(animalId, idade_minima)) {
                        passeios_selecionados.add(passeio_pesquisado);
                   
                    }
                }else passeios_selecionados.add(passeio_pesquisado);
            }

       }


                lista_resultados.close();
                comando.close();

        
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return passeios_selecionados;
}
    public static ArrayList<String> buscarAnimaisDoAquario(int aquarioid) {
    ArrayList<String> animais = new ArrayList<>();

    String sql = "SELECT animalid FROM Atrações WHERE aquarioid = ?";

    try {
        PreparedStatement comando = BD.conexão.prepareStatement(sql);
        comando.setInt(1, aquarioid);
        ResultSet rs = comando.executeQuery();

        while (rs.next()) {
            animais.add(rs.getString("animalid"));
        }

        rs.close();
        comando.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return animais;
}

    private static boolean animaisAquarioAtendemFiltro(int sequencial_aquario, AnimalAquatico.Habitat habitat, int minimo_peso, boolean todos_animais) {
        AnimalAquatico[] animais_aquario = Atração.buscarAtraçõesAquario(sequencial_aquario);
        int total_animais_nao = 0;
        for (AnimalAquatico animal : animais_aquario){
            if(((minimo_peso != 0)
                && (animal.getPeso() < minimo_peso))
                || (animal.getHabitat() != habitat)){
                
                total_animais_nao++;
                if(todos_animais) return false;
                
            }
        }
        if(total_animais_nao == 0) return true;
        if((todos_animais) || (total_animais_nao == animais_aquario.length)){
            return false;
            
        }
        
        return true;
    }
    
    private static boolean isOkPesquisaEmTubarões(String animalId, TipoDente tipo_dente) {
        boolean pesquisa_ok = false;
        String sql = "SELECT * FROM animaisaquaticostubarões WHERE animalId = ?";
        
        if (tipo_dente != null) sql += " AND tipo_dente = ?";
        ResultSet lista_resultados = null;
        int index = 1;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, animalId);
            if (tipo_dente != null) comando.setInt(++index, tipo_dente.ordinal());
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) pesquisa_ok = true;
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {exceção_sql.printStackTrace ();}
        return pesquisa_ok;
    }
    
    
    private static boolean isOkPesquisaEmBaleias(String animalId, int idade) {
        boolean pesquisa_ok = false;
        String sql = "SELECT * FROM animaisaquaticosbaleias WHERE animalId = ?";
        if (idade != 0) sql += " AND idade >= ?";
        ResultSet lista_resultados = null;
        int index = 1;
        try {
            PreparedStatement comando = BD.conexão.prepareStatement(sql);
            comando.setString(1, animalId);
            if (idade != 0) comando.setInt(++index, idade);
            lista_resultados = comando.executeQuery();
            while (lista_resultados.next()) pesquisa_ok = true;
            lista_resultados.close();
            comando.close();
        } catch (SQLException exceção_sql) {exceção_sql.printStackTrace ();}
        return pesquisa_ok;
    }
    
    public int getSequencial() {
        return sequencial;
    }
    
    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
    public Escola getEscola() {
        return escolaid;
    }

    public Aquario getAquario() {
        return aquarioid;
    }
    public Locomoção getLocomoção() {
        return locomoção;
    }
    public Timestamp getDataHora() {
        return datahora;
    }
    
    public String toStringFull() {
        AnimalAquatico[] animais_aquario = Atração.buscarAtraçõesAquario(aquarioid.getSequencial());
        String str = "";
    for (AnimalAquatico animal : animais_aquario){
        str = escolaid.toStringFull() + " --- " + aquarioid.toStringFull() + "\n ";
        
         str += " -- " + animal.toStringFull();
        str += "\n          ";
        
        str += "locomoção [" + locomoção + "] - " + formatarDataHora(datahora.toString());
        
        }
        return str;
    }
    
    @Override
        public String toString() {
        return sequencial + " [Escola: " + escolaid.getNome() + "]"+ " [Aquario: " + aquarioid.getNome() + "]"; 
     }
}
