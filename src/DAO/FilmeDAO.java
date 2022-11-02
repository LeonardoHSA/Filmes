/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import javaBeans.Filme;
import jdbc.PostgreSqlConnection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

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
            String cmdsql = "insert into public.Filmes (nome, genero, direcao, ano, streamer, assistiu) values(?, ?, ?, ?, ?, ?)";
            
            // organizando o cmdsql e executando
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getGenero());
            stmt.setString(3, obj.getDirecao());
            stmt.setInt(4, obj.getAno());
            stmt.setString(5, obj.getStreamer());
            stmt.setString(6, obj.getAssitiu());
            
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
            String cmdsql = "select * from public.Filmes order by idfilme";
            
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
                f.setAssitiu(rs.getString("assistiu"));
                
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
            String cmdsql = "update Filmes set nome=?, genero=?, direcao=?, ano=?, streamer=?, assistiu=? where idFilme=?";
            
            // organizando o cmdsql e executando
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getGenero());
            stmt.setString(3, obj.getDirecao());
            stmt.setInt(4, obj.getAno());
            stmt.setString(5, obj.getStreamer());
            stmt.setString(6, obj.getAssitiu());
            stmt.setInt(7, obj.getIdFilme());
            
            
            stmt.execute();
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
    
    public List<Filme> pesquisaFilmesNome(String nome, String assistiu, String naoAssistiu){
        
        try {
            
            List<Filme> lista = new ArrayList<Filme>();
            
            if(assistiu == "Sim" && naoAssistiu == "Não"){
                
                JOptionPane.showMessageDialog(null, "Para pesquisar filmes no geral basta desmarcar as checkboxes !!");
                
            }else if(assistiu == "Sim"){
                        
                String cmdsql = "select * from public.Filmes where nome like ? and assistiu = ?";
            
                PreparedStatement stmt = conecta.prepareStatement(cmdsql);
                stmt.setString(1, "%"+nome+"%");
                stmt.setString(2, assistiu);
  
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                    Filme f = new Filme();
                    f.setIdFilme(rs.getInt("idFilme"));
                    f.setNome(rs.getString("nome"));
                    f.setGenero(rs.getString("genero"));
                    f.setDirecao(rs.getString("direcao"));
                    f.setAno(rs.getInt("ano"));
                    f.setStreamer(rs.getString("streamer"));
                    f.setAssitiu(rs.getString("assistiu"));

                    lista.add(f); 
                }
            } else if(naoAssistiu == "Não"){
                
            
                String cmdsql = "select * from public.Filmes where nome like ? and assistiu = ?";
            
                PreparedStatement stmt = conecta.prepareStatement(cmdsql);
                stmt.setString(1, "%"+nome+"%");
                stmt.setString(2, naoAssistiu);
  
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()){
                    Filme f = new Filme();
                    f.setIdFilme(rs.getInt("idFilme"));
                    f.setNome(rs.getString("nome"));
                    f.setGenero(rs.getString("genero"));
                    f.setDirecao(rs.getString("direcao"));
                    f.setAno(rs.getInt("ano"));
                    f.setStreamer(rs.getString("streamer"));
                    f.setAssitiu(rs.getString("assistiu"));

                    lista.add(f);
                
                
                }
            } else {
           
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
                    f.setAssitiu(rs.getString("assistiu"));

                    lista.add(f);
                }
            }
            
            return lista;
            
            
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
        
    }
    
    public List<Filme> pesquisaFilmesDecada(int dataInicial, String assistiu, String naoAssistiu){
        
        int dataFinal = dataInicial + 9;
        
        try {
            // criando o vetor que vai armazenar os registros do banco
            List<Filme> lista = new ArrayList<Filme>();
            
            if(assistiu == "Sim" && naoAssistiu == "Não"){
                
                JOptionPane.showMessageDialog(null, "Para pesquisar filmes no geral basta desmarcar as checkboxes !!");
                
            }else if(assistiu == "Sim"){
                // criando o comando sql
                String cmdsql = "select * from public.Filmes where ano between ? and ? and assistiu = ?";

                PreparedStatement stmt = conecta.prepareStatement(cmdsql);
                stmt.setInt(1,  dataInicial);
                stmt.setInt(2, dataFinal);
                stmt.setString(3, assistiu);
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
                    f.setAssitiu(rs.getString("assistiu"));


                    lista.add(f);
                }
            } else if(naoAssistiu == "Não"){
                // criando o comando sql
                String cmdsql = "select * from public.Filmes where ano between ? and ? and assistiu = ?";

                PreparedStatement stmt = conecta.prepareStatement(cmdsql);
                stmt.setInt(1,  dataInicial);
                stmt.setInt(2, dataFinal);
                stmt.setString(3, naoAssistiu);
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
                    f.setAssitiu(rs.getString("assistiu"));


                    lista.add(f);
                }
            } else {
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
                    f.setAssitiu(rs.getString("assistiu"));


                    lista.add(f);
                }
            } 
            
            return lista;     
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }  
        
    }
    
    public List<Filme> pesquisaFilmesAleatorio(int valor, String assistiu, String naoAssistiu){
        
        try {
            // criando o vetor que vai armazenar os registros do banco
            List<Filme> lista = new ArrayList<Filme>();
            
            if(assistiu == "Sim" && naoAssistiu == "Não"){
                
                JOptionPane.showMessageDialog(null, "Para pesquisar filmes no geral basta desmarcar as checkboxes !!");
                
            } else if(assistiu == "Sim"){
                // criando o comando sql
                String cmdsql = "select * from public.Filmes where assistiu = ? order by random() limit ?";

                PreparedStatement stmt = conecta.prepareStatement(cmdsql);
                stmt.setString(1, assistiu);
                stmt.setInt(2, valor);
                

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
                    f.setAssitiu(rs.getString("assistiu"));

                    lista.add(f);
                }
            } else if(naoAssistiu == "Não"){
                // criando o comando sql
                String cmdsql = "select * from public.Filmes where assistiu = ? order by random() limit ?";

                PreparedStatement stmt = conecta.prepareStatement(cmdsql);
                stmt.setString(1, naoAssistiu);
                stmt.setInt(2, valor);
                

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
                    f.setAssitiu(rs.getString("assistiu"));

                    lista.add(f);
                }
            } else {
                // criando o comando sql
                String cmdsql = "select * from public.Filmes order by random() limit ?";

                PreparedStatement stmt = conecta.prepareStatement(cmdsql);
                stmt.setInt(1, valor);

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
                    f.setAssitiu(rs.getString("assistiu"));

                    lista.add(f);
                }
            }
          
            return lista;
               
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }  
        
    }
    
    public List<Filme> pesquisaFilmesGenero(String genero, String assistiu, String naoAssistiu){
        
        try {
            // criando o vetor que vai armazenar os registros do banco
            List<Filme> lista = new ArrayList<Filme>();
            
            if(assistiu == "Sim" && naoAssistiu == "Não"){
                
                JOptionPane.showMessageDialog(null, "Para pesquisar filmes no geral basta desmarcar as checkboxes !!");
                
            } else if(assistiu == "Sim"){
                // criando o comando sql
                String cmdsql = "select * from public.Filmes where genero like ? and assistiu = ?";

                PreparedStatement stmt = conecta.prepareStatement(cmdsql);
                stmt.setString(1, "%"+genero+"%");
                stmt.setString(2, assistiu);
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
                    f.setAssitiu(rs.getString("assistiu"));

                    lista.add(f);
                }
            } else if(naoAssistiu == "Não"){
                // criando o comando sql
                String cmdsql = "select * from public.Filmes where genero like ? and assistiu = ?";

                PreparedStatement stmt = conecta.prepareStatement(cmdsql);
                stmt.setString(1, "%"+genero+"%");
                stmt.setString(2, naoAssistiu);
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
                    f.setAssitiu(rs.getString("assistiu"));

                    lista.add(f);
                }
            } else{
                // criando o comando sql
                String cmdsql = "select * from public.Filmes where genero like ? and";

                PreparedStatement stmt = conecta.prepareStatement(cmdsql);
                stmt.setString(1, "%"+genero+"%");
                
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
                    f.setAssitiu(rs.getString("assistiu"));

                    lista.add(f);
                }
            }
            
            return lista;
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
}
