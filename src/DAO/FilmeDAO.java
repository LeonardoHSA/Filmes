/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javaBeans.Filme;
import java.sql.Connection;
import javaBeans.Filme;
import jdbc.PostgreSqlConnection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author leonardo
 */
public class FilmeDAO {
    
    private Connection conecta;
    
    public FilmeDAO(){
        this.conecta = new PostgreSqlConnection().conecta();
    }
    
    public void cadastraFilme(Filme obj){
        
        try {
            //criando o comando SQL
            String cmdsql = "insert into public.Filmes (nome, genero, direcao, ano, streamer) values(?, ?, ?, ?, ?)";
            
            // organizando o cmdsql e executando
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getGenero());
            stmt.setString(3, obj.getDirecao());
            stmt.setInt(4, obj.getAno());
            stmt.setString(5, obj.getStreamer());
            
            stmt.execute();
            
            // fechando a conexão
            stmt.close();
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
    
    public List<Filme> listaFilmes(){
        
        try {
            // criando o vetor que vai armazenar os registros do banco
            List<Filme> lista = new ArrayList<Filme>();
            
            // criando o comando sql
            String cmdsql = "select * from public.Filmes";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            
            // guardando o resultado do select dentro de um objeto result set
            ResultSet rs = stmt.executeQuery();
            
            // enquanto houver registros do select dentro de um objeto result set
            while(rs.next()){
                Filme f = new Filme();
                f.setIdFilme(rs.getInt("idFilme"));
                f.setNome(rs.getString("nome"));
                f.setGenero(rs.getString("genero"));
                f.setDirecao(rs.getString("direcao"));
                f.setAno(rs.getInt("ano"));
                f.setStreamer(rs.getString("streamer"));
                
                lista.add(f);
            }
            
            return lista;
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
    
    public void deletaFilme(Filme obj){
        
        try {
            
            //Criando o comando sql
            String cmdsql = "delete from Filmes where idFilme=?";
            
            // organizando o cmdsql e executando 
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            
            stmt.setInt(1, obj.getIdFilme());
            
            stmt.execute();
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
    
    public void alterarFilme(Filme obj){
        
        try {
            
            //criando a String
            String cmdsql = "update Filmes set nome=?, genero=?, direcao=?, ano=?, streamer=? where idFilme=?";
            
            // organizando o cmdsql e executando
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getGenero());
            stmt.setString(3, obj.getDirecao());
            stmt.setInt(4, obj.getAno());
            stmt.setString(5, obj.getStreamer());
            stmt.setInt(6, obj.getIdFilme());
            
            stmt.execute();
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
    
    public List<Filme> pesquisaFilmesNome(String nome){
        
        try {
            // criando o vetor que vai armazenar os registros do banco
            List<Filme> lista = new ArrayList<Filme>();
            
            // criando o comando sql
            String cmdsql = "select * from public.Filmes where nome like ?";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, "%"+nome+"%");
            // guardando o resultado do select dentro de um objeto result set
            ResultSet rs = stmt.executeQuery();
            
            // enquanto houver registros do select dentro de um objeto result set
            while(rs.next()){
                Filme f = new Filme();
                f.setIdFilme(rs.getInt("idFilme"));
                f.setNome(rs.getString("nome"));
                f.setGenero(rs.getString("genero"));
                f.setDirecao(rs.getString("direcao"));
                f.setAno(rs.getInt("ano"));
                f.setStreamer(rs.getString("streamer"));
                
                lista.add(f);
            }
            
            return lista;
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
    
    public List<Filme> pesquisaFilmesDecada(int dataInicial){
        
        int dataFinal = dataInicial + 10;
        
        try {
            // criando o vetor que vai armazenar os registros do banco
            List<Filme> lista = new ArrayList<Filme>();
            
            // criando o comando sql
            String cmdsql = "select * from public.Filmes where ano between ? and ?";
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setInt(1,  dataInicial);
            stmt.setInt(2, dataFinal);
            dataFinal = 0;
            // guardando o resultado do select dentro de um objeto result set
            ResultSet rs = stmt.executeQuery();
            
            // enquanto houver registros do select dentro de um objeto result set
            while(rs.next()){
                Filme f = new Filme();
                f.setIdFilme(rs.getInt("idFilme"));
                f.setNome(rs.getString("nome"));
                f.setGenero(rs.getString("genero"));
                f.setDirecao(rs.getString("direcao"));
                f.setAno(rs.getInt("ano"));
                f.setStreamer(rs.getString("streamer"));
                
                lista.add(f);
            }
            
            return lista;
            
            
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
        
        
    }
}
