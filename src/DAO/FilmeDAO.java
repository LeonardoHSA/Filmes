/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import javaBeans.Filme;
import jdbc.PostgreSqlConnection;

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
        
    }
}
