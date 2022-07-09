/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author leonardo
 */
public class PostgreSqlConnection {
    
    public Connection conecta(){
        
        try {
            
            return DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Filmes", "postgres", "+de8000");
        } catch (Exception erroSql) {
            throw new RuntimeException(erroSql);
        }
    }
}
