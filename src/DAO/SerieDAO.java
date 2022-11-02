/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import javaBeans.Serie;
import jdbc.PostgreSqlConnection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author leonardo
 */
public class SerieDAO {
    
    private Connection conecta;
    
    public SerieDAO(){
        this.conecta = new PostgreSqlConnection().conecta();
    }
    
    public void cadastraSerie(Serie obj){
        
        try {
            //criando o comando SQL
            String cmdsql = "insert into public.Series (nome, genero, direcao, anoLancamento, temporadas, streamer, assistiu) values(?, ?, ?, ?, ?, ?, ?)";
            
            // organizando o cmdsql e executando
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getGenero());
            stmt.setString(3, obj.getDirecao());
            stmt.setInt(4, obj.getAnoLancamento());
            stmt.setString(5, obj.getTemporadas());
            stmt.setString(6, obj.getStreamer());
            stmt.setString(7, obj.getAssistiu());
            
            stmt.execute();
            
            // fechando a conexão
            stmt.close();
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
    
    public List<Serie> listaSeries(){
        
        try {
            // criando o vetor que vai armazenar os registros do banco
            List<Serie> lista = new ArrayList<Serie>();
            
            // criando o comando sql
            String cmdsql = "select * from public.Series";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            
            // guardando o resultado do select dentro de um objeto result set
            ResultSet rs = stmt.executeQuery();
            
            // enquanto houver registros do select dentro de um objeto result set
            while(rs.next()){
                Serie s = new Serie();
                s.setIdSerie(rs.getInt("idSerie"));
                s.setNome(rs.getString("nome"));
                s.setGenero(rs.getString("genero"));
                s.setDirecao(rs.getString("direcao"));
                s.setAnoLancamento(rs.getInt("anoLancamento"));
                s.setTemporadas(rs.getString("temporadas"));
                s.setStreamer(rs.getString("streamer"));
                s.setAssistiu(rs.getString("assistiu"));
                
                lista.add(s);
            }
            
            return lista;
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
    
    public void deletaSerie(Serie obj){
        
        try {
            
            //Criando o comando sql
            String cmdsql = "delete from public.Series where idSerie=?";
            
            // organizando o cmdsql e executando 
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            
            stmt.setInt(1, obj.getIdSerie());
            
            stmt.execute();
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
    
    public void alterarSerie(Serie obj){
        
        try {
            
            //criando a String
            String cmdsql = "update public.Series set nome=?, genero=?, direcao=?, anoLancamento=?, temporadas=?, streamer=?, assistiu=? where idSerie=?";
            
            // organizando o cmdsql e executando
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getGenero());
            stmt.setString(3, obj.getDirecao());
            stmt.setInt(4, obj.getAnoLancamento());
            stmt.setString(5, obj.getTemporadas());
            stmt.setString(6, obj.getStreamer());
            stmt.setString(7, obj.getAssistiu());
            stmt.setInt(8, obj.getIdSerie());
            
            stmt.execute();
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
    
    public List<Serie> pesquisaSerieNome(String nome){
        
        try {
            // criando o vetor que vai armazenar os registros do banco
            List<Serie> lista = new ArrayList<Serie>();
            
            // criando o comando sql
            String cmdsql = "select * from public.Series where nome like ?";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, "%"+nome+"%");
            // guardando o resultado do select dentro de um objeto result set
            ResultSet rs = stmt.executeQuery();
            
            // enquanto houver registros do select dentro de um objeto result set
            while(rs.next()){
                Serie s = new Serie();
                s.setIdSerie(rs.getInt("idSerie"));
                s.setNome(rs.getString("nome"));
                s.setGenero(rs.getString("genero"));
                s.setDirecao(rs.getString("direcao"));
                s.setAnoLancamento(rs.getInt("anoLancamento"));
                s.setTemporadas(rs.getString("temporadas"));
                s.setStreamer(rs.getString("streamer"));
                s.setAssistiu(rs.getString("assistiu"));
                
                lista.add(s);
            }
            
            return lista;
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
    
    public List<Serie> pesquisaSeriesDecada(int dataInicial){
        
        int dataFinal = dataInicial + 9;
        
        try {
            // criando o vetor que vai armazenar os registros do banco
            List<Serie> lista = new ArrayList<Serie>();
            
            // criando o comando sql
            String cmdsql = "select * from public.Series where anoLancamento between ? and ?";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setInt(1,  dataInicial);
            stmt.setInt(2, dataFinal);
            dataFinal = 0;
            // guardando o resultado do select dentro de um objeto result set
            ResultSet rs = stmt.executeQuery();
            
            // enquanto houver registros do select dentro de um objeto result set
            while(rs.next()){
                Serie s = new Serie();
                s.setIdSerie(rs.getInt("idSerie"));
                s.setNome(rs.getString("nome"));
                s.setGenero(rs.getString("genero"));
                s.setDirecao(rs.getString("direcao"));
                s.setAnoLancamento(rs.getInt("anoLancamento"));
                s.setTemporadas(rs.getString("temporadas"));
                s.setStreamer(rs.getString("streamer"));
                s.setAssistiu(rs.getString("assistiu"));
                
                lista.add(s);
            }
            
            return lista;
            
            
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }  
        
    }
    
    public List<Serie> pesquisaSeriesAleatorio(int valor){
        
        try {
            // criando o vetor que vai armazenar os registros do banco
            List<Serie> lista = new ArrayList<Serie>();
            
            // criando o comando sql
            String cmdsql = "select * from public.Series order by random() limit ?";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setInt(1, valor);
            
            // guardando o resultado do select dentro de um objeto result set
            ResultSet rs = stmt.executeQuery();
            
            // enquanto houver registros do select dentro de um objeto result set
            while(rs.next()){
                Serie s = new Serie();
                s.setIdSerie(rs.getInt("idSerie"));
                s.setNome(rs.getString("nome"));
                s.setGenero(rs.getString("genero"));
                s.setDirecao(rs.getString("direcao"));
                s.setAnoLancamento(rs.getInt("anoLancamento"));
                s.setTemporadas(rs.getString("temporadas"));
                s.setStreamer(rs.getString("streamer"));
                
                lista.add(s);
            }
            
            return lista;
            
            
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }  
        
    }
    
    public List<Serie> pesquisaSerieGenero(String genero){
        
        try {
            // criando o vetor que vai armazenar os registros do banco
            List<Serie> lista = new ArrayList<Serie>();
            
            // criando o comando sql
            String cmdsql = "select * from public.Series where genero like ?";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, "%"+genero+"%");
            // guardando o resultado do select dentro de um objeto result set
            ResultSet rs = stmt.executeQuery();
            
            // enquanto houver registros do select dentro de um objeto result set
            while(rs.next()){
                Serie s = new Serie();
                s.setIdSerie(rs.getInt("idSerie"));
                s.setNome(rs.getString("nome"));
                s.setGenero(rs.getString("genero"));
                s.setDirecao(rs.getString("direcao"));
                s.setAnoLancamento(rs.getInt("anoLancamento"));
                s.setTemporadas(rs.getString("temporadas"));
                s.setStreamer(rs.getString("streamer"));
                
                lista.add(s);
            }
            
            return lista;
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
}
